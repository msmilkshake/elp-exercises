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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, FIELD=7, STR=8, TRUE=9, 
		FALSE=10, INT=11, FLOAT=12, NULL=13, NEWLINE=14, SPACE=15;
	public static final int
		RULE_jValue = 0, RULE_jArray = 1, RULE_jNumber = 2, RULE_jString = 3, 
		RULE_jBoolean = 4, RULE_jNull = 5, RULE_field = 6, RULE_jField = 7, RULE_jObject = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"jValue", "jArray", "jNumber", "jString", "jBoolean", "jNull", "field", 
			"jField", "jObject"
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
			case FIELD:
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
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(22);
				jArray();
				}
				break;
			case T__4:
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
		enterRule(_localctx, 2, RULE_jArray);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(27);
					jValue();
					setState(28);
					match(T__1);
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16290L) != 0)) {
				{
				setState(35);
				jValue();
				}
			}

			setState(38);
			match(T__2);
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
		enterRule(_localctx, 4, RULE_jNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
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
		public TerminalNode FIELD() { return getToken(JsonParser.FIELD, 0); }
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
		enterRule(_localctx, 6, RULE_jString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !(_la==FIELD || _la==STR) ) {
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
		enterRule(_localctx, 8, RULE_jBoolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
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
		enterRule(_localctx, 10, RULE_jNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
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
	public static class FieldContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(JsonParser.FIELD, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonVisitor ) return ((JsonVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(FIELD);
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
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
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
		enterRule(_localctx, 14, RULE_jField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			field();
			setState(51);
			match(T__3);
			setState(52);
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
		enterRule(_localctx, 16, RULE_jObject);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__4);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55);
					jField();
					setState(56);
					match(T__1);
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FIELD) {
				{
				setState(63);
				jField();
				}
			}

			setState(66);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000fE\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\u0019\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001"+
		"\u0001\u0003\u0001%\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b;\b\b\n\b\f\b>\t\b\u0001"+
		"\b\u0003\bA\b\b\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0000\u0003\u0001\u0000\u000b\f\u0001\u0000\u0007"+
		"\b\u0001\u0000\t\nD\u0000\u0018\u0001\u0000\u0000\u0000\u0002\u001a\u0001"+
		"\u0000\u0000\u0000\u0004(\u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000"+
		"\u0000\b,\u0001\u0000\u0000\u0000\n.\u0001\u0000\u0000\u0000\f0\u0001"+
		"\u0000\u0000\u0000\u000e2\u0001\u0000\u0000\u0000\u00106\u0001\u0000\u0000"+
		"\u0000\u0012\u0019\u0003\u0006\u0003\u0000\u0013\u0019\u0003\u0004\u0002"+
		"\u0000\u0014\u0019\u0003\b\u0004\u0000\u0015\u0019\u0003\n\u0005\u0000"+
		"\u0016\u0019\u0003\u0002\u0001\u0000\u0017\u0019\u0003\u0010\b\u0000\u0018"+
		"\u0012\u0001\u0000\u0000\u0000\u0018\u0013\u0001\u0000\u0000\u0000\u0018"+
		"\u0014\u0001\u0000\u0000\u0000\u0018\u0015\u0001\u0000\u0000\u0000\u0018"+
		"\u0016\u0001\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u0001\u0001\u0000\u0000\u0000\u001a \u0005\u0001\u0000\u0000\u001b\u001c"+
		"\u0003\u0000\u0000\u0000\u001c\u001d\u0005\u0002\u0000\u0000\u001d\u001f"+
		"\u0001\u0000\u0000\u0000\u001e\u001b\u0001\u0000\u0000\u0000\u001f\"\u0001"+
		"\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000"+
		"\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#%\u0003\u0000"+
		"\u0000\u0000$#\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&\'\u0005\u0003\u0000\u0000\'\u0003\u0001\u0000\u0000"+
		"\u0000()\u0007\u0000\u0000\u0000)\u0005\u0001\u0000\u0000\u0000*+\u0007"+
		"\u0001\u0000\u0000+\u0007\u0001\u0000\u0000\u0000,-\u0007\u0002\u0000"+
		"\u0000-\t\u0001\u0000\u0000\u0000./\u0005\r\u0000\u0000/\u000b\u0001\u0000"+
		"\u0000\u000001\u0005\u0007\u0000\u00001\r\u0001\u0000\u0000\u000023\u0003"+
		"\f\u0006\u000034\u0005\u0004\u0000\u000045\u0003\u0000\u0000\u00005\u000f"+
		"\u0001\u0000\u0000\u00006<\u0005\u0005\u0000\u000078\u0003\u000e\u0007"+
		"\u000089\u0005\u0002\u0000\u00009;\u0001\u0000\u0000\u0000:7\u0001\u0000"+
		"\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		"?A\u0003\u000e\u0007\u0000@?\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BC\u0005\u0006\u0000\u0000C\u0011\u0001"+
		"\u0000\u0000\u0000\u0005\u0018 $<@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}