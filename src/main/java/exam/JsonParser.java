// Generated from C:/Users/prnfi/kotlin/elp-exercises/src/main/kotlin/exam/Json.g4 by ANTLR 4.13.1
package exam;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JsonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, STR=7, TRUE=8, FALSE=9, 
		INT=10, FLOAT=11, NULL=12, SPACE=13;
	public static final int
		RULE_jValue = 0, RULE_jField = 1, RULE_jObject = 2, RULE_jArray = 3, RULE_jNumber = 4, 
		RULE_jString = 5, RULE_jBoolean = 6, RULE_jNull = 7, RULE_name = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"jValue", "jField", "jObject", "jArray", "jNumber", "jString", "jBoolean", 
			"jNull", "name"
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

	@Override
	public String getGrammarFileName() { return "Json.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JsonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JValueContext extends ParserRuleContext {
		public JStringContext jString() {
			return getRuleContext(JStringContext.class,0);
		}
		public JNumberContext jNumber() {
			return getRuleContext(JNumberContext.class,0);
		}
		public JBooleanContext jBoolean() {
			return getRuleContext(JBooleanContext.class,0);
		}
		public JNullContext jNull() {
			return getRuleContext(JNullContext.class,0);
		}
		public JArrayContext jArray() {
			return getRuleContext(JArrayContext.class,0);
		}
		public JObjectContext jObject() {
			return getRuleContext(JObjectContext.class,0);
		}
		public JValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterJValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitJValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonVisitor ) return ((JsonVisitor<? extends T>)visitor).visitJValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JValueContext jValue() throws RecognitionException {
		JValueContext _localctx = new JValueContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jValue);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				jString();
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				jNumber();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				jBoolean();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
				jNull();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(22);
				jArray();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 6);
				{
				setState(23);
				jObject();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JFieldContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public JValueContext jValue() {
			return getRuleContext(JValueContext.class,0);
		}
		public JFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterJField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitJField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonVisitor ) return ((JsonVisitor<? extends T>)visitor).visitJField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JFieldContext jField() throws RecognitionException {
		JFieldContext _localctx = new JFieldContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			name();
			setState(27);
			match(T__0);
			setState(28);
			jValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JObjectContext extends ParserRuleContext {
		public List<JFieldContext> jField() {
			return getRuleContexts(JFieldContext.class);
		}
		public JFieldContext jField(int i) {
			return getRuleContext(JFieldContext.class,i);
		}
		public JObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterJObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitJObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonVisitor ) return ((JsonVisitor<? extends T>)visitor).visitJObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JObjectContext jObject() throws RecognitionException {
		JObjectContext _localctx = new JObjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__1);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(31);
				jField();
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(32);
					match(T__2);
					setState(33);
					jField();
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(41);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JArrayContext extends ParserRuleContext {
		public List<JValueContext> jValue() {
			return getRuleContexts(JValueContext.class);
		}
		public JValueContext jValue(int i) {
			return getRuleContext(JValueContext.class,i);
		}
		public JArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterJArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitJArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonVisitor ) return ((JsonVisitor<? extends T>)visitor).visitJArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JArrayContext jArray() throws RecognitionException {
		JArrayContext _localctx = new JArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_jArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__4);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8100L) != 0)) {
				{
				setState(44);
				jValue();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(45);
					match(T__2);
					setState(46);
					jValue();
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(54);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JNumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JsonParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(JsonParser.FLOAT, 0); }
		public JNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterJNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitJNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonVisitor ) return ((JsonVisitor<? extends T>)visitor).visitJNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JNumberContext jNumber() throws RecognitionException {
		JNumberContext _localctx = new JNumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_jNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JStringContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(JsonParser.STR, 0); }
		public JStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterJString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitJString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonVisitor ) return ((JsonVisitor<? extends T>)visitor).visitJString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JStringContext jString() throws RecognitionException {
		JStringContext _localctx = new JStringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(STR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JBooleanContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(JsonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JsonParser.FALSE, 0); }
		public JBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterJBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitJBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonVisitor ) return ((JsonVisitor<? extends T>)visitor).visitJBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JBooleanContext jBoolean() throws RecognitionException {
		JBooleanContext _localctx = new JBooleanContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jBoolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JNullContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(JsonParser.NULL, 0); }
		public JNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterJNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitJNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonVisitor ) return ((JsonVisitor<? extends T>)visitor).visitJNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JNullContext jNull() throws RecognitionException {
		JNullContext _localctx = new JNullContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(JsonParser.STR, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonVisitor ) return ((JsonVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(STR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\rC\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\u0019\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"#\b\u0002\n\u0002\f\u0002&\t\u0002\u0003\u0002(\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00030\b"+
		"\u0003\n\u0003\f\u00033\t\u0003\u0003\u00035\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0002\u0001\u0000\n\u000b\u0001"+
		"\u0000\b\tB\u0000\u0018\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000"+
		"\u0000\u0000\u0004\u001e\u0001\u0000\u0000\u0000\u0006+\u0001\u0000\u0000"+
		"\u0000\b8\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000\f<\u0001"+
		"\u0000\u0000\u0000\u000e>\u0001\u0000\u0000\u0000\u0010@\u0001\u0000\u0000"+
		"\u0000\u0012\u0019\u0003\n\u0005\u0000\u0013\u0019\u0003\b\u0004\u0000"+
		"\u0014\u0019\u0003\f\u0006\u0000\u0015\u0019\u0003\u000e\u0007\u0000\u0016"+
		"\u0019\u0003\u0006\u0003\u0000\u0017\u0019\u0003\u0004\u0002\u0000\u0018"+
		"\u0012\u0001\u0000\u0000\u0000\u0018\u0013\u0001\u0000\u0000\u0000\u0018"+
		"\u0014\u0001\u0000\u0000\u0000\u0018\u0015\u0001\u0000\u0000\u0000\u0018"+
		"\u0016\u0001\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u0001\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0010\b\u0000\u001b\u001c"+
		"\u0005\u0001\u0000\u0000\u001c\u001d\u0003\u0000\u0000\u0000\u001d\u0003"+
		"\u0001\u0000\u0000\u0000\u001e\'\u0005\u0002\u0000\u0000\u001f$\u0003"+
		"\u0002\u0001\u0000 !\u0005\u0003\u0000\u0000!#\u0003\u0002\u0001\u0000"+
		"\" \u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000"+
		"\u0000\u0000\'\u001f\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000)*\u0005\u0004\u0000\u0000*\u0005\u0001\u0000"+
		"\u0000\u0000+4\u0005\u0005\u0000\u0000,1\u0003\u0000\u0000\u0000-.\u0005"+
		"\u0003\u0000\u0000.0\u0003\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"03\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u00004,\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0005"+
		"\u0006\u0000\u00007\u0007\u0001\u0000\u0000\u000089\u0007\u0000\u0000"+
		"\u00009\t\u0001\u0000\u0000\u0000:;\u0005\u0007\u0000\u0000;\u000b\u0001"+
		"\u0000\u0000\u0000<=\u0007\u0001\u0000\u0000=\r\u0001\u0000\u0000\u0000"+
		">?\u0005\f\u0000\u0000?\u000f\u0001\u0000\u0000\u0000@A\u0005\u0007\u0000"+
		"\u0000A\u0011\u0001\u0000\u0000\u0000\u0005\u0018$\'14";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}