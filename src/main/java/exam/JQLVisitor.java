// Generated from C:/Users/prnfi/kotlin/elp-exercises/src/main/kotlin/exam/JQL.g4 by ANTLR 4.13.1
package exam;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JQLParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(JQLParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(JQLParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(JQLParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#load}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoad(JQLParser.LoadContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#save}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSave(JQLParser.SaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(JQLParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#accessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessor(JQLParser.AccessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#aggregator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregator(JQLParser.AggregatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(JQLParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#finder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinder(JQLParser.FinderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#jqValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJqValue(JQLParser.JqValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#jqField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJqField(JQLParser.JqFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#jqObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJqObject(JQLParser.JqObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#jqArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJqArray(JQLParser.JqArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#jqNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJqNumber(JQLParser.JqNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#jqString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJqString(JQLParser.JqStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#jqBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJqBoolean(JQLParser.JqBooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#jqNull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJqNull(JQLParser.JqNullContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#jqVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJqVar(JQLParser.JqVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(JQLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(JQLParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JQLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(JQLParser.VariableContext ctx);
}