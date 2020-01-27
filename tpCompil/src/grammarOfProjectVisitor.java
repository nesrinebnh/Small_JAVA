// Generated from C:/Users/ASUS/IdeaProjects/tpCompil/src\grammarOfProject.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammarOfProjectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammarOfProjectVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(grammarOfProjectParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(grammarOfProjectParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#libraryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryName(grammarOfProjectParser.LibraryNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#modificateur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModificateur(grammarOfProjectParser.ModificateurContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(grammarOfProjectParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#decvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecvar(grammarOfProjectParser.DecvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(grammarOfProjectParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#variablelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablelist(grammarOfProjectParser.VariablelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#insts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsts(grammarOfProjectParser.InstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst(grammarOfProjectParser.InstContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(grammarOfProjectParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(grammarOfProjectParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_expression(grammarOfProjectParser.Arithmetic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(grammarOfProjectParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(grammarOfProjectParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat(grammarOfProjectParser.FormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(grammarOfProjectParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#siinsts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSiinsts(grammarOfProjectParser.SiinstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#alors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlors(grammarOfProjectParser.AlorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#sinon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinon(grammarOfProjectParser.SinonContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(grammarOfProjectParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(grammarOfProjectParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarOfProjectParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(grammarOfProjectParser.ArithmeticContext ctx);
}