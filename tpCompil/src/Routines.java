import LexicalAnalyse.TableSymbol;
import LexicalAnalyse.TokenClass;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class Routines extends grammarOfProjectBaseListener {
    /** In this class we will deal with semantic errors
     * the most important errors are
     * 1-a variable used but not declared at all
     * 2-double declaration of a variable
     * 3-in an arithmetic operations using two variable
     * which are not comptible type incompatibility
     * 4- division by zero
     * and so on
     */

    /** to start we need to declare variables most common
     * those static variable for declaration and type
     * we need to import LexicalAnalyse.TableSymbol class because we will add and remove tokens
     * and so on
     */

    private static final int DECLARED = 1;
    private static final int UNDECLARED = 0;
    private static final int INTSJ = 0;
    private static final int FLOATSJ = 1;
    private static final int STRINGSJ = 2;
    private TableSymbol ts = new TableSymbol();
    private HashMap<ParserRuleContext,Integer> types = new HashMap<>();
    private HashMap<ParserRuleContext,String> values = new HashMap<>();
    private HashMap<ParserRuleContext,Integer> init = new HashMap<>();
    private HashMap<String,String> imports = new HashMap<>();
    private LinkedList<String> errors = new LinkedList<>();
    private LinkedList<String> warnings = new LinkedList<>();
    private Stack s = new Stack();
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";


    public Routines(){

    }

    /** is this routine, i will treat this particular part of my grammar: this end of my program
     * prog:(|imports) (|modificateur) CLASS CLASSNAME '{' declaration MAIN '{' insts '}' '}';
     * if the vector errors doesn't contain any errors i will show the table of symboles and quads and assembler code
     * or i will show the errors.
     * @param ctx
     */
    @Override public void exitProg(grammarOfProjectParser.ProgContext ctx) {
        if(ctx.CLASSNAME() != null)
            if(!Character.isUpperCase(ctx.CLASSNAME().getText().charAt(0)))
                errors.add("nes/w0: Classname must be capital letter!");
        if(errors.size() == 0){
            System.out.println("program compiled without errors!\nerrors: "+errors.size()+"\nwarnings: "+warnings.size());
            for(int i =0; i< warnings.size();i++){
                System.out.println(warnings.get(i));
            }
            System.out.println("\n\n\n");
            System.out.println("***** SHOW TABLE OF SYMBOLE  ******");
            for(int i = 0; i<ts.getSize();i++){
                System.out.println(ts.getToken(i).toString());
            }
            System.out.println("***** END SHOW TABLE OF SYMBOLE  ******\n\n\n");
        }
        else{
            System.out.println("program compiled with the following errors");
            for(int i=0;i<errors.size();i++){
                System.out.println(ANSI_RED+ errors.get(i)+ANSI_RESET);
            }
        }
    }
    /** check if there is double import or not*/
    @Override public void exitLibraryName(grammarOfProjectParser.LibraryNameContext ctx) {
        String libraryName = ctx.getText();
        if(imports.containsKey(libraryName)){
            /** error double import*/
            warnings.add("nes/w1: Double import\n"+ libraryName+" is imported multiple time");
        }else{
            imports.put(libraryName,libraryName);
        }
    }

    /**
     * this routines is used to check if a variable is declared for the first time
     * or there is an error which is double declaration
     * in addition, i will affect the type of the variable to it in case of no error
     * to do so i need to consider this particuler part of my grammar
     * declaration: (decvar declaration) | decvar;
     * decvar: type variablelist ';';
     * type: INT | FLOAT | STRING;
     * variablelist: IDF ',' variablelist | IDF;
     * when i exit dec , i will have both the variable and its type
     */
    @Override public void exitDecvar(grammarOfProjectParser.DecvarContext ctx) {
        /** retreive the type*/
        int type ;

        if(ctx.type().getText().equals("int_SJ")){
            type = 0;
        }else if(ctx.type().getText().equals("float_SJ")){
            type = 1;
        }else{
            type = 2;
        }

        grammarOfProjectParser.VariablelistContext variablelist = ctx.variablelist();

        for( ; ; variablelist = variablelist.variablelist()){
            String nameOfVariable = variablelist.getChild(0).getText();


            if(ts.containsToken(nameOfVariable)) {
                errors.add("nes/e1: Double declaration of variable of " + nameOfVariable);
            }else {
                /** check the size of idf*/
                if(nameOfVariable.length()>10){
                    errors.add("nes/e2: IDF too long "+nameOfVariable+" longer than 10");
                    ts.addToken(new TokenClass(nameOfVariable,DECLARED,type));
                }else{
                    ts.addToken(new TokenClass(nameOfVariable,DECLARED,type));
                }

            }
            if(variablelist.variablelist() == null) return;
        }
    }

    /**
     * in this routine, i will treat this particular part of my grammar
     * assignment: IDF ':=' arithmetic_expression ;
     * is this case i need to check if the type of the IDF and expression are compatible or not
     * if they are not we generate an error
     */

    @Override public void exitAssignment(grammarOfProjectParser.AssignmentContext ctx) {
        /** check for compatible type*/
        if(!checkTypeCompatibleForAssignment(ts.getToken(ctx.identifier().getText()).getType(),types.get(ctx.arithmetic_expression())))
            errors.add("nes/e3: incompatible type in assignment "+ctx.getText());

        types.clear();
        ts.getToken(ctx.identifier().getText()).setValue(values.get(ctx.arithmetic_expression()));

        values.clear();

        /** init variable*/
        ts.getToken(ctx.identifier().getText()).setInitialized(1);

    }
    /** chech if an idf is declared or not
     * if it's not declared i generate the error but also declare it to not generate
     * the error more than once
     * @param ctx
     */
    @Override public void exitIdentifier(grammarOfProjectParser.IdentifierContext ctx) {
        String isDeclared = ctx.IDF().getText();
        if(! ts.containsToken(isDeclared)) {
            errors.add("nes/e4 missing declaration " + isDeclared + " is used but not declared ");
            /** the type of the token is not important because will have an error */
            //TODO check if type == -1
            ts.addToken(new TokenClass(isDeclared,1,-1));
        }



    }

    /**
     * @param ctx
     */
    @Override public void exitArithmetic_expression(grammarOfProjectParser.Arithmetic_expressionContext ctx) {
        if(ctx.arithmetic_expression().size() == 1){
            String[] sep = ctx.getText().split("\\(|\\)");
            if(!sep[1].equals("")){
                ParserRuleContext save =null;
                for (Map.Entry<ParserRuleContext, Integer> entry : types.entrySet()) {
                    if(entry.getKey().getText().equals(sep[1])){
                        save = entry.getKey();
                    }
                }
                types.put(ctx,types.get(save));
                values.put(ctx,values.get(save));

            }

        }

        if(ctx.identifier() != null){
            if(ts.getToken(ctx.identifier().getText()).getInitialized() == 0){
                errors.add("nes/e5: missing initialization "+ ctx.identifier().getText()+" is not initialized");
            }
            types.put(ctx, ts.getToken(ctx.identifier().getText()).getType());
            values.put(ctx,ts.getToken(ctx.identifier().getText()).getValue());

            s.push(ctx);
        }

        if(ctx.val() != null){

            types.put(ctx, types.get(ctx.val()));
            values.put(ctx,values.get(ctx.val()));
            s.push(ctx);

        }
        if(ctx.PLUS() != null){
            if(! imports.containsKey("Small_Java.lang")) {
                errors.add("nes/e6 missing import add import Small_java.lang to your package list");
                imports.put("Small_Java.lang", "Small_Java.lang");
            }
            ParserRuleContext second = (ParserRuleContext) s.pop();
            ParserRuleContext first = (ParserRuleContext) s.pop();
            if(checkTypeCompatible(types.get(first),types.get(second))){
                ErrorType resultingType = getResultingType(types.get(first),types.get(second));
                types.put(ctx, resultingType.getResultType());
                if(resultingType.getErrorType() != -1){
                    String param1 = values.get(first);
                    String param2 = values.get(second);
                    if(resultingType.getResultType() == 0){
                        if(param1 != null && param2 != null){
                            int resultValue = getresultingValueOfInteger(param1,param2,"+");
                            values.put(ctx,String.valueOf(resultValue));
                        }
                    }else if(resultingType.getResultType() == 1){
                        if(param1 != null && param2 != null){
                            float resultValue = getresultingValueOfFloat(param1,param2,"+");
                            values.put(ctx,String.valueOf(resultValue));
                        }else{
                            System.out.println("253");

                        }
                    }else{
                        if(param1 != null && param2 != null){
                            String resultValue = getresultingValueOfString(param1,param2,"+");
                            values.put(ctx,resultValue);

                        }


                    }
                }else{
                    values.put(ctx,"-1");
                }
            }else{
                errors.add("249:  incompatible type");
                types.put(ctx, -1);
            }
            s.push(ctx);
        }
        if(ctx.DIV() != null){
            if(! imports.containsKey("Small_Java.lang")) {
                errors.add("nes/e6 missing import add import Small_java.lang to your package list");
                imports.put("Small_Java.lang", "Small_Java.lang");
            }
            ParserRuleContext second = (ParserRuleContext) s.pop();
            ParserRuleContext first = (ParserRuleContext) s.pop();
            /** devision by zero*/
            if(values.get(second) != null && values.get(second).equals("0")){
                errors.add("nes/e8 division by zero in  "+ctx.getText());
                types.put(ctx, -1);
                values.put(ctx, "-1");
            }
            else{
                if(checkTypeCompatible(types.get(first),types.get(second))){
                    ErrorType resultingType = getResultingType(types.get(first),types.get(second));
                    types.put(ctx, resultingType.getResultType());
                    if(resultingType.getErrorType() != -1){
                        String param1 = values.get(first);
                        String param2 = values.get(second);
                        if(resultingType.getResultType() == 0){
                            if(param1 != null && param2 != null){
                                int resultValue = getresultingValueOfInteger(param1,param2,"/");
                                values.put(ctx,String.valueOf(resultValue));
                            }
                        }else if(resultingType.getResultType() == 1){
                            if(param1 != null && param2 != null){
                                float resultValue = getresultingValueOfFloat(param1,param2,"/");
                                values.put(ctx,String.valueOf(resultValue));
                            }
                        }else{
                            errors.add("nes/e8: operator / not allowed to string in "+ctx.getText());
                        }
                    }else{
                        values.put(ctx,"-1");
                    }
                }else{
                    errors.add("249:  incompatible type");
                    types.put(ctx, -1);
                }
            }

            s.push(ctx);
        }
        if(ctx.MUL() != null){
            if(! imports.containsKey("Small_Java.lang")) {
                errors.add("nes/e6 missing import add import Small_java.lang to your package list");
                imports.put("Small_Java.lang", "Small_Java.lang");
            }
            ParserRuleContext second = (ParserRuleContext) s.pop();
            ParserRuleContext first = (ParserRuleContext) s.pop();
            if(checkTypeCompatible(types.get(first),types.get(second))){
                ErrorType resultingType = getResultingType(types.get(first),types.get(second));
                types.put(ctx, resultingType.getResultType());
                if(resultingType.getErrorType() != -1){
                    String param1 = values.get(first);
                    String param2 = values.get(second);
                    if(resultingType.getResultType() == 0){
                        if(param1 != null && param2 != null){
                            int resultValue = getresultingValueOfInteger(param1,param2,"*");
                            values.put(ctx,String.valueOf(resultValue));
                        }
                    }else if(resultingType.getResultType() == 1){
                        if(param1 != null && param2 != null){
                            float resultValue = getresultingValueOfFloat(param1,param2,"*");
                            values.put(ctx,String.valueOf(resultValue));
                        }
                    }else{
                        errors.add("nes/e8: operator * not allowed to string in "+ctx.getText());
                    }
                }else{
                    values.put(ctx,"-1");
                }
            }else{
                errors.add("249:  incompatible type");
                types.put(ctx, -1);
            }
            s.push(ctx);
        }
        if(ctx.MINUS() != null){
            if(! imports.containsKey("Small_Java.lang")) {
                errors.add("nes/e6 missing import add import Small_java.lang to your package list");
                imports.put("Small_Java.lang", "Small_Java.lang");
            }
            ParserRuleContext second = (ParserRuleContext) s.pop();
            ParserRuleContext first = (ParserRuleContext) s.pop();
            if(checkTypeCompatible(types.get(first),types.get(second))){
                ErrorType resultingType = getResultingType(types.get(first),types.get(second));
                types.put(ctx, resultingType.getResultType());
                if(resultingType.getErrorType() != -1){
                    String param1 = values.get(first);
                    String param2 = values.get(second);
                    if(resultingType.getResultType() == 0){
                        if(param1 != null && param2 != null){
                            int resultValue = getresultingValueOfInteger(param1,param2,"-");
                            values.put(ctx,String.valueOf(resultValue));
                        }
                    }else if(resultingType.getResultType() == 1){
                        if(param1 != null && param2 != null){
                            float resultValue = getresultingValueOfFloat(param1,param2,"-");
                            values.put(ctx,String.valueOf(resultValue));
                        }
                    }else{
                        errors.add("nes/e8: operator - not allowed to string in "+ctx.getText());
                    }
                }else{
                    values.put(ctx,"-1");
                }
            }else{
                errors.add("249:  incompatible type");
                types.put(ctx, -1);
            }
            s.push(ctx);
        }


    }

    /** we will affect the right type to our exp*/
    @Override public void exitVal(grammarOfProjectParser.ValContext ctx) {
        if(ctx.VALUEOFFLOAT() != null){
            types.put(ctx,FLOATSJ);
            init.put(ctx, 1);
            values.put(ctx,ctx.VALUEOFFLOAT().getText());

        }
        else if(ctx.VALUEOFINTEGER() != null){
            types.put(ctx,INTSJ);
            init.put(ctx,1);
            values.put(ctx,ctx.VALUEOFINTEGER().getText());
        }
        else{
            types.put(ctx,STRINGSJ);
            init.put(ctx,1);
            String [] split = ctx.VALUEOFSTRING().getText().split("\"");
            values.put(ctx,split[1]);
        }
    }

    @Override public void exitInput(grammarOfProjectParser.InputContext ctx) {
        /** if there is no error in this case we must affect a value
         * the value will be anything for now corresponding to the type*/
        if(! imports.containsKey("Small_Java.io")) {
            errors.add("nes/e6 missing import add import Small_Java.io to your package list");
            imports.put("Small_Java.io", "Small_Java.io");
        }
        int type = ts.getToken(ctx.identifier().getText()).getType();
        String format = ctx.format().getText();

        if(format.equals("%d") && type != 0 && type != -1)
            errors.add("nes/e7 incompatible format Hints: you are assigning %d to "+type);
        if(format.equals("%f") && type != 1 && type != -1)
            errors.add("nes/e7 incompatible format Hints: you are assigning %f to "+type);
        if(format.equals("%s") && type != 2 && type != -1)
            errors.add("nes/e7 incompatible format Hints: you are assigning %s to "+type);

        /** initialized*/
        ts.getToken(ctx.identifier().getText()).setInitialized(1);
        ts.getToken(ctx.identifier().getText()).setValue("1");
        /** if no error then the variable is initialized the problem will be the value*/



    }

    @Override public void exitOutput(grammarOfProjectParser.OutputContext ctx) {
        /** check if format is correct*/
        if(! imports.containsKey("Small_Java.io")) {
            errors.add("nes/e6 missing import  add import Small_Java.io to your package list");
            imports.put("Small_Java.io", "Small_Java.io");
        }

        if(ts.getToken(ctx.identifier().getText()).getInitialized() == 0){
            errors.add("nes/e5: missing initialization "+ ctx.identifier().getText()+" is not initialized");
        }

        int type = ts.getToken(ctx.identifier().getText()).getType();
        String format = ctx.format().getText();

        if(format.equals("%d") && type != 0 && type != -1)
            errors.add("nes/e7 incompatible format Hints: you are assigning %d to "+getType(type)+" in "+ctx.getText());
        if(format.equals("%f") && type != 1 && type != -1)
            errors.add("nes/e7 incompatible format Hints: you are assigning %f to "+getType(type)+" in "+ctx.getText());
        if(format.equals("%s") && type != 2 && type != -1)
            errors.add("nes/e7 incompatible format Hints: you are assigning %s to "+getType(type)+" in "+ctx.getText());
    }

    /** get the value of condition either it's true or false*/
    @Override public void exitArithmetic(grammarOfProjectParser.ArithmeticContext ctx) {
        /** check for compatibility
         * i need to make sure that the type are int int or int float
         * no string type is accepted.
         * and because i don't have boolean type in this language so
         * my condition should be an arithmetic expression or idf
         * let's start writing some code ^^
         */
        if(!checkTypeCompatibleForCondition(types.get(ctx.arithmetic_expression(0)),types.get(ctx.arithmetic_expression(1))))
            errors.add("nes/e8 incompatible type in condition you are comparing "+types.get(ctx.arithmetic_expression(0))+" with "+types.get(ctx.arithmetic_expression(1))+" in "+ctx.getText());

    }

    /** helpful method*/

    private static boolean checkTypeCompatibleForAssignment(int t1, int t2){
        /** i accept this following assignment type
         * int = int
         * float = float
         * float = int
         * string = string
         * except this everything is refused
         */
        if(t1 == 0 && t2 == 0) return true;
        if(t1 == 1 && t2 == 1) return true;
        if(t1 == 1 && t2 == 0) return true;
        if(t1 == 2 && t2 == 2) return true;
        if(t1 == 2 && t2 == 1) return true;
        if(t1 == 2 && t2 == 0) return true;
        /** -1 is always accepted because it generates an error*/
        if(t1 == 0 && t2 == -1) return true;
        if(t1 == 1 && t2 == -1) return true;
        if(t1 == -1 && t2 == 0) return true;
        if(t1 == 2 && t2 == -1) return true;
        if(t1 == -1 && t2 == 2) return true;
        if(t1 == -1 && t2 == 1) return true;


        return false;
    }

    private static  boolean checkTypeCompatibleForCondition(int t1, int t2){
        if(t1 == 0 && t2 == 0) return true;
        if(t1 == 1 && t2 == 0) return true;
        if(t1 == 0 && t2 == 1) return true;
        if(t1 == 1 && t2 == 1) return true;
        if(t1 == -1 && t2 == 0) return true;
        if(t1 == -1 && t2 == 1) return true;
        if(t1 == 0 && t2 == -1) return true;
        if(t1 == 1 && t2 == -1) return true;

        return false;
    }
    private static boolean checkTypeCompatible(int t1, int t2){
        /**
         * int op int
         * int op float
         * float op float
         * float op int
         * string op string
         * all the previous type accepted except them it's an error
         */
        if(t1 == 0 && t2 == 0) return true;
        if(t1 == 1 && t2 == 0) return true;
        if(t1 == 0 && t2 == 1) return true;
        if(t1 == 1 && t2 == 1) return true;
        if(t1 == 2 && t2 == 2) return true;
        if(t1 == 2 && t2 == 0) return true;
        if(t1 == 2 && t2 == 1) return true;
        if(t1 == 0 && t2 == 2) return true;
        if(t1 == 1 && t2 == 2) return true;
        if(t1 == -1 && t2 == 0) return true;
        if(t1 == -1 && t2 == 1) return true;
        if(t1 == -1 && t2 == 2) return true;
        if(t1 == 0 && t2 == -1) return true;
        if(t1 == 1 && t2 == -1) return true;
        if(t1 == 2 && t2 == -1) return true;

        return false;
    }

    private static ErrorType getResultingTypeCondition(int t1, int t2){
        ErrorType errortype = null;
        if(t1 == 0 && t2 == 0){
            errortype = new ErrorType(INTSJ,INTSJ);
            return errortype;
        }
        if(t1 == 0 && t2 == 1){
            errortype = new ErrorType(FLOATSJ,FLOATSJ);
            return errortype;
        }
        if(t1 == 1 && t2 == 0){
            errortype = new ErrorType(FLOATSJ,FLOATSJ);
            return errortype;
        }
        if(t1 == 1 && t2 == 1){
            errortype = new ErrorType(FLOATSJ,FLOATSJ);
            return errortype;
        }

        /** -1 with any type is the type because it'll generate an error*/
        if(t1 == 0 && t2 == -1){
            errortype = new ErrorType(INTSJ,-1);
            return errortype;
        }
        if(t1 == 1 && t2 == -1){
            errortype = new ErrorType(FLOATSJ,-1);
            return errortype;
        }
        if(t1 == 2 && t2 == -1){
            errortype = new ErrorType(STRINGSJ,-1);
            return errortype;
        }
        if(t1 == -1 && t2 == 0){
            errortype = new ErrorType(INTSJ,-1);
            return errortype;
        }
        if(t1 == -1 && t2 == 1){
            errortype = new ErrorType(FLOATSJ,-1);
            return errortype;
        }
        if(t1 == -1 && t2 == 2){
            errortype = new ErrorType(FLOATSJ,-1);
            return errortype;
        }

        return new ErrorType(STRINGSJ,-1);


    }


    private static ErrorType getResultingType(int t1, int t2){
        ErrorType errortype = null;
        if(t1 == 0 && t2 == 0){
            errortype = new ErrorType(INTSJ,INTSJ);
            return errortype;
        }
        if(t1 == 0 && t2 == 1){
            errortype = new ErrorType(FLOATSJ,FLOATSJ);
            return errortype;
        }
        if(t1 == 1 && t2 == 0){
            errortype = new ErrorType(FLOATSJ,FLOATSJ);
            return errortype;
        }
        if(t1 == 1 && t2 == 1){
            errortype = new ErrorType(FLOATSJ,FLOATSJ);
            return errortype;
        }
        if (t1 == 2 && t2 == 2) {
            errortype = new ErrorType(STRINGSJ,STRINGSJ);
            return errortype;
        }
        if (t2 == 2 && t1 == 2) {
            errortype = new ErrorType(STRINGSJ,STRINGSJ);
            return errortype;
        }
        if (t2 == 2 && t1 == 1) {
            errortype = new ErrorType(STRINGSJ,STRINGSJ);
            return errortype;
        }
        if (t2 == 2 && t1 == 0) {
            errortype = new ErrorType(STRINGSJ,STRINGSJ);
            return errortype;
        }
        if (t2 == 0 && t1 == 2) {
            errortype = new ErrorType(STRINGSJ,STRINGSJ);
            return errortype;
        }
        if (t2 == 1 && t1 == 2) {
            errortype = new ErrorType(STRINGSJ,STRINGSJ);
            return errortype;
        }

        /** -1 with any type is the type because it'll generate an error*/
        if(t1 == 0 && t2 == -1){
            errortype = new ErrorType(INTSJ,-1);
            return errortype;
        }
        if(t1 == 1 && t2 == -1){
            errortype = new ErrorType(FLOATSJ,-1);
            return errortype;
        }
        if(t1 == 2 && t2 == -1){
            errortype = new ErrorType(STRINGSJ,-1);
            return errortype;
        }
        if(t1 == -1 && t2 == 0){
            errortype = new ErrorType(INTSJ,-1);
            return errortype;
        }
        if(t1 == -1 && t2 == 1){
            errortype = new ErrorType(FLOATSJ,-1);
            return errortype;
        }
        if(t1 == -1 && t2 == 2){
            errortype = new ErrorType(FLOATSJ,-1);
            return errortype;
        }

        return new ErrorType(STRINGSJ,-1);


    }

    private int getresultingValueOfInteger(String val1 , String val2, String op){
        int result = 0;
        int v1 = Integer.valueOf(val1);
        int v2 = Integer.valueOf(val2);
        switch (op){
            case "*": result = v1 * v2;
                break;
            case "/": result = v1 / v2;
                break;
            case "+": result = v1 + v2;
                break;
            case  "-": result = v1 - v2;
                break;

        }

        return result;
    }

    private float getresultingValueOfFloat(String val1 , String val2, String op){
        float result = 0 ;
        float v1 = Float.valueOf(val1);
        float v2 = Float.valueOf(val2);
        switch (op){
            case "*": result = v1 * v2;
                break;
            case "/": result = v1 / v2;
                break;
            case "+": result = v1 + v2;
                break;
            case  "-": result = v1 - v2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + op);
        }

        return result;
    }

    private String getresultingValueOfString(String val1 , String val2, String op){
        StringBuilder result = new StringBuilder() ;

        switch (op){
            case "+":{
                result.append(val1);
                result.append(val2);
            }
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + op);
        }

        return result.toString();
    }
    private String getType(int t){
        switch (t){
            case 0: return "int_SJ";
            case 1: return "float_SJ";
            case 2: return "String_SJ";
        }
        return "";
    }



    public LinkedList<String> getErrors(){
        return this.errors;
    }
    public TableSymbol getTs(){return this.ts;}


}

