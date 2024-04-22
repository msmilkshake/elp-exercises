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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, FIELD=7, STR=8, TRUE=9, 
		FALSE=10, INT=11, FLOAT=12, NULL=13, NEWLINE=14, SPACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "FIELD", "STR", "TRUE", 
			"FALSE", "INT", "FLOAT", "NULL", "NEWLINE", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'", "':'", "'{'", "'}'", null, null, "'true'", 
			"'false'", null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "FIELD", "STR", "TRUE", "FALSE", 
			"INT", "FLOAT", "NULL", "NEWLINE", "SPACE"
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
		"\u0004\u0000\u000fm\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0004\u0006.\b\u0006\u000b\u0006\f\u0006/\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u00076\b\u0007\n\u0007\f\u0007"+
		"9\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004\nI\b"+
		"\n\u000b\n\f\nJ\u0001\u000b\u0004\u000bN\b\u000b\u000b\u000b\f\u000bO"+
		"\u0003\u000bR\b\u000b\u0001\u000b\u0001\u000b\u0004\u000bV\b\u000b\u000b"+
		"\u000b\f\u000bW\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0003"+
		"\r`\b\r\u0001\r\u0004\rc\b\r\u000b\r\f\rd\u0001\u000e\u0004\u000eh\b\u000e"+
		"\u000b\u000e\f\u000ei\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u0001\u0000\u0003\u0003\u000009AZaz\u0003\u0000\n\n\r\r\"\"\u0001"+
		"\u000009u\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000"+
		"\u0003!\u0001\u0000\u0000\u0000\u0005#\u0001\u0000\u0000\u0000\u0007%"+
		"\u0001\u0000\u0000\u0000\t\'\u0001\u0000\u0000\u0000\u000b)\u0001\u0000"+
		"\u0000\u0000\r+\u0001\u0000\u0000\u0000\u000f3\u0001\u0000\u0000\u0000"+
		"\u0011<\u0001\u0000\u0000\u0000\u0013A\u0001\u0000\u0000\u0000\u0015H"+
		"\u0001\u0000\u0000\u0000\u0017Q\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000"+
		"\u0000\u0000\u001bb\u0001\u0000\u0000\u0000\u001dg\u0001\u0000\u0000\u0000"+
		"\u001f \u0005[\u0000\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0005,\u0000"+
		"\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005]\u0000\u0000$\u0006\u0001"+
		"\u0000\u0000\u0000%&\u0005:\u0000\u0000&\b\u0001\u0000\u0000\u0000\'("+
		"\u0005{\u0000\u0000(\n\u0001\u0000\u0000\u0000)*\u0005}\u0000\u0000*\f"+
		"\u0001\u0000\u0000\u0000+-\u0005\"\u0000\u0000,.\u0007\u0000\u0000\u0000"+
		"-,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0005\"\u0000"+
		"\u00002\u000e\u0001\u0000\u0000\u000037\u0005\"\u0000\u000046\b\u0001"+
		"\u0000\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u0000:;\u0005\"\u0000\u0000;\u0010\u0001\u0000\u0000"+
		"\u0000<=\u0005t\u0000\u0000=>\u0005r\u0000\u0000>?\u0005u\u0000\u0000"+
		"?@\u0005e\u0000\u0000@\u0012\u0001\u0000\u0000\u0000AB\u0005f\u0000\u0000"+
		"BC\u0005a\u0000\u0000CD\u0005l\u0000\u0000DE\u0005s\u0000\u0000EF\u0005"+
		"e\u0000\u0000F\u0014\u0001\u0000\u0000\u0000GI\u0007\u0002\u0000\u0000"+
		"HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000K\u0016\u0001\u0000\u0000\u0000LN\u0007"+
		"\u0002\u0000\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000"+
		"\u0000QM\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000SU\u0005.\u0000\u0000TV\u0007\u0002\u0000\u0000UT\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000X\u0018\u0001\u0000\u0000\u0000YZ\u0005n\u0000\u0000"+
		"Z[\u0005u\u0000\u0000[\\\u0005l\u0000\u0000\\]\u0005l\u0000\u0000]\u001a"+
		"\u0001\u0000\u0000\u0000^`\u0005\r\u0000\u0000_^\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0005\n\u0000\u0000"+
		"b_\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000e\u001c\u0001\u0000\u0000\u0000fh\u0005"+
		" \u0000\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"kl\u0006\u000e\u0000\u0000l\u001e\u0001\u0000\u0000\u0000\n\u0000/7JO"+
		"QW_di\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}