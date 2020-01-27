// Generated from C:/Users/ASUS/IdeaProjects/tpCompil/src\grammarOfProject.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarOfProjectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, PUBLIC=9, 
		PRIVATE=10, CLASS=11, MAIN=12, IMPORT=13, INT=14, FLOAT=15, STRING=16, 
		JAVAIO=17, JAVALONG=18, PLUS=19, MUL=20, DIV=21, MINUS=22, GREATER=23, 
		LESS=24, EQUAL=25, DIFFERENT=26, GREATEROREQUAL=27, LESSOREQUAL=28, AND=29, 
		OR=30, NOT=31, INTFORMAT=32, FLOATFORMAT=33, STRINGFORMAT=34, OUT=35, 
		IN=36, SI=37, ALORS=38, SINON=39, IDF=40, CLASSNAME=41, TEXT=42, VALUEOFSTRING=43, 
		VALUEOFFLOAT=44, VALUEOFINTEGER=45, WHITESPACE=46;
	public static final int
		RULE_prog = 0, RULE_imports = 1, RULE_libraryName = 2, RULE_modificateur = 3, 
		RULE_declaration = 4, RULE_decvar = 5, RULE_type = 6, RULE_variablelist = 7, 
		RULE_insts = 8, RULE_inst = 9, RULE_assignment = 10, RULE_identifier = 11, 
		RULE_arithmetic_expression = 12, RULE_val = 13, RULE_input = 14, RULE_format = 15, 
		RULE_output = 16, RULE_siinsts = 17, RULE_alors = 18, RULE_sinon = 19, 
		RULE_condition = 20, RULE_logic = 21, RULE_arithmetic = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "imports", "libraryName", "modificateur", "declaration", "decvar", 
			"type", "variablelist", "insts", "inst", "assignment", "identifier", 
			"arithmetic_expression", "val", "input", "format", "output", "siinsts", 
			"alors", "sinon", "condition", "logic", "arithmetic"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "','", "':='", "'('", "')'", "'''", "'public'", 
			"'protected'", "'class_SJ'", "'main_SJ'", "'import'", "'int_SJ'", "'float_SJ'", 
			"'string_SJ'", "'Small_Java.io'", "'Small_Java.lang'", "'+'", "'*'", 
			"'/'", "'-'", "'>'", "'<'", "'='", "'!='", "'>='", "'<='", "'&'", "'|'", 
			"'!'", "'%d'", "'%f'", "'%s'", "'OUT_SJ'", "'IN_SJ'", "'si'", "'alors'", 
			"'sinon'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "PUBLIC", "PRIVATE", 
			"CLASS", "MAIN", "IMPORT", "INT", "FLOAT", "STRING", "JAVAIO", "JAVALONG", 
			"PLUS", "MUL", "DIV", "MINUS", "GREATER", "LESS", "EQUAL", "DIFFERENT", 
			"GREATEROREQUAL", "LESSOREQUAL", "AND", "OR", "NOT", "INTFORMAT", "FLOATFORMAT", 
			"STRINGFORMAT", "OUT", "IN", "SI", "ALORS", "SINON", "IDF", "CLASSNAME", 
			"TEXT", "VALUEOFSTRING", "VALUEOFFLOAT", "VALUEOFINTEGER", "WHITESPACE"
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
	public String getGrammarFileName() { return "grammarOfProject.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammarOfProjectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(grammarOfProjectParser.CLASS, 0); }
		public TerminalNode CLASSNAME() { return getToken(grammarOfProjectParser.CLASSNAME, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode MAIN() { return getToken(grammarOfProjectParser.MAIN, 0); }
		public InstsContext insts() {
			return getRuleContext(InstsContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ModificateurContext modificateur() {
			return getRuleContext(ModificateurContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
			case PRIVATE:
			case CLASS:
				{
				}
				break;
			case IMPORT:
				{
				setState(47);
				imports();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				}
				break;
			case PUBLIC:
			case PRIVATE:
				{
				setState(51);
				modificateur();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(54);
			match(CLASS);
			setState(55);
			match(CLASSNAME);
			setState(56);
			match(T__0);
			setState(57);
			declaration();
			setState(58);
			match(MAIN);
			setState(59);
			match(T__0);
			setState(60);
			insts();
			setState(61);
			match(T__1);
			setState(62);
			match(T__1);
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

	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(grammarOfProjectParser.IMPORT, 0); }
		public LibraryNameContext libraryName() {
			return getRuleContext(LibraryNameContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imports);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(IMPORT);
				setState(65);
				libraryName();
				setState(66);
				match(T__2);
				setState(67);
				imports();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(IMPORT);
				setState(70);
				libraryName();
				setState(71);
				match(T__2);
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

	public static class LibraryNameContext extends ParserRuleContext {
		public TerminalNode JAVAIO() { return getToken(grammarOfProjectParser.JAVAIO, 0); }
		public TerminalNode JAVALONG() { return getToken(grammarOfProjectParser.JAVALONG, 0); }
		public LibraryNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterLibraryName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitLibraryName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitLibraryName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibraryNameContext libraryName() throws RecognitionException {
		LibraryNameContext _localctx = new LibraryNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_libraryName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==JAVAIO || _la==JAVALONG) ) {
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

	public static class ModificateurContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(grammarOfProjectParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(grammarOfProjectParser.PRIVATE, 0); }
		public ModificateurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificateur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterModificateur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitModificateur(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitModificateur(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModificateurContext modificateur() throws RecognitionException {
		ModificateurContext _localctx = new ModificateurContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_modificateur);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !(_la==PUBLIC || _la==PRIVATE) ) {
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

	public static class DeclarationContext extends ParserRuleContext {
		public DecvarContext decvar() {
			return getRuleContext(DecvarContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(79);
				decvar();
				setState(80);
				declaration();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				decvar();
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

	public static class DecvarContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariablelistContext variablelist() {
			return getRuleContext(VariablelistContext.class,0);
		}
		public DecvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterDecvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitDecvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitDecvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecvarContext decvar() throws RecognitionException {
		DecvarContext _localctx = new DecvarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			type();
			setState(86);
			variablelist();
			setState(87);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(grammarOfProjectParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(grammarOfProjectParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(grammarOfProjectParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
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

	public static class VariablelistContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(grammarOfProjectParser.IDF, 0); }
		public VariablelistContext variablelist() {
			return getRuleContext(VariablelistContext.class,0);
		}
		public VariablelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterVariablelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitVariablelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitVariablelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablelistContext variablelist() throws RecognitionException {
		VariablelistContext _localctx = new VariablelistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variablelist);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(91);
				match(IDF);
				setState(92);
				match(T__3);
				setState(93);
				variablelist();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(IDF);
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

	public static class InstsContext extends ParserRuleContext {
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public InstsContext insts() {
			return getRuleContext(InstsContext.class,0);
		}
		public SiinstsContext siinsts() {
			return getRuleContext(SiinstsContext.class,0);
		}
		public InstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterInsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitInsts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitInsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstsContext insts() throws RecognitionException {
		InstsContext _localctx = new InstsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insts);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(97);
				inst();
				setState(98);
				match(T__2);
				setState(99);
				insts();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				inst();
				setState(102);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				siinsts();
				setState(105);
				insts();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				siinsts();
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

	public static class InstContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inst);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDF:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				assignment();
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				input();
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				output();
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

	public static class AssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			identifier();
			setState(116);
			match(T__4);
			setState(117);
			arithmetic_expression(0);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(grammarOfProjectParser.IDF, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IDF);
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

	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(grammarOfProjectParser.TEXT, 0); }
		public TerminalNode DIV() { return getToken(grammarOfProjectParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(grammarOfProjectParser.MUL, 0); }
		public TerminalNode PLUS() { return getToken(grammarOfProjectParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(grammarOfProjectParser.MINUS, 0); }
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterArithmetic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitArithmetic_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitArithmetic_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		return arithmetic_expression(0);
	}

	private Arithmetic_expressionContext arithmetic_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, _parentState);
		Arithmetic_expressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_arithmetic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(122);
				match(T__5);
				setState(123);
				arithmetic_expression(0);
				setState(124);
				match(T__6);
				}
				break;
			case VALUEOFSTRING:
			case VALUEOFFLOAT:
			case VALUEOFINTEGER:
				{
				setState(126);
				val();
				}
				break;
			case IDF:
				{
				setState(127);
				identifier();
				}
				break;
			case T__7:
				{
				setState(128);
				match(T__7);
				setState(129);
				match(TEXT);
				setState(130);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(133);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(134);
						match(DIV);
						setState(135);
						arithmetic_expression(8);
						}
						break;
					case 2:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(136);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(137);
						match(MUL);
						setState(138);
						arithmetic_expression(7);
						}
						break;
					case 3:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(139);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(140);
						match(PLUS);
						setState(141);
						arithmetic_expression(6);
						}
						break;
					case 4:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(142);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(143);
						match(MINUS);
						setState(144);
						arithmetic_expression(5);
						}
						break;
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode VALUEOFFLOAT() { return getToken(grammarOfProjectParser.VALUEOFFLOAT, 0); }
		public TerminalNode VALUEOFINTEGER() { return getToken(grammarOfProjectParser.VALUEOFINTEGER, 0); }
		public TerminalNode VALUEOFSTRING() { return getToken(grammarOfProjectParser.VALUEOFSTRING, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALUEOFSTRING) | (1L << VALUEOFFLOAT) | (1L << VALUEOFINTEGER))) != 0)) ) {
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(grammarOfProjectParser.IN, 0); }
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(IN);
			setState(153);
			match(T__5);
			setState(154);
			match(T__7);
			setState(155);
			format();
			setState(156);
			match(T__7);
			setState(157);
			match(T__3);
			setState(158);
			identifier();
			setState(159);
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

	public static class FormatContext extends ParserRuleContext {
		public TerminalNode INTFORMAT() { return getToken(grammarOfProjectParser.INTFORMAT, 0); }
		public TerminalNode FLOATFORMAT() { return getToken(grammarOfProjectParser.FLOATFORMAT, 0); }
		public TerminalNode STRINGFORMAT() { return getToken(grammarOfProjectParser.STRINGFORMAT, 0); }
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_format);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTFORMAT) | (1L << FLOATFORMAT) | (1L << STRINGFORMAT))) != 0)) ) {
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(grammarOfProjectParser.OUT, 0); }
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IDF() { return getToken(grammarOfProjectParser.IDF, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_output);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(OUT);
				setState(164);
				match(T__5);
				setState(165);
				match(T__7);
				setState(166);
				format();
				setState(167);
				match(T__7);
				setState(168);
				match(T__3);
				setState(169);
				identifier();
				setState(170);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(OUT);
				setState(173);
				match(T__5);
				setState(174);
				match(T__7);
				setState(175);
				match(IDF);
				setState(176);
				format();
				setState(177);
				match(T__7);
				setState(178);
				match(T__3);
				setState(179);
				identifier();
				setState(180);
				match(T__6);
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

	public static class SiinstsContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(grammarOfProjectParser.SI, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public AlorsContext alors() {
			return getRuleContext(AlorsContext.class,0);
		}
		public InstsContext insts() {
			return getRuleContext(InstsContext.class,0);
		}
		public SinonContext sinon() {
			return getRuleContext(SinonContext.class,0);
		}
		public SiinstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siinsts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterSiinsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitSiinsts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitSiinsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiinstsContext siinsts() throws RecognitionException {
		SiinstsContext _localctx = new SiinstsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_siinsts);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(SI);
				setState(185);
				match(T__5);
				setState(186);
				condition();
				setState(187);
				match(T__6);
				setState(188);
				alors();
				setState(189);
				match(T__0);
				setState(190);
				insts();
				setState(191);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(SI);
				setState(194);
				match(T__5);
				setState(195);
				condition();
				setState(196);
				match(T__6);
				setState(197);
				alors();
				setState(198);
				match(T__0);
				setState(199);
				insts();
				setState(200);
				match(T__1);
				setState(201);
				sinon();
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

	public static class AlorsContext extends ParserRuleContext {
		public TerminalNode ALORS() { return getToken(grammarOfProjectParser.ALORS, 0); }
		public AlorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterAlors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitAlors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitAlors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlorsContext alors() throws RecognitionException {
		AlorsContext _localctx = new AlorsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_alors);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ALORS);
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

	public static class SinonContext extends ParserRuleContext {
		public TerminalNode SINON() { return getToken(grammarOfProjectParser.SINON, 0); }
		public InstsContext insts() {
			return getRuleContext(InstsContext.class,0);
		}
		public SinonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterSinon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitSinon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitSinon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinonContext sinon() throws RecognitionException {
		SinonContext _localctx = new SinonContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sinon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(SINON);
			setState(208);
			match(T__0);
			setState(209);
			insts();
			setState(210);
			match(T__1);
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
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condition);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				logic(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				arithmetic();
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

	public static class LogicContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(grammarOfProjectParser.NOT, 0); }
		public List<LogicContext> logic() {
			return getRuleContexts(LogicContext.class);
		}
		public LogicContext logic(int i) {
			return getRuleContext(LogicContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode AND() { return getToken(grammarOfProjectParser.AND, 0); }
		public TerminalNode OR() { return getToken(grammarOfProjectParser.OR, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		return logic(0);
	}

	private LogicContext logic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicContext _localctx = new LogicContext(_ctx, _parentState);
		LogicContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_logic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(217);
				match(NOT);
				setState(218);
				logic(4);
				}
				break;
			case T__5:
				{
				setState(219);
				match(T__5);
				setState(220);
				condition();
				setState(221);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(231);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new LogicContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logic);
						setState(225);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(226);
						match(AND);
						setState(227);
						logic(4);
						}
						break;
					case 2:
						{
						_localctx = new LogicContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logic);
						setState(228);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(229);
						match(OR);
						setState(230);
						logic(3);
						}
						break;
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ArithmeticContext extends ParserRuleContext {
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode GREATER() { return getToken(grammarOfProjectParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(grammarOfProjectParser.LESS, 0); }
		public TerminalNode GREATEROREQUAL() { return getToken(grammarOfProjectParser.GREATEROREQUAL, 0); }
		public TerminalNode LESSOREQUAL() { return getToken(grammarOfProjectParser.LESSOREQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(grammarOfProjectParser.EQUAL, 0); }
		public TerminalNode DIFFERENT() { return getToken(grammarOfProjectParser.DIFFERENT, 0); }
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarOfProjectListener ) ((grammarOfProjectListener)listener).exitArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarOfProjectVisitor ) return ((grammarOfProjectVisitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arithmetic);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				arithmetic_expression(0);
				setState(237);
				match(GREATER);
				setState(238);
				arithmetic_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				arithmetic_expression(0);
				setState(241);
				match(LESS);
				setState(242);
				arithmetic_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				arithmetic_expression(0);
				setState(245);
				match(GREATEROREQUAL);
				setState(246);
				arithmetic_expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				arithmetic_expression(0);
				setState(249);
				match(LESSOREQUAL);
				setState(250);
				arithmetic_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				arithmetic_expression(0);
				setState(253);
				match(EQUAL);
				setState(254);
				arithmetic_expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				arithmetic_expression(0);
				setState(257);
				match(DIFFERENT);
				setState(258);
				arithmetic_expression(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return arithmetic_expression_sempred((Arithmetic_expressionContext)_localctx, predIndex);
		case 21:
			return logic_sempred((LogicContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmetic_expression_sempred(Arithmetic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean logic_sempred(LogicContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0109\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\5"+
		"\2\63\n\2\3\2\3\2\5\2\67\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\5\6V\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\5\tb\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\no\n\n\3\13\3\13\3\13\5\13t\n"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u0086\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u0094\n\16\f\16\16\16\u0097\13\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00b9\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ce\n\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u00d9\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u00e2\n\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00ea"+
		"\n\27\f\27\16\27\u00ed\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u0107\n\30\3\30\2\4\32,\31\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\2\7\3\2\23\24\3\2\13\f\3\2\20\22\3\2-/\3\2\"$\2\u010d"+
		"\2\62\3\2\2\2\4K\3\2\2\2\6M\3\2\2\2\bO\3\2\2\2\nU\3\2\2\2\fW\3\2\2\2\16"+
		"[\3\2\2\2\20a\3\2\2\2\22n\3\2\2\2\24s\3\2\2\2\26u\3\2\2\2\30y\3\2\2\2"+
		"\32\u0085\3\2\2\2\34\u0098\3\2\2\2\36\u009a\3\2\2\2 \u00a3\3\2\2\2\"\u00b8"+
		"\3\2\2\2$\u00cd\3\2\2\2&\u00cf\3\2\2\2(\u00d1\3\2\2\2*\u00d8\3\2\2\2,"+
		"\u00e1\3\2\2\2.\u0106\3\2\2\2\60\63\3\2\2\2\61\63\5\4\3\2\62\60\3\2\2"+
		"\2\62\61\3\2\2\2\63\66\3\2\2\2\64\67\3\2\2\2\65\67\5\b\5\2\66\64\3\2\2"+
		"\2\66\65\3\2\2\2\678\3\2\2\289\7\r\2\29:\7+\2\2:;\7\3\2\2;<\5\n\6\2<="+
		"\7\16\2\2=>\7\3\2\2>?\5\22\n\2?@\7\4\2\2@A\7\4\2\2A\3\3\2\2\2BC\7\17\2"+
		"\2CD\5\6\4\2DE\7\5\2\2EF\5\4\3\2FL\3\2\2\2GH\7\17\2\2HI\5\6\4\2IJ\7\5"+
		"\2\2JL\3\2\2\2KB\3\2\2\2KG\3\2\2\2L\5\3\2\2\2MN\t\2\2\2N\7\3\2\2\2OP\t"+
		"\3\2\2P\t\3\2\2\2QR\5\f\7\2RS\5\n\6\2SV\3\2\2\2TV\5\f\7\2UQ\3\2\2\2UT"+
		"\3\2\2\2V\13\3\2\2\2WX\5\16\b\2XY\5\20\t\2YZ\7\5\2\2Z\r\3\2\2\2[\\\t\4"+
		"\2\2\\\17\3\2\2\2]^\7*\2\2^_\7\6\2\2_b\5\20\t\2`b\7*\2\2a]\3\2\2\2a`\3"+
		"\2\2\2b\21\3\2\2\2cd\5\24\13\2de\7\5\2\2ef\5\22\n\2fo\3\2\2\2gh\5\24\13"+
		"\2hi\7\5\2\2io\3\2\2\2jk\5$\23\2kl\5\22\n\2lo\3\2\2\2mo\5$\23\2nc\3\2"+
		"\2\2ng\3\2\2\2nj\3\2\2\2nm\3\2\2\2o\23\3\2\2\2pt\5\26\f\2qt\5\36\20\2"+
		"rt\5\"\22\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\25\3\2\2\2uv\5\30\r\2vw\7\7"+
		"\2\2wx\5\32\16\2x\27\3\2\2\2yz\7*\2\2z\31\3\2\2\2{|\b\16\1\2|}\7\b\2\2"+
		"}~\5\32\16\2~\177\7\t\2\2\177\u0086\3\2\2\2\u0080\u0086\5\34\17\2\u0081"+
		"\u0086\5\30\r\2\u0082\u0083\7\n\2\2\u0083\u0084\7,\2\2\u0084\u0086\7\n"+
		"\2\2\u0085{\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0082"+
		"\3\2\2\2\u0086\u0095\3\2\2\2\u0087\u0088\f\t\2\2\u0088\u0089\7\27\2\2"+
		"\u0089\u0094\5\32\16\n\u008a\u008b\f\b\2\2\u008b\u008c\7\26\2\2\u008c"+
		"\u0094\5\32\16\t\u008d\u008e\f\7\2\2\u008e\u008f\7\25\2\2\u008f\u0094"+
		"\5\32\16\b\u0090\u0091\f\6\2\2\u0091\u0092\7\30\2\2\u0092\u0094\5\32\16"+
		"\7\u0093\u0087\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u0090"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\33\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\t\5\2\2\u0099\35\3\2\2\2\u009a"+
		"\u009b\7&\2\2\u009b\u009c\7\b\2\2\u009c\u009d\7\n\2\2\u009d\u009e\5 \21"+
		"\2\u009e\u009f\7\n\2\2\u009f\u00a0\7\6\2\2\u00a0\u00a1\5\30\r\2\u00a1"+
		"\u00a2\7\t\2\2\u00a2\37\3\2\2\2\u00a3\u00a4\t\6\2\2\u00a4!\3\2\2\2\u00a5"+
		"\u00a6\7%\2\2\u00a6\u00a7\7\b\2\2\u00a7\u00a8\7\n\2\2\u00a8\u00a9\5 \21"+
		"\2\u00a9\u00aa\7\n\2\2\u00aa\u00ab\7\6\2\2\u00ab\u00ac\5\30\r\2\u00ac"+
		"\u00ad\7\t\2\2\u00ad\u00b9\3\2\2\2\u00ae\u00af\7%\2\2\u00af\u00b0\7\b"+
		"\2\2\u00b0\u00b1\7\n\2\2\u00b1\u00b2\7*\2\2\u00b2\u00b3\5 \21\2\u00b3"+
		"\u00b4\7\n\2\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6\5\30\r\2\u00b6\u00b7\7"+
		"\t\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00a5\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b9"+
		"#\3\2\2\2\u00ba\u00bb\7\'\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00bd\5*\26\2"+
		"\u00bd\u00be\7\t\2\2\u00be\u00bf\5&\24\2\u00bf\u00c0\7\3\2\2\u00c0\u00c1"+
		"\5\22\n\2\u00c1\u00c2\7\4\2\2\u00c2\u00ce\3\2\2\2\u00c3\u00c4\7\'\2\2"+
		"\u00c4\u00c5\7\b\2\2\u00c5\u00c6\5*\26\2\u00c6\u00c7\7\t\2\2\u00c7\u00c8"+
		"\5&\24\2\u00c8\u00c9\7\3\2\2\u00c9\u00ca\5\22\n\2\u00ca\u00cb\7\4\2\2"+
		"\u00cb\u00cc\5(\25\2\u00cc\u00ce\3\2\2\2\u00cd\u00ba\3\2\2\2\u00cd\u00c3"+
		"\3\2\2\2\u00ce%\3\2\2\2\u00cf\u00d0\7(\2\2\u00d0\'\3\2\2\2\u00d1\u00d2"+
		"\7)\2\2\u00d2\u00d3\7\3\2\2\u00d3\u00d4\5\22\n\2\u00d4\u00d5\7\4\2\2\u00d5"+
		")\3\2\2\2\u00d6\u00d9\5,\27\2\u00d7\u00d9\5.\30\2\u00d8\u00d6\3\2\2\2"+
		"\u00d8\u00d7\3\2\2\2\u00d9+\3\2\2\2\u00da\u00db\b\27\1\2\u00db\u00dc\7"+
		"!\2\2\u00dc\u00e2\5,\27\6\u00dd\u00de\7\b\2\2\u00de\u00df\5*\26\2\u00df"+
		"\u00e0\7\t\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00da\3\2\2\2\u00e1\u00dd\3\2"+
		"\2\2\u00e2\u00eb\3\2\2\2\u00e3\u00e4\f\5\2\2\u00e4\u00e5\7\37\2\2\u00e5"+
		"\u00ea\5,\27\6\u00e6\u00e7\f\4\2\2\u00e7\u00e8\7 \2\2\u00e8\u00ea\5,\27"+
		"\5\u00e9\u00e3\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec-\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00ef\5\32\16\2\u00ef\u00f0\7\31\2\2\u00f0\u00f1\5\32\16\2\u00f1\u0107"+
		"\3\2\2\2\u00f2\u00f3\5\32\16\2\u00f3\u00f4\7\32\2\2\u00f4\u00f5\5\32\16"+
		"\2\u00f5\u0107\3\2\2\2\u00f6\u00f7\5\32\16\2\u00f7\u00f8\7\35\2\2\u00f8"+
		"\u00f9\5\32\16\2\u00f9\u0107\3\2\2\2\u00fa\u00fb\5\32\16\2\u00fb\u00fc"+
		"\7\36\2\2\u00fc\u00fd\5\32\16\2\u00fd\u0107\3\2\2\2\u00fe\u00ff\5\32\16"+
		"\2\u00ff\u0100\7\33\2\2\u0100\u0101\5\32\16\2\u0101\u0107\3\2\2\2\u0102"+
		"\u0103\5\32\16\2\u0103\u0104\7\34\2\2\u0104\u0105\5\32\16\2\u0105\u0107"+
		"\3\2\2\2\u0106\u00ee\3\2\2\2\u0106\u00f2\3\2\2\2\u0106\u00f6\3\2\2\2\u0106"+
		"\u00fa\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u0102\3\2\2\2\u0107/\3\2\2\2"+
		"\23\62\66KUans\u0085\u0093\u0095\u00b8\u00cd\u00d8\u00e1\u00e9\u00eb\u0106";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}