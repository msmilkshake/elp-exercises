// Generated from C:/Users/prnfi/kotlin/elp-exercises/src/main/kotlin/exam/JQL.g4 by ANTLR 4.13.1
package exam;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JQLParser}.
 */
public interface JQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JQLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(JQLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(JQLParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(JQLParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(JQLParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(JQLParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(JQLParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoad(JQLParser.LoadContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoad(JQLParser.LoadContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#save}.
	 * @param ctx the parse tree
	 */
	void enterSave(JQLParser.SaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#save}.
	 * @param ctx the parse tree
	 */
	void exitSave(JQLParser.SaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(JQLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(JQLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#aggregator}.
	 * @param ctx the parse tree
	 */
	void enterAggregator(JQLParser.AggregatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#aggregator}.
	 * @param ctx the parse tree
	 */
	void exitAggregator(JQLParser.AggregatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#accessor}.
	 * @param ctx the parse tree
	 */
	void enterAccessor(JQLParser.AccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#accessor}.
	 * @param ctx the parse tree
	 */
	void exitAccessor(JQLParser.AccessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#finder}.
	 * @param ctx the parse tree
	 */
	void enterFinder(JQLParser.FinderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#finder}.
	 * @param ctx the parse tree
	 */
	void exitFinder(JQLParser.FinderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jValue}.
	 * @param ctx the parse tree
	 */
	void enterJValue(JQLParser.JValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jValue}.
	 * @param ctx the parse tree
	 */
	void exitJValue(JQLParser.JValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jField}.
	 * @param ctx the parse tree
	 */
	void enterJField(JQLParser.JFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jField}.
	 * @param ctx the parse tree
	 */
	void exitJField(JQLParser.JFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jObject}.
	 * @param ctx the parse tree
	 */
	void enterJObject(JQLParser.JObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jObject}.
	 * @param ctx the parse tree
	 */
	void exitJObject(JQLParser.JObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jArray}.
	 * @param ctx the parse tree
	 */
	void enterJArray(JQLParser.JArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jArray}.
	 * @param ctx the parse tree
	 */
	void exitJArray(JQLParser.JArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jNumber}.
	 * @param ctx the parse tree
	 */
	void enterJNumber(JQLParser.JNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jNumber}.
	 * @param ctx the parse tree
	 */
	void exitJNumber(JQLParser.JNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jString}.
	 * @param ctx the parse tree
	 */
	void enterJString(JQLParser.JStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jString}.
	 * @param ctx the parse tree
	 */
	void exitJString(JQLParser.JStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jBoolean}.
	 * @param ctx the parse tree
	 */
	void enterJBoolean(JQLParser.JBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jBoolean}.
	 * @param ctx the parse tree
	 */
	void exitJBoolean(JQLParser.JBooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jNull}.
	 * @param ctx the parse tree
	 */
	void enterJNull(JQLParser.JNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jNull}.
	 * @param ctx the parse tree
	 */
	void exitJNull(JQLParser.JNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jVar}.
	 * @param ctx the parse tree
	 */
	void enterJVar(JQLParser.JVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jVar}.
	 * @param ctx the parse tree
	 */
	void exitJVar(JQLParser.JVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(JQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(JQLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(JQLParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(JQLParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(JQLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(JQLParser.VariableContext ctx);
}