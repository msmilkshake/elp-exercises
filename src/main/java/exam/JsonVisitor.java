// Generated from C:/Users/prnfi/kotlin/elp-exercises/src/main/kotlin/exam/Json.g4 by ANTLR 4.13.1
package exam;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JsonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JsonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JsonParser#jValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJValue(JsonParser.JValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#jField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJField(JsonParser.JFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#jObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJObject(JsonParser.JObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#jArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJArray(JsonParser.JArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#jNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJNumber(JsonParser.JNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#jString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJString(JsonParser.JStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#jBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJBoolean(JsonParser.JBooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#jNull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJNull(JsonParser.JNullContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(JsonParser.NameContext ctx);
}