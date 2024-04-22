// Generated from C:/Users/prnfi/kotlin/elp-exercises/src/main/kotlin/exam/Json.g4 by ANTLR 4.13.1
package exam;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonParser}.
 */
public interface JsonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonParser#jValue}.
	 * @param ctx the parse tree
	 */
	void enterJValue(JsonParser.JValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#jValue}.
	 * @param ctx the parse tree
	 */
	void exitJValue(JsonParser.JValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#jArray}.
	 * @param ctx the parse tree
	 */
	void enterJArray(JsonParser.JArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#jArray}.
	 * @param ctx the parse tree
	 */
	void exitJArray(JsonParser.JArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#jNumber}.
	 * @param ctx the parse tree
	 */
	void enterJNumber(JsonParser.JNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#jNumber}.
	 * @param ctx the parse tree
	 */
	void exitJNumber(JsonParser.JNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#jString}.
	 * @param ctx the parse tree
	 */
	void enterJString(JsonParser.JStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#jString}.
	 * @param ctx the parse tree
	 */
	void exitJString(JsonParser.JStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#jBoolean}.
	 * @param ctx the parse tree
	 */
	void enterJBoolean(JsonParser.JBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#jBoolean}.
	 * @param ctx the parse tree
	 */
	void exitJBoolean(JsonParser.JBooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#jNull}.
	 * @param ctx the parse tree
	 */
	void enterJNull(JsonParser.JNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#jNull}.
	 * @param ctx the parse tree
	 */
	void exitJNull(JsonParser.JNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(JsonParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(JsonParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#jField}.
	 * @param ctx the parse tree
	 */
	void enterJField(JsonParser.JFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#jField}.
	 * @param ctx the parse tree
	 */
	void exitJField(JsonParser.JFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#jObject}.
	 * @param ctx the parse tree
	 */
	void enterJObject(JsonParser.JObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#jObject}.
	 * @param ctx the parse tree
	 */
	void exitJObject(JsonParser.JObjectContext ctx);
}