import LexicalAnalyse.TableSymbol;
import LexicalAnalyse.TokenClass;

import java.util.LinkedList;

public class Quad extends grammarOfProjectBaseListener {
    /** this class is used to generate the quads for each instruction*/
    private LinkedList<String> stack = new LinkedList<>();
    private LinkedList<Integer> stackCondition = new LinkedList<>();
    private LinkedList<Integer> stackAlors = new LinkedList<>();
    private QuadMethods quad = new QuadMethods();
    private TableSymbol ts = new TableSymbol();
    private LinkedList<String> oc = new LinkedList<>();
    Routines routines;
    private String acc = "";
    /** cpt is used to genrate t1,t2,t3 ...*/
    private int cpt = 0,saveConditionBR,size=0,cptAnd = 0,cptOr =0;
    private boolean isAnd = false;


    public Quad(Routines routines){
        this.routines = routines;
    }

    //TODO if for

    /** generate quad*/
    @Override public void exitProg(grammarOfProjectParser.ProgContext ctx){
        /** if i detect an error than the prog should stop*/
        if(routines.getErrors().size()>0){
            return;
        }
        /** if no error then, i should add the quad of the end*/
        quad.addQuad("END","","","");
        /** display quad*/
        System.out.println("*** quad ***");
        for(int i=0;i<quad.size();i++){
            System.out.println(i+"-"+quad.getQuad(i).toString());
        }
        System.out.println("*** end of quads ***\n");
        /** display object code*/
        System.out.println(" **** Object code **** ");
        for(int i = 0;i<quad.size();i++){
            String temp = quad.getQuad(i).get(0);
            if(temp.compareTo("DATA SEGMENT") == 0)
                this.oc.add("DATA SEGMENT");
            if(temp.compareTo("DATA ENDS") == 0)
                this.oc.add("DATA ENDS");
            if(temp.compareTo("CODE SEGMENT") == 0)
                this.oc.add("CODE SEGMENT");
            if(temp.compareTo("END") == 0)
                this.oc.add("CODE ENDS");
            if(temp.compareTo("DEC") == 0){
                if(quad.getQuad(i).get(2).equals("string_SJ")|quad.getQuad(i).get(2).equals("int_SJ"))
                    this.oc.add(quad.getQuad(i).get(1)+" DD ?");
                else
                    this.oc.add(quad.getQuad(i).get(1)+" DW ?");
            }

            if(temp.compareTo("+")==0){
                LinkedList<String> tempOC = getInAcc(quad.getQuad(i).get(1),quad.getQuad(i).get(2));
                for(int j = 0; j<tempOC.size();j++){
                    this.oc.add(tempOC.get(j));
                }
                this.oc.add("ADD "+quad.getQuad(i).get(2));
                acc = quad.getQuad(i).get(3);
            }
            if(temp.compareTo("-")==0){
                LinkedList<String> tempOC = getInAcc(quad.getQuad(i).get(1),"");
                for(int j = 0; j<tempOC.size();j++){
                    this.oc.add(tempOC.get(j));
                }
                this.oc.add("SUB "+quad.getQuad(i).get(2));
                acc = quad.getQuad(i).get(3);
            }
            if(temp.compareTo("*")==0){
                LinkedList<String> tempOC = getInAcc(quad.getQuad(i).get(1),quad.getQuad(i).get(2));
                for(int j = 0; j<tempOC.size();j++){
                    this.oc.add(tempOC.get(j));
                }
                this.oc.add("MULT "+quad.getQuad(i).get(2));
                acc = quad.getQuad(i).get(3);
            }
            if(temp.compareTo("/")==0){
                LinkedList<String> tempOC = getInAcc(quad.getQuad(i).get(1),"");
                for(int j = 0; j<tempOC.size();j++){
                    this.oc.add(tempOC.get(j));
                }
                this.oc.add("DIV "+quad.getQuad(i).get(2));
                acc = quad.getQuad(i).get(3);
            }
            if(temp.compareTo(":=")==0){
                if(quad.getQuad(i).get(1).startsWith("T")){
                    this.oc.add("STORE "+quad.getQuad(i).get(3));
                    this.acc="";
                }
                else{
                    this.oc.add("LOAD "+quad.getQuad(i).get(1)+"\nSTORE "+quad.getQuad(i).get(3));
                    this.acc="";
                }
            }
            if(temp.compareTo("READ")==0){
                this.oc.add("IN port "+quad.getQuad(i).get(1));
            }

            if(temp.compareTo("WRITE")==0){
                this.oc.add("OUT "+quad.getQuad(i).get(1)+" port");
            }
            if(temp.compareTo("BLE")==0){
                this.oc.add("CMP "+quad.getQuad(i).get(2)+" "+quad.getQuad(i).get(3));
                this.oc.add("BLE "+quad.getQuad(Integer.valueOf(quad.getQuad(i).get(1))).get(0));
            }
            if(temp.compareTo("else")==0){
                this.oc.add("else: ");
            }
            if(temp.compareTo("alors")==0){
                this.oc.add("alors: ");
            }
            if(temp.compareTo("BL")==0){
                this.oc.add("CMP "+quad.getQuad(i).get(2)+" "+quad.getQuad(i).get(3));
                this.oc.add("BL "+quad.getQuad(Integer.valueOf(quad.getQuad(i).get(1))).get(0));
            }
            if(temp.compareTo("BNE")==0){
                this.oc.add("CMP "+quad.getQuad(i).get(2)+" "+quad.getQuad(i).get(3));
                this.oc.add("BNE "+quad.getQuad(Integer.valueOf(quad.getQuad(i).get(1))).get(0));
            }
            if(temp.compareTo("BE")==0){
                this.oc.add("CMP "+quad.getQuad(i).get(2)+" "+quad.getQuad(i).get(3));
                this.oc.add("BE "+quad.getQuad(Integer.valueOf(quad.getQuad(i).get(1))).get(0));
            }
            if(temp.compareTo("BGE")==0){
                this.oc.add("CMP "+quad.getQuad(i).get(2)+" "+quad.getQuad(i).get(3));
                this.oc.add("BGE "+quad.getQuad(Integer.valueOf(quad.getQuad(i).get(1))).get(0));
            }
            if(temp.compareTo("BG")==0){
                this.oc.add("CMP "+quad.getQuad(i).get(2)+" "+quad.getQuad(i).get(3));
                this.oc.add("BG "+quad.getQuad(Integer.valueOf(quad.getQuad(i).get(1))).get(0));
            }



        }

        for(int i =0; i<this.oc.size();i++){
            System.out.println(oc.get(i));
        }
        System.out.println(" **** End of Object code **** ");

    }

    @Override public void exitModificateur(grammarOfProjectParser.ModificateurContext ctx) {
        quad.addQuad("DATA SEGMENT","","","");
    }
    @Override public void exitDeclaration(grammarOfProjectParser.DeclarationContext ctx) {
        for (int i=0;i<quad.size();i++){
            if(quad.getQuad(i).get(0).equals("DATA ENDS"))
                return;
        }
        quad.addQuad("DATA ENDS","","","");
        for (int i=0;i<quad.size();i++){
            if(quad.getQuad(i).get(0).equals("CODE SEGMENT"))
                return;
        }
        quad.addQuad("CODE SEGMENT","","","");

    }


    @Override public void exitDecvar(grammarOfProjectParser.DecvarContext ctx){
        grammarOfProjectParser.VariablelistContext variablelist = ctx.variablelist();
        /** loop variablelist
         * for each variable, i generate DEC*/

        for( ; ; variablelist = variablelist.variablelist()){
            String nameOfVariable = variablelist.getChild(0).getText();

            quad.addQuad("DEC",nameOfVariable,getType(this.routines.getTs().getToken(nameOfVariable).getType()),"");

            if(variablelist.variablelist() == null){
                return;
            }
        }
    }

    /** assignment quad*/
    @Override public void exitAssignment(grammarOfProjectParser.AssignmentContext ctx){
        String tmp = stack.removeLast();
        quad.addQuad(":=",tmp,"",ctx.identifier().getText());

    }

    /**
     * for each operation, i generate its own quad
     * @param ctx
     */
    @Override public void exitArithmetic_expression(grammarOfProjectParser.Arithmetic_expressionContext ctx){
        /** push the value*/
        if(ctx.val() != null){
            stack.add(ctx.val().getText());
        }
        /** push the idf*/
        if(ctx.identifier() != null){
            stack.add(ctx.identifier().getText());
        }
        /** quad of PLUS +*/
        if(ctx.PLUS() != null){
            String temp = "T"+cpt;
            String right = stack.removeLast();
            String left = stack.removeLast();
            quad.addQuad("+",left,right,temp);
            cpt ++;
            stack.add(temp);
        }
        /** quad of MINUS -*/
        if(ctx.MINUS() != null){
            String temp = "T"+cpt;
            String right = stack.removeLast();
            String left = stack.removeLast();
            quad.addQuad("-",left,right,temp);
            cpt ++;
            stack.add(temp);
        }
        /** quad of MUL*/
        if(ctx.MUL() != null){
            String temp = "T"+cpt;
            String right = stack.removeLast();
            String left = stack.removeLast();
            quad.addQuad("*",left,right,temp);
            cpt ++;
            stack.add(temp);
        }
        /** DIV's quad*/
        if(ctx.DIV() != null){
            String temp = "T"+cpt;
            String right = stack.removeLast();
            String left = stack.removeLast();
            quad.addQuad("/",left,right,temp);
            cpt ++;
            stack.add(temp);
        }
    }

    /** quad of input*/
    @Override public void exitInput(grammarOfProjectParser.InputContext ctx) {
        quad.addQuad("READ",ctx.identifier().getText(),"","");
    }
    /** quad of output*/
    @Override public void exitOutput(grammarOfProjectParser.OutputContext ctx) {
        quad.addQuad("WRITE",ctx.identifier().getText(),this.routines.getTs().getToken(ctx.identifier().getText()).getValue(),"");
    }
    int saveCondition;
    /** quad of >|<|>=...*/
    @Override public void exitArithmetic(grammarOfProjectParser.ArithmeticContext ctx) {
        if(ctx.GREATER() != null){
            /** push operation and value to control it in and or or or not*/
            saveCondition = quad.addQuad("BLE","",stack.remove(),stack.remove());
            stackCondition.add(saveCondition);
        }
        if(ctx.GREATEROREQUAL() != null){
            saveCondition = quad.addQuad("BL","",stack.remove(),stack.remove());
            stackCondition.add(saveCondition);

        }
        if(ctx.EQUAL()!= null){
            saveCondition = quad.addQuad("BNE","",stack.remove(),stack.remove());
            stackCondition.add(saveCondition);
        }
        if(ctx.DIFFERENT()!=null){
            saveCondition = quad.addQuad("BE","",stack.remove(),stack.remove());
            stackCondition.add(saveCondition);
        }
        if(ctx.LESS() != null){
            saveCondition = quad.addQuad("BGE","",stack.remove(),stack.remove());
            stackCondition.add(saveCondition);
        }
        if(ctx.LESSOREQUAL() != null){
            saveCondition = quad.addQuad("BG","",stack.remove(),stack.remove());
            stackCondition.add(saveCondition);
        }
    }

    @Override public void exitLogic(grammarOfProjectParser.LogicContext ctx) {
        /** if it's about and
         * we've nothing to do, because we need to jump to else
         * each quad of and will jump to else nothing more
         */
        size = quad.size();
        if(ctx.AND() != null){
            isAnd = true;
            cptAnd ++;
            size--;
        }
        if(ctx.OR() != null){
            /**
             * the first should be false we have to make sure that the second is also
             * false to jump to else
             */
            int saveConditionC = stackCondition.removeLast();
            if(!stackCondition.isEmpty()){
                while(cptAnd != 0){

                    cptAnd --;
                    int saveCondition = stackCondition.remove();
                    quad.getQuad(saveCondition-1).set(1,""+(saveCondition+1));
                }
                int saveCondition = stackCondition.remove();
                quad.getQuad(saveCondition-1).set(0,inverseQuad( quad.getQuad(saveCondition-1).get(0)));
                stackAlors.add(saveCondition);
            }
            stackCondition.add(saveConditionC);
        }
        if(ctx.NOT() != null){

            if(!stackCondition.isEmpty()){
                int saveCondition = stackCondition.removeLast();
                quad.getQuad(saveCondition-1).set(0,inverseQuad(quad.getQuad(saveCondition-1).get(0)));
                stackCondition.addLast(saveCondition);
            }

        }
    }
    @Override public void exitAlors(grammarOfProjectParser.AlorsContext ctx) {
        quad.addQuad("alors","","","");
        while(!stackAlors.isEmpty()){
            int saveCondition = stackAlors.remove();
            quad.getQuad(saveCondition-1).set(1,""+(quad.size()-1));
        }

    }
    @Override public void exitSiinsts(grammarOfProjectParser.SiinstsContext ctx) {

        while(!stackCondition.isEmpty()){
            int saveCondition = stackCondition.remove();
            quad.getQuad(saveCondition-1).set(1,""+(quad.size()));
        }
        quad.getQuad(saveConditionBR-1).set(1,""+(quad.size()));
    }
    @Override public void enterSinon(grammarOfProjectParser.SinonContext ctx) {
        saveConditionBR = quad.addQuad("BR","","","");
        quad.addQuad("else","","","");
        while(!stackCondition.isEmpty()){
            int saveCondition = stackCondition.remove();
            quad.getQuad(saveCondition-1).set(1,""+(quad.size()-1));
        }
    }


    /** helpful method*/
    private LinkedList<String> getInAcc(String x, String y){
        LinkedList<String> gen = new LinkedList<>();
        if(acc.equals("")){
            gen.add("LOAD "+x);
            acc = x;
        }else if(acc.equals(y)){
            String t;
            t = x;
            x = y;
            y =t;
        }else if(!acc.equals(x)){
            gen.add("STORE "+acc);
            gen.add("LOAD "+x);
            acc = x;
        }
        return gen;
    }

    private String getType(int val){
        switch (val){
            case 0: return "int_SJ";
            case 1: return "float_SJ";
            case 2: return "string_SJ";
        }
        return null;
    }

    private String inverseQuad(String qc){
        switch (qc){
            case "BL": return "BGE";
            case "BLE": return "BG";
            case "BGE": return "BL";
            case "BG": return "BLE";
            case "BE": return "BNE";
            case "BNE": return "BE";
        }
        return "";
    }


}
