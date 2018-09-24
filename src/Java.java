// Generated from D:/CompiladorJava/src\Java.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, BOOLEAN=2, BREAK=3, BYTE=4, CASE=5, CATCH=6, CHAR=7, CLASS=8, 
		CONST=9, CONTINUE=10, DEFAULT=11, DO=12, DOUBLE=13, ELSE=14, EXTENDS=15, 
		FINAL=16, FINALLY=17, FLOAT=18, FOR=19, GOTO=20, IF=21, IMPLEMENTS=22, 
		IMPORT=23, INSTANCEOF=24, INT=25, INTERFACE=26, LONG=27, NATIVE=28, NEW=29, 
		PACKAGE=30, PRIVATE=31, PROTECTED=32, PUBLIC=33, RETURN=34, SHORT=35, 
		STATIC=36, SUPER=37, SWITCH=38, SYNCHRONIZED=39, THIS=40, THROW=41, THROWS=42, 
		TRANSIENT=43, TRY=44, VOID=45, VOLATILE=46, WHILE=47, OpAtribuicao=48, 
		OpNOT=49, OpBitAND=50, OpBitOR=51, OpBitXOR=52, OpBitComp=53, OpMenor=54, 
		OpMaior=55, OpSoma=56, OpSub=57, OpMulti=58, OpDiv=59, OpResto=60, OpIgualdade=61, 
		OpDesigualdade=62, OpMenorIgual=63, OpMaiorIgual=64, OpMultiAtribuicao=65, 
		OpDivAtribuicao=66, OpRestoAtribuicao=67, OpSomaAtribuicao=68, OpSubAtribuicao=69, 
		OpANDAtribuicao=70, OpXORAtribuicao=71, OpORAtribuicao=72, Incremento=73, 
		Decremento=74, OpAND=75, OpOR=76, OpShitLeft=77, OpShitRight=78, OpShiftZeroRight=79, 
		OpLeftAtribuicao=80, OpRightAtribuicao=81, OpRightZeroAtribuicao=82, DecimalNumeral=83, 
		OctalNumeral=84, HexNumeral=85, FloatNumeral=86, DoubleNumeral=87, Character=88, 
		String=89, BooleanLiteral=90, NULL=91, Espaco=92, ComentarioLinha=93, 
		ComentarioBloco=94, AP=95, FP=96, AC=97, FC=98, ACh=99, Fch=100, Virgula=101, 
		DoisPontos=102, Ponto=103, Interrogacao=104, PontoVirgula=105, ID=106;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ABSTRACT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", 
		"CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "EXTENDS", "FINAL", 
		"FINALLY", "FLOAT", "FOR", "GOTO", "IF", "IMPLEMENTS", "IMPORT", "INSTANCEOF", 
		"INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", 
		"PUBLIC", "RETURN", "SHORT", "STATIC", "SUPER", "SWITCH", "SYNCHRONIZED", 
		"THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", 
		"OpAtribuicao", "OpNOT", "OpBitAND", "OpBitOR", "OpBitXOR", "OpBitComp", 
		"OpMenor", "OpMaior", "OpSoma", "OpSub", "OpMulti", "OpDiv", "OpResto", 
		"OpIgualdade", "OpDesigualdade", "OpMenorIgual", "OpMaiorIgual", "OpMultiAtribuicao", 
		"OpDivAtribuicao", "OpRestoAtribuicao", "OpSomaAtribuicao", "OpSubAtribuicao", 
		"OpANDAtribuicao", "OpXORAtribuicao", "OpORAtribuicao", "Incremento", 
		"Decremento", "OpAND", "OpOR", "OpShitLeft", "OpShitRight", "OpShiftZeroRight", 
		"OpLeftAtribuicao", "OpRightAtribuicao", "OpRightZeroAtribuicao", "NonZeroDigit", 
		"Digit", "OctalDigit", "HexDigit", "EscapeSequence", "DecimalNumeral", 
		"OctalNumeral", "HexNumeral", "FloatNumeral", "DoubleNumeral", "Character", 
		"String", "BooleanLiteral", "NULL", "Espaco", "ComentarioLinha", "ComentarioBloco", 
		"AP", "FP", "AC", "FC", "ACh", "Fch", "Virgula", "DoisPontos", "Ponto", 
		"Interrogacao", "PontoVirgula", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'abstract'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", 
		"'char'", "'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", 
		"'else'", "'extends'", "'final'", "'finally'", "'float'", "'for'", "'goto'", 
		"'if'", "'implements'", "'import'", "'instanceof'", "'int'", "'interface'", 
		"'long'", "'native'", "'new'", "'package'", "'private'", "'protected'", 
		"'public'", "'return'", "'short'", "'static'", "'super'", "'switch'", 
		"'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", "'try'", 
		"'void'", "'volatile'", "'while'", "'='", "'!'", "'&'", "'|'", "'^'", 
		"'~'", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", 
		"'<='", "'>='", "'*='", "'/='", "'%='", "'+='", "'-='", "'&='", "'^='", 
		"'|='", "'++'", "'--'", "'&&'", "'||'", "'<<'", "'>>'", "'>>>'", "'<<='", 
		"'>>='", "'>>>='", null, null, null, null, null, null, null, null, "'null'", 
		null, null, null, "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "':'", 
		"'.'", "'?'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
		"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "EXTENDS", 
		"FINAL", "FINALLY", "FLOAT", "FOR", "GOTO", "IF", "IMPLEMENTS", "IMPORT", 
		"INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "SUPER", 
		"SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", 
		"VOID", "VOLATILE", "WHILE", "OpAtribuicao", "OpNOT", "OpBitAND", "OpBitOR", 
		"OpBitXOR", "OpBitComp", "OpMenor", "OpMaior", "OpSoma", "OpSub", "OpMulti", 
		"OpDiv", "OpResto", "OpIgualdade", "OpDesigualdade", "OpMenorIgual", "OpMaiorIgual", 
		"OpMultiAtribuicao", "OpDivAtribuicao", "OpRestoAtribuicao", "OpSomaAtribuicao", 
		"OpSubAtribuicao", "OpANDAtribuicao", "OpXORAtribuicao", "OpORAtribuicao", 
		"Incremento", "Decremento", "OpAND", "OpOR", "OpShitLeft", "OpShitRight", 
		"OpShiftZeroRight", "OpLeftAtribuicao", "OpRightAtribuicao", "OpRightZeroAtribuicao", 
		"DecimalNumeral", "OctalNumeral", "HexNumeral", "FloatNumeral", "DoubleNumeral", 
		"Character", "String", "BooleanLiteral", "NULL", "Espaco", "ComentarioLinha", 
		"ComentarioBloco", "AP", "FP", "AC", "FC", "ACh", "Fch", "Virgula", "DoisPontos", 
		"Ponto", "Interrogacao", "PontoVirgula", "ID"
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


	public Java(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2l\u0374\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3@\3"+
		"@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3"+
		"H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3"+
		"O\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\3S\3S\3T\3T\3U\3U\3V\3"+
		"V\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0299\nX\3"+
		"Y\3Y\3Y\3Y\7Y\u029f\nY\fY\16Y\u02a2\13Y\3Y\3Y\5Y\u02a6\nY\3Z\3Z\7Z\u02aa"+
		"\nZ\fZ\16Z\u02ad\13Z\3Z\3Z\3[\3[\3[\3[\7[\u02b5\n[\f[\16[\u02b8\13[\3"+
		"[\3[\3[\3[\3[\7[\u02bf\n[\f[\16[\u02c2\13[\3[\5[\u02c5\n[\3\\\6\\\u02c8"+
		"\n\\\r\\\16\\\u02c9\3\\\3\\\6\\\u02ce\n\\\r\\\16\\\u02cf\5\\\u02d2\n\\"+
		"\3\\\3\\\6\\\u02d6\n\\\r\\\16\\\u02d7\5\\\u02da\n\\\3\\\5\\\u02dd\n\\"+
		"\3\\\3\\\3\\\3\\\3\\\6\\\u02e4\n\\\r\\\16\\\u02e5\3\\\5\\\u02e9\n\\\5"+
		"\\\u02eb\n\\\3]\6]\u02ee\n]\r]\16]\u02ef\3]\3]\6]\u02f4\n]\r]\16]\u02f5"+
		"\5]\u02f8\n]\3]\3]\6]\u02fc\n]\r]\16]\u02fd\5]\u0300\n]\3]\5]\u0303\n"+
		"]\3]\3]\3]\3]\3]\6]\u030a\n]\r]\16]\u030b\3]\5]\u030f\n]\5]\u0311\n]\3"+
		"^\3^\3^\3^\3^\3^\3^\5^\u031a\n^\3_\3_\3_\7_\u031f\n_\f_\16_\u0322\13_"+
		"\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u032f\n`\3a\3a\3a\3a\3a\3b\6b\u0337"+
		"\nb\rb\16b\u0338\3b\3b\3c\3c\3c\3c\7c\u0341\nc\fc\16c\u0344\13c\3c\3c"+
		"\3d\3d\3d\3d\7d\u034c\nd\fd\16d\u034f\13d\3d\3d\3d\3d\3d\3e\3e\3f\3f\3"+
		"g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\5p\u036d\np\3"+
		"p\7p\u0370\np\fp\16p\u0373\13p\3\u034d\2q\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7\2\u00a9"+
		"\2\u00ab\2\u00ad\2\u00af\2\u00b1U\u00b3V\u00b5W\u00b7X\u00b9Y\u00bbZ\u00bd"+
		"[\u00bf\\\u00c1]\u00c3^\u00c5_\u00c7`\u00c9a\u00cbb\u00cdc\u00cfd\u00d1"+
		"e\u00d3f\u00d5g\u00d7h\u00d9i\u00dbj\u00ddk\u00dfl\3\2\f\5\2\62;CHch\4"+
		"\2NNnn\4\2GGgg\4\2HHhh\6\2FFHHffhh\4\2$$^^\5\2\13\f\16\17\"\"\4\2\f\f"+
		"\17\17\6\2&&C\\aac|\7\2&&\62;C\\aac|\2\u0397\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2"+
		"\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1"+
		"\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2"+
		"\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\3\u00e1\3\2\2\2\5\u00ea"+
		"\3\2\2\2\7\u00f2\3\2\2\2\t\u00f8\3\2\2\2\13\u00fd\3\2\2\2\r\u0102\3\2"+
		"\2\2\17\u0108\3\2\2\2\21\u010d\3\2\2\2\23\u0113\3\2\2\2\25\u0119\3\2\2"+
		"\2\27\u0122\3\2\2\2\31\u012a\3\2\2\2\33\u012d\3\2\2\2\35\u0134\3\2\2\2"+
		"\37\u0139\3\2\2\2!\u0141\3\2\2\2#\u0147\3\2\2\2%\u014f\3\2\2\2\'\u0155"+
		"\3\2\2\2)\u0159\3\2\2\2+\u015e\3\2\2\2-\u0161\3\2\2\2/\u016c\3\2\2\2\61"+
		"\u0173\3\2\2\2\63\u017e\3\2\2\2\65\u0182\3\2\2\2\67\u018c\3\2\2\29\u0191"+
		"\3\2\2\2;\u0198\3\2\2\2=\u019c\3\2\2\2?\u01a4\3\2\2\2A\u01ac\3\2\2\2C"+
		"\u01b6\3\2\2\2E\u01bd\3\2\2\2G\u01c4\3\2\2\2I\u01ca\3\2\2\2K\u01d1\3\2"+
		"\2\2M\u01d7\3\2\2\2O\u01de\3\2\2\2Q\u01eb\3\2\2\2S\u01f0\3\2\2\2U\u01f6"+
		"\3\2\2\2W\u01fd\3\2\2\2Y\u0207\3\2\2\2[\u020b\3\2\2\2]\u0210\3\2\2\2_"+
		"\u0219\3\2\2\2a\u021f\3\2\2\2c\u0221\3\2\2\2e\u0223\3\2\2\2g\u0225\3\2"+
		"\2\2i\u0227\3\2\2\2k\u0229\3\2\2\2m\u022b\3\2\2\2o\u022d\3\2\2\2q\u022f"+
		"\3\2\2\2s\u0231\3\2\2\2u\u0233\3\2\2\2w\u0235\3\2\2\2y\u0237\3\2\2\2{"+
		"\u0239\3\2\2\2}\u023c\3\2\2\2\177\u023f\3\2\2\2\u0081\u0242\3\2\2\2\u0083"+
		"\u0245\3\2\2\2\u0085\u0248\3\2\2\2\u0087\u024b\3\2\2\2\u0089\u024e\3\2"+
		"\2\2\u008b\u0251\3\2\2\2\u008d\u0254\3\2\2\2\u008f\u0257\3\2\2\2\u0091"+
		"\u025a\3\2\2\2\u0093\u025d\3\2\2\2\u0095\u0260\3\2\2\2\u0097\u0263\3\2"+
		"\2\2\u0099\u0266\3\2\2\2\u009b\u0269\3\2\2\2\u009d\u026c\3\2\2\2\u009f"+
		"\u026f\3\2\2\2\u00a1\u0273\3\2\2\2\u00a3\u0277\3\2\2\2\u00a5\u027b\3\2"+
		"\2\2\u00a7\u0280\3\2\2\2\u00a9\u0282\3\2\2\2\u00ab\u0284\3\2\2\2\u00ad"+
		"\u0286\3\2\2\2\u00af\u0298\3\2\2\2\u00b1\u02a5\3\2\2\2\u00b3\u02a7\3\2"+
		"\2\2\u00b5\u02c4\3\2\2\2\u00b7\u02c7\3\2\2\2\u00b9\u02ed\3\2\2\2\u00bb"+
		"\u0319\3\2\2\2\u00bd\u031b\3\2\2\2\u00bf\u032e\3\2\2\2\u00c1\u0330\3\2"+
		"\2\2\u00c3\u0336\3\2\2\2\u00c5\u033c\3\2\2\2\u00c7\u0347\3\2\2\2\u00c9"+
		"\u0355\3\2\2\2\u00cb\u0357\3\2\2\2\u00cd\u0359\3\2\2\2\u00cf\u035b\3\2"+
		"\2\2\u00d1\u035d\3\2\2\2\u00d3\u035f\3\2\2\2\u00d5\u0361\3\2\2\2\u00d7"+
		"\u0363\3\2\2\2\u00d9\u0365\3\2\2\2\u00db\u0367\3\2\2\2\u00dd\u0369\3\2"+
		"\2\2\u00df\u036c\3\2\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7d\2\2\u00e3\u00e4"+
		"\7u\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7c\2\2\u00e7"+
		"\u00e8\7e\2\2\u00e8\u00e9\7v\2\2\u00e9\4\3\2\2\2\u00ea\u00eb\7d\2\2\u00eb"+
		"\u00ec\7q\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7g\2\2"+
		"\u00ef\u00f0\7c\2\2\u00f0\u00f1\7p\2\2\u00f1\6\3\2\2\2\u00f2\u00f3\7d"+
		"\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7"+
		"\7m\2\2\u00f7\b\3\2\2\2\u00f8\u00f9\7d\2\2\u00f9\u00fa\7{\2\2\u00fa\u00fb"+
		"\7v\2\2\u00fb\u00fc\7g\2\2\u00fc\n\3\2\2\2\u00fd\u00fe\7e\2\2\u00fe\u00ff"+
		"\7c\2\2\u00ff\u0100\7u\2\2\u0100\u0101\7g\2\2\u0101\f\3\2\2\2\u0102\u0103"+
		"\7e\2\2\u0103\u0104\7c\2\2\u0104\u0105\7v\2\2\u0105\u0106\7e\2\2\u0106"+
		"\u0107\7j\2\2\u0107\16\3\2\2\2\u0108\u0109\7e\2\2\u0109\u010a\7j\2\2\u010a"+
		"\u010b\7c\2\2\u010b\u010c\7t\2\2\u010c\20\3\2\2\2\u010d\u010e\7e\2\2\u010e"+
		"\u010f\7n\2\2\u010f\u0110\7c\2\2\u0110\u0111\7u\2\2\u0111\u0112\7u\2\2"+
		"\u0112\22\3\2\2\2\u0113\u0114\7e\2\2\u0114\u0115\7q\2\2\u0115\u0116\7"+
		"p\2\2\u0116\u0117\7u\2\2\u0117\u0118\7v\2\2\u0118\24\3\2\2\2\u0119\u011a"+
		"\7e\2\2\u011a\u011b\7q\2\2\u011b\u011c\7p\2\2\u011c\u011d\7v\2\2\u011d"+
		"\u011e\7k\2\2\u011e\u011f\7p\2\2\u011f\u0120\7w\2\2\u0120\u0121\7g\2\2"+
		"\u0121\26\3\2\2\2\u0122\u0123\7f\2\2\u0123\u0124\7g\2\2\u0124\u0125\7"+
		"h\2\2\u0125\u0126\7c\2\2\u0126\u0127\7w\2\2\u0127\u0128\7n\2\2\u0128\u0129"+
		"\7v\2\2\u0129\30\3\2\2\2\u012a\u012b\7f\2\2\u012b\u012c\7q\2\2\u012c\32"+
		"\3\2\2\2\u012d\u012e\7f\2\2\u012e\u012f\7q\2\2\u012f\u0130\7w\2\2\u0130"+
		"\u0131\7d\2\2\u0131\u0132\7n\2\2\u0132\u0133\7g\2\2\u0133\34\3\2\2\2\u0134"+
		"\u0135\7g\2\2\u0135\u0136\7n\2\2\u0136\u0137\7u\2\2\u0137\u0138\7g\2\2"+
		"\u0138\36\3\2\2\2\u0139\u013a\7g\2\2\u013a\u013b\7z\2\2\u013b\u013c\7"+
		"v\2\2\u013c\u013d\7g\2\2\u013d\u013e\7p\2\2\u013e\u013f\7f\2\2\u013f\u0140"+
		"\7u\2\2\u0140 \3\2\2\2\u0141\u0142\7h\2\2\u0142\u0143\7k\2\2\u0143\u0144"+
		"\7p\2\2\u0144\u0145\7c\2\2\u0145\u0146\7n\2\2\u0146\"\3\2\2\2\u0147\u0148"+
		"\7h\2\2\u0148\u0149\7k\2\2\u0149\u014a\7p\2\2\u014a\u014b\7c\2\2\u014b"+
		"\u014c\7n\2\2\u014c\u014d\7n\2\2\u014d\u014e\7{\2\2\u014e$\3\2\2\2\u014f"+
		"\u0150\7h\2\2\u0150\u0151\7n\2\2\u0151\u0152\7q\2\2\u0152\u0153\7c\2\2"+
		"\u0153\u0154\7v\2\2\u0154&\3\2\2\2\u0155\u0156\7h\2\2\u0156\u0157\7q\2"+
		"\2\u0157\u0158\7t\2\2\u0158(\3\2\2\2\u0159\u015a\7i\2\2\u015a\u015b\7"+
		"q\2\2\u015b\u015c\7v\2\2\u015c\u015d\7q\2\2\u015d*\3\2\2\2\u015e\u015f"+
		"\7k\2\2\u015f\u0160\7h\2\2\u0160,\3\2\2\2\u0161\u0162\7k\2\2\u0162\u0163"+
		"\7o\2\2\u0163\u0164\7r\2\2\u0164\u0165\7n\2\2\u0165\u0166\7g\2\2\u0166"+
		"\u0167\7o\2\2\u0167\u0168\7g\2\2\u0168\u0169\7p\2\2\u0169\u016a\7v\2\2"+
		"\u016a\u016b\7u\2\2\u016b.\3\2\2\2\u016c\u016d\7k\2\2\u016d\u016e\7o\2"+
		"\2\u016e\u016f\7r\2\2\u016f\u0170\7q\2\2\u0170\u0171\7t\2\2\u0171\u0172"+
		"\7v\2\2\u0172\60\3\2\2\2\u0173\u0174\7k\2\2\u0174\u0175\7p\2\2\u0175\u0176"+
		"\7u\2\2\u0176\u0177\7v\2\2\u0177\u0178\7c\2\2\u0178\u0179\7p\2\2\u0179"+
		"\u017a\7e\2\2\u017a\u017b\7g\2\2\u017b\u017c\7q\2\2\u017c\u017d\7h\2\2"+
		"\u017d\62\3\2\2\2\u017e\u017f\7k\2\2\u017f\u0180\7p\2\2\u0180\u0181\7"+
		"v\2\2\u0181\64\3\2\2\2\u0182\u0183\7k\2\2\u0183\u0184\7p\2\2\u0184\u0185"+
		"\7v\2\2\u0185\u0186\7g\2\2\u0186\u0187\7t\2\2\u0187\u0188\7h\2\2\u0188"+
		"\u0189\7c\2\2\u0189\u018a\7e\2\2\u018a\u018b\7g\2\2\u018b\66\3\2\2\2\u018c"+
		"\u018d\7n\2\2\u018d\u018e\7q\2\2\u018e\u018f\7p\2\2\u018f\u0190\7i\2\2"+
		"\u01908\3\2\2\2\u0191\u0192\7p\2\2\u0192\u0193\7c\2\2\u0193\u0194\7v\2"+
		"\2\u0194\u0195\7k\2\2\u0195\u0196\7x\2\2\u0196\u0197\7g\2\2\u0197:\3\2"+
		"\2\2\u0198\u0199\7p\2\2\u0199\u019a\7g\2\2\u019a\u019b\7y\2\2\u019b<\3"+
		"\2\2\2\u019c\u019d\7r\2\2\u019d\u019e\7c\2\2\u019e\u019f\7e\2\2\u019f"+
		"\u01a0\7m\2\2\u01a0\u01a1\7c\2\2\u01a1\u01a2\7i\2\2\u01a2\u01a3\7g\2\2"+
		"\u01a3>\3\2\2\2\u01a4\u01a5\7r\2\2\u01a5\u01a6\7t\2\2\u01a6\u01a7\7k\2"+
		"\2\u01a7\u01a8\7x\2\2\u01a8\u01a9\7c\2\2\u01a9\u01aa\7v\2\2\u01aa\u01ab"+
		"\7g\2\2\u01ab@\3\2\2\2\u01ac\u01ad\7r\2\2\u01ad\u01ae\7t\2\2\u01ae\u01af"+
		"\7q\2\2\u01af\u01b0\7v\2\2\u01b0\u01b1\7g\2\2\u01b1\u01b2\7e\2\2\u01b2"+
		"\u01b3\7v\2\2\u01b3\u01b4\7g\2\2\u01b4\u01b5\7f\2\2\u01b5B\3\2\2\2\u01b6"+
		"\u01b7\7r\2\2\u01b7\u01b8\7w\2\2\u01b8\u01b9\7d\2\2\u01b9\u01ba\7n\2\2"+
		"\u01ba\u01bb\7k\2\2\u01bb\u01bc\7e\2\2\u01bcD\3\2\2\2\u01bd\u01be\7t\2"+
		"\2\u01be\u01bf\7g\2\2\u01bf\u01c0\7v\2\2\u01c0\u01c1\7w\2\2\u01c1\u01c2"+
		"\7t\2\2\u01c2\u01c3\7p\2\2\u01c3F\3\2\2\2\u01c4\u01c5\7u\2\2\u01c5\u01c6"+
		"\7j\2\2\u01c6\u01c7\7q\2\2\u01c7\u01c8\7t\2\2\u01c8\u01c9\7v\2\2\u01c9"+
		"H\3\2\2\2\u01ca\u01cb\7u\2\2\u01cb\u01cc\7v\2\2\u01cc\u01cd\7c\2\2\u01cd"+
		"\u01ce\7v\2\2\u01ce\u01cf\7k\2\2\u01cf\u01d0\7e\2\2\u01d0J\3\2\2\2\u01d1"+
		"\u01d2\7u\2\2\u01d2\u01d3\7w\2\2\u01d3\u01d4\7r\2\2\u01d4\u01d5\7g\2\2"+
		"\u01d5\u01d6\7t\2\2\u01d6L\3\2\2\2\u01d7\u01d8\7u\2\2\u01d8\u01d9\7y\2"+
		"\2\u01d9\u01da\7k\2\2\u01da\u01db\7v\2\2\u01db\u01dc\7e\2\2\u01dc\u01dd"+
		"\7j\2\2\u01ddN\3\2\2\2\u01de\u01df\7u\2\2\u01df\u01e0\7{\2\2\u01e0\u01e1"+
		"\7p\2\2\u01e1\u01e2\7e\2\2\u01e2\u01e3\7j\2\2\u01e3\u01e4\7t\2\2\u01e4"+
		"\u01e5\7q\2\2\u01e5\u01e6\7p\2\2\u01e6\u01e7\7k\2\2\u01e7\u01e8\7|\2\2"+
		"\u01e8\u01e9\7g\2\2\u01e9\u01ea\7f\2\2\u01eaP\3\2\2\2\u01eb\u01ec\7v\2"+
		"\2\u01ec\u01ed\7j\2\2\u01ed\u01ee\7k\2\2\u01ee\u01ef\7u\2\2\u01efR\3\2"+
		"\2\2\u01f0\u01f1\7v\2\2\u01f1\u01f2\7j\2\2\u01f2\u01f3\7t\2\2\u01f3\u01f4"+
		"\7q\2\2\u01f4\u01f5\7y\2\2\u01f5T\3\2\2\2\u01f6\u01f7\7v\2\2\u01f7\u01f8"+
		"\7j\2\2\u01f8\u01f9\7t\2\2\u01f9\u01fa\7q\2\2\u01fa\u01fb\7y\2\2\u01fb"+
		"\u01fc\7u\2\2\u01fcV\3\2\2\2\u01fd\u01fe\7v\2\2\u01fe\u01ff\7t\2\2\u01ff"+
		"\u0200\7c\2\2\u0200\u0201\7p\2\2\u0201\u0202\7u\2\2\u0202\u0203\7k\2\2"+
		"\u0203\u0204\7g\2\2\u0204\u0205\7p\2\2\u0205\u0206\7v\2\2\u0206X\3\2\2"+
		"\2\u0207\u0208\7v\2\2\u0208\u0209\7t\2\2\u0209\u020a\7{\2\2\u020aZ\3\2"+
		"\2\2\u020b\u020c\7x\2\2\u020c\u020d\7q\2\2\u020d\u020e\7k\2\2\u020e\u020f"+
		"\7f\2\2\u020f\\\3\2\2\2\u0210\u0211\7x\2\2\u0211\u0212\7q\2\2\u0212\u0213"+
		"\7n\2\2\u0213\u0214\7c\2\2\u0214\u0215\7v\2\2\u0215\u0216\7k\2\2\u0216"+
		"\u0217\7n\2\2\u0217\u0218\7g\2\2\u0218^\3\2\2\2\u0219\u021a\7y\2\2\u021a"+
		"\u021b\7j\2\2\u021b\u021c\7k\2\2\u021c\u021d\7n\2\2\u021d\u021e\7g\2\2"+
		"\u021e`\3\2\2\2\u021f\u0220\7?\2\2\u0220b\3\2\2\2\u0221\u0222\7#\2\2\u0222"+
		"d\3\2\2\2\u0223\u0224\7(\2\2\u0224f\3\2\2\2\u0225\u0226\7~\2\2\u0226h"+
		"\3\2\2\2\u0227\u0228\7`\2\2\u0228j\3\2\2\2\u0229\u022a\7\u0080\2\2\u022a"+
		"l\3\2\2\2\u022b\u022c\7>\2\2\u022cn\3\2\2\2\u022d\u022e\7@\2\2\u022ep"+
		"\3\2\2\2\u022f\u0230\7-\2\2\u0230r\3\2\2\2\u0231\u0232\7/\2\2\u0232t\3"+
		"\2\2\2\u0233\u0234\7,\2\2\u0234v\3\2\2\2\u0235\u0236\7\61\2\2\u0236x\3"+
		"\2\2\2\u0237\u0238\7\'\2\2\u0238z\3\2\2\2\u0239\u023a\7?\2\2\u023a\u023b"+
		"\7?\2\2\u023b|\3\2\2\2\u023c\u023d\7#\2\2\u023d\u023e\7?\2\2\u023e~\3"+
		"\2\2\2\u023f\u0240\7>\2\2\u0240\u0241\7?\2\2\u0241\u0080\3\2\2\2\u0242"+
		"\u0243\7@\2\2\u0243\u0244\7?\2\2\u0244\u0082\3\2\2\2\u0245\u0246\7,\2"+
		"\2\u0246\u0247\7?\2\2\u0247\u0084\3\2\2\2\u0248\u0249\7\61\2\2\u0249\u024a"+
		"\7?\2\2\u024a\u0086\3\2\2\2\u024b\u024c\7\'\2\2\u024c\u024d\7?\2\2\u024d"+
		"\u0088\3\2\2\2\u024e\u024f\7-\2\2\u024f\u0250\7?\2\2\u0250\u008a\3\2\2"+
		"\2\u0251\u0252\7/\2\2\u0252\u0253\7?\2\2\u0253\u008c\3\2\2\2\u0254\u0255"+
		"\7(\2\2\u0255\u0256\7?\2\2\u0256\u008e\3\2\2\2\u0257\u0258\7`\2\2\u0258"+
		"\u0259\7?\2\2\u0259\u0090\3\2\2\2\u025a\u025b\7~\2\2\u025b\u025c\7?\2"+
		"\2\u025c\u0092\3\2\2\2\u025d\u025e\7-\2\2\u025e\u025f\7-\2\2\u025f\u0094"+
		"\3\2\2\2\u0260\u0261\7/\2\2\u0261\u0262\7/\2\2\u0262\u0096\3\2\2\2\u0263"+
		"\u0264\7(\2\2\u0264\u0265\7(\2\2\u0265\u0098\3\2\2\2\u0266\u0267\7~\2"+
		"\2\u0267\u0268\7~\2\2\u0268\u009a\3\2\2\2\u0269\u026a\7>\2\2\u026a\u026b"+
		"\7>\2\2\u026b\u009c\3\2\2\2\u026c\u026d\7@\2\2\u026d\u026e\7@\2\2\u026e"+
		"\u009e\3\2\2\2\u026f\u0270\7@\2\2\u0270\u0271\7@\2\2\u0271\u0272\7@\2"+
		"\2\u0272\u00a0\3\2\2\2\u0273\u0274\7>\2\2\u0274\u0275\7>\2\2\u0275\u0276"+
		"\7?\2\2\u0276\u00a2\3\2\2\2\u0277\u0278\7@\2\2\u0278\u0279\7@\2\2\u0279"+
		"\u027a\7?\2\2\u027a\u00a4\3\2\2\2\u027b\u027c\7@\2\2\u027c\u027d\7@\2"+
		"\2\u027d\u027e\7@\2\2\u027e\u027f\7?\2\2\u027f\u00a6\3\2\2\2\u0280\u0281"+
		"\4\63;\2\u0281\u00a8\3\2\2\2\u0282\u0283\4\62;\2\u0283\u00aa\3\2\2\2\u0284"+
		"\u0285\4\629\2\u0285\u00ac\3\2\2\2\u0286\u0287\t\2\2\2\u0287\u00ae\3\2"+
		"\2\2\u0288\u0289\7^\2\2\u0289\u0299\7v\2\2\u028a\u028b\7^\2\2\u028b\u0299"+
		"\7d\2\2\u028c\u028d\7^\2\2\u028d\u0299\7p\2\2\u028e\u028f\7^\2\2\u028f"+
		"\u0299\7t\2\2\u0290\u0291\7^\2\2\u0291\u0299\7h\2\2\u0292\u0293\7^\2\2"+
		"\u0293\u0299\7)\2\2\u0294\u0295\7^\2\2\u0295\u0299\7^\2\2\u0296\u0297"+
		"\7^\2\2\u0297\u0299\7$\2\2\u0298\u0288\3\2\2\2\u0298\u028a\3\2\2\2\u0298"+
		"\u028c\3\2\2\2\u0298\u028e\3\2\2\2\u0298\u0290\3\2\2\2\u0298\u0292\3\2"+
		"\2\2\u0298\u0294\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u00b0\3\2\2\2\u029a"+
		"\u029b\7\62\2\2\u029b\u02a6\t\3\2\2\u029c\u02a0\5\u00a7T\2\u029d\u029f"+
		"\5\u00a9U\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2"+
		"\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a4"+
		"\t\3\2\2\u02a4\u02a6\3\2\2\2\u02a5\u029a\3\2\2\2\u02a5\u029c\3\2\2\2\u02a6"+
		"\u00b2\3\2\2\2\u02a7\u02ab\7\62\2\2\u02a8\u02aa\5\u00abV\2\u02a9\u02a8"+
		"\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02af\t\3\2\2\u02af\u00b4\3\2"+
		"\2\2\u02b0\u02b1\7\62\2\2\u02b1\u02b2\7z\2\2\u02b2\u02b6\3\2\2\2\u02b3"+
		"\u02b5\5\u00adW\2\u02b4\u02b3\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4"+
		"\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b9\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9"+
		"\u02c5\t\3\2\2\u02ba\u02bb\7\62\2\2\u02bb\u02bc\7Z\2\2\u02bc\u02c0\3\2"+
		"\2\2\u02bd\u02bf\5\u00adW\2\u02be\u02bd\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0"+
		"\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c3\3\2\2\2\u02c2\u02c0\3\2"+
		"\2\2\u02c3\u02c5\t\3\2\2\u02c4\u02b0\3\2\2\2\u02c4\u02ba\3\2\2\2\u02c5"+
		"\u00b6\3\2\2\2\u02c6\u02c8\5\u00a9U\2\u02c7\u02c6\3\2\2\2\u02c8\u02c9"+
		"\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02ea\3\2\2\2\u02cb"+
		"\u02cd\7\60\2\2\u02cc\u02ce\5\u00a9U\2\u02cd\u02cc\3\2\2\2\u02ce\u02cf"+
		"\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1"+
		"\u02cb\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d9\3\2\2\2\u02d3\u02d5\t\4"+
		"\2\2\u02d4\u02d6\5\u00a9U\2\u02d5\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7"+
		"\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9\u02d3\3\2"+
		"\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db\u02dd\t\5\2\2\u02dc"+
		"\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02eb\3\2\2\2\u02de\u02df\7\60"+
		"\2\2\u02df\u02eb\t\5\2\2\u02e0\u02e1\7\60\2\2\u02e1\u02e3\t\4\2\2\u02e2"+
		"\u02e4\5\u00a9U\2\u02e3\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e3"+
		"\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e9\t\5\2\2\u02e8"+
		"\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02d1\3\2"+
		"\2\2\u02ea\u02de\3\2\2\2\u02ea\u02e0\3\2\2\2\u02eb\u00b8\3\2\2\2\u02ec"+
		"\u02ee\5\u00a9U\2\u02ed\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02ed"+
		"\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u0310\3\2\2\2\u02f1\u02f3\7\60\2\2"+
		"\u02f2\u02f4\5\u00a9U\2\u02f3\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8\3\2\2\2\u02f7\u02f1\3\2"+
		"\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02ff\3\2\2\2\u02f9\u02fb\t\4\2\2\u02fa"+
		"\u02fc\5\u00a9U\2\u02fb\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fb"+
		"\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0300\3\2\2\2\u02ff\u02f9\3\2\2\2\u02ff"+
		"\u0300\3\2\2\2\u0300\u0302\3\2\2\2\u0301\u0303\t\6\2\2\u0302\u0301\3\2"+
		"\2\2\u0302\u0303\3\2\2\2\u0303\u0311\3\2\2\2\u0304\u0305\7\60\2\2\u0305"+
		"\u0311\t\6\2\2\u0306\u0307\7\60\2\2\u0307\u0309\t\4\2\2\u0308\u030a\5"+
		"\u00a9U\2\u0309\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u0309\3\2\2\2"+
		"\u030b\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d\u030f\t\6\2\2\u030e\u030d"+
		"\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\3\2\2\2\u0310\u02f7\3\2\2\2\u0310"+
		"\u0304\3\2\2\2\u0310\u0306\3\2\2\2\u0311\u00ba\3\2\2\2\u0312\u0313\7)"+
		"\2\2\u0313\u0314\n\7\2\2\u0314\u031a\7)\2\2\u0315\u0316\7)\2\2\u0316\u0317"+
		"\5\u00afX\2\u0317\u0318\7)\2\2\u0318\u031a\3\2\2\2\u0319\u0312\3\2\2\2"+
		"\u0319\u0315\3\2\2\2\u031a\u00bc\3\2\2\2\u031b\u0320\7$\2\2\u031c\u031f"+
		"\n\7\2\2\u031d\u031f\5\u00afX\2\u031e\u031c\3\2\2\2\u031e\u031d\3\2\2"+
		"\2\u031f\u0322\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0323"+
		"\3\2\2\2\u0322\u0320\3\2\2\2\u0323\u0324\7$\2\2\u0324\u00be\3\2\2\2\u0325"+
		"\u0326\7v\2\2\u0326\u0327\7t\2\2\u0327\u0328\7w\2\2\u0328\u032f\7g\2\2"+
		"\u0329\u032a\7h\2\2\u032a\u032b\7c\2\2\u032b\u032c\7n\2\2\u032c\u032d"+
		"\7u\2\2\u032d\u032f\7g\2\2\u032e\u0325\3\2\2\2\u032e\u0329\3\2\2\2\u032f"+
		"\u00c0\3\2\2\2\u0330\u0331\7p\2\2\u0331\u0332\7w\2\2\u0332\u0333\7n\2"+
		"\2\u0333\u0334\7n\2\2\u0334\u00c2\3\2\2\2\u0335\u0337\t\b\2\2\u0336\u0335"+
		"\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339"+
		"\u033a\3\2\2\2\u033a\u033b\bb\2\2\u033b\u00c4\3\2\2\2\u033c\u033d\7\61"+
		"\2\2\u033d\u033e\7\61\2\2\u033e\u0342\3\2\2\2\u033f\u0341\n\t\2\2\u0340"+
		"\u033f\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2"+
		"\2\2\u0343\u0345\3\2\2\2\u0344\u0342\3\2\2\2\u0345\u0346\bc\2\2\u0346"+
		"\u00c6\3\2\2\2\u0347\u0348\7\61\2\2\u0348\u0349\7,\2\2\u0349\u034d\3\2"+
		"\2\2\u034a\u034c\13\2\2\2\u034b\u034a\3\2\2\2\u034c\u034f\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u0350\3\2\2\2\u034f\u034d\3\2"+
		"\2\2\u0350\u0351\7,\2\2\u0351\u0352\7\61\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u0354\bd\2\2\u0354\u00c8\3\2\2\2\u0355\u0356\7*\2\2\u0356\u00ca\3\2\2"+
		"\2\u0357\u0358\7+\2\2\u0358\u00cc\3\2\2\2\u0359\u035a\7]\2\2\u035a\u00ce"+
		"\3\2\2\2\u035b\u035c\7_\2\2\u035c\u00d0\3\2\2\2\u035d\u035e\7}\2\2\u035e"+
		"\u00d2\3\2\2\2\u035f\u0360\7\177\2\2\u0360\u00d4\3\2\2\2\u0361\u0362\7"+
		".\2\2\u0362\u00d6\3\2\2\2\u0363\u0364\7<\2\2\u0364\u00d8\3\2\2\2\u0365"+
		"\u0366\7\60\2\2\u0366\u00da\3\2\2\2\u0367\u0368\7A\2\2\u0368\u00dc\3\2"+
		"\2\2\u0369\u036a\7=\2\2\u036a\u00de\3\2\2\2\u036b\u036d\t\n\2\2\u036c"+
		"\u036b\3\2\2\2\u036d\u0371\3\2\2\2\u036e\u0370\t\13\2\2\u036f\u036e\3"+
		"\2\2\2\u0370\u0373\3\2\2\2\u0371\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372"+
		"\u00e0\3\2\2\2\u0373\u0371\3\2\2\2&\2\u0298\u02a0\u02a5\u02ab\u02b6\u02c0"+
		"\u02c4\u02c9\u02cf\u02d1\u02d7\u02d9\u02dc\u02e5\u02e8\u02ea\u02ef\u02f5"+
		"\u02f7\u02fd\u02ff\u0302\u030b\u030e\u0310\u0319\u031e\u0320\u032e\u0338"+
		"\u0342\u034d\u036c\u036f\u0371\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}