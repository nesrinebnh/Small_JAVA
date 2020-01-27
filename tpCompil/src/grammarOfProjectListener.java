// Generated from C:/Users/ASUS/IdeaProjects/tpCompil/src\grammarOfProject.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammarOfProjectParser}.
 */
public interface grammarOfProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(grammarOfProjectParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(grammarOfProjectParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(grammarOfProjectParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(grammarOfProjectParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#libraryName}.
	 * @param ctx the parse tree
	 */
	void enterLibraryName(grammarOfProjectParser.LibraryNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#libraryName}.
	 * @param ctx the parse tree
	 */
	void exitLibraryName(grammarOfProjectParser.LibraryNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#modificateur}.
	 * @param ctx the parse tree
	 */
	void enterModificateur(grammarOfProjectParser.ModificateurContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#modificateur}.
	 * @param ctx the parse tree
	 */
	void exitModificateur(grammarOfProjectParser.ModificateurContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(grammarOfProjectParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(grammarOfProjectParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#decvar}.
	 * @param ctx the parse tree
	 */
	void enterDecvar(grammarOfProjectParser.DecvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#decvar}.
	 * @param ctx the parse tree
	 */
	void exitDecvar(grammarOfProjectParser.DecvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(grammarOfProjectParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(grammarOfProjectParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#variablelist}.
	 * @param ctx the parse tree
	 */
	void enterVariablelist(grammarOfProjectParser.VariablelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#variablelist}.
	 * @param ctx the parse tree
	 */
	void exitVariablelist(grammarOfProjectParser.VariablelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#insts}.
	 * @param ctx the parse tree
	 */
	void enterInsts(grammarOfProjectParser.InstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#insts}.
	 * @param ctx the parse tree
	 */
	void exitInsts(grammarOfProjectParser.InstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(grammarOfProjectParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(grammarOfProjectParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(grammarOfProjectParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(grammarOfProjectParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(grammarOfProjectParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(grammarOfProjectParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expression(grammarOfProjectParser.Arithmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expression(grammarOfProjectParser.Arithmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(grammarOfProjectParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(grammarOfProjectParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(grammarOfProjectParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(grammarOfProjectParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(grammarOfProjectParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(grammarOfProjectParser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(grammarOfProjectParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(grammarOfProjectParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#siinsts}.
	 * @param ctx the parse tree
	 */
	void enterSiinsts(grammarOfProjectParser.SiinstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#siinsts}.
	 * @param ctx the parse tree
	 */
	void exitSiinsts(grammarOfProjectParser.SiinstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#alors}.
	 * @param ctx the parse tree
	 */
	void enterAlors(grammarOfProjectParser.AlorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#alors}.
	 * @param ctx the parse tree
	 */
	void exitAlors(grammarOfProjectParser.AlorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#sinon}.
	 * @param ctx the parse tree
	 */
	void enterSinon(grammarOfProjectParser.SinonContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#sinon}.
	 * @param ctx the parse tree
	 */
	void exitSinon(grammarOfProjectParser.SinonContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(grammarOfProjectParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(grammarOfProjectParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(grammarOfProjectParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(grammarOfProjectParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarOfProjectParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(grammarOfProjectParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarOfProjectParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(grammarOfProjectParser.ArithmeticContext ctx);
}