// Generated from C:/Users/ASUS/IdeaProjects/tpCompil/src\grammarOfProject.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarOfProjectLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "PUBLIC", 
			"PRIVATE", "CLASS", "MAIN", "IMPORT", "INT", "FLOAT", "STRING", "JAVAIO", 
			"JAVALONG", "PLUS", "MUL", "DIV", "MINUS", "GREATER", "LESS", "EQUAL", 
			"DIFFERENT", "GREATEROREQUAL", "LESSOREQUAL", "AND", "OR", "NOT", "INTFORMAT", 
			"FLOATFORMAT", "STRINGFORMAT", "OUT", "IN", "SI", "ALORS", "SINON", "IDF", 
			"CLASSNAME", "TEXT", "VALUEOFSTRING", "VALUEOFFLOAT", "VALUEOFINTEGER", 
			"WHITESPACE"
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


	public grammarOfProjectLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammarOfProject.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0150\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\7)\u0116\n)"+
		"\f)\16)\u0119\13)\3*\3*\7*\u011d\n*\f*\16*\u0120\13*\3+\6+\u0123\n+\r"+
		"+\16+\u0124\3,\3,\3,\3,\7,\u012b\n,\f,\16,\u012e\13,\3,\3,\3-\5-\u0133"+
		"\n-\3-\6-\u0136\n-\r-\16-\u0137\3-\3-\6-\u013c\n-\r-\16-\u013d\3.\3.\5"+
		".\u0142\n.\3.\3.\7.\u0146\n.\f.\16.\u0149\13.\5.\u014b\n.\3/\3/\3/\3/"+
		"\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\f\3\2c|\4\2\62;c|\3"+
		"\2C\\\5\2\62;C\\c|\4\2C\\c|\3\2$$\4\2--//\3\2\62;\3\2\63;\5\2\13\f\17"+
		"\17\"\"\2\u015a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3"+
		"_\3\2\2\2\5a\3\2\2\2\7c\3\2\2\2\te\3\2\2\2\13g\3\2\2\2\rj\3\2\2\2\17l"+
		"\3\2\2\2\21n\3\2\2\2\23p\3\2\2\2\25w\3\2\2\2\27\u0081\3\2\2\2\31\u008a"+
		"\3\2\2\2\33\u0092\3\2\2\2\35\u0099\3\2\2\2\37\u00a0\3\2\2\2!\u00a9\3\2"+
		"\2\2#\u00b3\3\2\2\2%\u00c1\3\2\2\2\'\u00d1\3\2\2\2)\u00d3\3\2\2\2+\u00d5"+
		"\3\2\2\2-\u00d7\3\2\2\2/\u00d9\3\2\2\2\61\u00db\3\2\2\2\63\u00dd\3\2\2"+
		"\2\65\u00df\3\2\2\2\67\u00e2\3\2\2\29\u00e5\3\2\2\2;\u00e8\3\2\2\2=\u00ea"+
		"\3\2\2\2?\u00ec\3\2\2\2A\u00ee\3\2\2\2C\u00f1\3\2\2\2E\u00f4\3\2\2\2G"+
		"\u00f7\3\2\2\2I\u00fe\3\2\2\2K\u0104\3\2\2\2M\u0107\3\2\2\2O\u010d\3\2"+
		"\2\2Q\u0113\3\2\2\2S\u011a\3\2\2\2U\u0122\3\2\2\2W\u0126\3\2\2\2Y\u0132"+
		"\3\2\2\2[\u014a\3\2\2\2]\u014c\3\2\2\2_`\7}\2\2`\4\3\2\2\2ab\7\177\2\2"+
		"b\6\3\2\2\2cd\7=\2\2d\b\3\2\2\2ef\7.\2\2f\n\3\2\2\2gh\7<\2\2hi\7?\2\2"+
		"i\f\3\2\2\2jk\7*\2\2k\16\3\2\2\2lm\7+\2\2m\20\3\2\2\2no\7)\2\2o\22\3\2"+
		"\2\2pq\7r\2\2qr\7w\2\2rs\7d\2\2st\7n\2\2tu\7k\2\2uv\7e\2\2v\24\3\2\2\2"+
		"wx\7r\2\2xy\7t\2\2yz\7q\2\2z{\7v\2\2{|\7g\2\2|}\7e\2\2}~\7v\2\2~\177\7"+
		"g\2\2\177\u0080\7f\2\2\u0080\26\3\2\2\2\u0081\u0082\7e\2\2\u0082\u0083"+
		"\7n\2\2\u0083\u0084\7c\2\2\u0084\u0085\7u\2\2\u0085\u0086\7u\2\2\u0086"+
		"\u0087\7a\2\2\u0087\u0088\7U\2\2\u0088\u0089\7L\2\2\u0089\30\3\2\2\2\u008a"+
		"\u008b\7o\2\2\u008b\u008c\7c\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2"+
		"\u008e\u008f\7a\2\2\u008f\u0090\7U\2\2\u0090\u0091\7L\2\2\u0091\32\3\2"+
		"\2\2\u0092\u0093\7k\2\2\u0093\u0094\7o\2\2\u0094\u0095\7r\2\2\u0095\u0096"+
		"\7q\2\2\u0096\u0097\7t\2\2\u0097\u0098\7v\2\2\u0098\34\3\2\2\2\u0099\u009a"+
		"\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\u009d\7a\2\2\u009d"+
		"\u009e\7U\2\2\u009e\u009f\7L\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7h\2\2\u00a1"+
		"\u00a2\7n\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7v\2\2"+
		"\u00a5\u00a6\7a\2\2\u00a6\u00a7\7U\2\2\u00a7\u00a8\7L\2\2\u00a8 \3\2\2"+
		"\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad"+
		"\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7i\2\2\u00af\u00b0\7a\2\2\u00b0"+
		"\u00b1\7U\2\2\u00b1\u00b2\7L\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7U\2\2\u00b4"+
		"\u00b5\7o\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7n\2\2"+
		"\u00b8\u00b9\7a\2\2\u00b9\u00ba\7L\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc"+
		"\7x\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7\60\2\2\u00be\u00bf\7k\2\2\u00bf"+
		"\u00c0\7q\2\2\u00c0$\3\2\2\2\u00c1\u00c2\7U\2\2\u00c2\u00c3\7o\2\2\u00c3"+
		"\u00c4\7c\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7a\2\2"+
		"\u00c7\u00c8\7L\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7x\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7\60\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7c\2\2\u00ce"+
		"\u00cf\7p\2\2\u00cf\u00d0\7i\2\2\u00d0&\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2"+
		"(\3\2\2\2\u00d3\u00d4\7,\2\2\u00d4*\3\2\2\2\u00d5\u00d6\7\61\2\2\u00d6"+
		",\3\2\2\2\u00d7\u00d8\7/\2\2\u00d8.\3\2\2\2\u00d9\u00da\7@\2\2\u00da\60"+
		"\3\2\2\2\u00db\u00dc\7>\2\2\u00dc\62\3\2\2\2\u00dd\u00de\7?\2\2\u00de"+
		"\64\3\2\2\2\u00df\u00e0\7#\2\2\u00e0\u00e1\7?\2\2\u00e1\66\3\2\2\2\u00e2"+
		"\u00e3\7@\2\2\u00e3\u00e4\7?\2\2\u00e48\3\2\2\2\u00e5\u00e6\7>\2\2\u00e6"+
		"\u00e7\7?\2\2\u00e7:\3\2\2\2\u00e8\u00e9\7(\2\2\u00e9<\3\2\2\2\u00ea\u00eb"+
		"\7~\2\2\u00eb>\3\2\2\2\u00ec\u00ed\7#\2\2\u00ed@\3\2\2\2\u00ee\u00ef\7"+
		"\'\2\2\u00ef\u00f0\7f\2\2\u00f0B\3\2\2\2\u00f1\u00f2\7\'\2\2\u00f2\u00f3"+
		"\7h\2\2\u00f3D\3\2\2\2\u00f4\u00f5\7\'\2\2\u00f5\u00f6\7u\2\2\u00f6F\3"+
		"\2\2\2\u00f7\u00f8\7Q\2\2\u00f8\u00f9\7W\2\2\u00f9\u00fa\7V\2\2\u00fa"+
		"\u00fb\7a\2\2\u00fb\u00fc\7U\2\2\u00fc\u00fd\7L\2\2\u00fdH\3\2\2\2\u00fe"+
		"\u00ff\7K\2\2\u00ff\u0100\7P\2\2\u0100\u0101\7a\2\2\u0101\u0102\7U\2\2"+
		"\u0102\u0103\7L\2\2\u0103J\3\2\2\2\u0104\u0105\7u\2\2\u0105\u0106\7k\2"+
		"\2\u0106L\3\2\2\2\u0107\u0108\7c\2\2\u0108\u0109\7n\2\2\u0109\u010a\7"+
		"q\2\2\u010a\u010b\7t\2\2\u010b\u010c\7u\2\2\u010cN\3\2\2\2\u010d\u010e"+
		"\7u\2\2\u010e\u010f\7k\2\2\u010f\u0110\7p\2\2\u0110\u0111\7q\2\2\u0111"+
		"\u0112\7p\2\2\u0112P\3\2\2\2\u0113\u0117\t\2\2\2\u0114\u0116\t\3\2\2\u0115"+
		"\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118R\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011e\t\4\2\2\u011b\u011d"+
		"\t\5\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011fT\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\t\6\2\2"+
		"\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125V\3\2\2\2\u0126\u012c\7$\2\2\u0127\u012b\n\7\2\2\u0128\u0129"+
		"\7^\2\2\u0129\u012b\7$\2\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7$\2\2\u0130X\3\2\2\2\u0131\u0133"+
		"\t\b\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134"+
		"\u0136\t\t\2\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\7\60\2\2\u013a"+
		"\u013c\t\t\2\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013eZ\3\2\2\2\u013f\u014b\7\62\2\2\u0140\u0142"+
		"\t\b\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0147\t\n\2\2\u0144\u0146\t\t\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u013f\3\2\2\2\u014a\u0141\3\2\2\2\u014b\\\3\2\2\2"+
		"\u014c\u014d\t\13\2\2\u014d\u014e\3\2\2\2\u014e\u014f\b/\2\2\u014f^\3"+
		"\2\2\2\16\2\u0117\u011e\u0124\u012a\u012c\u0132\u0137\u013d\u0141\u0147"+
		"\u014a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}