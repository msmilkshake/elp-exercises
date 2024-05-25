// Generated from C:/Users/prnfi/kotlin/elp-exercises/src/main/kotlin/exam/JQL.g4 by ANTLR 4.13.1
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
public class JQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, STR=15, AGGREGATORS=16, 
		TRUE=17, FALSE=18, ID=19, INT=20, FLOAT=21, NULL=22, NEWLINE=23, COMMENT=24, 
		SPACE=25;
	public static final int
		RULE_script = 0, RULE_sequence = 1, RULE_instruction = 2, RULE_load = 3, 
		RULE_save = 4, RULE_assign = 5, RULE_expression = 6, RULE_accessor = 7, 
		RULE_aggregator = 8, RULE_key = 9, RULE_finder = 10, RULE_jqValue = 11, 
		RULE_jqField = 12, RULE_jqObject = 13, RULE_jqArray = 14, RULE_jqNumber = 15, 
		RULE_jqString = 16, RULE_jqBoolean = 17, RULE_jqNull = 18, RULE_jqVar = 19, 
		RULE_name = 20, RULE_arg = 21, RULE_variable = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "sequence", "instruction", "load", "save", "assign", "expression", 
			"accessor", "aggregator", "key", "finder", "jqValue", "jqField", "jqObject", 
			"jqArray", "jqNumber", "jqString", "jqBoolean", "jqNull", "jqVar", "name", 
			"arg", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'load'", "'to'", "'save'", "'='", "'.'", "'|'", "'*'", "':'", 
			"'{'", "','", "'}'", "'['", "']'", "'$'", null, null, "'true'", "'false'", 
			null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STR", "AGGREGATORS", "TRUE", "FALSE", "ID", "INT", 
			"FLOAT", "NULL", "NEWLINE", "COMMENT", "SPACE"
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
	public String getGrammarFileName() { return "JQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JQLParser.EOF, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			sequence();
			setState(47);
			match(EOF);
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
	public static class SequenceContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JQLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JQLParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(JQLParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(JQLParser.COMMENT, i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__2:
					case ID:
						{
						setState(49);
						instruction();
						}
						break;
					case COMMENT:
						{
						setState(50);
						match(COMMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(54); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(53);
						match(NEWLINE);
						}
						}
						setState(56); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(63);
			instruction();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==COMMENT) {
				{
				{
				setState(64);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==COMMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class InstructionContext extends ParserRuleContext {
		public LoadContext load() {
			return getRuleContext(LoadContext.class,0);
		}
		public SaveContext save() {
			return getRuleContext(SaveContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(JQLParser.COMMENT, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(70);
				load();
				}
				break;
			case T__2:
				{
				setState(71);
				save();
				}
				break;
			case ID:
				{
				setState(72);
				assign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(75);
				match(COMMENT);
				}
				break;
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
	public static class LoadContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode STR() { return getToken(JQLParser.STR, 0); }
		public LoadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterLoad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitLoad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitLoad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_load);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(79);
				arg();
				}
				break;
			case STR:
				{
				setState(80);
				match(STR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(83);
			match(T__1);
			setState(84);
			variable();
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
	public static class SaveContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode STR() { return getToken(JQLParser.STR, 0); }
		public SaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterSave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitSave(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitSave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaveContext save() throws RecognitionException {
		SaveContext _localctx = new SaveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_save);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__2);
			setState(87);
			variable();
			setState(88);
			match(T__1);
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(89);
				arg();
				}
				break;
			case STR:
				{
				setState(90);
				match(STR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class AssignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			variable();
			setState(94);
			match(T__3);
			setState(95);
			expression();
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
	public static class ExpressionContext extends ParserRuleContext {
		public AccessorContext accessor() {
			return getRuleContext(AccessorContext.class,0);
		}
		public JqValueContext jqValue() {
			return getRuleContext(JqValueContext.class,0);
		}
		public AggregatorContext aggregator() {
			return getRuleContext(AggregatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(97);
				accessor();
				}
				break;
			case 2:
				{
				setState(98);
				jqValue();
				}
				break;
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(101);
				aggregator();
				}
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
	public static class AccessorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public AccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterAccessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitAccessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitAccessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessorContext accessor() throws RecognitionException {
		AccessorContext _localctx = new AccessorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_accessor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			variable();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(105);
				match(T__4);
				setState(106);
				key();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class AggregatorContext extends ParserRuleContext {
		public TerminalNode AGGREGATORS() { return getToken(JQLParser.AGGREGATORS, 0); }
		public AggregatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterAggregator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitAggregator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitAggregator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregatorContext aggregator() throws RecognitionException {
		AggregatorContext _localctx = new AggregatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_aggregator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__5);
			setState(113);
			match(AGGREGATORS);
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
	public static class KeyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JQLParser.ID, 0); }
		public FinderContext finder() {
			return getRuleContext(FinderContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ID);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(116);
				finder();
				}
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
	public static class FinderContext extends ParserRuleContext {
		public FinderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterFinder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitFinder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitFinder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinderContext finder() throws RecognitionException {
		FinderContext _localctx = new FinderContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_finder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__6);
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
	public static class JqValueContext extends ParserRuleContext {
		public JqStringContext jqString() {
			return getRuleContext(JqStringContext.class,0);
		}
		public JqNumberContext jqNumber() {
			return getRuleContext(JqNumberContext.class,0);
		}
		public JqBooleanContext jqBoolean() {
			return getRuleContext(JqBooleanContext.class,0);
		}
		public JqNullContext jqNull() {
			return getRuleContext(JqNullContext.class,0);
		}
		public JqArrayContext jqArray() {
			return getRuleContext(JqArrayContext.class,0);
		}
		public JqObjectContext jqObject() {
			return getRuleContext(JqObjectContext.class,0);
		}
		public JqVarContext jqVar() {
			return getRuleContext(JqVarContext.class,0);
		}
		public JqValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jqValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJqValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJqValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJqValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JqValueContext jqValue() throws RecognitionException {
		JqValueContext _localctx = new JqValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jqValue);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__5:
			case T__9:
			case T__10:
			case T__12:
			case NEWLINE:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				jqString();
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				jqNumber();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				jqBoolean();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				jqNull();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				jqArray();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(127);
				jqObject();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(128);
				jqVar();
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
	public static class JqFieldContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public JqValueContext jqValue() {
			return getRuleContext(JqValueContext.class,0);
		}
		public JqFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jqField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJqField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJqField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJqField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JqFieldContext jqField() throws RecognitionException {
		JqFieldContext _localctx = new JqFieldContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jqField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			name();
			setState(132);
			match(T__7);
			setState(133);
			jqValue();
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
	public static class JqObjectContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(JQLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JQLParser.NEWLINE, i);
		}
		public List<JqFieldContext> jqField() {
			return getRuleContexts(JqFieldContext.class);
		}
		public JqFieldContext jqField(int i) {
			return getRuleContext(JqFieldContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(JQLParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(JQLParser.COMMENT, i);
		}
		public JqObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jqObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJqObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJqObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJqObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JqObjectContext jqObject() throws RecognitionException {
		JqObjectContext _localctx = new JqObjectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jqObject);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__8);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMENT) {
						{
						setState(136);
						match(COMMENT);
						}
					}

					setState(139);
					match(NEWLINE);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(145);
				jqField();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(146);
					match(T__9);
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE || _la==COMMENT) {
						{
						{
						setState(148);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(147);
							match(COMMENT);
							}
						}

						setState(150);
						match(NEWLINE);
						}
						}
						setState(155);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(156);
					jqField();
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==COMMENT) {
				{
				{
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(164);
					match(COMMENT);
					}
				}

				setState(167);
				match(NEWLINE);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(T__10);
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
	public static class JqArrayContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(JQLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JQLParser.NEWLINE, i);
		}
		public List<JqValueContext> jqValue() {
			return getRuleContexts(JqValueContext.class);
		}
		public JqValueContext jqValue(int i) {
			return getRuleContext(JqValueContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(JQLParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(JQLParser.COMMENT, i);
		}
		public JqArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jqArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJqArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJqArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJqArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JqArrayContext jqArray() throws RecognitionException {
		JqArrayContext _localctx = new JqArrayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jqArray);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__11);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMENT) {
						{
						setState(176);
						match(COMMENT);
						}
					}

					setState(179);
					match(NEWLINE);
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(185);
				jqValue();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(186);
					match(T__9);
					setState(193);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(188);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==COMMENT) {
								{
								setState(187);
								match(COMMENT);
								}
							}

							setState(190);
							match(NEWLINE);
							}
							} 
						}
						setState(195);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					}
					setState(196);
					jqValue();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==COMMENT) {
				{
				{
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(204);
					match(COMMENT);
					}
				}

				setState(207);
				match(NEWLINE);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(T__12);
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
	public static class JqNumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JQLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(JQLParser.FLOAT, 0); }
		public JqNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jqNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJqNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJqNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJqNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JqNumberContext jqNumber() throws RecognitionException {
		JqNumberContext _localctx = new JqNumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jqNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
	public static class JqStringContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(JQLParser.STR, 0); }
		public JqStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jqString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJqString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJqString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJqString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JqStringContext jqString() throws RecognitionException {
		JqStringContext _localctx = new JqStringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jqString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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
	public static class JqBooleanContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(JQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JQLParser.FALSE, 0); }
		public JqBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jqBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJqBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJqBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJqBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JqBooleanContext jqBoolean() throws RecognitionException {
		JqBooleanContext _localctx = new JqBooleanContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jqBoolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
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
	public static class JqNullContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(JQLParser.NULL, 0); }
		public JqNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jqNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJqNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJqNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJqNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JqNullContext jqNull() throws RecognitionException {
		JqNullContext _localctx = new JqNullContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jqNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
	public static class JqVarContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public JqVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jqVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJqVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJqVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJqVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JqVarContext jqVar() throws RecognitionException {
		JqVarContext _localctx = new JqVarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jqVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			variable();
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
		public TerminalNode STR() { return getToken(JQLParser.STR, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
	public static class ArgContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JQLParser.INT, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__13);
			setState(228);
			match(INT);
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JQLParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(ID);
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
		"\u0004\u0001\u0019\u00e9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u00014\b\u0001\u0001\u0001\u0004\u00017\b\u0001"+
		"\u000b\u0001\f\u00018\u0005\u0001;\b\u0001\n\u0001\f\u0001>\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001B\b\u0001\n\u0001\f\u0001E\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002J\b\u0002\u0001\u0002\u0003"+
		"\u0002M\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003R\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\\\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006d\b\u0006"+
		"\u0001\u0006\u0003\u0006g\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007l\b\u0007\n\u0007\f\u0007o\t\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0003\tv\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0082\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0003\r\u008a\b\r\u0001\r\u0005\r\u008d\b\r\n\r\f\r\u0090\t\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0095\b\r\u0001\r\u0005\r\u0098\b\r\n\r\f\r"+
		"\u009b\t\r\u0001\r\u0005\r\u009e\b\r\n\r\f\r\u00a1\t\r\u0003\r\u00a3\b"+
		"\r\u0001\r\u0003\r\u00a6\b\r\u0001\r\u0005\r\u00a9\b\r\n\r\f\r\u00ac\t"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u00b2\b\u000e\u0001"+
		"\u000e\u0005\u000e\u00b5\b\u000e\n\u000e\f\u000e\u00b8\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00bd\b\u000e\u0001\u000e\u0005\u000e"+
		"\u00c0\b\u000e\n\u000e\f\u000e\u00c3\t\u000e\u0001\u000e\u0005\u000e\u00c6"+
		"\b\u000e\n\u000e\f\u000e\u00c9\t\u000e\u0003\u000e\u00cb\b\u000e\u0001"+
		"\u000e\u0003\u000e\u00ce\b\u000e\u0001\u000e\u0005\u000e\u00d1\b\u000e"+
		"\n\u000e\f\u000e\u00d4\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,\u0000\u0003\u0001\u0000\u0017\u0018\u0001\u0000\u0014"+
		"\u0015\u0001\u0000\u0011\u0012\u00f5\u0000.\u0001\u0000\u0000\u0000\u0002"+
		"<\u0001\u0000\u0000\u0000\u0004I\u0001\u0000\u0000\u0000\u0006N\u0001"+
		"\u0000\u0000\u0000\bV\u0001\u0000\u0000\u0000\n]\u0001\u0000\u0000\u0000"+
		"\fc\u0001\u0000\u0000\u0000\u000eh\u0001\u0000\u0000\u0000\u0010p\u0001"+
		"\u0000\u0000\u0000\u0012s\u0001\u0000\u0000\u0000\u0014w\u0001\u0000\u0000"+
		"\u0000\u0016\u0081\u0001\u0000\u0000\u0000\u0018\u0083\u0001\u0000\u0000"+
		"\u0000\u001a\u0087\u0001\u0000\u0000\u0000\u001c\u00af\u0001\u0000\u0000"+
		"\u0000\u001e\u00d7\u0001\u0000\u0000\u0000 \u00d9\u0001\u0000\u0000\u0000"+
		"\"\u00db\u0001\u0000\u0000\u0000$\u00dd\u0001\u0000\u0000\u0000&\u00df"+
		"\u0001\u0000\u0000\u0000(\u00e1\u0001\u0000\u0000\u0000*\u00e3\u0001\u0000"+
		"\u0000\u0000,\u00e6\u0001\u0000\u0000\u0000./\u0003\u0002\u0001\u0000"+
		"/0\u0005\u0000\u0000\u00010\u0001\u0001\u0000\u0000\u000014\u0003\u0004"+
		"\u0002\u000024\u0005\u0018\u0000\u000031\u0001\u0000\u0000\u000032\u0001"+
		"\u0000\u0000\u000046\u0001\u0000\u0000\u000057\u0005\u0017\u0000\u0000"+
		"65\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:3\u0001\u0000"+
		"\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		"?C\u0003\u0004\u0002\u0000@B\u0007\u0000\u0000\u0000A@\u0001\u0000\u0000"+
		"\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000D\u0003\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"FJ\u0003\u0006\u0003\u0000GJ\u0003\b\u0004\u0000HJ\u0003\n\u0005\u0000"+
		"IF\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000"+
		"\u0000JL\u0001\u0000\u0000\u0000KM\u0005\u0018\u0000\u0000LK\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0005\u0001\u0000\u0000\u0000"+
		"NQ\u0005\u0001\u0000\u0000OR\u0003*\u0015\u0000PR\u0005\u000f\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000ST\u0005\u0002\u0000\u0000TU\u0003,\u0016\u0000U\u0007\u0001\u0000"+
		"\u0000\u0000VW\u0005\u0003\u0000\u0000WX\u0003,\u0016\u0000X[\u0005\u0002"+
		"\u0000\u0000Y\\\u0003*\u0015\u0000Z\\\u0005\u000f\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\t\u0001\u0000\u0000\u0000"+
		"]^\u0003,\u0016\u0000^_\u0005\u0004\u0000\u0000_`\u0003\f\u0006\u0000"+
		"`\u000b\u0001\u0000\u0000\u0000ad\u0003\u000e\u0007\u0000bd\u0003\u0016"+
		"\u000b\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000df\u0001"+
		"\u0000\u0000\u0000eg\u0003\u0010\b\u0000fe\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000g\r\u0001\u0000\u0000\u0000hm\u0003,\u0016\u0000ij\u0005"+
		"\u0005\u0000\u0000jl\u0003\u0012\t\u0000ki\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"n\u000f\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\u0006"+
		"\u0000\u0000qr\u0005\u0010\u0000\u0000r\u0011\u0001\u0000\u0000\u0000"+
		"su\u0005\u0013\u0000\u0000tv\u0003\u0014\n\u0000ut\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000v\u0013\u0001\u0000\u0000\u0000wx\u0005\u0007"+
		"\u0000\u0000x\u0015\u0001\u0000\u0000\u0000y\u0082\u0001\u0000\u0000\u0000"+
		"z\u0082\u0003 \u0010\u0000{\u0082\u0003\u001e\u000f\u0000|\u0082\u0003"+
		"\"\u0011\u0000}\u0082\u0003$\u0012\u0000~\u0082\u0003\u001c\u000e\u0000"+
		"\u007f\u0082\u0003\u001a\r\u0000\u0080\u0082\u0003&\u0013\u0000\u0081"+
		"y\u0001\u0000\u0000\u0000\u0081z\u0001\u0000\u0000\u0000\u0081{\u0001"+
		"\u0000\u0000\u0000\u0081|\u0001\u0000\u0000\u0000\u0081}\u0001\u0000\u0000"+
		"\u0000\u0081~\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0017\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0003(\u0014\u0000\u0084\u0085\u0005\b\u0000\u0000\u0085"+
		"\u0086\u0003\u0016\u000b\u0000\u0086\u0019\u0001\u0000\u0000\u0000\u0087"+
		"\u008e\u0005\t\u0000\u0000\u0088\u008a\u0005\u0018\u0000\u0000\u0089\u0088"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0005\u0017\u0000\u0000\u008c\u0089"+
		"\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u00a2"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u009f"+
		"\u0003\u0018\f\u0000\u0092\u0099\u0005\n\u0000\u0000\u0093\u0095\u0005"+
		"\u0018\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0005"+
		"\u0017\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0098\u009b\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001"+
		"\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009c\u009e\u0003\u0018\f\u0000\u009d\u0092\u0001\u0000"+
		"\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u0091\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a6\u0005\u0018\u0000\u0000\u00a5\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a9\u0005\u0017\u0000\u0000\u00a8\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u000b"+
		"\u0000\u0000\u00ae\u001b\u0001\u0000\u0000\u0000\u00af\u00b6\u0005\f\u0000"+
		"\u0000\u00b0\u00b2\u0005\u0018\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b5\u0005\u0017\u0000\u0000\u00b4\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00ca\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00c7\u0003\u0016\u000b"+
		"\u0000\u00ba\u00c1\u0005\n\u0000\u0000\u00bb\u00bd\u0005\u0018\u0000\u0000"+
		"\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c0\u0005\u0017\u0000\u0000"+
		"\u00bf\u00bc\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c6\u0003\u0016\u000b\u0000\u00c5\u00ba\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00b9\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00d2\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ce\u0005\u0018\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d1\u0005\u0017\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\r\u0000\u0000\u00d6"+
		"\u001d\u0001\u0000\u0000\u0000\u00d7\u00d8\u0007\u0001\u0000\u0000\u00d8"+
		"\u001f\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u000f\u0000\u0000\u00da"+
		"!\u0001\u0000\u0000\u0000\u00db\u00dc\u0007\u0002\u0000\u0000\u00dc#\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005\u0016\u0000\u0000\u00de%\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0003,\u0016\u0000\u00e0\'\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0005\u000f\u0000\u0000\u00e2)\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0005\u000e\u0000\u0000\u00e4\u00e5\u0005\u0014\u0000\u0000"+
		"\u00e5+\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0013\u0000\u0000\u00e7"+
		"-\u0001\u0000\u0000\u0000\u001d38<CILQ[cfmu\u0081\u0089\u008e\u0094\u0099"+
		"\u009f\u00a2\u00a5\u00aa\u00b1\u00b6\u00bc\u00c1\u00c7\u00ca\u00cd\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}