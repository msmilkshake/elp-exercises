// Generated from C:/Users/prnfi/kotlin/elp-exercises/src/main/kotlin/week3/csv/Csv.g4 by ANTLR 4.13.1
package week3.csv;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CsvParser}.
 */
public interface CsvListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CsvParser#csv}.
	 * @param ctx the parse tree
	 */
	void enterCsv(CsvParser.CsvContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#csv}.
	 * @param ctx the parse tree
	 */
	void exitCsv(CsvParser.CsvContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(CsvParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(CsvParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(CsvParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(CsvParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CsvParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CsvParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CsvParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CsvParser.NumberContext ctx);
}