// Generated from C:/Users/prnfi/kotlin/elp-exercises/src/main/kotlin/week3/parser/IdParser.g4 by ANTLR 4.13.1
package week3.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IdParserParser}.
 */
public interface IdParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IdParserParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(IdParserParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdParserParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(IdParserParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link IdParserParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(IdParserParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link IdParserParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(IdParserParser.IdContext ctx);
}