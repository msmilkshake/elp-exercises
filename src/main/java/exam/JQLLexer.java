// Generated from C:/Users/prnfi/kotlin/elp-exercises/src/main/kotlin/exam/JQL.g4 by ANTLR 4.13.1
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
public class JQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, STR=15, AGGREGATORS=16, 
		ID=17, TRUE=18, FALSE=19, INT=20, FLOAT=21, NULL=22, NEWLINE=23, SPACE=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "STR", "AGGREGATORS", "ID", 
			"TRUE", "FALSE", "INT", "FLOAT", "NULL", "NEWLINE", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'load'", "'to'", "'save'", "'='", "'.'", "'|'", "'*'", "':'", 
			"'{'", "','", "'}'", "'['", "']'", "'$'", null, null, null, "'true'", 
			"'false'", null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STR", "AGGREGATORS", "ID", "TRUE", "FALSE", "INT", 
			"FLOAT", "NULL", "NEWLINE", "SPACE"
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


	public JQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JQL.g4"; }

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
		"\u0004\u0000\u0018\u00a8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000eW\b\u000e\n\u000e"+
		"\f\u000eZ\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000fo\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0005\u0010s\b\u0010\n\u0010\f\u0010v\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u0084"+
		"\b\u0013\u000b\u0013\f\u0013\u0085\u0001\u0014\u0004\u0014\u0089\b\u0014"+
		"\u000b\u0014\f\u0014\u008a\u0003\u0014\u008d\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0004\u0014\u0091\b\u0014\u000b\u0014\f\u0014\u0092\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0003\u0016"+
		"\u009b\b\u0016\u0001\u0016\u0004\u0016\u009e\b\u0016\u000b\u0016\f\u0016"+
		"\u009f\u0001\u0017\u0004\u0017\u00a3\b\u0017\u000b\u0017\f\u0017\u00a4"+
		"\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0004\u0003"+
		"\u0000\n\n\r\r\"\"\u0001\u0000az\u0003\u000009AZaz\u0001\u000009\u00b4"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u00036\u0001\u0000"+
		"\u0000\u0000\u00059\u0001\u0000\u0000\u0000\u0007>\u0001\u0000\u0000\u0000"+
		"\t@\u0001\u0000\u0000\u0000\u000bB\u0001\u0000\u0000\u0000\rD\u0001\u0000"+
		"\u0000\u0000\u000fF\u0001\u0000\u0000\u0000\u0011H\u0001\u0000\u0000\u0000"+
		"\u0013J\u0001\u0000\u0000\u0000\u0015L\u0001\u0000\u0000\u0000\u0017N"+
		"\u0001\u0000\u0000\u0000\u0019P\u0001\u0000\u0000\u0000\u001bR\u0001\u0000"+
		"\u0000\u0000\u001dT\u0001\u0000\u0000\u0000\u001fn\u0001\u0000\u0000\u0000"+
		"!p\u0001\u0000\u0000\u0000#w\u0001\u0000\u0000\u0000%|\u0001\u0000\u0000"+
		"\u0000\'\u0083\u0001\u0000\u0000\u0000)\u008c\u0001\u0000\u0000\u0000"+
		"+\u0094\u0001\u0000\u0000\u0000-\u009d\u0001\u0000\u0000\u0000/\u00a2"+
		"\u0001\u0000\u0000\u000012\u0005l\u0000\u000023\u0005o\u0000\u000034\u0005"+
		"a\u0000\u000045\u0005d\u0000\u00005\u0002\u0001\u0000\u0000\u000067\u0005"+
		"t\u0000\u000078\u0005o\u0000\u00008\u0004\u0001\u0000\u0000\u00009:\u0005"+
		"s\u0000\u0000:;\u0005a\u0000\u0000;<\u0005v\u0000\u0000<=\u0005e\u0000"+
		"\u0000=\u0006\u0001\u0000\u0000\u0000>?\u0005=\u0000\u0000?\b\u0001\u0000"+
		"\u0000\u0000@A\u0005.\u0000\u0000A\n\u0001\u0000\u0000\u0000BC\u0005|"+
		"\u0000\u0000C\f\u0001\u0000\u0000\u0000DE\u0005*\u0000\u0000E\u000e\u0001"+
		"\u0000\u0000\u0000FG\u0005:\u0000\u0000G\u0010\u0001\u0000\u0000\u0000"+
		"HI\u0005{\u0000\u0000I\u0012\u0001\u0000\u0000\u0000JK\u0005,\u0000\u0000"+
		"K\u0014\u0001\u0000\u0000\u0000LM\u0005}\u0000\u0000M\u0016\u0001\u0000"+
		"\u0000\u0000NO\u0005[\u0000\u0000O\u0018\u0001\u0000\u0000\u0000PQ\u0005"+
		"]\u0000\u0000Q\u001a\u0001\u0000\u0000\u0000RS\u0005$\u0000\u0000S\u001c"+
		"\u0001\u0000\u0000\u0000TX\u0005\"\u0000\u0000UW\b\u0000\u0000\u0000V"+
		"U\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000[\\\u0005\"\u0000\u0000\\\u001e\u0001\u0000\u0000\u0000]^"+
		"\u0005m\u0000\u0000^_\u0005a\u0000\u0000_o\u0005x\u0000\u0000`a\u0005"+
		"m\u0000\u0000ab\u0005i\u0000\u0000bo\u0005n\u0000\u0000cd\u0005c\u0000"+
		"\u0000de\u0005o\u0000\u0000ef\u0005u\u0000\u0000fg\u0005n\u0000\u0000"+
		"go\u0005t\u0000\u0000hi\u0005s\u0000\u0000ij\u0005u\u0000\u0000jo\u0005"+
		"m\u0000\u0000kl\u0005a\u0000\u0000lm\u0005v\u0000\u0000mo\u0005g\u0000"+
		"\u0000n]\u0001\u0000\u0000\u0000n`\u0001\u0000\u0000\u0000nc\u0001\u0000"+
		"\u0000\u0000nh\u0001\u0000\u0000\u0000nk\u0001\u0000\u0000\u0000o \u0001"+
		"\u0000\u0000\u0000pt\u0007\u0001\u0000\u0000qs\u0007\u0002\u0000\u0000"+
		"rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000u\"\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000wx\u0005t\u0000\u0000xy\u0005r\u0000\u0000yz\u0005u\u0000"+
		"\u0000z{\u0005e\u0000\u0000{$\u0001\u0000\u0000\u0000|}\u0005f\u0000\u0000"+
		"}~\u0005a\u0000\u0000~\u007f\u0005l\u0000\u0000\u007f\u0080\u0005s\u0000"+
		"\u0000\u0080\u0081\u0005e\u0000\u0000\u0081&\u0001\u0000\u0000\u0000\u0082"+
		"\u0084\u0007\u0003\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086(\u0001\u0000\u0000\u0000\u0087\u0089"+
		"\u0007\u0003\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u0088"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u0090\u0005.\u0000\u0000\u008f\u0091\u0007"+
		"\u0003\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093*\u0001\u0000\u0000\u0000\u0094\u0095\u0005n\u0000"+
		"\u0000\u0095\u0096\u0005u\u0000\u0000\u0096\u0097\u0005l\u0000\u0000\u0097"+
		"\u0098\u0005l\u0000\u0000\u0098,\u0001\u0000\u0000\u0000\u0099\u009b\u0005"+
		"\r\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0005\n\u0000"+
		"\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0.\u0001\u0000\u0000\u0000\u00a1\u00a3\u0005 \u0000\u0000\u00a2"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0006\u0017\u0000\u0000\u00a7"+
		"0\u0001\u0000\u0000\u0000\u000b\u0000Xnt\u0085\u008a\u008c\u0092\u009a"+
		"\u009f\u00a4\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}