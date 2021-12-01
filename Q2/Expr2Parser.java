// Generated from Expr2.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Expr2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUM=7, ID=8, NEWLINE=9;
	public static final int
		RULE_prog = 0, RULE_term = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "term", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'-'", "'+'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NUM", "ID", "NEWLINE"
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
	public String getGrammarFileName() { return "Expr2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Expr2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(Expr2Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Expr2Parser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(6);
				expr(0);
				setState(7);
				match(NEWLINE);
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			System.out.println();
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

	public static class TermContext extends ParserRuleContext {
		public Token ID;
		public Token NUM;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(Expr2Parser.ID, 0); }
		public TerminalNode NUM() { return getToken(Expr2Parser.NUM, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_term);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(T__0);
				setState(17);
				expr(0);
				setState(18);
				match(T__1);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				((TermContext)_localctx).ID = match(ID);
				System.out.print((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				((TermContext)_localctx).NUM = match(NUM);
				System.out.print((((TermContext)_localctx).NUM!=null?((TermContext)_localctx).NUM.getText():null));
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

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(27);
				match(T__2);
				setState(28);
				expr(7);
				System.out.print("-");
				}
				break;
			case T__3:
				{
				setState(31);
				match(T__3);
				setState(32);
				expr(6);
				System.out.print("-");
				}
				break;
			case T__0:
			case NUM:
			case ID:
				{
				setState(35);
				term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(38);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(39);
						match(T__4);
						setState(42);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							setState(40);
							expr(0);
							}
							break;
						case 2:
							{
							setState(41);
							term();
							}
							break;
						}
						System.out.print("*");
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(46);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(47);
						match(T__5);
						setState(50);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(48);
							expr(0);
							}
							break;
						case 2:
							{
							setState(49);
							term();
							}
							break;
						}
						System.out.print("/");
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(55);
						match(T__3);
						setState(58);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(56);
							expr(0);
							}
							break;
						case 2:
							{
							setState(57);
							term();
							}
							break;
						}
						System.out.print("+");
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(62);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(63);
						match(T__2);
						setState(66);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
						case 1:
							{
							setState(64);
							expr(0);
							}
							break;
						case 2:
							{
							setState(65);
							term();
							}
							break;
						}
						System.out.print("-");
						}
						break;
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\'\n\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\65\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4E\n\4\3"+
		"\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\4\2\3\6\5\2\4\6\2\2\2W\2\r\3\2\2\2\4"+
		"\32\3\2\2\2\6&\3\2\2\2\b\t\5\6\4\2\t\n\7\13\2\2\n\f\3\2\2\2\13\b\3\2\2"+
		"\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\20\3\2\2\2\17\r\3\2\2\2\20"+
		"\21\b\2\1\2\21\3\3\2\2\2\22\23\7\3\2\2\23\24\5\6\4\2\24\25\7\4\2\2\25"+
		"\33\3\2\2\2\26\27\7\n\2\2\27\33\b\3\1\2\30\31\7\t\2\2\31\33\b\3\1\2\32"+
		"\22\3\2\2\2\32\26\3\2\2\2\32\30\3\2\2\2\33\5\3\2\2\2\34\35\b\4\1\2\35"+
		"\36\7\5\2\2\36\37\5\6\4\t\37 \b\4\1\2 \'\3\2\2\2!\"\7\6\2\2\"#\5\6\4\b"+
		"#$\b\4\1\2$\'\3\2\2\2%\'\5\4\3\2&\34\3\2\2\2&!\3\2\2\2&%\3\2\2\2\'J\3"+
		"\2\2\2()\f\7\2\2),\7\7\2\2*-\5\6\4\2+-\5\4\3\2,*\3\2\2\2,+\3\2\2\2-.\3"+
		"\2\2\2./\b\4\1\2/I\3\2\2\2\60\61\f\6\2\2\61\64\7\b\2\2\62\65\5\6\4\2\63"+
		"\65\5\4\3\2\64\62\3\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\67\b\4\1\2\67"+
		"I\3\2\2\289\f\5\2\29<\7\6\2\2:=\5\6\4\2;=\5\4\3\2<:\3\2\2\2<;\3\2\2\2"+
		"=>\3\2\2\2>?\b\4\1\2?I\3\2\2\2@A\f\4\2\2AD\7\5\2\2BE\5\6\4\2CE\5\4\3\2"+
		"DB\3\2\2\2DC\3\2\2\2EF\3\2\2\2FG\b\4\1\2GI\3\2\2\2H(\3\2\2\2H\60\3\2\2"+
		"\2H8\3\2\2\2H@\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\7\3\2\2\2LJ\3\2"+
		"\2\2\13\r\32&,\64<DHJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}