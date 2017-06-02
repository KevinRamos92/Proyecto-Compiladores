// Generated from compile.g4 by ANTLR 4.4
package Analizer.MyProject;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, DOUBLEPLUS=4, DOUBLEMINUS=5, COMILLA=6, MAS=7, MENOS=8, 
		POR=9, DIV=10, MAYOR=11, MENOR=12, PLUSEQ=13, MINEQ=14, DOUBLEEQ=15, NEGATE=16, 
		EQUAL=17, ILLAVE=18, RLLAVE=19, LPAR=20, RPAR=21, DOTDOT=22, SEMIDOT=23, 
		TRUE=24, FALSE=25, IF=26, ELSE=27, END=28, WHILE=29, DO=30, WRITE=31, 
		BREAK=32, FOR=33, PROGRAM=34, VAR=35, PRINTLN=36, ID=37, NUMBER=38, PRINT=39, 
		COMMENT=40, WS=41, COMP=42;
	public static final String[] tokenNames = {
		"<INVALID>", "'&&'", "'||'", "'!'", "'++'", "'--'", "'\"'", "'+'", "'-'", 
		"'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='", "'{'", 
		"'}'", "'('", "')'", "':'", "';'", "'true'", "'false'", "'if'", "'else'", 
		"'end'", "'while'", "'do'", "'write'", "'break'", "'for'", "'program'", 
		"'var'", "'println'", "ID", "NUMBER", "' System.out.println '", "COMMENT", 
		"WS", "COMP"
	};
	public static final int
		RULE_program = 0, RULE_analizer = 1, RULE_if_statement = 2, RULE_do_statement = 3, 
		RULE_for_statement = 4, RULE_vardec = 5, RULE_varasig = 6, RULE_println = 7, 
		RULE_logicexpr = 8, RULE_comprex = 9, RULE_comparop = 10, RULE_arithmetic_expr = 11, 
		RULE_numeric_result = 12, RULE_logical_ent = 13, RULE_numeric_ent = 14;
	public static final String[] ruleNames = {
		"program", "analizer", "if_statement", "do_statement", "for_statement", 
		"vardec", "varasig", "println", "logicexpr", "comprex", "comparop", "arithmetic_expr", 
		"numeric_result", "logical_ent", "numeric_ent"
	};

	@Override
	public String getGrammarFileName() { return "compile.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public compileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compileParser.ID, 0); }
		public AnalizerContext analizer(int i) {
			return getRuleContext(AnalizerContext.class,i);
		}
		public List<AnalizerContext> analizer() {
			return getRuleContexts(AnalizerContext.class);
		}
		public TerminalNode RLLAVE() { return getToken(compileParser.RLLAVE, 0); }
		public TerminalNode ILLAVE() { return getToken(compileParser.ILLAVE, 0); }
		public TerminalNode PROGRAM() { return getToken(compileParser.PROGRAM, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(PROGRAM);
			setState(31); match(ID);
			setState(32); match(ILLAVE);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << EQUAL) | (1L << LPAR) | (1L << IF) | (1L << DO) | (1L << FOR) | (1L << VAR) | (1L << PRINTLN) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(33); analizer();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39); match(RLLAVE);
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

	public static class AnalizerContext extends ParserRuleContext {
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public Numeric_resultContext numeric_result() {
			return getRuleContext(Numeric_resultContext.class,0);
		}
		public VarasigContext varasig() {
			return getRuleContext(VarasigContext.class,0);
		}
		public AnalizerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analizer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).enterAnalizer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).exitAnalizer(this);
		}
	}

	public final AnalizerContext analizer() throws RecognitionException {
		AnalizerContext _localctx = new AnalizerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_analizer);
		try {
			setState(49);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41); vardec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); varasig();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43); arithmetic_expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44); numeric_result();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45); if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(46); do_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(47); for_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(48); println();
				}
				break;
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode SEMIDOT() { return getToken(compileParser.SEMIDOT, 0); }
		public TerminalNode IF() { return getToken(compileParser.IF, 0); }
		public List<Numeric_entContext> numeric_ent() {
			return getRuleContexts(Numeric_entContext.class);
		}
		public TerminalNode MAYOR() { return getToken(compileParser.MAYOR, 0); }
		public Numeric_entContext numeric_ent(int i) {
			return getRuleContext(Numeric_entContext.class,i);
		}
		public TerminalNode RLLAVE() { return getToken(compileParser.RLLAVE, 0); }
		public TerminalNode LPAR() { return getToken(compileParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(compileParser.RPAR, 0); }
		public TerminalNode ILLAVE() { return getToken(compileParser.ILLAVE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(IF);
			setState(52); match(LPAR);
			setState(53); numeric_ent();
			setState(54); match(MAYOR);
			setState(55); numeric_ent();
			setState(56); match(RPAR);
			setState(57); match(ILLAVE);
			setState(58); numeric_ent();
			setState(59); match(SEMIDOT);
			setState(60); match(RLLAVE);
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

	public static class Do_statementContext extends ParserRuleContext {
		public TerminalNode SEMIDOT() { return getToken(compileParser.SEMIDOT, 0); }
		public TerminalNode EQUAL() { return getToken(compileParser.EQUAL, 0); }
		public List<Numeric_entContext> numeric_ent() {
			return getRuleContexts(Numeric_entContext.class);
		}
		public TerminalNode DO() { return getToken(compileParser.DO, 0); }
		public Numeric_entContext numeric_ent(int i) {
			return getRuleContext(Numeric_entContext.class,i);
		}
		public TerminalNode PRINTLN() { return getToken(compileParser.PRINTLN, 0); }
		public TerminalNode RLLAVE() { return getToken(compileParser.RLLAVE, 0); }
		public TerminalNode LPAR() { return getToken(compileParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(compileParser.RPAR, 0); }
		public TerminalNode ILLAVE() { return getToken(compileParser.ILLAVE, 0); }
		public TerminalNode WHILE() { return getToken(compileParser.WHILE, 0); }
		public Do_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).exitDo_statement(this);
		}
	}

	public final Do_statementContext do_statement() throws RecognitionException {
		Do_statementContext _localctx = new Do_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(DO);
			setState(63); match(ILLAVE);
			setState(64); match(PRINTLN);
			setState(65); numeric_ent();
			setState(66); match(SEMIDOT);
			setState(67); match(RLLAVE);
			setState(68); match(WHILE);
			setState(69); match(LPAR);
			setState(70); numeric_ent();
			setState(71); match(EQUAL);
			setState(72); numeric_ent();
			setState(73); match(RPAR);
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

	public static class For_statementContext extends ParserRuleContext {
		public List<TerminalNode> SEMIDOT() { return getTokens(compileParser.SEMIDOT); }
		public TerminalNode MAYOR() { return getToken(compileParser.MAYOR, 0); }
		public Numeric_entContext numeric_ent(int i) {
			return getRuleContext(Numeric_entContext.class,i);
		}
		public TerminalNode FOR() { return getToken(compileParser.FOR, 0); }
		public TerminalNode DOUBLEEQ() { return getToken(compileParser.DOUBLEEQ, 0); }
		public TerminalNode ID(int i) {
			return getToken(compileParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(compileParser.LPAR, 0); }
		public TerminalNode ILLAVE() { return getToken(compileParser.ILLAVE, 0); }
		public List<TerminalNode> ID() { return getTokens(compileParser.ID); }
		public List<Numeric_entContext> numeric_ent() {
			return getRuleContexts(Numeric_entContext.class);
		}
		public TerminalNode SEMIDOT(int i) {
			return getToken(compileParser.SEMIDOT, i);
		}
		public TerminalNode DOUBLEPLUS() { return getToken(compileParser.DOUBLEPLUS, 0); }
		public TerminalNode COMILLA(int i) {
			return getToken(compileParser.COMILLA, i);
		}
		public TerminalNode PRINTLN() { return getToken(compileParser.PRINTLN, 0); }
		public List<TerminalNode> COMILLA() { return getTokens(compileParser.COMILLA); }
		public TerminalNode RLLAVE() { return getToken(compileParser.RLLAVE, 0); }
		public TerminalNode RPAR() { return getToken(compileParser.RPAR, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_for_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(FOR);
			setState(76); match(LPAR);
			setState(78); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(77); numeric_ent();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(80); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(82); match(ID);
			setState(83); match(MAYOR);
			setState(84); numeric_ent();
			setState(85); match(SEMIDOT);
			setState(86); match(ID);
			setState(87); match(DOUBLEEQ);
			setState(88); numeric_ent();
			setState(89); match(SEMIDOT);
			setState(90); match(ID);
			setState(91); match(DOUBLEPLUS);
			setState(92); match(RPAR);
			setState(93); match(ILLAVE);
			setState(94); match(PRINTLN);
			setState(95); match(COMILLA);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(96); match(ID);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102); match(COMILLA);
			setState(103); match(SEMIDOT);
			setState(104); match(RLLAVE);
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

	public static class VardecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compileParser.ID, 0); }
		public TerminalNode SEMIDOT() { return getToken(compileParser.SEMIDOT, 0); }
		public TerminalNode VAR() { return getToken(compileParser.VAR, 0); }
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).enterVardec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).exitVardec(this);
		}
	}

	public final VardecContext vardec() throws RecognitionException {
		VardecContext _localctx = new VardecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vardec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(VAR);
			setState(107); match(ID);
			setState(108); match(SEMIDOT);
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

	public static class VarasigContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compileParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(compileParser.EQUAL, 0); }
		public TerminalNode SEMIDOT() { return getToken(compileParser.SEMIDOT, 0); }
		public TerminalNode NUMBER() { return getToken(compileParser.NUMBER, 0); }
		public VarasigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varasig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).enterVarasig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).exitVarasig(this);
		}
	}

	public final VarasigContext varasig() throws RecognitionException {
		VarasigContext _localctx = new VarasigContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varasig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(ID);
			setState(111); match(EQUAL);
			setState(112); match(NUMBER);
			setState(113); match(SEMIDOT);
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

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode SEMIDOT() { return getToken(compileParser.SEMIDOT, 0); }
		public TerminalNode PRINTLN() { return getToken(compileParser.PRINTLN, 0); }
		public TerminalNode NUMBER() { return getToken(compileParser.NUMBER, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).exitPrintln(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(PRINTLN);
			setState(116); match(NUMBER);
			setState(117); match(SEMIDOT);
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

	public static class LogicexprContext extends ParserRuleContext {
		public Logical_entContext logical_ent() {
			return getRuleContext(Logical_entContext.class,0);
		}
		public TerminalNode NOT() { return getToken(compileParser.NOT, 0); }
		public LogicexprContext logicexpr(int i) {
			return getRuleContext(LogicexprContext.class,i);
		}
		public TerminalNode AND() { return getToken(compileParser.AND, 0); }
		public ComprexContext comprex() {
			return getRuleContext(ComprexContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(compileParser.LPAR, 0); }
		public List<LogicexprContext> logicexpr() {
			return getRuleContexts(LogicexprContext.class);
		}
		public TerminalNode RPAR() { return getToken(compileParser.RPAR, 0); }
		public TerminalNode OR() { return getToken(compileParser.OR, 0); }
		public LogicexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).enterLogicexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).exitLogicexpr(this);
		}
	}

	public final LogicexprContext logicexpr() throws RecognitionException {
		return logicexpr(0);
	}

	private LogicexprContext logicexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicexprContext _localctx = new LogicexprContext(_ctx, _parentState);
		LogicexprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_logicexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(120); comprex();
				}
				break;
			case 2:
				{
				setState(121); match(LPAR);
				setState(122); logicexpr(0);
				setState(123); match(RPAR);
				}
				break;
			case 3:
				{
				setState(125); logical_ent();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(137);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new LogicexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicexpr);
						setState(128);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(129); match(AND);
						setState(130); logicexpr(7);
						}
						break;
					case 2:
						{
						_localctx = new LogicexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicexpr);
						setState(131);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(132); match(OR);
						setState(133); logicexpr(6);
						}
						break;
					case 3:
						{
						_localctx = new LogicexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicexpr);
						setState(134);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(135); match(NOT);
						setState(136); logicexpr(5);
						}
						break;
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComprexContext extends ParserRuleContext {
		public List<ComparopContext> comparop() {
			return getRuleContexts(ComparopContext.class);
		}
		public ComparopContext comparop(int i) {
			return getRuleContext(ComparopContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(compileParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(compileParser.RPAR, 0); }
		public TerminalNode COMP() { return getToken(compileParser.COMP, 0); }
		public ComprexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comprex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).enterComprex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).exitComprex(this);
		}
	}

	public final ComprexContext comprex() throws RecognitionException {
		ComprexContext _localctx = new ComprexContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comprex);
		try {
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142); comparop();
				setState(143); match(COMP);
				setState(144); comparop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146); match(LPAR);
				setState(147); comparop();
				setState(148); match(RPAR);
				}
				break;
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

	public static class ComparopContext extends ParserRuleContext {
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public ComparopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).enterComparop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).exitComparop(this);
		}
	}

	public final ComparopContext comparop() throws RecognitionException {
		ComparopContext _localctx = new ComparopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); arithmetic_expr(0);
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

	public static class Arithmetic_exprContext extends ParserRuleContext {
		public TerminalNode MENOS() { return getToken(compileParser.MENOS, 0); }
		public Numeric_entContext numeric_ent() {
			return getRuleContext(Numeric_entContext.class,0);
		}
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public TerminalNode MAS() { return getToken(compileParser.MAS, 0); }
		public TerminalNode LPAR() { return getToken(compileParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(compileParser.RPAR, 0); }
		public TerminalNode POR() { return getToken(compileParser.POR, 0); }
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(compileParser.DIV, 0); }
		public Arithmetic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).enterArithmetic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).exitArithmetic_expr(this);
		}
	}

	public final Arithmetic_exprContext arithmetic_expr() throws RecognitionException {
		return arithmetic_expr(0);
	}

	private Arithmetic_exprContext arithmetic_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_exprContext _localctx = new Arithmetic_exprContext(_ctx, _parentState);
		Arithmetic_exprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_arithmetic_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			switch (_input.LA(1)) {
			case MENOS:
				{
				setState(155); match(MENOS);
				setState(156); arithmetic_expr(3);
				}
				break;
			case LPAR:
				{
				setState(157); match(LPAR);
				setState(158); arithmetic_expr(0);
				setState(159); match(RPAR);
				}
				break;
			case ID:
			case NUMBER:
				{
				setState(161); numeric_ent();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(176);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(164);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(165); match(POR);
						setState(166); arithmetic_expr(8);
						}
						break;
					case 2:
						{
						_localctx = new Arithmetic_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(167);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(168); match(DIV);
						setState(169); arithmetic_expr(7);
						}
						break;
					case 3:
						{
						_localctx = new Arithmetic_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(170);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(171); match(MAS);
						setState(172); arithmetic_expr(6);
						}
						break;
					case 4:
						{
						_localctx = new Arithmetic_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(173);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(174); match(MENOS);
						setState(175); arithmetic_expr(5);
						}
						break;
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Numeric_resultContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(compileParser.EQUAL, 0); }
		public Numeric_entContext numeric_ent() {
			return getRuleContext(Numeric_entContext.class,0);
		}
		public Numeric_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).enterNumeric_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).exitNumeric_result(this);
		}
	}

	public final Numeric_resultContext numeric_result() throws RecognitionException {
		Numeric_resultContext _localctx = new Numeric_resultContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_numeric_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(EQUAL);
			setState(182); numeric_ent();
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

	public static class Logical_entContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compileParser.ID, 0); }
		public TerminalNode FALSE() { return getToken(compileParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(compileParser.TRUE, 0); }
		public Logical_entContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_ent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).enterLogical_ent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).exitLogical_ent(this);
		}
	}

	public final Logical_entContext logical_ent() throws RecognitionException {
		Logical_entContext _localctx = new Logical_entContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logical_ent);
		int _la;
		try {
			setState(186);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); match(ID);
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

	public static class Numeric_entContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compileParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(compileParser.NUMBER, 0); }
		public Numeric_entContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_ent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).enterNumeric_ent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compileListener ) ((compileListener)listener).exitNumeric_ent(this);
		}
	}

	public final Numeric_entContext numeric_ent() throws RecognitionException {
		Numeric_entContext _localctx = new Numeric_entContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numeric_ent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8: return logicexpr_sempred((LogicexprContext)_localctx, predIndex);
		case 11: return arithmetic_expr_sempred((Arithmetic_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicexpr_sempred(LogicexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);
		case 1: return precpred(_ctx, 5);
		case 2: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean arithmetic_expr_sempred(Arithmetic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 7);
		case 4: return precpred(_ctx, 6);
		case 5: return precpred(_ctx, 5);
		case 6: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u00c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\7\2"+
		"%\n\2\f\2\16\2(\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\6\6Q\n\6\r\6\16\6R\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6d\n\6\f\6\16\6g"+
		"\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0081\n\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u008c\n\n\f\n\16\n\u008f\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u0099\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00a5\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b3"+
		"\n\r\f\r\16\r\u00b6\13\r\3\16\3\16\3\16\3\17\3\17\5\17\u00bd\n\17\3\20"+
		"\3\20\3\20\2\4\22\30\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\4\3\2"+
		"\32\33\3\2\'(\u00c8\2 \3\2\2\2\4\63\3\2\2\2\6\65\3\2\2\2\b@\3\2\2\2\n"+
		"M\3\2\2\2\fl\3\2\2\2\16p\3\2\2\2\20u\3\2\2\2\22\u0080\3\2\2\2\24\u0098"+
		"\3\2\2\2\26\u009a\3\2\2\2\30\u00a4\3\2\2\2\32\u00b7\3\2\2\2\34\u00bc\3"+
		"\2\2\2\36\u00be\3\2\2\2 !\7$\2\2!\"\7\'\2\2\"&\7\24\2\2#%\5\4\3\2$#\3"+
		"\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7\25\2\2"+
		"*\3\3\2\2\2+\64\5\f\7\2,\64\5\16\b\2-\64\5\30\r\2.\64\5\32\16\2/\64\5"+
		"\6\4\2\60\64\5\b\5\2\61\64\5\n\6\2\62\64\5\20\t\2\63+\3\2\2\2\63,\3\2"+
		"\2\2\63-\3\2\2\2\63.\3\2\2\2\63/\3\2\2\2\63\60\3\2\2\2\63\61\3\2\2\2\63"+
		"\62\3\2\2\2\64\5\3\2\2\2\65\66\7\34\2\2\66\67\7\26\2\2\678\5\36\20\28"+
		"9\7\r\2\29:\5\36\20\2:;\7\27\2\2;<\7\24\2\2<=\5\36\20\2=>\7\31\2\2>?\7"+
		"\25\2\2?\7\3\2\2\2@A\7 \2\2AB\7\24\2\2BC\7&\2\2CD\5\36\20\2DE\7\31\2\2"+
		"EF\7\25\2\2FG\7\37\2\2GH\7\26\2\2HI\5\36\20\2IJ\7\23\2\2JK\5\36\20\2K"+
		"L\7\27\2\2L\t\3\2\2\2MN\7#\2\2NP\7\26\2\2OQ\5\36\20\2PO\3\2\2\2QR\3\2"+
		"\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\'\2\2UV\7\r\2\2VW\5\36\20\2WX\7"+
		"\31\2\2XY\7\'\2\2YZ\7\21\2\2Z[\5\36\20\2[\\\7\31\2\2\\]\7\'\2\2]^\7\6"+
		"\2\2^_\7\27\2\2_`\7\24\2\2`a\7&\2\2ae\7\b\2\2bd\7\'\2\2cb\3\2\2\2dg\3"+
		"\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\b\2\2ij\7\31\2\2jk"+
		"\7\25\2\2k\13\3\2\2\2lm\7%\2\2mn\7\'\2\2no\7\31\2\2o\r\3\2\2\2pq\7\'\2"+
		"\2qr\7\23\2\2rs\7(\2\2st\7\31\2\2t\17\3\2\2\2uv\7&\2\2vw\7(\2\2wx\7\31"+
		"\2\2x\21\3\2\2\2yz\b\n\1\2z\u0081\5\24\13\2{|\7\26\2\2|}\5\22\n\2}~\7"+
		"\27\2\2~\u0081\3\2\2\2\177\u0081\5\34\17\2\u0080y\3\2\2\2\u0080{\3\2\2"+
		"\2\u0080\177\3\2\2\2\u0081\u008d\3\2\2\2\u0082\u0083\f\b\2\2\u0083\u0084"+
		"\7\3\2\2\u0084\u008c\5\22\n\t\u0085\u0086\f\7\2\2\u0086\u0087\7\4\2\2"+
		"\u0087\u008c\5\22\n\b\u0088\u0089\f\6\2\2\u0089\u008a\7\5\2\2\u008a\u008c"+
		"\5\22\n\7\u008b\u0082\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0088\3\2\2\2"+
		"\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\23"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\5\26\f\2\u0091\u0092\7,\2\2\u0092"+
		"\u0093\5\26\f\2\u0093\u0099\3\2\2\2\u0094\u0095\7\26\2\2\u0095\u0096\5"+
		"\26\f\2\u0096\u0097\7\27\2\2\u0097\u0099\3\2\2\2\u0098\u0090\3\2\2\2\u0098"+
		"\u0094\3\2\2\2\u0099\25\3\2\2\2\u009a\u009b\5\30\r\2\u009b\27\3\2\2\2"+
		"\u009c\u009d\b\r\1\2\u009d\u009e\7\n\2\2\u009e\u00a5\5\30\r\5\u009f\u00a0"+
		"\7\26\2\2\u00a0\u00a1\5\30\r\2\u00a1\u00a2\7\27\2\2\u00a2\u00a5\3\2\2"+
		"\2\u00a3\u00a5\5\36\20\2\u00a4\u009c\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00b4\3\2\2\2\u00a6\u00a7\f\t\2\2\u00a7\u00a8\7\13"+
		"\2\2\u00a8\u00b3\5\30\r\n\u00a9\u00aa\f\b\2\2\u00aa\u00ab\7\f\2\2\u00ab"+
		"\u00b3\5\30\r\t\u00ac\u00ad\f\7\2\2\u00ad\u00ae\7\t\2\2\u00ae\u00b3\5"+
		"\30\r\b\u00af\u00b0\f\6\2\2\u00b0\u00b1\7\n\2\2\u00b1\u00b3\5\30\r\7\u00b2"+
		"\u00a6\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00af\3\2"+
		"\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\31\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\23\2\2\u00b8\u00b9\5\36"+
		"\20\2\u00b9\33\3\2\2\2\u00ba\u00bd\t\2\2\2\u00bb\u00bd\7\'\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\35\3\2\2\2\u00be\u00bf\t\3\2\2\u00bf"+
		"\37\3\2\2\2\16&\63Re\u0080\u008b\u008d\u0098\u00a4\u00b2\u00b4\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}