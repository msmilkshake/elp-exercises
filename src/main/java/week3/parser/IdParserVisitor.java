// Generated from C:/Users/prnfi/kotlin/elp-exercises/src/main/kotlin/week3/parser/IdParser.g4 by ANTLR 4.13.1
package week3.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IdParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IdParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IdParserParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(IdParserParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link IdParserParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(IdParserParser.IdContext ctx);
}