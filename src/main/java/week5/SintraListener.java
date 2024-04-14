// Generated from C:/Users/prnfi/kotlin/elp-exercises/src/main/kotlin/week5/Sintra.g4 by ANTLR 4.13.1
package week5;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SintraParser}.
 */
public interface SintraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SintraParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(SintraParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintraParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(SintraParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintraParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(SintraParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintraParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(SintraParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintraParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(SintraParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintraParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(SintraParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintraParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SintraParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintraParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SintraParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintraParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SintraParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintraParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SintraParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintraParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SintraParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintraParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SintraParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link SintraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(SintraParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link SintraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(SintraParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link SintraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(SintraParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link SintraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(SintraParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link SintraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(SintraParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link SintraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(SintraParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link SintraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(SintraParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link SintraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(SintraParser.VariableExpressionContext ctx);
}