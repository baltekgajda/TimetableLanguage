package main.lexerParser.gen;// Generated from C:/Users/bartl/git/TT/grammar\tt.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ttParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGER_TYPE=1, STRING_TYPE=2, TIMETABLE_TYPE=3, TIMETABLE_DATA_TYPE=4, 
		LEFT_ROUND_BRACKET=5, RIGHT_ROUND_BRACKET=6, LEFT_CURLY_BRACKET=7, RIGHT_CURLY_BRACKET=8, 
		DOT=9, PRINT=10, LIST_TIMETABLE=11, OPEN_TT_DATA=12, GEN_TIMETABLE=13, 
		PRINT_TT_STATS=14, PRINT_TT_DATA_STATS=15, GEN_PDF=16, GET_FITNESS=17, 
		GET_CLASSROOMS=18, SEMICOLON=19, IF=20, ELSE=21, FOREACH=22, WHILE=23, 
		COLON=24, ASSIGNMENT=25, OR=26, AND=27, COMPARISON=28, PLUS=29, MINUS=30, 
		MULTIPLY=31, DIVIDE=32, VARIABLE_NAME=33, INTEGER=34, STRING=35, COMMA=36, 
		COMMENT=37, WHITESPACE=38;
	public static final int
		RULE_script = 0, RULE_instructions = 1, RULE_condition = 2, RULE_alternative = 3, 
		RULE_conjunction = 4, RULE_comparison = 5, RULE_mathExpression = 6, RULE_statement = 7, 
		RULE_if_statement = 8, RULE_while_statement = 9, RULE_for_loop = 10, RULE_declaration_statement = 11, 
		RULE_assignement_statement = 12, RULE_timetable_statements = 13, RULE_print_statement = 14, 
		RULE_print_tt_statistics = 15, RULE_print_tt_data_statistics = 16, RULE_generate_PDF = 17, 
		RULE_list_tt_statement = 18, RULE_open_timetable_data = 19, RULE_gen_timetable = 20, 
		RULE_return_statement = 21, RULE_get_fitness = 22, RULE_get_classroom_count = 23, 
		RULE_type_declaration = 24, RULE_string_declaration = 25, RULE_int_declaration = 26, 
		RULE_timetable_data_declaration = 27, RULE_timetable_declaration = 28, 
		RULE_type_assignment = 29, RULE_string_assignment = 30, RULE_int_assignment = 31, 
		RULE_timetable_data_assignment = 32, RULE_timetable_assignment = 33, RULE_print_types = 34, 
		RULE_type = 35, RULE_timetable_type = 36, RULE_timetable_data_type = 37, 
		RULE_int_type = 38, RULE_string_type = 39;
	public static final String[] ruleNames = {
		"script", "instructions", "condition", "alternative", "conjunction", "comparison", 
		"mathExpression", "statement", "if_statement", "while_statement", "for_loop", 
		"declaration_statement", "assignement_statement", "timetable_statements", 
		"print_statement", "print_tt_statistics", "print_tt_data_statistics", 
		"generate_PDF", "list_tt_statement", "open_timetable_data", "gen_timetable", 
		"return_statement", "get_fitness", "get_classroom_count", "type_declaration", 
		"string_declaration", "int_declaration", "timetable_data_declaration", 
		"timetable_declaration", "type_assignment", "string_assignment", "int_assignment", 
		"timetable_data_assignment", "timetable_assignment", "print_types", "type", 
		"timetable_type", "timetable_data_type", "int_type", "string_type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Integer'", "'String'", "'Timetable'", "'TimetableData'", "'('", 
		"')'", "'{'", "'}'", "'.'", "'print'", "'listAll'", "'openTTData'", "'genTimetable'", 
		"'printStats'", "'printDataStats'", "'genPDF'", "'getFitness'", "'getClassroomCount'", 
		"';'", "'if'", "'else'", "'forEach'", "'while'", "':'", "'='", "'or'", 
		"'and'", null, "'+'", "'-'", "'*'", "'/'", null, null, null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INTEGER_TYPE", "STRING_TYPE", "TIMETABLE_TYPE", "TIMETABLE_DATA_TYPE", 
		"LEFT_ROUND_BRACKET", "RIGHT_ROUND_BRACKET", "LEFT_CURLY_BRACKET", "RIGHT_CURLY_BRACKET", 
		"DOT", "PRINT", "LIST_TIMETABLE", "OPEN_TT_DATA", "GEN_TIMETABLE", "PRINT_TT_STATS", 
		"PRINT_TT_DATA_STATS", "GEN_PDF", "GET_FITNESS", "GET_CLASSROOMS", "SEMICOLON", 
		"IF", "ELSE", "FOREACH", "WHILE", "COLON", "ASSIGNMENT", "OR", "AND", 
		"COMPARISON", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "VARIABLE_NAME", 
		"INTEGER", "STRING", "COMMA", "COMMENT", "WHITESPACE"
	};
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
	public String getGrammarFileName() { return "tt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ttParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_TYPE) | (1L << STRING_TYPE) | (1L << TIMETABLE_TYPE) | (1L << TIMETABLE_DATA_TYPE) | (1L << PRINT) | (1L << SEMICOLON) | (1L << IF) | (1L << FOREACH) | (1L << WHILE) | (1L << VARIABLE_NAME))) != 0)) {
				{
				{
				setState(80);
				statement();
				}
				}
				setState(85);
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

	public static class InstructionsContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY_BRACKET() { return getToken(ttParser.LEFT_CURLY_BRACKET, 0); }
		public TerminalNode RIGHT_CURLY_BRACKET() { return getToken(ttParser.RIGHT_CURLY_BRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instructions);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_CURLY_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(86);
				match(LEFT_CURLY_BRACKET);
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(87);
					statement();
					}
					}
					setState(90); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_TYPE) | (1L << STRING_TYPE) | (1L << TIMETABLE_TYPE) | (1L << TIMETABLE_DATA_TYPE) | (1L << PRINT) | (1L << SEMICOLON) | (1L << IF) | (1L << FOREACH) | (1L << WHILE) | (1L << VARIABLE_NAME))) != 0) );
				setState(92);
				match(RIGHT_CURLY_BRACKET);
				}
				}
				break;
			case INTEGER_TYPE:
			case STRING_TYPE:
			case TIMETABLE_TYPE:
			case TIMETABLE_DATA_TYPE:
			case PRINT:
			case SEMICOLON:
			case IF:
			case FOREACH:
			case WHILE:
			case VARIABLE_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				statement();
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(ttParser.LEFT_ROUND_BRACKET, 0); }
		public AlternativeContext alternative() {
			return getRuleContext(AlternativeContext.class,0);
		}
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(ttParser.RIGHT_ROUND_BRACKET, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(LEFT_ROUND_BRACKET);
			setState(98);
			alternative();
			setState(99);
			match(RIGHT_ROUND_BRACKET);
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

	public static class AlternativeContext extends ParserRuleContext {
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ttParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ttParser.OR, i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitAlternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			conjunction();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(102);
				match(OR);
				setState(103);
				conjunction();
				}
				}
				setState(108);
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

	public static class ConjunctionContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ttParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ttParser.AND, i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			comparison();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(110);
				match(AND);
				setState(111);
				comparison();
				}
				}
				setState(116);
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

	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode COMPARISON() { return getToken(ttParser.COMPARISON, 0); }
		public List<TerminalNode> VARIABLE_NAME() { return getTokens(ttParser.VARIABLE_NAME); }
		public TerminalNode VARIABLE_NAME(int i) {
			return getToken(ttParser.VARIABLE_NAME, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(ttParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(ttParser.INTEGER, i);
		}
		public List<Return_statementContext> return_statement() {
			return getRuleContexts(Return_statementContext.class);
		}
		public Return_statementContext return_statement(int i) {
			return getRuleContext(Return_statementContext.class,i);
		}
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(117);
				match(VARIABLE_NAME);
				}
				break;
			case 2:
				{
				setState(118);
				match(INTEGER);
				}
				break;
			case 3:
				{
				setState(119);
				return_statement();
				}
				break;
			case 4:
				{
				setState(120);
				mathExpression();
				}
				break;
			}
			setState(123);
			match(COMPARISON);
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(124);
				match(VARIABLE_NAME);
				}
				break;
			case 2:
				{
				setState(125);
				match(INTEGER);
				}
				break;
			case 3:
				{
				setState(126);
				return_statement();
				}
				break;
			case 4:
				{
				setState(127);
				mathExpression();
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

	public static class MathExpressionContext extends ParserRuleContext {
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(ttParser.LEFT_ROUND_BRACKET, 0); }
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(ttParser.RIGHT_ROUND_BRACKET, 0); }
		public TerminalNode PLUS() { return getToken(ttParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ttParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(ttParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(ttParser.DIVIDE, 0); }
		public List<TerminalNode> VARIABLE_NAME() { return getTokens(ttParser.VARIABLE_NAME); }
		public TerminalNode VARIABLE_NAME(int i) {
			return getToken(ttParser.VARIABLE_NAME, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(ttParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(ttParser.INTEGER, i);
		}
		public List<Return_statementContext> return_statement() {
			return getRuleContexts(Return_statementContext.class);
		}
		public Return_statementContext return_statement(int i) {
			return getRuleContext(Return_statementContext.class,i);
		}
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitMathExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitMathExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mathExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(LEFT_ROUND_BRACKET);
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(131);
				match(VARIABLE_NAME);
				}
				break;
			case 2:
				{
				setState(132);
				match(INTEGER);
				}
				break;
			case 3:
				{
				setState(133);
				return_statement();
				}
				break;
			case 4:
				{
				setState(134);
				mathExpression();
				}
				break;
			}
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(138);
				match(VARIABLE_NAME);
				}
				break;
			case 2:
				{
				setState(139);
				match(INTEGER);
				}
				break;
			case 3:
				{
				setState(140);
				return_statement();
				}
				break;
			case 4:
				{
				setState(141);
				mathExpression();
				}
				break;
			}
			setState(144);
			match(RIGHT_ROUND_BRACKET);
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

	public static class StatementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ttParser.SEMICOLON, 0); }
		public Assignement_statementContext assignement_statement() {
			return getRuleContext(Assignement_statementContext.class,0);
		}
		public Timetable_statementsContext timetable_statements() {
			return getRuleContext(Timetable_statementsContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				if_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				while_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				for_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				declaration_statement();
				setState(150);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				assignement_statement();
				setState(153);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
				timetable_statements();
				setState(156);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				print_statement();
				setState(159);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
				match(SEMICOLON);
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
		public TerminalNode IF() { return getToken(ttParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ttParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(IF);
			setState(165);
			condition();
			setState(166);
			instructions();
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(167);
				match(ELSE);
				setState(168);
				instructions();
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ttParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(WHILE);
			setState(172);
			condition();
			setState(173);
			instructions();
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(ttParser.FOREACH, 0); }
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(ttParser.LEFT_ROUND_BRACKET, 0); }
		public Timetable_typeContext timetable_type() {
			return getRuleContext(Timetable_typeContext.class,0);
		}
		public List<TerminalNode> VARIABLE_NAME() { return getTokens(ttParser.VARIABLE_NAME); }
		public TerminalNode VARIABLE_NAME(int i) {
			return getToken(ttParser.VARIABLE_NAME, i);
		}
		public TerminalNode COLON() { return getToken(ttParser.COLON, 0); }
		public TerminalNode DOT() { return getToken(ttParser.DOT, 0); }
		public List_tt_statementContext list_tt_statement() {
			return getRuleContext(List_tt_statementContext.class,0);
		}
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(ttParser.RIGHT_ROUND_BRACKET, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(FOREACH);
			setState(176);
			match(LEFT_ROUND_BRACKET);
			setState(177);
			timetable_type();
			setState(178);
			match(VARIABLE_NAME);
			setState(179);
			match(COLON);
			setState(180);
			match(VARIABLE_NAME);
			setState(181);
			match(DOT);
			setState(182);
			list_tt_statement();
			setState(183);
			match(RIGHT_ROUND_BRACKET);
			setState(184);
			instructions();
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

	public static class Declaration_statementContext extends ParserRuleContext {
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public String_declarationContext string_declaration() {
			return getRuleContext(String_declarationContext.class,0);
		}
		public Int_declarationContext int_declaration() {
			return getRuleContext(Int_declarationContext.class,0);
		}
		public Timetable_declarationContext timetable_declaration() {
			return getRuleContext(Timetable_declarationContext.class,0);
		}
		public Timetable_data_declarationContext timetable_data_declaration() {
			return getRuleContext(Timetable_data_declarationContext.class,0);
		}
		public Declaration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterDeclaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitDeclaration_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitDeclaration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration_statement);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				type_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				string_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				int_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				timetable_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				timetable_data_declaration();
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

	public static class Assignement_statementContext extends ParserRuleContext {
		public Type_assignmentContext type_assignment() {
			return getRuleContext(Type_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public Timetable_assignmentContext timetable_assignment() {
			return getRuleContext(Timetable_assignmentContext.class,0);
		}
		public Timetable_data_assignmentContext timetable_data_assignment() {
			return getRuleContext(Timetable_data_assignmentContext.class,0);
		}
		public Assignement_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignement_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterAssignement_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitAssignement_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitAssignement_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignement_statementContext assignement_statement() throws RecognitionException {
		Assignement_statementContext _localctx = new Assignement_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignement_statement);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				type_assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				string_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				int_assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				timetable_assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				timetable_data_assignment();
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

	public static class Timetable_statementsContext extends ParserRuleContext {
		public Gen_timetableContext gen_timetable() {
			return getRuleContext(Gen_timetableContext.class,0);
		}
		public Print_tt_statisticsContext print_tt_statistics() {
			return getRuleContext(Print_tt_statisticsContext.class,0);
		}
		public Generate_PDFContext generate_PDF() {
			return getRuleContext(Generate_PDFContext.class,0);
		}
		public Print_tt_data_statisticsContext print_tt_data_statistics() {
			return getRuleContext(Print_tt_data_statisticsContext.class,0);
		}
		public Timetable_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timetable_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterTimetable_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitTimetable_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitTimetable_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timetable_statementsContext timetable_statements() throws RecognitionException {
		Timetable_statementsContext _localctx = new Timetable_statementsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_timetable_statements);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				gen_timetable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				print_tt_statistics();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				generate_PDF();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				print_tt_data_statistics();
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

	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ttParser.PRINT, 0); }
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(ttParser.LEFT_ROUND_BRACKET, 0); }
		public List<Print_typesContext> print_types() {
			return getRuleContexts(Print_typesContext.class);
		}
		public Print_typesContext print_types(int i) {
			return getRuleContext(Print_typesContext.class,i);
		}
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(ttParser.RIGHT_ROUND_BRACKET, 0); }
		public List<TerminalNode> PLUS() { return getTokens(ttParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ttParser.PLUS, i);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitPrint_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitPrint_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_print_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(PRINT);
			setState(207);
			match(LEFT_ROUND_BRACKET);
			setState(208);
			print_types();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(209);
				match(PLUS);
				setState(210);
				print_types();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(RIGHT_ROUND_BRACKET);
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

	public static class Print_tt_statisticsContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(ttParser.VARIABLE_NAME, 0); }
		public TerminalNode DOT() { return getToken(ttParser.DOT, 0); }
		public TerminalNode PRINT_TT_STATS() { return getToken(ttParser.PRINT_TT_STATS, 0); }
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(ttParser.LEFT_ROUND_BRACKET, 0); }
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(ttParser.RIGHT_ROUND_BRACKET, 0); }
		public Print_tt_statisticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_tt_statistics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterPrint_tt_statistics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitPrint_tt_statistics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitPrint_tt_statistics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_tt_statisticsContext print_tt_statistics() throws RecognitionException {
		Print_tt_statisticsContext _localctx = new Print_tt_statisticsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_print_tt_statistics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(VARIABLE_NAME);
			setState(219);
			match(DOT);
			setState(220);
			match(PRINT_TT_STATS);
			setState(221);
			match(LEFT_ROUND_BRACKET);
			setState(222);
			match(RIGHT_ROUND_BRACKET);
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

	public static class Print_tt_data_statisticsContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(ttParser.VARIABLE_NAME, 0); }
		public TerminalNode DOT() { return getToken(ttParser.DOT, 0); }
		public TerminalNode PRINT_TT_DATA_STATS() { return getToken(ttParser.PRINT_TT_DATA_STATS, 0); }
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(ttParser.LEFT_ROUND_BRACKET, 0); }
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(ttParser.RIGHT_ROUND_BRACKET, 0); }
		public Print_tt_data_statisticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_tt_data_statistics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterPrint_tt_data_statistics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitPrint_tt_data_statistics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitPrint_tt_data_statistics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_tt_data_statisticsContext print_tt_data_statistics() throws RecognitionException {
		Print_tt_data_statisticsContext _localctx = new Print_tt_data_statisticsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_print_tt_data_statistics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(VARIABLE_NAME);
			setState(225);
			match(DOT);
			setState(226);
			match(PRINT_TT_DATA_STATS);
			setState(227);
			match(LEFT_ROUND_BRACKET);
			setState(228);
			match(RIGHT_ROUND_BRACKET);
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

	public static class Generate_PDFContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(ttParser.VARIABLE_NAME, 0); }
		public TerminalNode DOT() { return getToken(ttParser.DOT, 0); }
		public TerminalNode GEN_PDF() { return getToken(ttParser.GEN_PDF, 0); }
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(ttParser.LEFT_ROUND_BRACKET, 0); }
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(ttParser.RIGHT_ROUND_BRACKET, 0); }
		public Generate_PDFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generate_PDF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterGenerate_PDF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitGenerate_PDF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitGenerate_PDF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generate_PDFContext generate_PDF() throws RecognitionException {
		Generate_PDFContext _localctx = new Generate_PDFContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_generate_PDF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(VARIABLE_NAME);
			setState(231);
			match(DOT);
			setState(232);
			match(GEN_PDF);
			setState(233);
			match(LEFT_ROUND_BRACKET);
			setState(234);
			match(RIGHT_ROUND_BRACKET);
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

	public static class List_tt_statementContext extends ParserRuleContext {
		public TerminalNode LIST_TIMETABLE() { return getToken(ttParser.LIST_TIMETABLE, 0); }
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(ttParser.LEFT_ROUND_BRACKET, 0); }
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(ttParser.RIGHT_ROUND_BRACKET, 0); }
		public List_tt_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_tt_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterList_tt_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitList_tt_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitList_tt_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_tt_statementContext list_tt_statement() throws RecognitionException {
		List_tt_statementContext _localctx = new List_tt_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_list_tt_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(LIST_TIMETABLE);
			setState(237);
			match(LEFT_ROUND_BRACKET);
			setState(238);
			match(RIGHT_ROUND_BRACKET);
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

	public static class Open_timetable_dataContext extends ParserRuleContext {
		public TerminalNode OPEN_TT_DATA() { return getToken(ttParser.OPEN_TT_DATA, 0); }
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(ttParser.LEFT_ROUND_BRACKET, 0); }
		public TerminalNode STRING() { return getToken(ttParser.STRING, 0); }
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(ttParser.RIGHT_ROUND_BRACKET, 0); }
		public Open_timetable_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_timetable_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterOpen_timetable_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitOpen_timetable_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitOpen_timetable_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_timetable_dataContext open_timetable_data() throws RecognitionException {
		Open_timetable_dataContext _localctx = new Open_timetable_dataContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_open_timetable_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(OPEN_TT_DATA);
			setState(241);
			match(LEFT_ROUND_BRACKET);
			setState(242);
			match(STRING);
			setState(243);
			match(RIGHT_ROUND_BRACKET);
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

	public static class Gen_timetableContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(ttParser.VARIABLE_NAME, 0); }
		public TerminalNode DOT() { return getToken(ttParser.DOT, 0); }
		public TerminalNode GEN_TIMETABLE() { return getToken(ttParser.GEN_TIMETABLE, 0); }
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(ttParser.LEFT_ROUND_BRACKET, 0); }
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(ttParser.RIGHT_ROUND_BRACKET, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(ttParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(ttParser.INTEGER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ttParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ttParser.COMMA, i);
		}
		public Gen_timetableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gen_timetable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterGen_timetable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitGen_timetable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitGen_timetable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gen_timetableContext gen_timetable() throws RecognitionException {
		Gen_timetableContext _localctx = new Gen_timetableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_gen_timetable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(VARIABLE_NAME);
			setState(246);
			match(DOT);
			setState(247);
			match(GEN_TIMETABLE);
			setState(248);
			match(LEFT_ROUND_BRACKET);
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(249);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(250);
				match(INTEGER);
				setState(251);
				match(COMMA);
				setState(252);
				match(INTEGER);
				}
				break;
			}
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(255);
				match(COMMA);
				setState(256);
				match(INTEGER);
				}
			}

			setState(259);
			match(RIGHT_ROUND_BRACKET);
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

	public static class Return_statementContext extends ParserRuleContext {
		public Get_fitnessContext get_fitness() {
			return getRuleContext(Get_fitnessContext.class,0);
		}
		public Get_classroom_countContext get_classroom_count() {
			return getRuleContext(Get_classroom_countContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_return_statement);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				get_fitness();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				get_classroom_count();
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

	public static class Get_fitnessContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(ttParser.VARIABLE_NAME, 0); }
		public TerminalNode DOT() { return getToken(ttParser.DOT, 0); }
		public TerminalNode GET_FITNESS() { return getToken(ttParser.GET_FITNESS, 0); }
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(ttParser.LEFT_ROUND_BRACKET, 0); }
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(ttParser.RIGHT_ROUND_BRACKET, 0); }
		public Get_fitnessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_fitness; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterGet_fitness(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitGet_fitness(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitGet_fitness(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_fitnessContext get_fitness() throws RecognitionException {
		Get_fitnessContext _localctx = new Get_fitnessContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_get_fitness);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(VARIABLE_NAME);
			setState(266);
			match(DOT);
			setState(267);
			match(GET_FITNESS);
			setState(268);
			match(LEFT_ROUND_BRACKET);
			setState(269);
			match(RIGHT_ROUND_BRACKET);
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

	public static class Get_classroom_countContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(ttParser.VARIABLE_NAME, 0); }
		public TerminalNode DOT() { return getToken(ttParser.DOT, 0); }
		public TerminalNode GET_CLASSROOMS() { return getToken(ttParser.GET_CLASSROOMS, 0); }
		public TerminalNode LEFT_ROUND_BRACKET() { return getToken(ttParser.LEFT_ROUND_BRACKET, 0); }
		public TerminalNode RIGHT_ROUND_BRACKET() { return getToken(ttParser.RIGHT_ROUND_BRACKET, 0); }
		public Get_classroom_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_classroom_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterGet_classroom_count(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitGet_classroom_count(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitGet_classroom_count(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_classroom_countContext get_classroom_count() throws RecognitionException {
		Get_classroom_countContext _localctx = new Get_classroom_countContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_get_classroom_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(VARIABLE_NAME);
			setState(272);
			match(DOT);
			setState(273);
			match(GET_CLASSROOMS);
			setState(274);
			match(LEFT_ROUND_BRACKET);
			setState(275);
			match(RIGHT_ROUND_BRACKET);
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

	public static class Type_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> VARIABLE_NAME() { return getTokens(ttParser.VARIABLE_NAME); }
		public TerminalNode VARIABLE_NAME(int i) {
			return getToken(ttParser.VARIABLE_NAME, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(ttParser.ASSIGNMENT, 0); }
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterType_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitType_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitType_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			type();
			setState(278);
			match(VARIABLE_NAME);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(279);
				match(ASSIGNMENT);
				setState(280);
				match(VARIABLE_NAME);
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

	public static class String_declarationContext extends ParserRuleContext {
		public String_typeContext string_type() {
			return getRuleContext(String_typeContext.class,0);
		}
		public TerminalNode VARIABLE_NAME() { return getToken(ttParser.VARIABLE_NAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ttParser.ASSIGNMENT, 0); }
		public TerminalNode STRING() { return getToken(ttParser.STRING, 0); }
		public String_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterString_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitString_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitString_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_declarationContext string_declaration() throws RecognitionException {
		String_declarationContext _localctx = new String_declarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			string_type();
			setState(284);
			match(VARIABLE_NAME);
			setState(285);
			match(ASSIGNMENT);
			setState(286);
			match(STRING);
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

	public static class Int_declarationContext extends ParserRuleContext {
		public Int_typeContext int_type() {
			return getRuleContext(Int_typeContext.class,0);
		}
		public TerminalNode VARIABLE_NAME() { return getToken(ttParser.VARIABLE_NAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ttParser.ASSIGNMENT, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(ttParser.INTEGER, 0); }
		public Int_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterInt_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitInt_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitInt_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_declarationContext int_declaration() throws RecognitionException {
		Int_declarationContext _localctx = new Int_declarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_int_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			int_type();
			setState(289);
			match(VARIABLE_NAME);
			setState(290);
			match(ASSIGNMENT);
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_ROUND_BRACKET:
				{
				setState(291);
				mathExpression();
				}
				break;
			case VARIABLE_NAME:
				{
				setState(292);
				return_statement();
				}
				break;
			case INTEGER:
				{
				setState(293);
				match(INTEGER);
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

	public static class Timetable_data_declarationContext extends ParserRuleContext {
		public Timetable_data_typeContext timetable_data_type() {
			return getRuleContext(Timetable_data_typeContext.class,0);
		}
		public TerminalNode VARIABLE_NAME() { return getToken(ttParser.VARIABLE_NAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ttParser.ASSIGNMENT, 0); }
		public Open_timetable_dataContext open_timetable_data() {
			return getRuleContext(Open_timetable_dataContext.class,0);
		}
		public Timetable_data_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timetable_data_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterTimetable_data_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitTimetable_data_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitTimetable_data_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timetable_data_declarationContext timetable_data_declaration() throws RecognitionException {
		Timetable_data_declarationContext _localctx = new Timetable_data_declarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_timetable_data_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			timetable_data_type();
			setState(297);
			match(VARIABLE_NAME);
			setState(298);
			match(ASSIGNMENT);
			setState(299);
			open_timetable_data();
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

	public static class Timetable_declarationContext extends ParserRuleContext {
		public Timetable_typeContext timetable_type() {
			return getRuleContext(Timetable_typeContext.class,0);
		}
		public TerminalNode VARIABLE_NAME() { return getToken(ttParser.VARIABLE_NAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ttParser.ASSIGNMENT, 0); }
		public Gen_timetableContext gen_timetable() {
			return getRuleContext(Gen_timetableContext.class,0);
		}
		public Timetable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timetable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterTimetable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitTimetable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitTimetable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timetable_declarationContext timetable_declaration() throws RecognitionException {
		Timetable_declarationContext _localctx = new Timetable_declarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_timetable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			timetable_type();
			setState(302);
			match(VARIABLE_NAME);
			setState(303);
			match(ASSIGNMENT);
			setState(304);
			gen_timetable();
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

	public static class Type_assignmentContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE_NAME() { return getTokens(ttParser.VARIABLE_NAME); }
		public TerminalNode VARIABLE_NAME(int i) {
			return getToken(ttParser.VARIABLE_NAME, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(ttParser.ASSIGNMENT, 0); }
		public Type_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterType_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitType_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitType_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_assignmentContext type_assignment() throws RecognitionException {
		Type_assignmentContext _localctx = new Type_assignmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(VARIABLE_NAME);
			setState(307);
			match(ASSIGNMENT);
			setState(308);
			match(VARIABLE_NAME);
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

	public static class String_assignmentContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(ttParser.VARIABLE_NAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ttParser.ASSIGNMENT, 0); }
		public TerminalNode STRING() { return getToken(ttParser.STRING, 0); }
		public String_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterString_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitString_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitString_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_assignmentContext string_assignment() throws RecognitionException {
		String_assignmentContext _localctx = new String_assignmentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_string_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(VARIABLE_NAME);
			setState(311);
			match(ASSIGNMENT);
			setState(312);
			match(STRING);
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

	public static class Int_assignmentContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(ttParser.VARIABLE_NAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ttParser.ASSIGNMENT, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(ttParser.INTEGER, 0); }
		public Int_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterInt_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitInt_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitInt_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_assignmentContext int_assignment() throws RecognitionException {
		Int_assignmentContext _localctx = new Int_assignmentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_int_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(VARIABLE_NAME);
			setState(315);
			match(ASSIGNMENT);
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_ROUND_BRACKET:
				{
				setState(316);
				mathExpression();
				}
				break;
			case VARIABLE_NAME:
				{
				setState(317);
				return_statement();
				}
				break;
			case INTEGER:
				{
				setState(318);
				match(INTEGER);
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

	public static class Timetable_data_assignmentContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(ttParser.VARIABLE_NAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ttParser.ASSIGNMENT, 0); }
		public Open_timetable_dataContext open_timetable_data() {
			return getRuleContext(Open_timetable_dataContext.class,0);
		}
		public Timetable_data_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timetable_data_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterTimetable_data_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitTimetable_data_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitTimetable_data_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timetable_data_assignmentContext timetable_data_assignment() throws RecognitionException {
		Timetable_data_assignmentContext _localctx = new Timetable_data_assignmentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_timetable_data_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(VARIABLE_NAME);
			setState(322);
			match(ASSIGNMENT);
			setState(323);
			open_timetable_data();
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

	public static class Timetable_assignmentContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(ttParser.VARIABLE_NAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ttParser.ASSIGNMENT, 0); }
		public Gen_timetableContext gen_timetable() {
			return getRuleContext(Gen_timetableContext.class,0);
		}
		public Timetable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timetable_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterTimetable_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitTimetable_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitTimetable_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timetable_assignmentContext timetable_assignment() throws RecognitionException {
		Timetable_assignmentContext _localctx = new Timetable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_timetable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(VARIABLE_NAME);
			setState(326);
			match(ASSIGNMENT);
			setState(327);
			gen_timetable();
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

	public static class Print_typesContext extends ParserRuleContext {
		public TerminalNode VARIABLE_NAME() { return getToken(ttParser.VARIABLE_NAME, 0); }
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ttParser.STRING, 0); }
		public Print_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterPrint_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitPrint_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitPrint_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_typesContext print_types() throws RecognitionException {
		Print_typesContext _localctx = new Print_typesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_print_types);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(VARIABLE_NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				return_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				match(STRING);
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

	public static class TypeContext extends ParserRuleContext {
		public Timetable_typeContext timetable_type() {
			return getRuleContext(Timetable_typeContext.class,0);
		}
		public String_typeContext string_type() {
			return getRuleContext(String_typeContext.class,0);
		}
		public Int_typeContext int_type() {
			return getRuleContext(Int_typeContext.class,0);
		}
		public Timetable_data_typeContext timetable_data_type() {
			return getRuleContext(Timetable_data_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_type);
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIMETABLE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				timetable_type();
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				string_type();
				}
				break;
			case INTEGER_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				int_type();
				}
				break;
			case TIMETABLE_DATA_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				timetable_data_type();
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

	public static class Timetable_typeContext extends ParserRuleContext {
		public TerminalNode TIMETABLE_TYPE() { return getToken(ttParser.TIMETABLE_TYPE, 0); }
		public Timetable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timetable_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterTimetable_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitTimetable_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitTimetable_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timetable_typeContext timetable_type() throws RecognitionException {
		Timetable_typeContext _localctx = new Timetable_typeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_timetable_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(TIMETABLE_TYPE);
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

	public static class Timetable_data_typeContext extends ParserRuleContext {
		public TerminalNode TIMETABLE_DATA_TYPE() { return getToken(ttParser.TIMETABLE_DATA_TYPE, 0); }
		public Timetable_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timetable_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterTimetable_data_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitTimetable_data_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitTimetable_data_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timetable_data_typeContext timetable_data_type() throws RecognitionException {
		Timetable_data_typeContext _localctx = new Timetable_data_typeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_timetable_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(TIMETABLE_DATA_TYPE);
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

	public static class Int_typeContext extends ParserRuleContext {
		public TerminalNode INTEGER_TYPE() { return getToken(ttParser.INTEGER_TYPE, 0); }
		public Int_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterInt_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitInt_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitInt_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_typeContext int_type() throws RecognitionException {
		Int_typeContext _localctx = new Int_typeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_int_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(INTEGER_TYPE);
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

	public static class String_typeContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(ttParser.STRING_TYPE, 0); }
		public String_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).enterString_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ttListener ) ((ttListener)listener).exitString_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ttVisitor ) return ((ttVisitor<? extends T>)visitor).visitString_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_typeContext string_type() throws RecognitionException {
		String_typeContext _localctx = new String_typeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_string_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(STRING_TYPE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u015f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\7\2T\n\2\f"+
		"\2\16\2W\13\2\3\3\3\3\6\3[\n\3\r\3\16\3\\\3\3\3\3\3\3\5\3b\n\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\7\5k\n\5\f\5\16\5n\13\5\3\6\3\6\3\6\7\6s\n\6\f\6"+
		"\16\6v\13\6\3\7\3\7\3\7\3\7\5\7|\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u0083\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u008a\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0091\n\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00a5\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00ac\n\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u00c2"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00c9\n\16\3\17\3\17\3\17\3\17\5\17"+
		"\u00cf\n\17\3\20\3\20\3\20\3\20\3\20\7\20\u00d6\n\20\f\20\16\20\u00d9"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0100\n\26\3\26"+
		"\3\26\5\26\u0104\n\26\3\26\3\26\3\27\3\27\5\27\u010a\n\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5"+
		"\32\u011c\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0129\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\5!\u0142\n!\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3$\3$\3$\5$\u014f\n$\3%\3%\3%\3%\5%\u0155\n%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3)\2\2*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNP\2\3\3\2\37\"\2\u0168\2U\3\2\2\2\4a\3\2\2\2"+
		"\6c\3\2\2\2\bg\3\2\2\2\no\3\2\2\2\f{\3\2\2\2\16\u0084\3\2\2\2\20\u00a4"+
		"\3\2\2\2\22\u00a6\3\2\2\2\24\u00ad\3\2\2\2\26\u00b1\3\2\2\2\30\u00c1\3"+
		"\2\2\2\32\u00c8\3\2\2\2\34\u00ce\3\2\2\2\36\u00d0\3\2\2\2 \u00dc\3\2\2"+
		"\2\"\u00e2\3\2\2\2$\u00e8\3\2\2\2&\u00ee\3\2\2\2(\u00f2\3\2\2\2*\u00f7"+
		"\3\2\2\2,\u0109\3\2\2\2.\u010b\3\2\2\2\60\u0111\3\2\2\2\62\u0117\3\2\2"+
		"\2\64\u011d\3\2\2\2\66\u0122\3\2\2\28\u012a\3\2\2\2:\u012f\3\2\2\2<\u0134"+
		"\3\2\2\2>\u0138\3\2\2\2@\u013c\3\2\2\2B\u0143\3\2\2\2D\u0147\3\2\2\2F"+
		"\u014e\3\2\2\2H\u0154\3\2\2\2J\u0156\3\2\2\2L\u0158\3\2\2\2N\u015a\3\2"+
		"\2\2P\u015c\3\2\2\2RT\5\20\t\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"V\3\3\2\2\2WU\3\2\2\2XZ\7\t\2\2Y[\5\20\t\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\n\2\2_b\3\2\2\2`b\5\20\t\2aX\3\2\2\2a`\3"+
		"\2\2\2b\5\3\2\2\2cd\7\7\2\2de\5\b\5\2ef\7\b\2\2f\7\3\2\2\2gl\5\n\6\2h"+
		"i\7\34\2\2ik\5\n\6\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\t\3\2\2"+
		"\2nl\3\2\2\2ot\5\f\7\2pq\7\35\2\2qs\5\f\7\2rp\3\2\2\2sv\3\2\2\2tr\3\2"+
		"\2\2tu\3\2\2\2u\13\3\2\2\2vt\3\2\2\2w|\7#\2\2x|\7$\2\2y|\5,\27\2z|\5\16"+
		"\b\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|}\3\2\2\2}\u0082\7\36\2\2"+
		"~\u0083\7#\2\2\177\u0083\7$\2\2\u0080\u0083\5,\27\2\u0081\u0083\5\16\b"+
		"\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3"+
		"\2\2\2\u0083\r\3\2\2\2\u0084\u0089\7\7\2\2\u0085\u008a\7#\2\2\u0086\u008a"+
		"\7$\2\2\u0087\u008a\5,\27\2\u0088\u008a\5\16\b\2\u0089\u0085\3\2\2\2\u0089"+
		"\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u0090\t\2\2\2\u008c\u0091\7#\2\2\u008d\u0091\7$\2\2\u008e\u0091"+
		"\5,\27\2\u008f\u0091\5\16\b\2\u0090\u008c\3\2\2\2\u0090\u008d\3\2\2\2"+
		"\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093"+
		"\7\b\2\2\u0093\17\3\2\2\2\u0094\u00a5\5\22\n\2\u0095\u00a5\5\24\13\2\u0096"+
		"\u00a5\5\26\f\2\u0097\u0098\5\30\r\2\u0098\u0099\7\25\2\2\u0099\u00a5"+
		"\3\2\2\2\u009a\u009b\5\32\16\2\u009b\u009c\7\25\2\2\u009c\u00a5\3\2\2"+
		"\2\u009d\u009e\5\34\17\2\u009e\u009f\7\25\2\2\u009f\u00a5\3\2\2\2\u00a0"+
		"\u00a1\5\36\20\2\u00a1\u00a2\7\25\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a5"+
		"\7\25\2\2\u00a4\u0094\3\2\2\2\u00a4\u0095\3\2\2\2\u00a4\u0096\3\2\2\2"+
		"\u00a4\u0097\3\2\2\2\u00a4\u009a\3\2\2\2\u00a4\u009d\3\2\2\2\u00a4\u00a0"+
		"\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\21\3\2\2\2\u00a6\u00a7\7\26\2\2\u00a7"+
		"\u00a8\5\6\4\2\u00a8\u00ab\5\4\3\2\u00a9\u00aa\7\27\2\2\u00aa\u00ac\5"+
		"\4\3\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\23\3\2\2\2\u00ad"+
		"\u00ae\7\31\2\2\u00ae\u00af\5\6\4\2\u00af\u00b0\5\4\3\2\u00b0\25\3\2\2"+
		"\2\u00b1\u00b2\7\30\2\2\u00b2\u00b3\7\7\2\2\u00b3\u00b4\5J&\2\u00b4\u00b5"+
		"\7#\2\2\u00b5\u00b6\7\32\2\2\u00b6\u00b7\7#\2\2\u00b7\u00b8\7\13\2\2\u00b8"+
		"\u00b9\5&\24\2\u00b9\u00ba\7\b\2\2\u00ba\u00bb\5\4\3\2\u00bb\27\3\2\2"+
		"\2\u00bc\u00c2\5\62\32\2\u00bd\u00c2\5\64\33\2\u00be\u00c2\5\66\34\2\u00bf"+
		"\u00c2\5:\36\2\u00c0\u00c2\58\35\2\u00c1\u00bc\3\2\2\2\u00c1\u00bd\3\2"+
		"\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\31\3\2\2\2\u00c3\u00c9\5<\37\2\u00c4\u00c9\5> \2\u00c5\u00c9\5@!\2\u00c6"+
		"\u00c9\5D#\2\u00c7\u00c9\5B\"\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2"+
		"\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\33"+
		"\3\2\2\2\u00ca\u00cf\5*\26\2\u00cb\u00cf\5 \21\2\u00cc\u00cf\5$\23\2\u00cd"+
		"\u00cf\5\"\22\2\u00ce\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3"+
		"\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\35\3\2\2\2\u00d0\u00d1\7\f\2\2\u00d1"+
		"\u00d2\7\7\2\2\u00d2\u00d7\5F$\2\u00d3\u00d4\7\37\2\2\u00d4\u00d6\5F$"+
		"\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\b\2\2\u00db"+
		"\37\3\2\2\2\u00dc\u00dd\7#\2\2\u00dd\u00de\7\13\2\2\u00de\u00df\7\20\2"+
		"\2\u00df\u00e0\7\7\2\2\u00e0\u00e1\7\b\2\2\u00e1!\3\2\2\2\u00e2\u00e3"+
		"\7#\2\2\u00e3\u00e4\7\13\2\2\u00e4\u00e5\7\21\2\2\u00e5\u00e6\7\7\2\2"+
		"\u00e6\u00e7\7\b\2\2\u00e7#\3\2\2\2\u00e8\u00e9\7#\2\2\u00e9\u00ea\7\13"+
		"\2\2\u00ea\u00eb\7\22\2\2\u00eb\u00ec\7\7\2\2\u00ec\u00ed\7\b\2\2\u00ed"+
		"%\3\2\2\2\u00ee\u00ef\7\r\2\2\u00ef\u00f0\7\7\2\2\u00f0\u00f1\7\b\2\2"+
		"\u00f1\'\3\2\2\2\u00f2\u00f3\7\16\2\2\u00f3\u00f4\7\7\2\2\u00f4\u00f5"+
		"\7%\2\2\u00f5\u00f6\7\b\2\2\u00f6)\3\2\2\2\u00f7\u00f8\7#\2\2\u00f8\u00f9"+
		"\7\13\2\2\u00f9\u00fa\7\17\2\2\u00fa\u00ff\7\7\2\2\u00fb\u0100\7$\2\2"+
		"\u00fc\u00fd\7$\2\2\u00fd\u00fe\7&\2\2\u00fe\u0100\7$\2\2\u00ff\u00fb"+
		"\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u0102\7&\2\2\u0102"+
		"\u0104\7$\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0106\7\b\2\2\u0106+\3\2\2\2\u0107\u010a\5.\30\2\u0108\u010a"+
		"\5\60\31\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a-\3\2\2\2\u010b"+
		"\u010c\7#\2\2\u010c\u010d\7\13\2\2\u010d\u010e\7\23\2\2\u010e\u010f\7"+
		"\7\2\2\u010f\u0110\7\b\2\2\u0110/\3\2\2\2\u0111\u0112\7#\2\2\u0112\u0113"+
		"\7\13\2\2\u0113\u0114\7\24\2\2\u0114\u0115\7\7\2\2\u0115\u0116\7\b\2\2"+
		"\u0116\61\3\2\2\2\u0117\u0118\5H%\2\u0118\u011b\7#\2\2\u0119\u011a\7\33"+
		"\2\2\u011a\u011c\7#\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\63\3\2\2\2\u011d\u011e\5P)\2\u011e\u011f\7#\2\2\u011f\u0120\7\33\2\2"+
		"\u0120\u0121\7%\2\2\u0121\65\3\2\2\2\u0122\u0123\5N(\2\u0123\u0124\7#"+
		"\2\2\u0124\u0128\7\33\2\2\u0125\u0129\5\16\b\2\u0126\u0129\5,\27\2\u0127"+
		"\u0129\7$\2\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2"+
		"\2\2\u0129\67\3\2\2\2\u012a\u012b\5L\'\2\u012b\u012c\7#\2\2\u012c\u012d"+
		"\7\33\2\2\u012d\u012e\5(\25\2\u012e9\3\2\2\2\u012f\u0130\5J&\2\u0130\u0131"+
		"\7#\2\2\u0131\u0132\7\33\2\2\u0132\u0133\5*\26\2\u0133;\3\2\2\2\u0134"+
		"\u0135\7#\2\2\u0135\u0136\7\33\2\2\u0136\u0137\7#\2\2\u0137=\3\2\2\2\u0138"+
		"\u0139\7#\2\2\u0139\u013a\7\33\2\2\u013a\u013b\7%\2\2\u013b?\3\2\2\2\u013c"+
		"\u013d\7#\2\2\u013d\u0141\7\33\2\2\u013e\u0142\5\16\b\2\u013f\u0142\5"+
		",\27\2\u0140\u0142\7$\2\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0140\3\2\2\2\u0142A\3\2\2\2\u0143\u0144\7#\2\2\u0144\u0145\7\33\2\2"+
		"\u0145\u0146\5(\25\2\u0146C\3\2\2\2\u0147\u0148\7#\2\2\u0148\u0149\7\33"+
		"\2\2\u0149\u014a\5*\26\2\u014aE\3\2\2\2\u014b\u014f\7#\2\2\u014c\u014f"+
		"\5,\27\2\u014d\u014f\7%\2\2\u014e\u014b\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014d\3\2\2\2\u014fG\3\2\2\2\u0150\u0155\5J&\2\u0151\u0155\5P)\2\u0152"+
		"\u0155\5N(\2\u0153\u0155\5L\'\2\u0154\u0150\3\2\2\2\u0154\u0151\3\2\2"+
		"\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155I\3\2\2\2\u0156\u0157"+
		"\7\5\2\2\u0157K\3\2\2\2\u0158\u0159\7\6\2\2\u0159M\3\2\2\2\u015a\u015b"+
		"\7\3\2\2\u015bO\3\2\2\2\u015c\u015d\7\4\2\2\u015dQ\3\2\2\2\31U\\alt{\u0082"+
		"\u0089\u0090\u00a4\u00ab\u00c1\u00c8\u00ce\u00d7\u00ff\u0103\u0109\u011b"+
		"\u0128\u0141\u014e\u0154";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}