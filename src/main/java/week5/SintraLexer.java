// Generated from C:/Users/prnfi/kotlin/elp-exercises/src/main/kotlin/week5/Sintra.g4 by ANTLR 4.13.1
package week5;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SintraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WHILE=6, IF=7, ELSE=8, PRINT=9, 
		ID=10, INT=11, OPERATOR_COMPARE=12, OPERATOR_LOGIC=13, OPERATOR_MUL_DIV_MOD=14, 
		OPERATOR_ADD_SUB=15, NEWLINE=16, COMMENT=17, SPACE=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "WHILE", "IF", "ELSE", "PRINT", 
			"ID", "INT", "OPERATOR_COMPARE", "OPERATOR_LOGIC", "OPERATOR_MUL_DIV_MOD", 
			"OPERATOR_ADD_SUB", "NEWLINE", "COMMENT", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'='", "'while'", "'if'", "'else'", 
			"'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "WHILE", "IF", "ELSE", "PRINT", "ID", 
			"INT", "OPERATOR_COMPARE", "OPERATOR_LOGIC", "OPERATOR_MUL_DIV_MOD", 
			"OPERATOR_ADD_SUB", "NEWLINE", "COMMENT", "SPACE"
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


	public SintraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sintra.g4"; }

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
		"\u0004\u0000\u0012y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\tF\b"+
		"\t\n\t\f\tI\t\t\u0001\n\u0004\nL\b\n\u000b\n\f\nM\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000bX\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f^\b\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000fe\b\u000f\u0001"+
		"\u000f\u0004\u000fh\b\u000f\u000b\u000f\f\u000fi\u0001\u0010\u0001\u0010"+
		"\u0005\u0010n\b\u0010\n\u0010\f\u0010q\t\u0010\u0001\u0011\u0004\u0011"+
		"t\b\u0011\u000b\u0011\f\u0011u\u0001\u0011\u0001\u0011\u0000\u0000\u0012"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0006\u0001\u0000a"+
		"z\u0002\u000009az\u0001\u000009\u0003\u0000%%**//\u0002\u0000++--\u0002"+
		"\u0000\n\n\r\r\u0083\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001"+
		"%\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005)\u0001"+
		"\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000\t-\u0001\u0000\u0000"+
		"\u0000\u000b/\u0001\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f"+
		"8\u0001\u0000\u0000\u0000\u0011=\u0001\u0000\u0000\u0000\u0013C\u0001"+
		"\u0000\u0000\u0000\u0015K\u0001\u0000\u0000\u0000\u0017W\u0001\u0000\u0000"+
		"\u0000\u0019]\u0001\u0000\u0000\u0000\u001b_\u0001\u0000\u0000\u0000\u001d"+
		"a\u0001\u0000\u0000\u0000\u001fg\u0001\u0000\u0000\u0000!k\u0001\u0000"+
		"\u0000\u0000#s\u0001\u0000\u0000\u0000%&\u0005(\u0000\u0000&\u0002\u0001"+
		"\u0000\u0000\u0000\'(\u0005)\u0000\u0000(\u0004\u0001\u0000\u0000\u0000"+
		")*\u0005{\u0000\u0000*\u0006\u0001\u0000\u0000\u0000+,\u0005}\u0000\u0000"+
		",\b\u0001\u0000\u0000\u0000-.\u0005=\u0000\u0000.\n\u0001\u0000\u0000"+
		"\u0000/0\u0005w\u0000\u000001\u0005h\u0000\u000012\u0005i\u0000\u0000"+
		"23\u0005l\u0000\u000034\u0005e\u0000\u00004\f\u0001\u0000\u0000\u0000"+
		"56\u0005i\u0000\u000067\u0005f\u0000\u00007\u000e\u0001\u0000\u0000\u0000"+
		"89\u0005e\u0000\u00009:\u0005l\u0000\u0000:;\u0005s\u0000\u0000;<\u0005"+
		"e\u0000\u0000<\u0010\u0001\u0000\u0000\u0000=>\u0005p\u0000\u0000>?\u0005"+
		"r\u0000\u0000?@\u0005i\u0000\u0000@A\u0005n\u0000\u0000AB\u0005t\u0000"+
		"\u0000B\u0012\u0001\u0000\u0000\u0000CG\u0007\u0000\u0000\u0000DF\u0007"+
		"\u0001\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0014\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000JL\u0007\u0002\u0000\u0000KJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000N\u0016\u0001\u0000\u0000\u0000OX\u0005<\u0000"+
		"\u0000PQ\u0005<\u0000\u0000QX\u0005=\u0000\u0000RS\u0005=\u0000\u0000"+
		"SX\u0005=\u0000\u0000TX\u0005>\u0000\u0000UV\u0005>\u0000\u0000VX\u0005"+
		"=\u0000\u0000WO\u0001\u0000\u0000\u0000WP\u0001\u0000\u0000\u0000WR\u0001"+
		"\u0000\u0000\u0000WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"X\u0018\u0001\u0000\u0000\u0000YZ\u0005&\u0000\u0000Z^\u0005&\u0000\u0000"+
		"[\\\u0005|\u0000\u0000\\^\u0005|\u0000\u0000]Y\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000^\u001a\u0001\u0000\u0000\u0000_`\u0007\u0003"+
		"\u0000\u0000`\u001c\u0001\u0000\u0000\u0000ab\u0007\u0004\u0000\u0000"+
		"b\u001e\u0001\u0000\u0000\u0000ce\u0005\r\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0005\n\u0000"+
		"\u0000gd\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000j \u0001\u0000\u0000\u0000ko\u0005"+
		"#\u0000\u0000ln\b\u0005\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"p\"\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rt\u0005 \u0000\u0000"+
		"sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0006\u0011"+
		"\u0000\u0000x$\u0001\u0000\u0000\u0000\t\u0000GMW]diou\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}