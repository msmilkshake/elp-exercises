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
	 * Enter a parse tree produced by {@link JQLParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(JQLParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(JQLParser.KeyContext ctx);
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
	 * Enter a parse tree produced by {@link JQLParser#jqValue}.
	 * @param ctx the parse tree
	 */
	void enterJqValue(JQLParser.JqValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jqValue}.
	 * @param ctx the parse tree
	 */
	void exitJqValue(JQLParser.JqValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jqField}.
	 * @param ctx the parse tree
	 */
	void enterJqField(JQLParser.JqFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jqField}.
	 * @param ctx the parse tree
	 */
	void exitJqField(JQLParser.JqFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jqObject}.
	 * @param ctx the parse tree
	 */
	void enterJqObject(JQLParser.JqObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jqObject}.
	 * @param ctx the parse tree
	 */
	void exitJqObject(JQLParser.JqObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jqArray}.
	 * @param ctx the parse tree
	 */
	void enterJqArray(JQLParser.JqArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jqArray}.
	 * @param ctx the parse tree
	 */
	void exitJqArray(JQLParser.JqArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jqNumber}.
	 * @param ctx the parse tree
	 */
	void enterJqNumber(JQLParser.JqNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jqNumber}.
	 * @param ctx the parse tree
	 */
	void exitJqNumber(JQLParser.JqNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jqString}.
	 * @param ctx the parse tree
	 */
	void enterJqString(JQLParser.JqStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jqString}.
	 * @param ctx the parse tree
	 */
	void exitJqString(JQLParser.JqStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jqBoolean}.
	 * @param ctx the parse tree
	 */
	void enterJqBoolean(JQLParser.JqBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jqBoolean}.
	 * @param ctx the parse tree
	 */
	void exitJqBoolean(JQLParser.JqBooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jqNull}.
	 * @param ctx the parse tree
	 */
	void enterJqNull(JQLParser.JqNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jqNull}.
	 * @param ctx the parse tree
	 */
	void exitJqNull(JQLParser.JqNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link JQLParser#jqVar}.
	 * @param ctx the parse tree
	 */
	void enterJqVar(JQLParser.JqVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link JQLParser#jqVar}.
	 * @param ctx the parse tree
	 */
	void exitJqVar(JQLParser.JqVarContext ctx);
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