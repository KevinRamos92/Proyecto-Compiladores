// Generated from compile.g4 by ANTLR 4.4
package Analizer.MyProject;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compileLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'"
	};
	public static final String[] ruleNames = {
		"AND", "OR", "NOT", "DOUBLEPLUS", "DOUBLEMINUS", "COMILLA", "MAS", "MENOS", 
		"POR", "DIV", "MAYOR", "MENOR", "PLUSEQ", "MINEQ", "DOUBLEEQ", "NEGATE", 
		"EQUAL", "ILLAVE", "RLLAVE", "LPAR", "RPAR", "DOTDOT", "SEMIDOT", "TRUE", 
		"FALSE", "IF", "ELSE", "END", "WHILE", "DO", "WRITE", "BREAK", "FOR", 
		"PROGRAM", "VAR", "PRINTLN", "ID", "NUMBER", "PRINT", "COMMENT", "WS", 
		"COMP"
	};


	public compileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compile.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u010d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\7&\u00d4\n&\f&\16&\u00d7\13&\3\'\6\'\u00da"+
		"\n\'\r\'\16\'\u00db\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3)\3)\6)\u00f5\n)\r)\16)\u00f6\3)\5)\u00fa\n)\3)\3)\3*\6"+
		"*\u00ff\n*\r*\16*\u0100\3*\3*\3+\3+\3+\3+\3+\3+\3+\5+\u010c\n+\3\u00f6"+
		"\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62"+
		";\3\3\f\f\5\2\13\f\17\17\"\"\u0116\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Z\3\2\2\2\7]\3"+
		"\2\2\2\t_\3\2\2\2\13b\3\2\2\2\re\3\2\2\2\17g\3\2\2\2\21i\3\2\2\2\23k\3"+
		"\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31q\3\2\2\2\33s\3\2\2\2\35v\3\2\2\2\37"+
		"y\3\2\2\2!|\3\2\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0083\3\2\2\2)\u0085"+
		"\3\2\2\2+\u0087\3\2\2\2-\u0089\3\2\2\2/\u008b\3\2\2\2\61\u008d\3\2\2\2"+
		"\63\u0092\3\2\2\2\65\u0098\3\2\2\2\67\u009b\3\2\2\29\u00a0\3\2\2\2;\u00a4"+
		"\3\2\2\2=\u00aa\3\2\2\2?\u00ad\3\2\2\2A\u00b3\3\2\2\2C\u00b9\3\2\2\2E"+
		"\u00bd\3\2\2\2G\u00c5\3\2\2\2I\u00c9\3\2\2\2K\u00d1\3\2\2\2M\u00d9\3\2"+
		"\2\2O\u00dd\3\2\2\2Q\u00f4\3\2\2\2S\u00fe\3\2\2\2U\u010b\3\2\2\2WX\7("+
		"\2\2XY\7(\2\2Y\4\3\2\2\2Z[\7~\2\2[\\\7~\2\2\\\6\3\2\2\2]^\7#\2\2^\b\3"+
		"\2\2\2_`\7-\2\2`a\7-\2\2a\n\3\2\2\2bc\7/\2\2cd\7/\2\2d\f\3\2\2\2ef\7$"+
		"\2\2f\16\3\2\2\2gh\7-\2\2h\20\3\2\2\2ij\7/\2\2j\22\3\2\2\2kl\7,\2\2l\24"+
		"\3\2\2\2mn\7\61\2\2n\26\3\2\2\2op\7@\2\2p\30\3\2\2\2qr\7>\2\2r\32\3\2"+
		"\2\2st\7@\2\2tu\7?\2\2u\34\3\2\2\2vw\7>\2\2wx\7?\2\2x\36\3\2\2\2yz\7?"+
		"\2\2z{\7?\2\2{ \3\2\2\2|}\7#\2\2}~\7?\2\2~\"\3\2\2\2\177\u0080\7?\2\2"+
		"\u0080$\3\2\2\2\u0081\u0082\7}\2\2\u0082&\3\2\2\2\u0083\u0084\7\177\2"+
		"\2\u0084(\3\2\2\2\u0085\u0086\7*\2\2\u0086*\3\2\2\2\u0087\u0088\7+\2\2"+
		"\u0088,\3\2\2\2\u0089\u008a\7<\2\2\u008a.\3\2\2\2\u008b\u008c\7=\2\2\u008c"+
		"\60\3\2\2\2\u008d\u008e\7v\2\2\u008e\u008f\7t\2\2\u008f\u0090\7w\2\2\u0090"+
		"\u0091\7g\2\2\u0091\62\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094\7c\2\2\u0094"+
		"\u0095\7n\2\2\u0095\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097\64\3\2\2\2\u0098"+
		"\u0099\7k\2\2\u0099\u009a\7h\2\2\u009a\66\3\2\2\2\u009b\u009c\7g\2\2\u009c"+
		"\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e\u009f\7g\2\2\u009f8\3\2\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7f\2\2\u00a3:\3\2\2\2\u00a4"+
		"\u00a5\7y\2\2\u00a5\u00a6\7j\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7n\2\2"+
		"\u00a8\u00a9\7g\2\2\u00a9<\3\2\2\2\u00aa\u00ab\7f\2\2\u00ab\u00ac\7q\2"+
		"\2\u00ac>\3\2\2\2\u00ad\u00ae\7y\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7"+
		"k\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7g\2\2\u00b2@\3\2\2\2\u00b3\u00b4"+
		"\7d\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7m\2\2\u00b8B\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7q\2\2\u00bb"+
		"\u00bc\7t\2\2\u00bcD\3\2\2\2\u00bd\u00be\7r\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7q\2\2\u00c0\u00c1\7i\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7c\2\2"+
		"\u00c3\u00c4\7o\2\2\u00c4F\3\2\2\2\u00c5\u00c6\7x\2\2\u00c6\u00c7\7c\2"+
		"\2\u00c7\u00c8\7t\2\2\u00c8H\3\2\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7"+
		"t\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf"+
		"\7n\2\2\u00cf\u00d0\7p\2\2\u00d0J\3\2\2\2\u00d1\u00d5\t\2\2\2\u00d2\u00d4"+
		"\t\3\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6L\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\t\4\2\2"+
		"\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dcN\3\2\2\2\u00dd\u00de\7\"\2\2\u00de\u00df\7U\2\2\u00df\u00e0"+
		"\7{\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7g\2\2\u00e3"+
		"\u00e4\7o\2\2\u00e4\u00e5\7\60\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7w\2"+
		"\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7\60\2\2\u00e9\u00ea\7r\2\2\u00ea\u00eb"+
		"\7t\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7v\2\2\u00ee"+
		"\u00ef\7n\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7\"\2\2\u00f1P\3\2\2\2\u00f2"+
		"\u00f3\7\61\2\2\u00f3\u00f5\7\61\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\3"+
		"\2\2\2\u00f6\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00fa\t\5\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b)"+
		"\2\2\u00fcR\3\2\2\2\u00fd\u00ff\t\6\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\b*\2\2\u0103T\3\2\2\2\u0104\u010c\5\27\f\2\u0105\u010c\5\31\r\2"+
		"\u0106\u010c\5\33\16\2\u0107\u010c\5\35\17\2\u0108\u010c\5\37\20\2\u0109"+
		"\u010c\5!\21\2\u010a\u010c\5#\22\2\u010b\u0104\3\2\2\2\u010b\u0105\3\2"+
		"\2\2\u010b\u0106\3\2\2\2\u010b\u0107\3\2\2\2\u010b\u0108\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010cV\3\2\2\2\t\2\u00d5\u00db\u00f6"+
		"\u00f9\u0100\u010b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}