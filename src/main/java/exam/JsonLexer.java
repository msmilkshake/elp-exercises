// Generated from C:/Users/prnfi/kotlin/elp-exercises/src/main/kotlin/exam/Json.g4 by ANTLR 4.13.1
package exam;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JsonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, STR=7, TRUE=8, FALSE=9, 
		INT=10, FLOAT=11, NULL=12, SPACE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "STR", "TRUE", "FALSE", 
			"INT", "FLOAT", "NULL", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'{'", "','", "'}'", "'['", "']'", null, "'true'", "'false'", 
			null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "STR", "TRUE", "FALSE", "INT", 
			"FLOAT", "NULL", "SPACE"
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


	public JsonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Json.g4"; }

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
		"\u0004\u0000\rY\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006*\b"+
		"\u0006\n\u0006\f\u0006-\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0004\t=\b\t\u000b\t\f\t>\u0001\n\u0004\nB"+
		"\b\n\u000b\n\f\nC\u0003\nF\b\n\u0001\n\u0001\n\u0004\nJ\b\n\u000b\n\f"+
		"\nK\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0004\fT\b\f\u000b\f\f\fU\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000\u0003\u0003"+
		"\u0000\n\n\r\r\"\"\u0001\u000009\u0003\u0000\n\n\r\r  ^\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003\u001d\u0001\u0000\u0000"+
		"\u0000\u0005\u001f\u0001\u0000\u0000\u0000\u0007!\u0001\u0000\u0000\u0000"+
		"\t#\u0001\u0000\u0000\u0000\u000b%\u0001\u0000\u0000\u0000\r\'\u0001\u0000"+
		"\u0000\u0000\u000f0\u0001\u0000\u0000\u0000\u00115\u0001\u0000\u0000\u0000"+
		"\u0013<\u0001\u0000\u0000\u0000\u0015E\u0001\u0000\u0000\u0000\u0017M"+
		"\u0001\u0000\u0000\u0000\u0019S\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		":\u0000\u0000\u001c\u0002\u0001\u0000\u0000\u0000\u001d\u001e\u0005{\u0000"+
		"\u0000\u001e\u0004\u0001\u0000\u0000\u0000\u001f \u0005,\u0000\u0000 "+
		"\u0006\u0001\u0000\u0000\u0000!\"\u0005}\u0000\u0000\"\b\u0001\u0000\u0000"+
		"\u0000#$\u0005[\u0000\u0000$\n\u0001\u0000\u0000\u0000%&\u0005]\u0000"+
		"\u0000&\f\u0001\u0000\u0000\u0000\'+\u0005\"\u0000\u0000(*\b\u0000\u0000"+
		"\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000./\u0005\"\u0000\u0000/\u000e\u0001\u0000\u0000\u0000"+
		"01\u0005t\u0000\u000012\u0005r\u0000\u000023\u0005u\u0000\u000034\u0005"+
		"e\u0000\u00004\u0010\u0001\u0000\u0000\u000056\u0005f\u0000\u000067\u0005"+
		"a\u0000\u000078\u0005l\u0000\u000089\u0005s\u0000\u00009:\u0005e\u0000"+
		"\u0000:\u0012\u0001\u0000\u0000\u0000;=\u0007\u0001\u0000\u0000<;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?\u0014\u0001\u0000\u0000\u0000@B\u0007\u0001"+
		"\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000"+
		"EA\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GI\u0005.\u0000\u0000HJ\u0007\u0001\u0000\u0000IH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000L\u0016\u0001\u0000\u0000\u0000MN\u0005n\u0000\u0000NO\u0005"+
		"u\u0000\u0000OP\u0005l\u0000\u0000PQ\u0005l\u0000\u0000Q\u0018\u0001\u0000"+
		"\u0000\u0000RT\u0007\u0002\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WX\u0006\f\u0000\u0000X\u001a\u0001\u0000\u0000"+
		"\u0000\u0007\u0000+>CEKU\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}