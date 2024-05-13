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
		ID=17, TRUE=18, FALSE=19, INT=20, FLOAT=21, NULL=22, NEWLINE=23, SPACE=24;
	public static final int
		RULE_script = 0, RULE_sequence = 1, RULE_instruction = 2, RULE_load = 3, 
		RULE_save = 4, RULE_assign = 5, RULE_expression = 6, RULE_aggregator = 7, 
		RULE_accessor = 8, RULE_finder = 9, RULE_jValue = 10, RULE_jField = 11, 
		RULE_jObject = 12, RULE_jArray = 13, RULE_jNumber = 14, RULE_jString = 15, 
		RULE_jBoolean = 16, RULE_jNull = 17, RULE_jVar = 18, RULE_name = 19, RULE_arg = 20, 
		RULE_variable = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "sequence", "instruction", "load", "save", "assign", "expression", 
			"aggregator", "accessor", "finder", "jValue", "jField", "jObject", "jArray", 
			"jNumber", "jString", "jBoolean", "jNull", "jVar", "name", "arg", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'load'", "'to'", "'save'", "'='", "'|'", "'.'", "'*'", "':'", 
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
			setState(44);
			sequence();
			setState(45);
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
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					instruction();
					setState(49); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(48);
						match(NEWLINE);
						}
						}
						setState(51); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(58);
			instruction();
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
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				load();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				save();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				assign();
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
			setState(65);
			match(T__0);
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(66);
				arg();
				}
				break;
			case STR:
				{
				setState(67);
				match(STR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(70);
			match(T__1);
			setState(71);
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
			setState(73);
			match(T__2);
			setState(74);
			variable();
			setState(75);
			match(T__1);
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(76);
				arg();
				}
				break;
			case STR:
				{
				setState(77);
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
			setState(80);
			variable();
			setState(81);
			match(T__3);
			setState(82);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AccessorContext accessor() {
			return getRuleContext(AccessorContext.class,0);
		}
		public FinderContext finder() {
			return getRuleContext(FinderContext.class,0);
		}
		public JObjectContext jObject() {
			return getRuleContext(JObjectContext.class,0);
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
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(85);
				variable();
				}
				break;
			case 3:
				{
				setState(86);
				accessor();
				}
				break;
			case 4:
				{
				setState(87);
				finder();
				}
				break;
			case 5:
				{
				setState(88);
				jObject();
				}
				break;
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(91);
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
		enterRule(_localctx, 14, RULE_aggregator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__4);
			setState(95);
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
	public static class AccessorContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<FinderContext> finder() {
			return getRuleContexts(FinderContext.class);
		}
		public FinderContext finder(int i) {
			return getRuleContext(FinderContext.class,i);
		}
		public AccessorContext accessor() {
			return getRuleContext(AccessorContext.class,0);
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
		enterRule(_localctx, 16, RULE_accessor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(97);
				variable();
				}
				break;
			case 2:
				{
				setState(98);
				finder();
				}
				break;
			}
			setState(101);
			match(T__5);
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(102);
				accessor();
				}
				break;
			case 2:
				{
				setState(103);
				variable();
				}
				break;
			case 3:
				{
				setState(104);
				finder();
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
	public static class FinderContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_finder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			variable();
			setState(108);
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
		public JVarContext jVar() {
			return getRuleContext(JVarContext.class,0);
		}
		public JValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JValueContext jValue() throws RecognitionException {
		JValueContext _localctx = new JValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jValue);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				jString();
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				jNumber();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				jBoolean();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				jNull();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				jArray();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				jObject();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				jVar();
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
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JFieldContext jField() throws RecognitionException {
		JFieldContext _localctx = new JFieldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			name();
			setState(120);
			match(T__7);
			setState(121);
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
		public List<TerminalNode> NEWLINE() { return getTokens(JQLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JQLParser.NEWLINE, i);
		}
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
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JObjectContext jObject() throws RecognitionException {
		JObjectContext _localctx = new JObjectContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jObject);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__8);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					match(NEWLINE);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(130);
				jField();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(131);
					match(T__9);
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(132);
						match(NEWLINE);
						}
						}
						setState(137);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(138);
					jField();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(146);
				match(NEWLINE);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
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
	public static class JArrayContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(JQLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JQLParser.NEWLINE, i);
		}
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
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JArrayContext jArray() throws RecognitionException {
		JArrayContext _localctx = new JArrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jArray);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__11);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(155);
					match(NEWLINE);
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8294912L) != 0)) {
				{
				setState(161);
				jValue();
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(162);
					match(T__9);
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(163);
						match(NEWLINE);
						}
						}
						setState(168);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(169);
					jValue();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(177);
				match(NEWLINE);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
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
	public static class JNumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JQLParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(JQLParser.FLOAT, 0); }
		public JNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JNumberContext jNumber() throws RecognitionException {
		JNumberContext _localctx = new JNumberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		public TerminalNode STR() { return getToken(JQLParser.STR, 0); }
		public JStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JStringContext jString() throws RecognitionException {
		JStringContext _localctx = new JStringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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
		public TerminalNode TRUE() { return getToken(JQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JQLParser.FALSE, 0); }
		public JBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JBooleanContext jBoolean() throws RecognitionException {
		JBooleanContext _localctx = new JBooleanContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jBoolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		public TerminalNode NULL() { return getToken(JQLParser.NULL, 0); }
		public JNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JNullContext jNull() throws RecognitionException {
		JNullContext _localctx = new JNullContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jNull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
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
	public static class JVarContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public JVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).enterJVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JQLListener ) ((JQLListener)listener).exitJVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JQLVisitor ) return ((JQLVisitor<? extends T>)visitor).visitJVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JVarContext jVar() throws RecognitionException {
		JVarContext _localctx = new JVarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
		enterRule(_localctx, 38, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
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
		enterRule(_localctx, 40, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__13);
			setState(198);
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
		enterRule(_localctx, 42, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		"\u0004\u0001\u0018\u00cb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004"+
		"\u00012\b\u0001\u000b\u0001\f\u00013\u0005\u00016\b\u0001\n\u0001\f\u0001"+
		"9\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002@\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"E\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004O\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006Z\b\u0006\u0001\u0006\u0003\u0006"+
		"]\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b"+
		"d\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bj\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nv\b"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005"+
		"\f~\b\f\n\f\f\f\u0081\t\f\u0001\f\u0001\f\u0001\f\u0005\f\u0086\b\f\n"+
		"\f\f\f\u0089\t\f\u0001\f\u0005\f\u008c\b\f\n\f\f\f\u008f\t\f\u0003\f\u0091"+
		"\b\f\u0001\f\u0005\f\u0094\b\f\n\f\f\f\u0097\t\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0005\r\u009d\b\r\n\r\f\r\u00a0\t\r\u0001\r\u0001\r\u0001\r"+
		"\u0005\r\u00a5\b\r\n\r\f\r\u00a8\t\r\u0001\r\u0005\r\u00ab\b\r\n\r\f\r"+
		"\u00ae\t\r\u0003\r\u00b0\b\r\u0001\r\u0005\r\u00b3\b\r\n\r\f\r\u00b6\t"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0000\u0000\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0002\u0001"+
		"\u0000\u0014\u0015\u0001\u0000\u0012\u0013\u00d2\u0000,\u0001\u0000\u0000"+
		"\u0000\u00027\u0001\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006"+
		"A\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nP\u0001\u0000\u0000"+
		"\u0000\fY\u0001\u0000\u0000\u0000\u000e^\u0001\u0000\u0000\u0000\u0010"+
		"c\u0001\u0000\u0000\u0000\u0012k\u0001\u0000\u0000\u0000\u0014u\u0001"+
		"\u0000\u0000\u0000\u0016w\u0001\u0000\u0000\u0000\u0018{\u0001\u0000\u0000"+
		"\u0000\u001a\u009a\u0001\u0000\u0000\u0000\u001c\u00b9\u0001\u0000\u0000"+
		"\u0000\u001e\u00bb\u0001\u0000\u0000\u0000 \u00bd\u0001\u0000\u0000\u0000"+
		"\"\u00bf\u0001\u0000\u0000\u0000$\u00c1\u0001\u0000\u0000\u0000&\u00c3"+
		"\u0001\u0000\u0000\u0000(\u00c5\u0001\u0000\u0000\u0000*\u00c8\u0001\u0000"+
		"\u0000\u0000,-\u0003\u0002\u0001\u0000-.\u0005\u0000\u0000\u0001.\u0001"+
		"\u0001\u0000\u0000\u0000/1\u0003\u0004\u0002\u000002\u0005\u0017\u0000"+
		"\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u00005/\u0001"+
		"\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u0000:;\u0003\u0004\u0002\u0000;\u0003\u0001\u0000\u0000\u0000<@\u0003"+
		"\u0006\u0003\u0000=@\u0003\b\u0004\u0000>@\u0003\n\u0005\u0000?<\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000"+
		"@\u0005\u0001\u0000\u0000\u0000AD\u0005\u0001\u0000\u0000BE\u0003(\u0014"+
		"\u0000CE\u0005\u000f\u0000\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005\u0002\u0000\u0000GH\u0003"+
		"*\u0015\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0005\u0003\u0000\u0000"+
		"JK\u0003*\u0015\u0000KN\u0005\u0002\u0000\u0000LO\u0003(\u0014\u0000M"+
		"O\u0005\u000f\u0000\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000"+
		"\u0000O\t\u0001\u0000\u0000\u0000PQ\u0003*\u0015\u0000QR\u0005\u0004\u0000"+
		"\u0000RS\u0003\f\u0006\u0000S\u000b\u0001\u0000\u0000\u0000TZ\u0001\u0000"+
		"\u0000\u0000UZ\u0003*\u0015\u0000VZ\u0003\u0010\b\u0000WZ\u0003\u0012"+
		"\t\u0000XZ\u0003\u0018\f\u0000YT\u0001\u0000\u0000\u0000YU\u0001\u0000"+
		"\u0000\u0000YV\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YX\u0001"+
		"\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[]\u0003\u000e\u0007\u0000"+
		"\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\r\u0001\u0000"+
		"\u0000\u0000^_\u0005\u0005\u0000\u0000_`\u0005\u0010\u0000\u0000`\u000f"+
		"\u0001\u0000\u0000\u0000ad\u0003*\u0015\u0000bd\u0003\u0012\t\u0000ca"+
		"\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ei\u0005\u0006\u0000\u0000fj\u0003\u0010\b\u0000gj\u0003*\u0015"+
		"\u0000hj\u0003\u0012\t\u0000if\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000ih\u0001\u0000\u0000\u0000j\u0011\u0001\u0000\u0000\u0000kl\u0003"+
		"*\u0015\u0000lm\u0005\u0007\u0000\u0000m\u0013\u0001\u0000\u0000\u0000"+
		"nv\u0003\u001e\u000f\u0000ov\u0003\u001c\u000e\u0000pv\u0003 \u0010\u0000"+
		"qv\u0003\"\u0011\u0000rv\u0003\u001a\r\u0000sv\u0003\u0018\f\u0000tv\u0003"+
		"$\u0012\u0000un\u0001\u0000\u0000\u0000uo\u0001\u0000\u0000\u0000up\u0001"+
		"\u0000\u0000\u0000uq\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\u0015\u0001\u0000"+
		"\u0000\u0000wx\u0003&\u0013\u0000xy\u0005\b\u0000\u0000yz\u0003\u0014"+
		"\n\u0000z\u0017\u0001\u0000\u0000\u0000{\u007f\u0005\t\u0000\u0000|~\u0005"+
		"\u0017\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0090\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0082\u008d\u0003\u0016\u000b\u0000\u0083\u0087\u0005\n\u0000\u0000\u0084"+
		"\u0086\u0005\u0017\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u008a\u008c\u0003\u0016\u000b\u0000\u008b"+
		"\u0083\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090"+
		"\u0082\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0095\u0001\u0000\u0000\u0000\u0092\u0094\u0005\u0017\u0000\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005\u000b\u0000\u0000\u0099\u0019\u0001\u0000\u0000\u0000\u009a"+
		"\u009e\u0005\f\u0000\u0000\u009b\u009d\u0005\u0017\u0000\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00af"+
		"\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00ac"+
		"\u0003\u0014\n\u0000\u00a2\u00a6\u0005\n\u0000\u0000\u00a3\u00a5\u0005"+
		"\u0017\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ab\u0003\u0014\n\u0000\u00aa\u00a2\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00a1\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b3\u0005\u0017\u0000\u0000\u00b2\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\r\u0000"+
		"\u0000\u00b8\u001b\u0001\u0000\u0000\u0000\u00b9\u00ba\u0007\u0000\u0000"+
		"\u0000\u00ba\u001d\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u000f\u0000"+
		"\u0000\u00bc\u001f\u0001\u0000\u0000\u0000\u00bd\u00be\u0007\u0001\u0000"+
		"\u0000\u00be!\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0016\u0000\u0000"+
		"\u00c0#\u0001\u0000\u0000\u0000\u00c1\u00c2\u0003*\u0015\u0000\u00c2%"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u000f\u0000\u0000\u00c4\'\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005\u000e\u0000\u0000\u00c6\u00c7\u0005"+
		"\u0014\u0000\u0000\u00c7)\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0011"+
		"\u0000\u0000\u00c9+\u0001\u0000\u0000\u0000\u001437?DNY\\ciu\u007f\u0087"+
		"\u008d\u0090\u0095\u009e\u00a6\u00ac\u00af\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}