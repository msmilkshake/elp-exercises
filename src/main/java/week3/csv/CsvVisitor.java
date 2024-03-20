// Generated from C:/Users/prnfi/kotlin/elp-exercises/src/main/kotlin/week3/csv/Csv.g4 by ANTLR 4.13.1
package week3.csv;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CsvParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CsvVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CsvParser#csv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsv(CsvParser.CsvContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(CsvParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(CsvParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CsvParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CsvParser.NumberContext ctx);
}