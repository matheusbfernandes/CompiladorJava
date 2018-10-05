// Generated from D:/CompiladorJava/src/analisadorLexico\Java.g4 by ANTLR 4.7
package analisadorLexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	private final int ID_VALOR = 97;
	private final int ERRO_VALOR = 109;

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
		TRANSIENT=43, TRY=44, VOID=45, VOLATILE=46, WHILE=47, NULL=48, TRUE=49, 
		FALSE=50, OpAtribuicao=51, OpNOT=52, OpBitAND=53, OpBitOR=54, OpBitXOR=55, 
		OpBitComp=56, OpMenor=57, OpMaior=58, OpSoma=59, OpSub=60, OpMulti=61, 
		OpDiv=62, OpResto=63, OpIgualdade=64, OpDesigualdade=65, OpMenorIgual=66, 
		OpMaiorIgual=67, OpMultiAtribuicao=68, OpDivAtribuicao=69, OpRestoAtribuicao=70, 
		OpSomaAtribuicao=71, OpSubAtribuicao=72, OpANDAtribuicao=73, OpXORAtribuicao=74, 
		OpORAtribuicao=75, Incremento=76, Decremento=77, OpAND=78, OpOR=79, OpShitLeft=80, 
		OpShitRight=81, OpShiftZeroRight=82, OpLeftAtribuicao=83, OpRightAtribuicao=84, 
		OpRightZeroAtribuicao=85, IntSufix=86, DecimalNumeral=87, OctalNumeral=88, 
		HexNumeral=89, FloatNumeral=90, DoubleNumeral=91, Character=92, String=93, 
		Espaco=94, ComentarioLinha=95, ComentarioBloco=96, ID=97, AP=98, FP=99, 
		AC=100, FC=101, ACh=102, Fch=103, Virgula=104, DoisPontos=105, Ponto=106, 
		Interrogacao=107, PontoVirgula=108, ERROR=109;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public int getID() {
		return ID_VALOR;
	}

	public int getErro() {
		return ERRO_VALOR;
	}

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
		"NULL", "TRUE", "FALSE", "OpAtribuicao", "OpNOT", "OpBitAND", "OpBitOR", 
		"OpBitXOR", "OpBitComp", "OpMenor", "OpMaior", "OpSoma", "OpSub", "OpMulti", 
		"OpDiv", "OpResto", "OpIgualdade", "OpDesigualdade", "OpMenorIgual", "OpMaiorIgual", 
		"OpMultiAtribuicao", "OpDivAtribuicao", "OpRestoAtribuicao", "OpSomaAtribuicao", 
		"OpSubAtribuicao", "OpANDAtribuicao", "OpXORAtribuicao", "OpORAtribuicao", 
		"Incremento", "Decremento", "OpAND", "OpOR", "OpShitLeft", "OpShitRight", 
		"OpShiftZeroRight", "OpLeftAtribuicao", "OpRightAtribuicao", "OpRightZeroAtribuicao", 
		"NonZeroDigit", "Digit", "OctalDigit", "HexDigit", "EscapeSequence", "IntSufix", 
		"DecimalNumeral", "OctalNumeral", "HexNumeral", "FloatNumeral", "DoubleNumeral", 
		"Character", "String", "Espaco", "ComentarioLinha", "ComentarioBloco", 
		"ID", "AP", "FP", "AC", "FC", "ACh", "Fch", "Virgula", "DoisPontos", "Ponto", 
		"Interrogacao", "PontoVirgula", "ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'abstract'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", 
		"'char'", "'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", 
		"'else'", "'extends'", "'final'", "'finally'", "'float'", "'for'", "'goto'", 
		"'if'", "'implements'", "'import'", "'instanceof'", "'int'", "'interface'", 
		"'long'", "'native'", "'new'", "'package'", "'private'", "'protected'", 
		"'public'", "'return'", "'short'", "'static'", "'super'", "'switch'", 
		"'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", "'try'", 
		"'void'", "'volatile'", "'while'", "'null'", "'true'", "'false'", "'='", 
		"'!'", "'&'", "'|'", "'^'", "'~'", "'<'", "'>'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'=='", "'!='", "'<='", "'>='", "'*='", "'/='", "'%='", 
		"'+='", "'-='", "'&='", "'^='", "'|='", "'++'", "'--'", "'&&'", "'||'", 
		"'<<'", "'>>'", "'>>>'", "'<<='", "'>>='", "'>>>='", null, null, null, 
		null, null, null, null, null, null, null, null, null, "'('", "')'", "'['", 
		"']'", "'{'", "'}'", "','", "':'", "'.'", "'?'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
		"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "EXTENDS", 
		"FINAL", "FINALLY", "FLOAT", "FOR", "GOTO", "IF", "IMPLEMENTS", "IMPORT", 
		"INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "SUPER", 
		"SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", 
		"VOID", "VOLATILE", "WHILE", "NULL", "TRUE", "FALSE", "OpAtribuicao", 
		"OpNOT", "OpBitAND", "OpBitOR", "OpBitXOR", "OpBitComp", "OpMenor", "OpMaior", 
		"OpSoma", "OpSub", "OpMulti", "OpDiv", "OpResto", "OpIgualdade", "OpDesigualdade", 
		"OpMenorIgual", "OpMaiorIgual", "OpMultiAtribuicao", "OpDivAtribuicao", 
		"OpRestoAtribuicao", "OpSomaAtribuicao", "OpSubAtribuicao", "OpANDAtribuicao", 
		"OpXORAtribuicao", "OpORAtribuicao", "Incremento", "Decremento", "OpAND", 
		"OpOR", "OpShitLeft", "OpShitRight", "OpShiftZeroRight", "OpLeftAtribuicao", 
		"OpRightAtribuicao", "OpRightZeroAtribuicao", "IntSufix", "DecimalNumeral", 
		"OctalNumeral", "HexNumeral", "FloatNumeral", "DoubleNumeral", "Character", 
		"String", "Espaco", "ComentarioLinha", "ComentarioBloco", "ID", "AP", 
		"FP", "AC", "FC", "ACh", "Fch", "Virgula", "DoisPontos", "Ponto", "Interrogacao", 
		"PontoVirgula", "ERROR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2o\u0377\b\1\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		")\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3"+
		"\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3"+
		"A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3"+
		"I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3P\3"+
		"Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3S\3T\3T\3T\3T\3U\3U\3U\3U\3V\3V\3V\3V\3V\3"+
		"W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3"+
		"[\5[\u02af\n[\3\\\3\\\3]\3]\3]\7]\u02b6\n]\f]\16]\u02b9\13]\5]\u02bb\n"+
		"]\3^\3^\7^\u02bf\n^\f^\16^\u02c2\13^\3_\3_\3_\3_\7_\u02c8\n_\f_\16_\u02cb"+
		"\13_\3_\3_\3_\3_\7_\u02d1\n_\f_\16_\u02d4\13_\5_\u02d6\n_\3`\6`\u02d9"+
		"\n`\r`\16`\u02da\3`\3`\6`\u02df\n`\r`\16`\u02e0\5`\u02e3\n`\3`\3`\6`\u02e7"+
		"\n`\r`\16`\u02e8\5`\u02eb\n`\3`\5`\u02ee\n`\3`\3`\3`\3`\3`\6`\u02f5\n"+
		"`\r`\16`\u02f6\3`\5`\u02fa\n`\5`\u02fc\n`\3a\6a\u02ff\na\ra\16a\u0300"+
		"\3a\3a\6a\u0305\na\ra\16a\u0306\5a\u0309\na\3a\3a\6a\u030d\na\ra\16a\u030e"+
		"\5a\u0311\na\3a\5a\u0314\na\3a\3a\3a\3a\3a\6a\u031b\na\ra\16a\u031c\3"+
		"a\5a\u0320\na\5a\u0322\na\3b\3b\3b\3b\3b\3b\3b\5b\u032b\nb\3c\3c\3c\7"+
		"c\u0330\nc\fc\16c\u0333\13c\3c\3c\3d\6d\u0338\nd\rd\16d\u0339\3d\3d\3"+
		"e\3e\3e\3e\7e\u0342\ne\fe\16e\u0345\13e\3e\3e\3f\3f\3f\3f\7f\u034d\nf"+
		"\ff\16f\u0350\13f\3f\3f\3f\3f\3f\3g\5g\u0358\ng\3g\7g\u035b\ng\fg\16g"+
		"\u035e\13g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3"+
		"q\3r\3r\3s\3s\3\u034e\2t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009b"+
		"O\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00ad\2\u00af"+
		"\2\u00b1\2\u00b3\2\u00b5\2\u00b7X\u00b9Y\u00bbZ\u00bd[\u00bf\\\u00c1]"+
		"\u00c3^\u00c5_\u00c7`\u00c9a\u00cbb\u00cdc\u00cfd\u00d1e\u00d3f\u00d5"+
		"g\u00d7h\u00d9i\u00dbj\u00ddk\u00dfl\u00e1m\u00e3n\u00e5o\3\2\r\5\2\62"+
		";CHch\4\2NNnn\4\2GGgg\4\2HHhh\6\2FFHHffhh\4\2))^^\4\2$$^^\5\2\13\f\16"+
		"\17\"\"\4\2\f\f\17\17\6\2&&C\\aac|\7\2&&\62;C\\aac|\2\u0399\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd"+
		"\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2"+
		"\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf"+
		"\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2"+
		"\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1"+
		"\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\3\u00e7\3\2\2\2\5\u00f0\3\2\2"+
		"\2\7\u00f8\3\2\2\2\t\u00fe\3\2\2\2\13\u0103\3\2\2\2\r\u0108\3\2\2\2\17"+
		"\u010e\3\2\2\2\21\u0113\3\2\2\2\23\u0119\3\2\2\2\25\u011f\3\2\2\2\27\u0128"+
		"\3\2\2\2\31\u0130\3\2\2\2\33\u0133\3\2\2\2\35\u013a\3\2\2\2\37\u013f\3"+
		"\2\2\2!\u0147\3\2\2\2#\u014d\3\2\2\2%\u0155\3\2\2\2\'\u015b\3\2\2\2)\u015f"+
		"\3\2\2\2+\u0164\3\2\2\2-\u0167\3\2\2\2/\u0172\3\2\2\2\61\u0179\3\2\2\2"+
		"\63\u0184\3\2\2\2\65\u0188\3\2\2\2\67\u0192\3\2\2\29\u0197\3\2\2\2;\u019e"+
		"\3\2\2\2=\u01a2\3\2\2\2?\u01aa\3\2\2\2A\u01b2\3\2\2\2C\u01bc\3\2\2\2E"+
		"\u01c3\3\2\2\2G\u01ca\3\2\2\2I\u01d0\3\2\2\2K\u01d7\3\2\2\2M\u01dd\3\2"+
		"\2\2O\u01e4\3\2\2\2Q\u01f1\3\2\2\2S\u01f6\3\2\2\2U\u01fc\3\2\2\2W\u0203"+
		"\3\2\2\2Y\u020d\3\2\2\2[\u0211\3\2\2\2]\u0216\3\2\2\2_\u021f\3\2\2\2a"+
		"\u0225\3\2\2\2c\u022a\3\2\2\2e\u022f\3\2\2\2g\u0235\3\2\2\2i\u0237\3\2"+
		"\2\2k\u0239\3\2\2\2m\u023b\3\2\2\2o\u023d\3\2\2\2q\u023f\3\2\2\2s\u0241"+
		"\3\2\2\2u\u0243\3\2\2\2w\u0245\3\2\2\2y\u0247\3\2\2\2{\u0249\3\2\2\2}"+
		"\u024b\3\2\2\2\177\u024d\3\2\2\2\u0081\u024f\3\2\2\2\u0083\u0252\3\2\2"+
		"\2\u0085\u0255\3\2\2\2\u0087\u0258\3\2\2\2\u0089\u025b\3\2\2\2\u008b\u025e"+
		"\3\2\2\2\u008d\u0261\3\2\2\2\u008f\u0264\3\2\2\2\u0091\u0267\3\2\2\2\u0093"+
		"\u026a\3\2\2\2\u0095\u026d\3\2\2\2\u0097\u0270\3\2\2\2\u0099\u0273\3\2"+
		"\2\2\u009b\u0276\3\2\2\2\u009d\u0279\3\2\2\2\u009f\u027c\3\2\2\2\u00a1"+
		"\u027f\3\2\2\2\u00a3\u0282\3\2\2\2\u00a5\u0285\3\2\2\2\u00a7\u0289\3\2"+
		"\2\2\u00a9\u028d\3\2\2\2\u00ab\u0291\3\2\2\2\u00ad\u0296\3\2\2\2\u00af"+
		"\u0298\3\2\2\2\u00b1\u029a\3\2\2\2\u00b3\u029c\3\2\2\2\u00b5\u02ae\3\2"+
		"\2\2\u00b7\u02b0\3\2\2\2\u00b9\u02ba\3\2\2\2\u00bb\u02bc\3\2\2\2\u00bd"+
		"\u02d5\3\2\2\2\u00bf\u02d8\3\2\2\2\u00c1\u02fe\3\2\2\2\u00c3\u032a\3\2"+
		"\2\2\u00c5\u032c\3\2\2\2\u00c7\u0337\3\2\2\2\u00c9\u033d\3\2\2\2\u00cb"+
		"\u0348\3\2\2\2\u00cd\u0357\3\2\2\2\u00cf\u035f\3\2\2\2\u00d1\u0361\3\2"+
		"\2\2\u00d3\u0363\3\2\2\2\u00d5\u0365\3\2\2\2\u00d7\u0367\3\2\2\2\u00d9"+
		"\u0369\3\2\2\2\u00db\u036b\3\2\2\2\u00dd\u036d\3\2\2\2\u00df\u036f\3\2"+
		"\2\2\u00e1\u0371\3\2\2\2\u00e3\u0373\3\2\2\2\u00e5\u0375\3\2\2\2\u00e7"+
		"\u00e8\7c\2\2\u00e8\u00e9\7d\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7v\2\2"+
		"\u00eb\u00ec\7t\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef"+
		"\7v\2\2\u00ef\4\3\2\2\2\u00f0\u00f1\7d\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3"+
		"\7q\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7c\2\2\u00f6"+
		"\u00f7\7p\2\2\u00f7\6\3\2\2\2\u00f8\u00f9\7d\2\2\u00f9\u00fa\7t\2\2\u00fa"+
		"\u00fb\7g\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7m\2\2\u00fd\b\3\2\2\2\u00fe"+
		"\u00ff\7d\2\2\u00ff\u0100\7{\2\2\u0100\u0101\7v\2\2\u0101\u0102\7g\2\2"+
		"\u0102\n\3\2\2\2\u0103\u0104\7e\2\2\u0104\u0105\7c\2\2\u0105\u0106\7u"+
		"\2\2\u0106\u0107\7g\2\2\u0107\f\3\2\2\2\u0108\u0109\7e\2\2\u0109\u010a"+
		"\7c\2\2\u010a\u010b\7v\2\2\u010b\u010c\7e\2\2\u010c\u010d\7j\2\2\u010d"+
		"\16\3\2\2\2\u010e\u010f\7e\2\2\u010f\u0110\7j\2\2\u0110\u0111\7c\2\2\u0111"+
		"\u0112\7t\2\2\u0112\20\3\2\2\2\u0113\u0114\7e\2\2\u0114\u0115\7n\2\2\u0115"+
		"\u0116\7c\2\2\u0116\u0117\7u\2\2\u0117\u0118\7u\2\2\u0118\22\3\2\2\2\u0119"+
		"\u011a\7e\2\2\u011a\u011b\7q\2\2\u011b\u011c\7p\2\2\u011c\u011d\7u\2\2"+
		"\u011d\u011e\7v\2\2\u011e\24\3\2\2\2\u011f\u0120\7e\2\2\u0120\u0121\7"+
		"q\2\2\u0121\u0122\7p\2\2\u0122\u0123\7v\2\2\u0123\u0124\7k\2\2\u0124\u0125"+
		"\7p\2\2\u0125\u0126\7w\2\2\u0126\u0127\7g\2\2\u0127\26\3\2\2\2\u0128\u0129"+
		"\7f\2\2\u0129\u012a\7g\2\2\u012a\u012b\7h\2\2\u012b\u012c\7c\2\2\u012c"+
		"\u012d\7w\2\2\u012d\u012e\7n\2\2\u012e\u012f\7v\2\2\u012f\30\3\2\2\2\u0130"+
		"\u0131\7f\2\2\u0131\u0132\7q\2\2\u0132\32\3\2\2\2\u0133\u0134\7f\2\2\u0134"+
		"\u0135\7q\2\2\u0135\u0136\7w\2\2\u0136\u0137\7d\2\2\u0137\u0138\7n\2\2"+
		"\u0138\u0139\7g\2\2\u0139\34\3\2\2\2\u013a\u013b\7g\2\2\u013b\u013c\7"+
		"n\2\2\u013c\u013d\7u\2\2\u013d\u013e\7g\2\2\u013e\36\3\2\2\2\u013f\u0140"+
		"\7g\2\2\u0140\u0141\7z\2\2\u0141\u0142\7v\2\2\u0142\u0143\7g\2\2\u0143"+
		"\u0144\7p\2\2\u0144\u0145\7f\2\2\u0145\u0146\7u\2\2\u0146 \3\2\2\2\u0147"+
		"\u0148\7h\2\2\u0148\u0149\7k\2\2\u0149\u014a\7p\2\2\u014a\u014b\7c\2\2"+
		"\u014b\u014c\7n\2\2\u014c\"\3\2\2\2\u014d\u014e\7h\2\2\u014e\u014f\7k"+
		"\2\2\u014f\u0150\7p\2\2\u0150\u0151\7c\2\2\u0151\u0152\7n\2\2\u0152\u0153"+
		"\7n\2\2\u0153\u0154\7{\2\2\u0154$\3\2\2\2\u0155\u0156\7h\2\2\u0156\u0157"+
		"\7n\2\2\u0157\u0158\7q\2\2\u0158\u0159\7c\2\2\u0159\u015a\7v\2\2\u015a"+
		"&\3\2\2\2\u015b\u015c\7h\2\2\u015c\u015d\7q\2\2\u015d\u015e\7t\2\2\u015e"+
		"(\3\2\2\2\u015f\u0160\7i\2\2\u0160\u0161\7q\2\2\u0161\u0162\7v\2\2\u0162"+
		"\u0163\7q\2\2\u0163*\3\2\2\2\u0164\u0165\7k\2\2\u0165\u0166\7h\2\2\u0166"+
		",\3\2\2\2\u0167\u0168\7k\2\2\u0168\u0169\7o\2\2\u0169\u016a\7r\2\2\u016a"+
		"\u016b\7n\2\2\u016b\u016c\7g\2\2\u016c\u016d\7o\2\2\u016d\u016e\7g\2\2"+
		"\u016e\u016f\7p\2\2\u016f\u0170\7v\2\2\u0170\u0171\7u\2\2\u0171.\3\2\2"+
		"\2\u0172\u0173\7k\2\2\u0173\u0174\7o\2\2\u0174\u0175\7r\2\2\u0175\u0176"+
		"\7q\2\2\u0176\u0177\7t\2\2\u0177\u0178\7v\2\2\u0178\60\3\2\2\2\u0179\u017a"+
		"\7k\2\2\u017a\u017b\7p\2\2\u017b\u017c\7u\2\2\u017c\u017d\7v\2\2\u017d"+
		"\u017e\7c\2\2\u017e\u017f\7p\2\2\u017f\u0180\7e\2\2\u0180\u0181\7g\2\2"+
		"\u0181\u0182\7q\2\2\u0182\u0183\7h\2\2\u0183\62\3\2\2\2\u0184\u0185\7"+
		"k\2\2\u0185\u0186\7p\2\2\u0186\u0187\7v\2\2\u0187\64\3\2\2\2\u0188\u0189"+
		"\7k\2\2\u0189\u018a\7p\2\2\u018a\u018b\7v\2\2\u018b\u018c\7g\2\2\u018c"+
		"\u018d\7t\2\2\u018d\u018e\7h\2\2\u018e\u018f\7c\2\2\u018f\u0190\7e\2\2"+
		"\u0190\u0191\7g\2\2\u0191\66\3\2\2\2\u0192\u0193\7n\2\2\u0193\u0194\7"+
		"q\2\2\u0194\u0195\7p\2\2\u0195\u0196\7i\2\2\u01968\3\2\2\2\u0197\u0198"+
		"\7p\2\2\u0198\u0199\7c\2\2\u0199\u019a\7v\2\2\u019a\u019b\7k\2\2\u019b"+
		"\u019c\7x\2\2\u019c\u019d\7g\2\2\u019d:\3\2\2\2\u019e\u019f\7p\2\2\u019f"+
		"\u01a0\7g\2\2\u01a0\u01a1\7y\2\2\u01a1<\3\2\2\2\u01a2\u01a3\7r\2\2\u01a3"+
		"\u01a4\7c\2\2\u01a4\u01a5\7e\2\2\u01a5\u01a6\7m\2\2\u01a6\u01a7\7c\2\2"+
		"\u01a7\u01a8\7i\2\2\u01a8\u01a9\7g\2\2\u01a9>\3\2\2\2\u01aa\u01ab\7r\2"+
		"\2\u01ab\u01ac\7t\2\2\u01ac\u01ad\7k\2\2\u01ad\u01ae\7x\2\2\u01ae\u01af"+
		"\7c\2\2\u01af\u01b0\7v\2\2\u01b0\u01b1\7g\2\2\u01b1@\3\2\2\2\u01b2\u01b3"+
		"\7r\2\2\u01b3\u01b4\7t\2\2\u01b4\u01b5\7q\2\2\u01b5\u01b6\7v\2\2\u01b6"+
		"\u01b7\7g\2\2\u01b7\u01b8\7e\2\2\u01b8\u01b9\7v\2\2\u01b9\u01ba\7g\2\2"+
		"\u01ba\u01bb\7f\2\2\u01bbB\3\2\2\2\u01bc\u01bd\7r\2\2\u01bd\u01be\7w\2"+
		"\2\u01be\u01bf\7d\2\2\u01bf\u01c0\7n\2\2\u01c0\u01c1\7k\2\2\u01c1\u01c2"+
		"\7e\2\2\u01c2D\3\2\2\2\u01c3\u01c4\7t\2\2\u01c4\u01c5\7g\2\2\u01c5\u01c6"+
		"\7v\2\2\u01c6\u01c7\7w\2\2\u01c7\u01c8\7t\2\2\u01c8\u01c9\7p\2\2\u01c9"+
		"F\3\2\2\2\u01ca\u01cb\7u\2\2\u01cb\u01cc\7j\2\2\u01cc\u01cd\7q\2\2\u01cd"+
		"\u01ce\7t\2\2\u01ce\u01cf\7v\2\2\u01cfH\3\2\2\2\u01d0\u01d1\7u\2\2\u01d1"+
		"\u01d2\7v\2\2\u01d2\u01d3\7c\2\2\u01d3\u01d4\7v\2\2\u01d4\u01d5\7k\2\2"+
		"\u01d5\u01d6\7e\2\2\u01d6J\3\2\2\2\u01d7\u01d8\7u\2\2\u01d8\u01d9\7w\2"+
		"\2\u01d9\u01da\7r\2\2\u01da\u01db\7g\2\2\u01db\u01dc\7t\2\2\u01dcL\3\2"+
		"\2\2\u01dd\u01de\7u\2\2\u01de\u01df\7y\2\2\u01df\u01e0\7k\2\2\u01e0\u01e1"+
		"\7v\2\2\u01e1\u01e2\7e\2\2\u01e2\u01e3\7j\2\2\u01e3N\3\2\2\2\u01e4\u01e5"+
		"\7u\2\2\u01e5\u01e6\7{\2\2\u01e6\u01e7\7p\2\2\u01e7\u01e8\7e\2\2\u01e8"+
		"\u01e9\7j\2\2\u01e9\u01ea\7t\2\2\u01ea\u01eb\7q\2\2\u01eb\u01ec\7p\2\2"+
		"\u01ec\u01ed\7k\2\2\u01ed\u01ee\7|\2\2\u01ee\u01ef\7g\2\2\u01ef\u01f0"+
		"\7f\2\2\u01f0P\3\2\2\2\u01f1\u01f2\7v\2\2\u01f2\u01f3\7j\2\2\u01f3\u01f4"+
		"\7k\2\2\u01f4\u01f5\7u\2\2\u01f5R\3\2\2\2\u01f6\u01f7\7v\2\2\u01f7\u01f8"+
		"\7j\2\2\u01f8\u01f9\7t\2\2\u01f9\u01fa\7q\2\2\u01fa\u01fb\7y\2\2\u01fb"+
		"T\3\2\2\2\u01fc\u01fd\7v\2\2\u01fd\u01fe\7j\2\2\u01fe\u01ff\7t\2\2\u01ff"+
		"\u0200\7q\2\2\u0200\u0201\7y\2\2\u0201\u0202\7u\2\2\u0202V\3\2\2\2\u0203"+
		"\u0204\7v\2\2\u0204\u0205\7t\2\2\u0205\u0206\7c\2\2\u0206\u0207\7p\2\2"+
		"\u0207\u0208\7u\2\2\u0208\u0209\7k\2\2\u0209\u020a\7g\2\2\u020a\u020b"+
		"\7p\2\2\u020b\u020c\7v\2\2\u020cX\3\2\2\2\u020d\u020e\7v\2\2\u020e\u020f"+
		"\7t\2\2\u020f\u0210\7{\2\2\u0210Z\3\2\2\2\u0211\u0212\7x\2\2\u0212\u0213"+
		"\7q\2\2\u0213\u0214\7k\2\2\u0214\u0215\7f\2\2\u0215\\\3\2\2\2\u0216\u0217"+
		"\7x\2\2\u0217\u0218\7q\2\2\u0218\u0219\7n\2\2\u0219\u021a\7c\2\2\u021a"+
		"\u021b\7v\2\2\u021b\u021c\7k\2\2\u021c\u021d\7n\2\2\u021d\u021e\7g\2\2"+
		"\u021e^\3\2\2\2\u021f\u0220\7y\2\2\u0220\u0221\7j\2\2\u0221\u0222\7k\2"+
		"\2\u0222\u0223\7n\2\2\u0223\u0224\7g\2\2\u0224`\3\2\2\2\u0225\u0226\7"+
		"p\2\2\u0226\u0227\7w\2\2\u0227\u0228\7n\2\2\u0228\u0229\7n\2\2\u0229b"+
		"\3\2\2\2\u022a\u022b\7v\2\2\u022b\u022c\7t\2\2\u022c\u022d\7w\2\2\u022d"+
		"\u022e\7g\2\2\u022ed\3\2\2\2\u022f\u0230\7h\2\2\u0230\u0231\7c\2\2\u0231"+
		"\u0232\7n\2\2\u0232\u0233\7u\2\2\u0233\u0234\7g\2\2\u0234f\3\2\2\2\u0235"+
		"\u0236\7?\2\2\u0236h\3\2\2\2\u0237\u0238\7#\2\2\u0238j\3\2\2\2\u0239\u023a"+
		"\7(\2\2\u023al\3\2\2\2\u023b\u023c\7~\2\2\u023cn\3\2\2\2\u023d\u023e\7"+
		"`\2\2\u023ep\3\2\2\2\u023f\u0240\7\u0080\2\2\u0240r\3\2\2\2\u0241\u0242"+
		"\7>\2\2\u0242t\3\2\2\2\u0243\u0244\7@\2\2\u0244v\3\2\2\2\u0245\u0246\7"+
		"-\2\2\u0246x\3\2\2\2\u0247\u0248\7/\2\2\u0248z\3\2\2\2\u0249\u024a\7,"+
		"\2\2\u024a|\3\2\2\2\u024b\u024c\7\61\2\2\u024c~\3\2\2\2\u024d\u024e\7"+
		"\'\2\2\u024e\u0080\3\2\2\2\u024f\u0250\7?\2\2\u0250\u0251\7?\2\2\u0251"+
		"\u0082\3\2\2\2\u0252\u0253\7#\2\2\u0253\u0254\7?\2\2\u0254\u0084\3\2\2"+
		"\2\u0255\u0256\7>\2\2\u0256\u0257\7?\2\2\u0257\u0086\3\2\2\2\u0258\u0259"+
		"\7@\2\2\u0259\u025a\7?\2\2\u025a\u0088\3\2\2\2\u025b\u025c\7,\2\2\u025c"+
		"\u025d\7?\2\2\u025d\u008a\3\2\2\2\u025e\u025f\7\61\2\2\u025f\u0260\7?"+
		"\2\2\u0260\u008c\3\2\2\2\u0261\u0262\7\'\2\2\u0262\u0263\7?\2\2\u0263"+
		"\u008e\3\2\2\2\u0264\u0265\7-\2\2\u0265\u0266\7?\2\2\u0266\u0090\3\2\2"+
		"\2\u0267\u0268\7/\2\2\u0268\u0269\7?\2\2\u0269\u0092\3\2\2\2\u026a\u026b"+
		"\7(\2\2\u026b\u026c\7?\2\2\u026c\u0094\3\2\2\2\u026d\u026e\7`\2\2\u026e"+
		"\u026f\7?\2\2\u026f\u0096\3\2\2\2\u0270\u0271\7~\2\2\u0271\u0272\7?\2"+
		"\2\u0272\u0098\3\2\2\2\u0273\u0274\7-\2\2\u0274\u0275\7-\2\2\u0275\u009a"+
		"\3\2\2\2\u0276\u0277\7/\2\2\u0277\u0278\7/\2\2\u0278\u009c\3\2\2\2\u0279"+
		"\u027a\7(\2\2\u027a\u027b\7(\2\2\u027b\u009e\3\2\2\2\u027c\u027d\7~\2"+
		"\2\u027d\u027e\7~\2\2\u027e\u00a0\3\2\2\2\u027f\u0280\7>\2\2\u0280\u0281"+
		"\7>\2\2\u0281\u00a2\3\2\2\2\u0282\u0283\7@\2\2\u0283\u0284\7@\2\2\u0284"+
		"\u00a4\3\2\2\2\u0285\u0286\7@\2\2\u0286\u0287\7@\2\2\u0287\u0288\7@\2"+
		"\2\u0288\u00a6\3\2\2\2\u0289\u028a\7>\2\2\u028a\u028b\7>\2\2\u028b\u028c"+
		"\7?\2\2\u028c\u00a8\3\2\2\2\u028d\u028e\7@\2\2\u028e\u028f\7@\2\2\u028f"+
		"\u0290\7?\2\2\u0290\u00aa\3\2\2\2\u0291\u0292\7@\2\2\u0292\u0293\7@\2"+
		"\2\u0293\u0294\7@\2\2\u0294\u0295\7?\2\2\u0295\u00ac\3\2\2\2\u0296\u0297"+
		"\4\63;\2\u0297\u00ae\3\2\2\2\u0298\u0299\4\62;\2\u0299\u00b0\3\2\2\2\u029a"+
		"\u029b\4\629\2\u029b\u00b2\3\2\2\2\u029c\u029d\t\2\2\2\u029d\u00b4\3\2"+
		"\2\2\u029e\u029f\7^\2\2\u029f\u02af\7v\2\2\u02a0\u02a1\7^\2\2\u02a1\u02af"+
		"\7d\2\2\u02a2\u02a3\7^\2\2\u02a3\u02af\7p\2\2\u02a4\u02a5\7^\2\2\u02a5"+
		"\u02af\7t\2\2\u02a6\u02a7\7^\2\2\u02a7\u02af\7h\2\2\u02a8\u02a9\7^\2\2"+
		"\u02a9\u02af\7)\2\2\u02aa\u02ab\7^\2\2\u02ab\u02af\7^\2\2\u02ac\u02ad"+
		"\7^\2\2\u02ad\u02af\7$\2\2\u02ae\u029e\3\2\2\2\u02ae\u02a0\3\2\2\2\u02ae"+
		"\u02a2\3\2\2\2\u02ae\u02a4\3\2\2\2\u02ae\u02a6\3\2\2\2\u02ae\u02a8\3\2"+
		"\2\2\u02ae\u02aa\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af\u00b6\3\2\2\2\u02b0"+
		"\u02b1\t\3\2\2\u02b1\u00b8\3\2\2\2\u02b2\u02bb\7\62\2\2\u02b3\u02b7\5"+
		"\u00adW\2\u02b4\u02b6\5\u00afX\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9\3\2\2"+
		"\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7"+
		"\3\2\2\2\u02ba\u02b2\3\2\2\2\u02ba\u02b3\3\2\2\2\u02bb\u00ba\3\2\2\2\u02bc"+
		"\u02c0\7\62\2\2\u02bd\u02bf\5\u00b1Y\2\u02be\u02bd\3\2\2\2\u02bf\u02c2"+
		"\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u00bc\3\2\2\2\u02c2"+
		"\u02c0\3\2\2\2\u02c3\u02c4\7\62\2\2\u02c4\u02c5\7z\2\2\u02c5\u02c9\3\2"+
		"\2\2\u02c6\u02c8\5\u00b3Z\2\u02c7\u02c6\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9"+
		"\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02d6\3\2\2\2\u02cb\u02c9\3\2"+
		"\2\2\u02cc\u02cd\7\62\2\2\u02cd\u02ce\7Z\2\2\u02ce\u02d2\3\2\2\2\u02cf"+
		"\u02d1\5\u00b3Z\2\u02d0\u02cf\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0"+
		"\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5"+
		"\u02c3\3\2\2\2\u02d5\u02cc\3\2\2\2\u02d6\u00be\3\2\2\2\u02d7\u02d9\5\u00af"+
		"X\2\u02d8\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02d8\3\2\2\2\u02da"+
		"\u02db\3\2\2\2\u02db\u02fb\3\2\2\2\u02dc\u02de\7\60\2\2\u02dd\u02df\5"+
		"\u00afX\2\u02de\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02de\3\2\2\2"+
		"\u02e0\u02e1\3\2\2\2\u02e1\u02e3\3\2\2\2\u02e2\u02dc\3\2\2\2\u02e2\u02e3"+
		"\3\2\2\2\u02e3\u02ea\3\2\2\2\u02e4\u02e6\t\4\2\2\u02e5\u02e7\5\u00afX"+
		"\2\u02e6\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9"+
		"\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02e4\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb"+
		"\u02ed\3\2\2\2\u02ec\u02ee\t\5\2\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2"+
		"\2\2\u02ee\u02fc\3\2\2\2\u02ef\u02f0\7\60\2\2\u02f0\u02fc\t\5\2\2\u02f1"+
		"\u02f2\7\60\2\2\u02f2\u02f4\t\4\2\2\u02f3\u02f5\5\u00afX\2\u02f4\u02f3"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"+
		"\u02f9\3\2\2\2\u02f8\u02fa\t\5\2\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2"+
		"\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02e2\3\2\2\2\u02fb\u02ef\3\2\2\2\u02fb"+
		"\u02f1\3\2\2\2\u02fc\u00c0\3\2\2\2\u02fd\u02ff\5\u00afX\2\u02fe\u02fd"+
		"\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301"+
		"\u0321\3\2\2\2\u0302\u0304\7\60\2\2\u0303\u0305\5\u00afX\2\u0304\u0303"+
		"\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"\u0309\3\2\2\2\u0308\u0302\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u0310\3\2"+
		"\2\2\u030a\u030c\t\4\2\2\u030b\u030d\5\u00afX\2\u030c\u030b\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\3\2"+
		"\2\2\u0310\u030a\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313\3\2\2\2\u0312"+
		"\u0314\t\6\2\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0322\3\2"+
		"\2\2\u0315\u0316\7\60\2\2\u0316\u0322\t\6\2\2\u0317\u0318\7\60\2\2\u0318"+
		"\u031a\t\4\2\2\u0319\u031b\5\u00afX\2\u031a\u0319\3\2\2\2\u031b\u031c"+
		"\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031f\3\2\2\2\u031e"+
		"\u0320\t\6\2\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\3\2"+
		"\2\2\u0321\u0308\3\2\2\2\u0321\u0315\3\2\2\2\u0321\u0317\3\2\2\2\u0322"+
		"\u00c2\3\2\2\2\u0323\u0324\7)\2\2\u0324\u0325\n\7\2\2\u0325\u032b\7)\2"+
		"\2\u0326\u0327\7)\2\2\u0327\u0328\5\u00b5[\2\u0328\u0329\7)\2\2\u0329"+
		"\u032b\3\2\2\2\u032a\u0323\3\2\2\2\u032a\u0326\3\2\2\2\u032b\u00c4\3\2"+
		"\2\2\u032c\u0331\7$\2\2\u032d\u0330\n\b\2\2\u032e\u0330\5\u00b5[\2\u032f"+
		"\u032d\3\2\2\2\u032f\u032e\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2"+
		"\2\2\u0331\u0332\3\2\2\2\u0332\u0334\3\2\2\2\u0333\u0331\3\2\2\2\u0334"+
		"\u0335\7$\2\2\u0335\u00c6\3\2\2\2\u0336\u0338\t\t\2\2\u0337\u0336\3\2"+
		"\2\2\u0338\u0339\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a"+
		"\u033b\3\2\2\2\u033b\u033c\bd\2\2\u033c\u00c8\3\2\2\2\u033d\u033e\7\61"+
		"\2\2\u033e\u033f\7\61\2\2\u033f\u0343\3\2\2\2\u0340\u0342\n\n\2\2\u0341"+
		"\u0340\3\2\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2"+
		"\2\2\u0344\u0346\3\2\2\2\u0345\u0343\3\2\2\2\u0346\u0347\be\2\2\u0347"+
		"\u00ca\3\2\2\2\u0348\u0349\7\61\2\2\u0349\u034a\7,\2\2\u034a\u034e\3\2"+
		"\2\2\u034b\u034d\13\2\2\2\u034c\u034b\3\2\2\2\u034d\u0350\3\2\2\2\u034e"+
		"\u034f\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u0351\3\2\2\2\u0350\u034e\3\2"+
		"\2\2\u0351\u0352\7,\2\2\u0352\u0353\7\61\2\2\u0353\u0354\3\2\2\2\u0354"+
		"\u0355\bf\2\2\u0355\u00cc\3\2\2\2\u0356\u0358\t\13\2\2\u0357\u0356\3\2"+
		"\2\2\u0358\u035c\3\2\2\2\u0359\u035b\t\f\2\2\u035a\u0359\3\2\2\2\u035b"+
		"\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u00ce\3\2"+
		"\2\2\u035e\u035c\3\2\2\2\u035f\u0360\7*\2\2\u0360\u00d0\3\2\2\2\u0361"+
		"\u0362\7+\2\2\u0362\u00d2\3\2\2\2\u0363\u0364\7]\2\2\u0364\u00d4\3\2\2"+
		"\2\u0365\u0366\7_\2\2\u0366\u00d6\3\2\2\2\u0367\u0368\7}\2\2\u0368\u00d8"+
		"\3\2\2\2\u0369\u036a\7\177\2\2\u036a\u00da\3\2\2\2\u036b\u036c\7.\2\2"+
		"\u036c\u00dc\3\2\2\2\u036d\u036e\7<\2\2\u036e\u00de\3\2\2\2\u036f\u0370"+
		"\7\60\2\2\u0370\u00e0\3\2\2\2\u0371\u0372\7A\2\2\u0372\u00e2\3\2\2\2\u0373"+
		"\u0374\7=\2\2\u0374\u00e4\3\2\2\2\u0375\u0376\13\2\2\2\u0376\u00e6\3\2"+
		"\2\2%\2\u02ae\u02b7\u02ba\u02c0\u02c9\u02d2\u02d5\u02da\u02e0\u02e2\u02e8"+
		"\u02ea\u02ed\u02f6\u02f9\u02fb\u0300\u0306\u0308\u030e\u0310\u0313\u031c"+
		"\u031f\u0321\u032a\u032f\u0331\u0339\u0343\u034e\u0357\u035a\u035c\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}