// Generated from C:/Users/prnfi/kotlin/elp-exercises/src/main/kotlin/week3/csv/Csv.g4 by ANTLR 4.13.1
package week3.csv;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CsvLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STR=1, SPACE=2, NEWLINE=3, SEP=4, TRUE=5, FALSE=6, INT=7, FLOAT=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STR", "SPACE", "NEWLINE", "SEP", "TRUE", "FALSE", "INT", "FLOAT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STR", "SPACE", "NEWLINE", "SEP", "TRUE", "FALSE", "INT", "FLOAT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CsvLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Csv.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\bE\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000"+
		"\f\u0000\u0017\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001"+
		"\u001c\b\u0001\u000b\u0001\f\u0001\u001d\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002%\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0004\u00065\b\u0006\u000b\u0006\f\u00066\u0001\u0007\u0004\u0007"+
		":\b\u0007\u000b\u0007\f\u0007;\u0003\u0007>\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0004\u0007B\b\u0007\u000b\u0007\f\u0007C\u0000\u0000\b\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0001\u0000\u0003\u0003\u0000\n\n\r\r\"\"\u0002\u0000,,;;\u0001\u0000"+
		"09K\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0001"+
		"\u0011\u0001\u0000\u0000\u0000\u0003\u001b\u0001\u0000\u0000\u0000\u0005"+
		"$\u0001\u0000\u0000\u0000\u0007&\u0001\u0000\u0000\u0000\t(\u0001\u0000"+
		"\u0000\u0000\u000b-\u0001\u0000\u0000\u0000\r4\u0001\u0000\u0000\u0000"+
		"\u000f=\u0001\u0000\u0000\u0000\u0011\u0015\u0005\"\u0000\u0000\u0012"+
		"\u0014\b\u0000\u0000\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017"+
		"\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0015"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0005\"\u0000\u0000\u0019\u0002\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0005 \u0000\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000"+
		"\u0000\u0000\u001f \u0006\u0001\u0000\u0000 \u0004\u0001\u0000\u0000\u0000"+
		"!%\u0005\n\u0000\u0000\"#\u0005\n\u0000\u0000#%\u0005\r\u0000\u0000$!"+
		"\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%\u0006\u0001\u0000"+
		"\u0000\u0000&\'\u0007\u0001\u0000\u0000\'\b\u0001\u0000\u0000\u0000()"+
		"\u0005t\u0000\u0000)*\u0005r\u0000\u0000*+\u0005u\u0000\u0000+,\u0005"+
		"e\u0000\u0000,\n\u0001\u0000\u0000\u0000-.\u0005f\u0000\u0000./\u0005"+
		"a\u0000\u0000/0\u0005l\u0000\u000001\u0005s\u0000\u000012\u0005e\u0000"+
		"\u00002\f\u0001\u0000\u0000\u000035\u0007\u0002\u0000\u000043\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u00007\u000e\u0001\u0000\u0000\u00008:\u0007\u0002\u0000"+
		"\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=9\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?A\u0005.\u0000\u0000@B\u0007\u0002\u0000\u0000A@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000D\u0010\u0001\u0000\u0000\u0000\b\u0000\u0015\u001d$6;=C\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}