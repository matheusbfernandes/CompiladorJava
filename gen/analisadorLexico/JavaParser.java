// Generated from D:/CompiladorJava/src/analisadorLexico\Java.g4 by ANTLR 4.7
package analisadorLexico;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
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
		TRANSIENT=43, TRY=44, VOID=45, VOLATILE=46, WHILE=47, NULL=48, TRUE=49, 
		FALSE=50, ID=51, OpAtribuicao=52, OpNOT=53, OpBitAND=54, OpBitOR=55, OpBitXOR=56, 
		OpBitComp=57, OpMenor=58, OpMaior=59, OpSoma=60, OpSub=61, OpMulti=62, 
		OpDiv=63, OpResto=64, OpIgualdade=65, OpDesigualdade=66, OpMenorIgual=67, 
		OpMaiorIgual=68, OpMultiAtribuicao=69, OpDivAtribuicao=70, OpRestoAtribuicao=71, 
		OpSomaAtribuicao=72, OpSubAtribuicao=73, OpANDAtribuicao=74, OpXORAtribuicao=75, 
		OpORAtribuicao=76, Incremento=77, Decremento=78, OpAND=79, OpOR=80, OpShitLeft=81, 
		OpShitRight=82, OpShiftZeroRight=83, OpLeftAtribuicao=84, OpRightAtribuicao=85, 
		OpRightZeroAtribuicao=86, DecimalNumeral=87, OctalNumeral=88, HexNumeral=89, 
		FloatNumeral=90, DoubleNumeral=91, Character=92, String=93, Espaco=94, 
		ComentarioLinha=95, ComentarioBloco=96, AP=97, FP=98, AC=99, FC=100, ACh=101, 
		FCh=102, Virgula=103, DoisPontos=104, Ponto=105, Interrogacao=106, PontoVirgula=107, 
		ERROR=108;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclarations = 2, 
		RULE_importDeclaration = 3, RULE_singleTypeImportDeclaration = 4, RULE_typeImportOnDemandDeclaration = 5, 
		RULE_typeDeclarations = 6, RULE_typeDeclaration = 7, RULE_classDeclaration = 8, 
		RULE_classModifiers = 9, RULE_classModifier = 10, RULE_superRule = 11, 
		RULE_interfaces = 12, RULE_interfaceTypeList = 13, RULE_classBody = 14, 
		RULE_classBodyDeclarations = 15, RULE_classBodyDeclaration = 16, RULE_classMemberDeclaration = 17, 
		RULE_constructorDeclaration = 18, RULE_constructorModifiers = 19, RULE_constructorModifier = 20, 
		RULE_constructorDeclarator = 21, RULE_formalParameterList = 22, RULE_formalParameter = 23, 
		RULE_classTypeList = 24, RULE_constructorBody = 25, RULE_explicitConstructorInvocation = 26, 
		RULE_fieldDeclaration = 27, RULE_fieldModifiers = 28, RULE_fieldModifier = 29, 
		RULE_variableDeclarators = 30, RULE_variableDeclarator = 31, RULE_variableDeclaratorId = 32, 
		RULE_variableInitializer = 33, RULE_methodDeclaration = 34, RULE_methodHeader = 35, 
		RULE_resultType = 36, RULE_methodModifiers = 37, RULE_methodModifier = 38, 
		RULE_methodDeclarator = 39, RULE_methodBody = 40, RULE_interfaceDeclaration = 41, 
		RULE_interfaceModifiers = 42, RULE_interfaceModifier = 43, RULE_extendsInterfaces = 44, 
		RULE_interfaceBody = 45, RULE_interfaceMemberDeclarations = 46, RULE_interfaceMemberDeclaration = 47, 
		RULE_constantDeclaration = 48, RULE_constantModifiers = 49, RULE_abstractMethodDeclaration = 50, 
		RULE_abstractMethodModifiers = 51, RULE_abstractMethodModifier = 52, RULE_arrayInitializer = 53, 
		RULE_variableInitializers = 54, RULE_type = 55, RULE_primitiveType = 56, 
		RULE_numericType = 57, RULE_integralType = 58, RULE_floatingPointType = 59, 
		RULE_referenceType = 60, RULE_classOrInterfaceType = 61, RULE_classType = 62, 
		RULE_interfaceType = 63, RULE_arrayType = 64, RULE_block = 65, RULE_blockStatements = 66, 
		RULE_blockStatement = 67, RULE_localVariableDeclarationStatement = 68, 
		RULE_localVariableDeclaration = 69, RULE_statement = 70, RULE_statementNoShortIf = 71, 
		RULE_statementWithoutTrailingSubstatement = 72, RULE_emptyStatement = 73, 
		RULE_labeledStatement = 74, RULE_labeledStatementNoShortIf = 75, RULE_expressionStatement = 76, 
		RULE_statementExpression = 77, RULE_ifThenStatement = 78, RULE_switchStatement = 79, 
		RULE_switchBlock = 80, RULE_switchBlockStatementGroups = 81, RULE_switchBlockStatementGroup = 82, 
		RULE_switchLabels = 83, RULE_whileStatement = 84, RULE_whileStatementNoShortIf = 85, 
		RULE_doStatement = 86, RULE_forStatement = 87, RULE_forStatementNoShortIf = 88, 
		RULE_forInit = 89, RULE_forUpdate = 90, RULE_statementExpressionList = 91, 
		RULE_breakStatement = 92, RULE_continueStatement = 93, RULE_returnStatement = 94, 
		RULE_throwsStatement = 95, RULE_synchronizedStatement = 96, RULE_tryStatement = 97, 
		RULE_catches = 98, RULE_catchClause = 99, RULE_expression = 100, RULE_assignmentExpression = 101, 
		RULE_assignment = 102, RULE_assignmentOperator = 103, RULE_conditionalExpression = 104, 
		RULE_conditionalOrExpression = 105, RULE_conditionalAndExpression = 106, 
		RULE_inclusiveOrExpression = 107, RULE_exclusiveOrExpression = 108, RULE_andExpression = 109, 
		RULE_equalityExpression = 110, RULE_relationalExpression = 111, RULE_shiftExpression = 112, 
		RULE_additiveExpression = 113, RULE_multiplicativeExpression = 114, RULE_castExpression = 115, 
		RULE_unaryExpression = 116, RULE_unaryExpressionNotPlusMinus = 117, RULE_postdecrementExpression = 118, 
		RULE_postincrementExpression = 119, RULE_postfixExpression = 120, RULE_methodInvocation = 121, 
		RULE_primary = 122, RULE_primaryNoNewArray = 123, RULE_classInstanceCreationExpression = 124, 
		RULE_argumentList = 125, RULE_arrayCreationExpression = 126, RULE_dimExprs = 127, 
		RULE_dimExpr = 128, RULE_dims = 129, RULE_packageName = 130, RULE_typeName = 131, 
		RULE_simpleTypeName = 132, RULE_expressionName = 133, RULE_literal = 134, 
		RULE_integerLiteral = 135, RULE_floatingPointLiteral = 136, RULE_booleanLiteral = 137;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclarations", "importDeclaration", 
		"singleTypeImportDeclaration", "typeImportOnDemandDeclaration", "typeDeclarations", 
		"typeDeclaration", "classDeclaration", "classModifiers", "classModifier", 
		"superRule", "interfaces", "interfaceTypeList", "classBody", "classBodyDeclarations", 
		"classBodyDeclaration", "classMemberDeclaration", "constructorDeclaration", 
		"constructorModifiers", "constructorModifier", "constructorDeclarator", 
		"formalParameterList", "formalParameter", "classTypeList", "constructorBody", 
		"explicitConstructorInvocation", "fieldDeclaration", "fieldModifiers", 
		"fieldModifier", "variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
		"variableInitializer", "methodDeclaration", "methodHeader", "resultType", 
		"methodModifiers", "methodModifier", "methodDeclarator", "methodBody", 
		"interfaceDeclaration", "interfaceModifiers", "interfaceModifier", "extendsInterfaces", 
		"interfaceBody", "interfaceMemberDeclarations", "interfaceMemberDeclaration", 
		"constantDeclaration", "constantModifiers", "abstractMethodDeclaration", 
		"abstractMethodModifiers", "abstractMethodModifier", "arrayInitializer", 
		"variableInitializers", "type", "primitiveType", "numericType", "integralType", 
		"floatingPointType", "referenceType", "classOrInterfaceType", "classType", 
		"interfaceType", "arrayType", "block", "blockStatements", "blockStatement", 
		"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
		"statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement", 
		"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
		"statementExpression", "ifThenStatement", "switchStatement", "switchBlock", 
		"switchBlockStatementGroups", "switchBlockStatementGroup", "switchLabels", 
		"whileStatement", "whileStatementNoShortIf", "doStatement", "forStatement", 
		"forStatementNoShortIf", "forInit", "forUpdate", "statementExpressionList", 
		"breakStatement", "continueStatement", "returnStatement", "throwsStatement", 
		"synchronizedStatement", "tryStatement", "catches", "catchClause", "expression", 
		"assignmentExpression", "assignment", "assignmentOperator", "conditionalExpression", 
		"conditionalOrExpression", "conditionalAndExpression", "inclusiveOrExpression", 
		"exclusiveOrExpression", "andExpression", "equalityExpression", "relationalExpression", 
		"shiftExpression", "additiveExpression", "multiplicativeExpression", "castExpression", 
		"unaryExpression", "unaryExpressionNotPlusMinus", "postdecrementExpression", 
		"postincrementExpression", "postfixExpression", "methodInvocation", "primary", 
		"primaryNoNewArray", "classInstanceCreationExpression", "argumentList", 
		"arrayCreationExpression", "dimExprs", "dimExpr", "dims", "packageName", 
		"typeName", "simpleTypeName", "expressionName", "literal", "integerLiteral", 
		"floatingPointLiteral", "booleanLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'abstract'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", 
		"'char'", "'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", 
		"'else'", "'extends'", "'final'", "'finally'", "'float'", "'for'", "'goto'", 
		"'if'", "'implements'", "'import'", "'instanceof'", "'int'", "'interface'", 
		"'long'", "'native'", "'new'", "'package'", "'private'", "'protected'", 
		"'public'", "'return'", "'short'", "'static'", "'super'", "'switch'", 
		"'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", "'try'", 
		"'void'", "'volatile'", "'while'", "'null'", "'true'", "'false'", null, 
		"'='", "'!'", "'&'", "'|'", "'^'", "'~'", "'<'", "'>'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'=='", "'!='", "'<='", "'>='", "'*='", "'/='", "'%='", 
		"'+='", "'-='", "'&='", "'^='", "'|='", "'++'", "'--'", "'&&'", "'||'", 
		"'<<'", "'>>'", "'>>>'", "'<<='", "'>>='", "'>>>='", null, null, null, 
		null, null, null, null, null, null, null, "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "','", "':'", "'.'", "'?'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
		"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "EXTENDS", 
		"FINAL", "FINALLY", "FLOAT", "FOR", "GOTO", "IF", "IMPLEMENTS", "IMPORT", 
		"INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "SUPER", 
		"SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", 
		"VOID", "VOLATILE", "WHILE", "NULL", "TRUE", "FALSE", "ID", "OpAtribuicao", 
		"OpNOT", "OpBitAND", "OpBitOR", "OpBitXOR", "OpBitComp", "OpMenor", "OpMaior", 
		"OpSoma", "OpSub", "OpMulti", "OpDiv", "OpResto", "OpIgualdade", "OpDesigualdade", 
		"OpMenorIgual", "OpMaiorIgual", "OpMultiAtribuicao", "OpDivAtribuicao", 
		"OpRestoAtribuicao", "OpSomaAtribuicao", "OpSubAtribuicao", "OpANDAtribuicao", 
		"OpXORAtribuicao", "OpORAtribuicao", "Incremento", "Decremento", "OpAND", 
		"OpOR", "OpShitLeft", "OpShitRight", "OpShiftZeroRight", "OpLeftAtribuicao", 
		"OpRightAtribuicao", "OpRightZeroAtribuicao", "DecimalNumeral", "OctalNumeral", 
		"HexNumeral", "FloatNumeral", "DoubleNumeral", "Character", "String", 
		"Espaco", "ComentarioLinha", "ComentarioBloco", "AP", "FP", "AC", "FC", 
		"ACh", "FCh", "Virgula", "DoisPontos", "Ponto", "Interrogacao", "PontoVirgula", 
		"ERROR"
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
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportDeclarationsContext importDeclarations() {
			return getRuleContext(ImportDeclarationsContext.class,0);
		}
		public TypeDeclarationsContext typeDeclarations() {
			return getRuleContext(TypeDeclarationsContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(276);
				packageDeclaration();
				}
			}

			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORT) {
				{
				setState(279);
				importDeclarations(0);
				}
			}

			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << FINAL) | (1L << INTERFACE) | (1L << PUBLIC))) != 0) || _la==PontoVirgula) {
				{
				setState(282);
				typeDeclarations(0);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JavaParser.PACKAGE, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode PontoVirgula() { return getToken(JavaParser.PontoVirgula, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(PACKAGE);
			setState(286);
			packageName(0);
			setState(287);
			match(PontoVirgula);
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

	public static class ImportDeclarationsContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public ImportDeclarationsContext importDeclarations() {
			return getRuleContext(ImportDeclarationsContext.class,0);
		}
		public ImportDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterImportDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitImportDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitImportDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationsContext importDeclarations() throws RecognitionException {
		return importDeclarations(0);
	}

	private ImportDeclarationsContext importDeclarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ImportDeclarationsContext _localctx = new ImportDeclarationsContext(_ctx, _parentState);
		ImportDeclarationsContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_importDeclarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(290);
			importDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ImportDeclarationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_importDeclarations);
					setState(292);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(293);
					importDeclaration();
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDeclaration);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				typeImportOnDemandDeclaration();
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

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaParser.IMPORT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode PontoVirgula() { return getToken(JavaParser.PontoVirgula, 0); }
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSingleTypeImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSingleTypeImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(IMPORT);
			setState(304);
			typeName();
			setState(305);
			match(PontoVirgula);
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

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaParser.IMPORT, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode Ponto() { return getToken(JavaParser.Ponto, 0); }
		public TerminalNode OpMulti() { return getToken(JavaParser.OpMulti, 0); }
		public TerminalNode PontoVirgula() { return getToken(JavaParser.PontoVirgula, 0); }
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeImportOnDemandDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(IMPORT);
			setState(308);
			packageName(0);
			setState(309);
			match(Ponto);
			setState(310);
			match(OpMulti);
			setState(311);
			match(PontoVirgula);
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

	public static class TypeDeclarationsContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TypeDeclarationsContext typeDeclarations() {
			return getRuleContext(TypeDeclarationsContext.class,0);
		}
		public TypeDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationsContext typeDeclarations() throws RecognitionException {
		return typeDeclarations(0);
	}

	private TypeDeclarationsContext typeDeclarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeDeclarationsContext _localctx = new TypeDeclarationsContext(_ctx, _parentState);
		TypeDeclarationsContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_typeDeclarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(314);
			typeDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeDeclarationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeDeclarations);
					setState(316);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(317);
					typeDeclaration();
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode PontoVirgula() { return getToken(JavaParser.PontoVirgula, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeDeclaration);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				match(PontoVirgula);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassModifiersContext classModifiers() {
			return getRuleContext(ClassModifiersContext.class,0);
		}
		public SuperRuleContext superRule() {
			return getRuleContext(SuperRuleContext.class,0);
		}
		public InterfacesContext interfaces() {
			return getRuleContext(InterfacesContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC))) != 0)) {
				{
				setState(328);
				classModifiers(0);
				}
			}

			setState(331);
			match(CLASS);
			setState(332);
			match(ID);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(333);
				superRule();
				}
			}

			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(336);
				interfaces();
				}
			}

			setState(339);
			classBody();
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

	public static class ClassModifiersContext extends ParserRuleContext {
		public ClassModifierContext classModifier() {
			return getRuleContext(ClassModifierContext.class,0);
		}
		public ClassModifiersContext classModifiers() {
			return getRuleContext(ClassModifiersContext.class,0);
		}
		public ClassModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifiersContext classModifiers() throws RecognitionException {
		return classModifiers(0);
	}

	private ClassModifiersContext classModifiers(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClassModifiersContext _localctx = new ClassModifiersContext(_ctx, _parentState);
		ClassModifiersContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_classModifiers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(342);
			classModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ClassModifiersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_classModifiers);
					setState(344);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(345);
					classModifier();
					}
					} 
				}
				setState(350);
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

	public static class ClassModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC))) != 0)) ) {
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

	public static class SuperRuleContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSuperRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSuperRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSuperRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperRuleContext superRule() throws RecognitionException {
		SuperRuleContext _localctx = new SuperRuleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_superRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(EXTENDS);
			setState(354);
			classType();
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

	public static class InterfacesContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public InterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacesContext interfaces() throws RecognitionException {
		InterfacesContext _localctx = new InterfacesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(IMPLEMENTS);
			setState(357);
			interfaceTypeList(0);
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

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public TerminalNode Virgula() { return getToken(JavaParser.Virgula, 0); }
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		return interfaceTypeList(0);
	}

	private InterfaceTypeListContext interfaceTypeList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, _parentState);
		InterfaceTypeListContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_interfaceTypeList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(360);
			interfaceType();
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InterfaceTypeListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_interfaceTypeList);
					setState(362);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(363);
					match(Virgula);
					setState(364);
					interfaceType();
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode ACh() { return getToken(JavaParser.ACh, 0); }
		public TerminalNode FCh() { return getToken(JavaParser.FCh, 0); }
		public ClassBodyDeclarationsContext classBodyDeclarations() {
			return getRuleContext(ClassBodyDeclarationsContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(ACh);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << ID))) != 0)) {
				{
				setState(371);
				classBodyDeclarations(0);
				}
			}

			setState(374);
			match(FCh);
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

	public static class ClassBodyDeclarationsContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration() {
			return getRuleContext(ClassBodyDeclarationContext.class,0);
		}
		public ClassBodyDeclarationsContext classBodyDeclarations() {
			return getRuleContext(ClassBodyDeclarationsContext.class,0);
		}
		public ClassBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationsContext classBodyDeclarations() throws RecognitionException {
		return classBodyDeclarations(0);
	}

	private ClassBodyDeclarationsContext classBodyDeclarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClassBodyDeclarationsContext _localctx = new ClassBodyDeclarationsContext(_ctx, _parentState);
		ClassBodyDeclarationsContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_classBodyDeclarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(377);
			classBodyDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ClassBodyDeclarationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_classBodyDeclarations);
					setState(379);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(380);
					classBodyDeclaration();
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBodyDeclaration);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				constructorDeclaration();
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

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classMemberDeclaration);
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				methodDeclaration();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public ConstructorModifiersContext constructorModifiers() {
			return getRuleContext(ConstructorModifiersContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(394);
				constructorModifiers(0);
				}
			}

			setState(397);
			constructorDeclarator();
			setState(398);
			constructorBody();
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

	public static class ConstructorModifiersContext extends ParserRuleContext {
		public ConstructorModifierContext constructorModifier() {
			return getRuleContext(ConstructorModifierContext.class,0);
		}
		public ConstructorModifiersContext constructorModifiers() {
			return getRuleContext(ConstructorModifiersContext.class,0);
		}
		public ConstructorModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstructorModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorModifiersContext constructorModifiers() throws RecognitionException {
		return constructorModifiers(0);
	}

	private ConstructorModifiersContext constructorModifiers(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstructorModifiersContext _localctx = new ConstructorModifiersContext(_ctx, _parentState);
		ConstructorModifiersContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_constructorModifiers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(401);
			constructorModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstructorModifiersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constructorModifiers);
					setState(403);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(404);
					constructorModifier();
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class ConstructorModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstructorModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constructorModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
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

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstructorDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			simpleTypeName();
			setState(413);
			match(AP);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << ID))) != 0)) {
				{
				setState(414);
				formalParameterList(0);
				}
			}

			setState(417);
			match(FP);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode PontoVirgula() { return getToken(JavaParser.PontoVirgula, 0); }
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		return formalParameterList(0);
	}

	private FormalParameterListContext formalParameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, _parentState);
		FormalParameterListContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_formalParameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(420);
			formalParameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FormalParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_formalParameterList);
					setState(422);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(423);
					match(PontoVirgula);
					setState(424);
					formalParameter();
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			type(0);
			setState(431);
			variableDeclaratorId(0);
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

	public static class ClassTypeListContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ClassTypeListContext classTypeList() {
			return getRuleContext(ClassTypeListContext.class,0);
		}
		public TerminalNode Virgula() { return getToken(JavaParser.Virgula, 0); }
		public ClassTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeListContext classTypeList() throws RecognitionException {
		return classTypeList(0);
	}

	private ClassTypeListContext classTypeList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClassTypeListContext _localctx = new ClassTypeListContext(_ctx, _parentState);
		ClassTypeListContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_classTypeList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(434);
			classType();
			}
			_ctx.stop = _input.LT(-1);
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ClassTypeListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_classTypeList);
					setState(436);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(437);
					match(Virgula);
					setState(438);
					classType();
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode ACh() { return getToken(JavaParser.ACh, 0); }
		public TerminalNode FCh() { return getToken(JavaParser.FCh, 0); }
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(ACh);
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(445);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << WHILE) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpAtribuicao))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (OpMultiAtribuicao - 69)) | (1L << (OpDivAtribuicao - 69)) | (1L << (OpRestoAtribuicao - 69)) | (1L << (OpSomaAtribuicao - 69)) | (1L << (OpSubAtribuicao - 69)) | (1L << (OpANDAtribuicao - 69)) | (1L << (OpXORAtribuicao - 69)) | (1L << (OpORAtribuicao - 69)) | (1L << (OpLeftAtribuicao - 69)) | (1L << (OpRightAtribuicao - 69)) | (1L << (OpRightZeroAtribuicao - 69)) | (1L << (DecimalNumeral - 69)) | (1L << (OctalNumeral - 69)) | (1L << (HexNumeral - 69)) | (1L << (FloatNumeral - 69)) | (1L << (DoubleNumeral - 69)) | (1L << (Character - 69)) | (1L << (String - 69)) | (1L << (AP - 69)) | (1L << (ACh - 69)) | (1L << (Ponto - 69)) | (1L << (PontoVirgula - 69)))) != 0)) {
				{
				setState(448);
				blockStatements(0);
				}
			}

			setState(451);
			match(FCh);
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

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExplicitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_explicitConstructorInvocation);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				match(THIS);
				setState(454);
				match(AP);
				setState(456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(455);
					argumentList(0);
					}
					break;
				}
				setState(458);
				match(FP);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				match(SUPER);
				setState(460);
				match(AP);
				setState(462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(461);
					argumentList(0);
					}
					break;
				}
				setState(464);
				match(FP);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode PontoVirgula() { return getToken(JavaParser.PontoVirgula, 0); }
		public FieldModifiersContext fieldModifiers() {
			return getRuleContext(FieldModifiersContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) {
				{
				setState(467);
				fieldModifiers(0);
				}
			}

			setState(470);
			type(0);
			setState(471);
			variableDeclarators(0);
			setState(472);
			match(PontoVirgula);
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

	public static class FieldModifiersContext extends ParserRuleContext {
		public FieldModifierContext fieldModifier() {
			return getRuleContext(FieldModifierContext.class,0);
		}
		public FieldModifiersContext fieldModifiers() {
			return getRuleContext(FieldModifiersContext.class,0);
		}
		public FieldModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFieldModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifiersContext fieldModifiers() throws RecognitionException {
		return fieldModifiers(0);
	}

	private FieldModifiersContext fieldModifiers(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FieldModifiersContext _localctx = new FieldModifiersContext(_ctx, _parentState);
		FieldModifiersContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_fieldModifiers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(475);
			fieldModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FieldModifiersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fieldModifiers);
					setState(477);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(478);
					fieldModifier();
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class FieldModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public TerminalNode TRANSIENT() { return getToken(JavaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(JavaParser.VOLATILE, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFieldModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode Virgula() { return getToken(JavaParser.Virgula, 0); }
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		return variableDeclarators(0);
	}

	private VariableDeclaratorsContext variableDeclarators(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, _parentState);
		VariableDeclaratorsContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_variableDeclarators, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(487);
			variableDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableDeclaratorsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variableDeclarators);
					setState(489);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(490);
					match(Virgula);
					setState(491);
					variableDeclarator();
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode OpAtribuicao() { return getToken(JavaParser.OpAtribuicao, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableDeclarator);
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				variableDeclaratorId(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				variableDeclaratorId(0);
				setState(499);
				match(OpAtribuicao);
				setState(500);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode AC() { return getToken(JavaParser.AC, 0); }
		public TerminalNode FC() { return getToken(JavaParser.FC, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		return variableDeclaratorId(0);
	}

	private VariableDeclaratorIdContext variableDeclaratorId(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, _parentState);
		VariableDeclaratorIdContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_variableDeclaratorId, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(505);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableDeclaratorIdContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variableDeclaratorId);
					setState(507);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(508);
					match(AC);
					setState(509);
					match(FC);
					}
					} 
				}
				setState(514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableInitializer);
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				arrayInitializer();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			methodHeader();
			setState(520);
			methodBody();
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

	public static class MethodHeaderContext extends ParserRuleContext {
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public MethodModifiersContext methodModifiers() {
			return getRuleContext(MethodModifiersContext.class,0);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_methodHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << SYNCHRONIZED))) != 0)) {
				{
				setState(522);
				methodModifiers(0);
				}
			}

			setState(525);
			resultType();
			setState(526);
			methodDeclarator();
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

	public static class ResultTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterResultType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitResultType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitResultType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			type(0);
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

	public static class MethodModifiersContext extends ParserRuleContext {
		public MethodModifierContext methodModifier() {
			return getRuleContext(MethodModifierContext.class,0);
		}
		public MethodModifiersContext methodModifiers() {
			return getRuleContext(MethodModifiersContext.class,0);
		}
		public MethodModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifiersContext methodModifiers() throws RecognitionException {
		return methodModifiers(0);
	}

	private MethodModifiersContext methodModifiers(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MethodModifiersContext _localctx = new MethodModifiersContext(_ctx, _parentState);
		MethodModifiersContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_methodModifiers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(531);
			methodModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MethodModifiersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_methodModifiers);
					setState(533);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(534);
					methodModifier();
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class MethodModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode NATIVE() { return getToken(JavaParser.NATIVE, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_methodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << SYNCHRONIZED))) != 0)) ) {
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

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(ID);
			setState(543);
			match(AP);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << ID))) != 0)) {
				{
				setState(544);
				formalParameterList(0);
				}
			}

			setState(547);
			match(FP);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode PontoVirgula() { return getToken(JavaParser.PontoVirgula, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_methodBody);
		try {
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACh:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				block();
				}
				break;
			case PontoVirgula:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				match(PontoVirgula);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public InterfaceModifiersContext interfaceModifiers() {
			return getRuleContext(InterfaceModifiersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==PUBLIC) {
				{
				setState(553);
				interfaceModifiers(0);
				}
			}

			setState(556);
			match(INTERFACE);
			setState(557);
			match(ID);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(558);
				extendsInterfaces(0);
				}
			}

			setState(561);
			interfaceBody();
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

	public static class InterfaceModifiersContext extends ParserRuleContext {
		public InterfaceModifierContext interfaceModifier() {
			return getRuleContext(InterfaceModifierContext.class,0);
		}
		public InterfaceModifiersContext interfaceModifiers() {
			return getRuleContext(InterfaceModifiersContext.class,0);
		}
		public InterfaceModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceModifiersContext interfaceModifiers() throws RecognitionException {
		return interfaceModifiers(0);
	}

	private InterfaceModifiersContext interfaceModifiers(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InterfaceModifiersContext _localctx = new InterfaceModifiersContext(_ctx, _parentState);
		InterfaceModifiersContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_interfaceModifiers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(564);
			interfaceModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InterfaceModifiersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_interfaceModifiers);
					setState(566);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(567);
					interfaceModifier();
					}
					} 
				}
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class InterfaceModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_interfaceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_la = _input.LA(1);
			if ( !(_la==ABSTRACT || _la==PUBLIC) ) {
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

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public TerminalNode Virgula() { return getToken(JavaParser.Virgula, 0); }
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExtendsInterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExtendsInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		return extendsInterfaces(0);
	}

	private ExtendsInterfacesContext extendsInterfaces(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, _parentState);
		ExtendsInterfacesContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_extendsInterfaces, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(576);
			match(EXTENDS);
			setState(577);
			interfaceType();
			}
			_ctx.stop = _input.LT(-1);
			setState(584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExtendsInterfacesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_extendsInterfaces);
					setState(579);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(580);
					match(Virgula);
					setState(581);
					interfaceType();
					}
					} 
				}
				setState(586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode ACh() { return getToken(JavaParser.ACh, 0); }
		public TerminalNode FCh() { return getToken(JavaParser.FCh, 0); }
		public InterfaceMemberDeclarationsContext interfaceMemberDeclarations() {
			return getRuleContext(InterfaceMemberDeclarationsContext.class,0);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(ACh);
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << ID))) != 0)) {
				{
				setState(588);
				interfaceMemberDeclarations(0);
				}
			}

			setState(591);
			match(FCh);
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

	public static class InterfaceMemberDeclarationsContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationsContext interfaceMemberDeclarations() {
			return getRuleContext(InterfaceMemberDeclarationsContext.class,0);
		}
		public InterfaceMemberDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMemberDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMemberDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceMemberDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationsContext interfaceMemberDeclarations() throws RecognitionException {
		return interfaceMemberDeclarations(0);
	}

	private InterfaceMemberDeclarationsContext interfaceMemberDeclarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InterfaceMemberDeclarationsContext _localctx = new InterfaceMemberDeclarationsContext(_ctx, _parentState);
		InterfaceMemberDeclarationsContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_interfaceMemberDeclarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(594);
			interfaceMemberDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InterfaceMemberDeclarationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_interfaceMemberDeclarations);
					setState(596);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(597);
					interfaceMemberDeclaration();
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public AbstractMethodDeclarationContext abstractMethodDeclaration() {
			return getRuleContext(AbstractMethodDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_interfaceMemberDeclaration);
		try {
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				abstractMethodDeclaration();
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

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public ConstantModifiersContext constantModifiers() {
			return getRuleContext(ConstantModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			constantModifiers();
			setState(608);
			type(0);
			setState(609);
			variableDeclarator();
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

	public static class ConstantModifiersContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public ConstantModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantModifiersContext constantModifiers() throws RecognitionException {
		ConstantModifiersContext _localctx = new ConstantModifiersContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_constantModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0)) ) {
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

	public static class AbstractMethodDeclarationContext extends ParserRuleContext {
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public TerminalNode PontoVirgula() { return getToken(JavaParser.PontoVirgula, 0); }
		public AbstractMethodModifiersContext abstractMethodModifiers() {
			return getRuleContext(AbstractMethodModifiersContext.class,0);
		}
		public AbstractMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAbstractMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAbstractMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAbstractMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractMethodDeclarationContext abstractMethodDeclaration() throws RecognitionException {
		AbstractMethodDeclarationContext _localctx = new AbstractMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_abstractMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==PUBLIC) {
				{
				setState(613);
				abstractMethodModifiers(0);
				}
			}

			setState(616);
			resultType();
			setState(617);
			methodDeclarator();
			setState(618);
			match(PontoVirgula);
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

	public static class AbstractMethodModifiersContext extends ParserRuleContext {
		public AbstractMethodModifierContext abstractMethodModifier() {
			return getRuleContext(AbstractMethodModifierContext.class,0);
		}
		public AbstractMethodModifiersContext abstractMethodModifiers() {
			return getRuleContext(AbstractMethodModifiersContext.class,0);
		}
		public AbstractMethodModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractMethodModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAbstractMethodModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAbstractMethodModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAbstractMethodModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractMethodModifiersContext abstractMethodModifiers() throws RecognitionException {
		return abstractMethodModifiers(0);
	}

	private AbstractMethodModifiersContext abstractMethodModifiers(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AbstractMethodModifiersContext _localctx = new AbstractMethodModifiersContext(_ctx, _parentState);
		AbstractMethodModifiersContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_abstractMethodModifiers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(621);
			abstractMethodModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(627);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AbstractMethodModifiersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_abstractMethodModifiers);
					setState(623);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(624);
					abstractMethodModifier();
					}
					} 
				}
				setState(629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class AbstractMethodModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public AbstractMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAbstractMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAbstractMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAbstractMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractMethodModifierContext abstractMethodModifier() throws RecognitionException {
		AbstractMethodModifierContext _localctx = new AbstractMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_abstractMethodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_la = _input.LA(1);
			if ( !(_la==ABSTRACT || _la==PUBLIC) ) {
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode ACh() { return getToken(JavaParser.ACh, 0); }
		public TerminalNode Virgula() { return getToken(JavaParser.Virgula, 0); }
		public TerminalNode Interrogacao() { return getToken(JavaParser.Interrogacao, 0); }
		public TerminalNode FCh() { return getToken(JavaParser.FCh, 0); }
		public VariableInitializersContext variableInitializers() {
			return getRuleContext(VariableInitializersContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_arrayInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(ACh);
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(633);
				variableInitializers(0);
				}
				break;
			}
			setState(636);
			match(Virgula);
			setState(637);
			match(Interrogacao);
			setState(638);
			match(FCh);
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

	public static class VariableInitializersContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableInitializersContext variableInitializers() {
			return getRuleContext(VariableInitializersContext.class,0);
		}
		public TerminalNode Virgula() { return getToken(JavaParser.Virgula, 0); }
		public VariableInitializersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableInitializers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableInitializers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableInitializers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializersContext variableInitializers() throws RecognitionException {
		return variableInitializers(0);
	}

	private VariableInitializersContext variableInitializers(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariableInitializersContext _localctx = new VariableInitializersContext(_ctx, _parentState);
		VariableInitializersContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_variableInitializers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(641);
			variableInitializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(648);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableInitializersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variableInitializers);
					setState(643);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(644);
					match(Virgula);
					setState(645);
					variableInitializer();
					}
					} 
				}
				setState(650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode AC() { return getToken(JavaParser.AC, 0); }
		public TerminalNode FC() { return getToken(JavaParser.FC, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(652);
				primitiveType();
				}
				break;
			case ID:
				{
				setState(653);
				classOrInterfaceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(661);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(656);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(657);
					match(AC);
					setState(658);
					match(FC);
					}
					} 
				}
				setState(663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(JavaParser.BOOLEAN, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_primitiveType);
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				match(BOOLEAN);
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

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNumericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_numericType);
		try {
			setState(670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				floatingPointType();
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

	public static class IntegralTypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(JavaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JavaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(JavaParser.CHAR, 0); }
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitIntegralType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitIntegralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
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

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(JavaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaParser.DOUBLE, 0); }
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFloatingPointType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFloatingPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_referenceType);
		try {
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				arrayType();
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_classOrInterfaceType);
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				interfaceType();
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			typeName();
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

	public static class InterfaceTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			typeName();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode AC() { return getToken(JavaParser.AC, 0); }
		public TerminalNode FC() { return getToken(JavaParser.FC, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			type(0);
			setState(689);
			match(AC);
			setState(690);
			match(FC);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode ACh() { return getToken(JavaParser.ACh, 0); }
		public TerminalNode FCh() { return getToken(JavaParser.FCh, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(ACh);
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << WHILE) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpAtribuicao))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (OpMultiAtribuicao - 69)) | (1L << (OpDivAtribuicao - 69)) | (1L << (OpRestoAtribuicao - 69)) | (1L << (OpSomaAtribuicao - 69)) | (1L << (OpSubAtribuicao - 69)) | (1L << (OpANDAtribuicao - 69)) | (1L << (OpXORAtribuicao - 69)) | (1L << (OpORAtribuicao - 69)) | (1L << (OpLeftAtribuicao - 69)) | (1L << (OpRightAtribuicao - 69)) | (1L << (OpRightZeroAtribuicao - 69)) | (1L << (DecimalNumeral - 69)) | (1L << (OctalNumeral - 69)) | (1L << (HexNumeral - 69)) | (1L << (FloatNumeral - 69)) | (1L << (DoubleNumeral - 69)) | (1L << (Character - 69)) | (1L << (String - 69)) | (1L << (AP - 69)) | (1L << (ACh - 69)) | (1L << (Ponto - 69)) | (1L << (PontoVirgula - 69)))) != 0)) {
				{
				setState(693);
				blockStatements(0);
				}
			}

			setState(696);
			match(FCh);
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

	public static class BlockStatementsContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		return blockStatements(0);
	}

	private BlockStatementsContext blockStatements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, _parentState);
		BlockStatementsContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_blockStatements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(699);
			blockStatement();
			}
			_ctx.stop = _input.LT(-1);
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockStatementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockStatements);
					setState(701);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(702);
					blockStatement();
					}
					} 
				}
				setState(707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_blockStatement);
		try {
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				statement();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			localVariableDeclaration();
			setState(713);
			match(PontoVirgula);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			type(0);
			setState(716);
			variableDeclarators(0);
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
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_statement);
		try {
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(720);
				ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(721);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(722);
				forStatement();
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

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_statementNoShortIf);
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
				whileStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(728);
				forStatementNoShortIf();
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

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowsStatementContext throwsStatement() {
			return getRuleContext(ThrowsStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitStatementWithoutTrailingSubstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACh:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				block();
				}
				break;
			case PontoVirgula:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				emptyStatement();
				}
				break;
			case NEW:
			case SUPER:
			case THIS:
			case NULL:
			case TRUE:
			case FALSE:
			case ID:
			case OpAtribuicao:
			case OpMultiAtribuicao:
			case OpDivAtribuicao:
			case OpRestoAtribuicao:
			case OpSomaAtribuicao:
			case OpSubAtribuicao:
			case OpANDAtribuicao:
			case OpXORAtribuicao:
			case OpORAtribuicao:
			case OpLeftAtribuicao:
			case OpRightAtribuicao:
			case OpRightZeroAtribuicao:
			case DecimalNumeral:
			case OctalNumeral:
			case HexNumeral:
			case FloatNumeral:
			case DoubleNumeral:
			case Character:
			case String:
			case AP:
			case Ponto:
				enterOuterAlt(_localctx, 3);
				{
				setState(733);
				expressionStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(734);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(735);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 6);
				{
				setState(736);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(737);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(738);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 9);
				{
				setState(739);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 10);
				{
				setState(740);
				throwsStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 11);
				{
				setState(741);
				tryStatement();
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode PontoVirgula() { return getToken(JavaParser.PontoVirgula, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(PontoVirgula);
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode DoisPontos() { return getToken(JavaParser.DoisPontos, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(ID);
			setState(747);
			match(DoisPontos);
			setState(748);
			statement();
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

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode DoisPontos() { return getToken(JavaParser.DoisPontos, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLabeledStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLabeledStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(ID);
			setState(751);
			match(DoisPontos);
			setState(752);
			statementNoShortIf();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode PontoVirgula() { return getToken(JavaParser.PontoVirgula, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			statementExpression();
			setState(755);
			match(PontoVirgula);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PostincrementExpressionContext postincrementExpression() {
			return getRuleContext(PostincrementExpressionContext.class,0);
		}
		public PostdecrementExpressionContext postdecrementExpression() {
			return getRuleContext(PostdecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_statementExpression);
		try {
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				postincrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(759);
				postdecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(760);
				methodInvocation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(761);
				classInstanceCreationExpression();
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

	public static class IfThenStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitIfThenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitIfThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(IF);
			setState(765);
			match(AP);
			setState(766);
			expression();
			setState(767);
			match(FP);
			setState(768);
			statement();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(SWITCH);
			setState(771);
			match(AP);
			setState(772);
			expression();
			setState(773);
			match(FP);
			setState(774);
			switchBlock();
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

	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode ACh() { return getToken(JavaParser.ACh, 0); }
		public TerminalNode FCh() { return getToken(JavaParser.FCh, 0); }
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,0);
		}
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(ACh);
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(777);
				switchBlockStatementGroups(0);
				}
				break;
			}
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SWITCH) {
				{
				setState(780);
				switchLabels();
				}
			}

			setState(783);
			match(FCh);
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

	public static class SwitchBlockStatementGroupsContext extends ParserRuleContext {
		public SwitchBlockStatementGroupContext switchBlockStatementGroup() {
			return getRuleContext(SwitchBlockStatementGroupContext.class,0);
		}
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,0);
		}
		public SwitchBlockStatementGroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroups; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchBlockStatementGroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchBlockStatementGroups(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchBlockStatementGroups(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupsContext switchBlockStatementGroups() throws RecognitionException {
		return switchBlockStatementGroups(0);
	}

	private SwitchBlockStatementGroupsContext switchBlockStatementGroups(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, _parentState);
		SwitchBlockStatementGroupsContext _prevctx = _localctx;
		int _startState = 162;
		enterRecursionRule(_localctx, 162, RULE_switchBlockStatementGroups, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(786);
			switchBlockStatementGroup();
			}
			_ctx.stop = _input.LT(-1);
			setState(792);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SwitchBlockStatementGroupsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_switchBlockStatementGroups);
					setState(788);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(789);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			switchLabels();
			setState(796);
			blockStatements(0);
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

	public static class SwitchLabelsContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_switchLabels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(SWITCH);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(WHILE);
			setState(801);
			match(AP);
			setState(802);
			expression();
			setState(803);
			match(FP);
			setState(804);
			statement();
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

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitWhileStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitWhileStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(WHILE);
			setState(807);
			match(AP);
			setState(808);
			expression();
			setState(809);
			match(FP);
			setState(810);
			statementNoShortIf();
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

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(JavaParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public TerminalNode PontoVirgula() { return getToken(JavaParser.PontoVirgula, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(DO);
			setState(813);
			statement();
			setState(814);
			match(WHILE);
			setState(815);
			match(AP);
			setState(816);
			expression();
			setState(817);
			match(FP);
			setState(818);
			match(PontoVirgula);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public List<TerminalNode> PontoVirgula() { return getTokens(JavaParser.PontoVirgula); }
		public TerminalNode PontoVirgula(int i) {
			return getToken(JavaParser.PontoVirgula, i);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(FOR);
			setState(821);
			match(AP);
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpAtribuicao))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (OpMultiAtribuicao - 69)) | (1L << (OpDivAtribuicao - 69)) | (1L << (OpRestoAtribuicao - 69)) | (1L << (OpSomaAtribuicao - 69)) | (1L << (OpSubAtribuicao - 69)) | (1L << (OpANDAtribuicao - 69)) | (1L << (OpXORAtribuicao - 69)) | (1L << (OpORAtribuicao - 69)) | (1L << (OpLeftAtribuicao - 69)) | (1L << (OpRightAtribuicao - 69)) | (1L << (OpRightZeroAtribuicao - 69)) | (1L << (DecimalNumeral - 69)) | (1L << (OctalNumeral - 69)) | (1L << (HexNumeral - 69)) | (1L << (FloatNumeral - 69)) | (1L << (DoubleNumeral - 69)) | (1L << (Character - 69)) | (1L << (String - 69)) | (1L << (AP - 69)) | (1L << (Ponto - 69)))) != 0)) {
				{
				setState(822);
				forInit();
				}
			}

			setState(825);
			match(PontoVirgula);
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(826);
				expression();
				}
				break;
			}
			setState(829);
			match(PontoVirgula);
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpAtribuicao))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (OpMultiAtribuicao - 69)) | (1L << (OpDivAtribuicao - 69)) | (1L << (OpRestoAtribuicao - 69)) | (1L << (OpSomaAtribuicao - 69)) | (1L << (OpSubAtribuicao - 69)) | (1L << (OpANDAtribuicao - 69)) | (1L << (OpXORAtribuicao - 69)) | (1L << (OpORAtribuicao - 69)) | (1L << (OpLeftAtribuicao - 69)) | (1L << (OpRightAtribuicao - 69)) | (1L << (OpRightZeroAtribuicao - 69)) | (1L << (DecimalNumeral - 69)) | (1L << (OctalNumeral - 69)) | (1L << (HexNumeral - 69)) | (1L << (FloatNumeral - 69)) | (1L << (DoubleNumeral - 69)) | (1L << (Character - 69)) | (1L << (String - 69)) | (1L << (AP - 69)) | (1L << (Ponto - 69)))) != 0)) {
				{
				setState(830);
				forUpdate();
				}
			}

			setState(833);
			match(FP);
			setState(834);
			statement();
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

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public List<TerminalNode> PontoVirgula() { return getTokens(JavaParser.PontoVirgula); }
		public TerminalNode PontoVirgula(int i) {
			return getToken(JavaParser.PontoVirgula, i);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_forStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(FOR);
			setState(837);
			match(AP);
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpAtribuicao))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (OpMultiAtribuicao - 69)) | (1L << (OpDivAtribuicao - 69)) | (1L << (OpRestoAtribuicao - 69)) | (1L << (OpSomaAtribuicao - 69)) | (1L << (OpSubAtribuicao - 69)) | (1L << (OpANDAtribuicao - 69)) | (1L << (OpXORAtribuicao - 69)) | (1L << (OpORAtribuicao - 69)) | (1L << (OpLeftAtribuicao - 69)) | (1L << (OpRightAtribuicao - 69)) | (1L << (OpRightZeroAtribuicao - 69)) | (1L << (DecimalNumeral - 69)) | (1L << (OctalNumeral - 69)) | (1L << (HexNumeral - 69)) | (1L << (FloatNumeral - 69)) | (1L << (DoubleNumeral - 69)) | (1L << (Character - 69)) | (1L << (String - 69)) | (1L << (AP - 69)) | (1L << (Ponto - 69)))) != 0)) {
				{
				setState(838);
				forInit();
				}
			}

			setState(841);
			match(PontoVirgula);
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(842);
				expression();
				}
				break;
			}
			setState(845);
			match(PontoVirgula);
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpAtribuicao))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (OpMultiAtribuicao - 69)) | (1L << (OpDivAtribuicao - 69)) | (1L << (OpRestoAtribuicao - 69)) | (1L << (OpSomaAtribuicao - 69)) | (1L << (OpSubAtribuicao - 69)) | (1L << (OpANDAtribuicao - 69)) | (1L << (OpXORAtribuicao - 69)) | (1L << (OpORAtribuicao - 69)) | (1L << (OpLeftAtribuicao - 69)) | (1L << (OpRightAtribuicao - 69)) | (1L << (OpRightZeroAtribuicao - 69)) | (1L << (DecimalNumeral - 69)) | (1L << (OctalNumeral - 69)) | (1L << (HexNumeral - 69)) | (1L << (FloatNumeral - 69)) | (1L << (DoubleNumeral - 69)) | (1L << (Character - 69)) | (1L << (String - 69)) | (1L << (AP - 69)) | (1L << (Ponto - 69)))) != 0)) {
				{
				setState(846);
				forUpdate();
				}
			}

			setState(849);
			match(FP);
			setState(850);
			statementNoShortIf();
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

	public static class ForInitContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_forInit);
		try {
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				statementExpressionList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				localVariableDeclaration();
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

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			statementExpressionList(0);
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

	public static class StatementExpressionListContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public TerminalNode Virgula() { return getToken(JavaParser.Virgula, 0); }
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatementExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitStatementExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		return statementExpressionList(0);
	}

	private StatementExpressionListContext statementExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, _parentState);
		StatementExpressionListContext _prevctx = _localctx;
		int _startState = 182;
		enterRecursionRule(_localctx, 182, RULE_statementExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(859);
			statementExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(866);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementExpressionList);
					setState(861);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(862);
					match(Virgula);
					setState(863);
					statementExpression();
					}
					} 
				}
				setState(868);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(JavaParser.BREAK, 0); }
		public TerminalNode PontoVirgula() { return getToken(JavaParser.PontoVirgula, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(BREAK);
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(870);
				match(ID);
				}
			}

			setState(873);
			match(PontoVirgula);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(JavaParser.CONTINUE, 0); }
		public TerminalNode PontoVirgula() { return getToken(JavaParser.PontoVirgula, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(CONTINUE);
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(876);
				match(ID);
				}
			}

			setState(879);
			match(PontoVirgula);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
		public TerminalNode PontoVirgula() { return getToken(JavaParser.PontoVirgula, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(RETURN);
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(882);
				expression();
				}
				break;
			}
			setState(885);
			match(PontoVirgula);
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

	public static class ThrowsStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(JavaParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PontoVirgula() { return getToken(JavaParser.PontoVirgula, 0); }
		public ThrowsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterThrowsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitThrowsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitThrowsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowsStatementContext throwsStatement() throws RecognitionException {
		ThrowsStatementContext _localctx = new ThrowsStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_throwsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(THROW);
			setState(888);
			expression();
			setState(889);
			match(PontoVirgula);
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

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSynchronizedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(SYNCHRONIZED);
			setState(892);
			match(AP);
			setState(893);
			expression();
			setState(894);
			match(FP);
			setState(895);
			block();
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

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(JavaParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_tryStatement);
		try {
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(897);
				match(TRY);
				setState(898);
				block();
				setState(899);
				catches(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				match(TRY);
				setState(902);
				block();
				setState(904);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(903);
					catches(0);
					}
					break;
				}
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

	public static class CatchesContext extends ParserRuleContext {
		public CatchClauseContext catchClause() {
			return getRuleContext(CatchClauseContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		return catches(0);
	}

	private CatchesContext catches(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CatchesContext _localctx = new CatchesContext(_ctx, _parentState);
		CatchesContext _prevctx = _localctx;
		int _startState = 196;
		enterRecursionRule(_localctx, 196, RULE_catches, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(909);
			catchClause();
			}
			_ctx.stop = _input.LT(-1);
			setState(915);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CatchesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_catches);
					setState(911);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(912);
					catchClause();
					}
					} 
				}
				setState(917);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(JavaParser.CATCH, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			match(CATCH);
			setState(919);
			match(AP);
			setState(920);
			formalParameter();
			setState(921);
			match(FP);
			setState(922);
			block();
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			assignmentExpression();
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_assignmentExpression);
		try {
			setState(928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				assignment();
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			assignmentOperator();
			setState(931);
			assignmentExpression();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode OpAtribuicao() { return getToken(JavaParser.OpAtribuicao, 0); }
		public TerminalNode OpMultiAtribuicao() { return getToken(JavaParser.OpMultiAtribuicao, 0); }
		public TerminalNode OpDivAtribuicao() { return getToken(JavaParser.OpDivAtribuicao, 0); }
		public TerminalNode OpRestoAtribuicao() { return getToken(JavaParser.OpRestoAtribuicao, 0); }
		public TerminalNode OpSomaAtribuicao() { return getToken(JavaParser.OpSomaAtribuicao, 0); }
		public TerminalNode OpSubAtribuicao() { return getToken(JavaParser.OpSubAtribuicao, 0); }
		public TerminalNode OpLeftAtribuicao() { return getToken(JavaParser.OpLeftAtribuicao, 0); }
		public TerminalNode OpRightAtribuicao() { return getToken(JavaParser.OpRightAtribuicao, 0); }
		public TerminalNode OpRightZeroAtribuicao() { return getToken(JavaParser.OpRightZeroAtribuicao, 0); }
		public TerminalNode OpANDAtribuicao() { return getToken(JavaParser.OpANDAtribuicao, 0); }
		public TerminalNode OpXORAtribuicao() { return getToken(JavaParser.OpXORAtribuicao, 0); }
		public TerminalNode OpORAtribuicao() { return getToken(JavaParser.OpORAtribuicao, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (OpAtribuicao - 52)) | (1L << (OpMultiAtribuicao - 52)) | (1L << (OpDivAtribuicao - 52)) | (1L << (OpRestoAtribuicao - 52)) | (1L << (OpSomaAtribuicao - 52)) | (1L << (OpSubAtribuicao - 52)) | (1L << (OpANDAtribuicao - 52)) | (1L << (OpXORAtribuicao - 52)) | (1L << (OpORAtribuicao - 52)) | (1L << (OpLeftAtribuicao - 52)) | (1L << (OpRightAtribuicao - 52)) | (1L << (OpRightZeroAtribuicao - 52)))) != 0)) ) {
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode Interrogacao() { return getToken(JavaParser.Interrogacao, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DoisPontos() { return getToken(JavaParser.DoisPontos, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_conditionalExpression);
		try {
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				conditionalOrExpression(0);
				setState(937);
				match(Interrogacao);
				setState(938);
				expression();
				setState(939);
				match(DoisPontos);
				setState(940);
				conditionalExpression();
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode OpOR() { return getToken(JavaParser.OpOR, 0); }
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 210;
		enterRecursionRule(_localctx, 210, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(945);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(952);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(947);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(948);
					match(OpOR);
					setState(949);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(954);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public TerminalNode OpAND() { return getToken(JavaParser.OpAND, 0); }
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 212;
		enterRecursionRule(_localctx, 212, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(956);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(963);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(958);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(959);
					match(OpAND);
					setState(960);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode OpBitOR() { return getToken(JavaParser.OpBitOR, 0); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 214;
		enterRecursionRule(_localctx, 214, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(967);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(974);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(969);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(970);
					match(OpBitOR);
					setState(971);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(976);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode OpBitXOR() { return getToken(JavaParser.OpBitXOR, 0); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 216;
		enterRecursionRule(_localctx, 216, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(978);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(985);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(980);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(981);
					match(OpBitXOR);
					setState(982);
					andExpression(0);
					}
					} 
				}
				setState(987);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode OpBitAND() { return getToken(JavaParser.OpBitAND, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 218;
		enterRecursionRule(_localctx, 218, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(989);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(996);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(991);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(992);
					match(OpBitAND);
					setState(993);
					equalityExpression(0);
					}
					} 
				}
				setState(998);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode OpIgualdade() { return getToken(JavaParser.OpIgualdade, 0); }
		public TerminalNode OpDesigualdade() { return getToken(JavaParser.OpDesigualdade, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 220;
		enterRecursionRule(_localctx, 220, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1000);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1010);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1008);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(1002);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1003);
						match(OpIgualdade);
						setState(1004);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(1005);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1006);
						match(OpDesigualdade);
						setState(1007);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(1012);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode OpMenor() { return getToken(JavaParser.OpMenor, 0); }
		public TerminalNode OpMaior() { return getToken(JavaParser.OpMaior, 0); }
		public TerminalNode OpMenorIgual() { return getToken(JavaParser.OpMenorIgual, 0); }
		public TerminalNode OpMaiorIgual() { return getToken(JavaParser.OpMaiorIgual, 0); }
		public TerminalNode INSTANCEOF() { return getToken(JavaParser.INSTANCEOF, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 222;
		enterRecursionRule(_localctx, 222, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1014);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1033);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1031);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1016);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1017);
						match(OpMenor);
						setState(1018);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1019);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1020);
						match(OpMaior);
						setState(1021);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1022);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1023);
						match(OpMenorIgual);
						setState(1024);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1025);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1026);
						match(OpMaiorIgual);
						setState(1027);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1028);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1029);
						match(INSTANCEOF);
						setState(1030);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(1035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode OpShitLeft() { return getToken(JavaParser.OpShitLeft, 0); }
		public TerminalNode OpShitRight() { return getToken(JavaParser.OpShitRight, 0); }
		public TerminalNode OpShiftZeroRight() { return getToken(JavaParser.OpShiftZeroRight, 0); }
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 224;
		enterRecursionRule(_localctx, 224, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1037);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1050);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1048);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(1039);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1040);
						match(OpShitLeft);
						setState(1041);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(1042);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1043);
						match(OpShitRight);
						setState(1044);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(1045);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1046);
						match(OpShiftZeroRight);
						setState(1047);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(1052);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode OpSoma() { return getToken(JavaParser.OpSoma, 0); }
		public TerminalNode OpSub() { return getToken(JavaParser.OpSub, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 226;
		enterRecursionRule(_localctx, 226, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1054);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1064);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1062);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(1056);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1057);
						match(OpSoma);
						setState(1058);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(1059);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1060);
						match(OpSub);
						setState(1061);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(1066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode OpMulti() { return getToken(JavaParser.OpMulti, 0); }
		public TerminalNode OpDiv() { return getToken(JavaParser.OpDiv, 0); }
		public TerminalNode OpResto() { return getToken(JavaParser.OpResto, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 228;
		enterRecursionRule(_localctx, 228, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1068);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1081);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1079);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1070);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1071);
						match(OpMulti);
						setState(1072);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1073);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1074);
						match(OpDiv);
						setState(1075);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1076);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1077);
						match(OpResto);
						setState(1078);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(1083);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_castExpression);
		try {
			setState(1094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1084);
				match(AP);
				setState(1085);
				primitiveType();
				setState(1086);
				match(FP);
				setState(1087);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
				match(AP);
				setState(1090);
				referenceType();
				setState(1091);
				match(FP);
				setState(1092);
				unaryExpressionNotPlusMinus();
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode OpSoma() { return getToken(JavaParser.OpSoma, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode OpSub() { return getToken(JavaParser.OpSub, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_unaryExpression);
		try {
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1097);
				match(OpSoma);
				setState(1098);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1099);
				match(OpSub);
				setState(1100);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1101);
				unaryExpressionNotPlusMinus();
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

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode OpBitComp() { return getToken(JavaParser.OpBitComp, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode OpNOT() { return getToken(JavaParser.OpNOT, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1104);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1105);
				match(OpBitComp);
				setState(1106);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1107);
				match(OpNOT);
				setState(1108);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1109);
				castExpression();
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

	public static class PostdecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Decremento() { return getToken(JavaParser.Decremento, 0); }
		public PostdecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postdecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPostdecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPostdecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPostdecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostdecrementExpressionContext postdecrementExpression() throws RecognitionException {
		PostdecrementExpressionContext _localctx = new PostdecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_postdecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			postfixExpression(0);
			setState(1113);
			match(Decremento);
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

	public static class PostincrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Incremento() { return getToken(JavaParser.Incremento, 0); }
		public PostincrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postincrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPostincrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPostincrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPostincrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostincrementExpressionContext postincrementExpression() throws RecognitionException {
		PostincrementExpressionContext _localctx = new PostincrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_postincrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			postfixExpression(0);
			setState(1116);
			match(Incremento);
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Incremento() { return getToken(JavaParser.Incremento, 0); }
		public TerminalNode Decremento() { return getToken(JavaParser.Decremento, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 240;
		enterRecursionRule(_localctx, 240, RULE_postfixExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(1119);
				primary(0);
				}
				break;
			case 2:
				{
				setState(1120);
				expressionName();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(1123);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1124);
						match(Incremento);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(1125);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1126);
						match(Decremento);
						}
						break;
					}
					} 
				}
				setState(1131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
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

	public static class MethodInvocationContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode Ponto() { return getToken(JavaParser.Ponto, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_methodInvocation);
		try {
			setState(1154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1132);
				match(AP);
				setState(1134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1133);
					argumentList(0);
					}
					break;
				}
				setState(1136);
				match(FP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1137);
				primary(0);
				setState(1138);
				match(Ponto);
				setState(1139);
				match(ID);
				setState(1140);
				match(AP);
				setState(1142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(1141);
					argumentList(0);
					}
					break;
				}
				setState(1144);
				match(FP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1146);
				match(SUPER);
				setState(1147);
				match(Ponto);
				setState(1148);
				match(ID);
				setState(1149);
				match(AP);
				setState(1151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1150);
					argumentList(0);
					}
					break;
				}
				setState(1153);
				match(FP);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public TerminalNode Ponto() { return getToken(JavaParser.Ponto, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public PrimaryNoNewArrayContext primaryNoNewArray() {
			return getRuleContext(PrimaryNoNewArrayContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		return primary(0);
	}

	private PrimaryContext primary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryContext _localctx = new PrimaryContext(_ctx, _parentState);
		PrimaryContext _prevctx = _localctx;
		int _startState = 244;
		enterRecursionRule(_localctx, 244, RULE_primary, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1157);
				match(AP);
				setState(1159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1158);
					argumentList(0);
					}
					break;
				}
				setState(1161);
				match(FP);
				}
				break;
			case 2:
				{
				setState(1162);
				match(SUPER);
				setState(1163);
				match(Ponto);
				setState(1164);
				match(ID);
				setState(1165);
				match(AP);
				setState(1167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1166);
					argumentList(0);
					}
					break;
				}
				setState(1169);
				match(FP);
				}
				break;
			case 3:
				{
				setState(1170);
				primaryNoNewArray(0);
				}
				break;
			case 4:
				{
				setState(1171);
				match(SUPER);
				setState(1172);
				match(Ponto);
				setState(1173);
				match(ID);
				}
				break;
			case 5:
				{
				setState(1174);
				arrayCreationExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primary);
						setState(1177);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1178);
						match(Ponto);
						setState(1179);
						match(ID);
						setState(1180);
						match(AP);
						setState(1182);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
						case 1:
							{
							setState(1181);
							argumentList(0);
							}
							break;
						}
						setState(1184);
						match(FP);
						}
						break;
					case 2:
						{
						_localctx = new PrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primary);
						setState(1185);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1186);
						match(Ponto);
						setState(1187);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(1192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
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

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode AC() { return getToken(JavaParser.AC, 0); }
		public TerminalNode FC() { return getToken(JavaParser.FC, 0); }
		public PrimaryNoNewArrayContext primaryNoNewArray() {
			return getRuleContext(PrimaryNoNewArrayContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimaryNoNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPrimaryNoNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		return primaryNoNewArray(0);
	}

	private PrimaryNoNewArrayContext primaryNoNewArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, _parentState);
		PrimaryNoNewArrayContext _prevctx = _localctx;
		int _startState = 246;
		enterRecursionRule(_localctx, 246, RULE_primaryNoNewArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case TRUE:
			case FALSE:
			case DecimalNumeral:
			case OctalNumeral:
			case HexNumeral:
			case FloatNumeral:
			case DoubleNumeral:
			case Character:
			case String:
				{
				setState(1194);
				literal();
				}
				break;
			case THIS:
				{
				setState(1195);
				match(THIS);
				}
				break;
			case AP:
				{
				setState(1196);
				match(AP);
				setState(1197);
				expression();
				setState(1198);
				match(FP);
				}
				break;
			case NEW:
				{
				setState(1200);
				classInstanceCreationExpression();
				}
				break;
			case ID:
			case Ponto:
				{
				setState(1201);
				expressionName();
				setState(1202);
				match(AC);
				setState(1203);
				expression();
				setState(1204);
				match(FC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryNoNewArrayContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryNoNewArray);
					setState(1208);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1209);
					match(AC);
					setState(1210);
					expression();
					setState(1211);
					match(FC);
					}
					} 
				}
				setState(1217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassInstanceCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassInstanceCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_classInstanceCreationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			match(NEW);
			setState(1219);
			classType();
			setState(1220);
			match(AP);
			setState(1222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1221);
				argumentList(0);
				}
				break;
			}
			setState(1224);
			match(FP);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode Virgula() { return getToken(JavaParser.Virgula, 0); }
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		return argumentList(0);
	}

	private ArgumentListContext argumentList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, _parentState);
		ArgumentListContext _prevctx = _localctx;
		int _startState = 250;
		enterRecursionRule(_localctx, 250, RULE_argumentList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1227);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentList);
					setState(1229);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1230);
					match(Virgula);
					setState(1231);
					expression();
					}
					} 
				}
				setState(1236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
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

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_arrayCreationExpression);
		try {
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1237);
				match(NEW);
				setState(1238);
				primitiveType();
				setState(1239);
				dimExprs(0);
				setState(1241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1240);
					dims(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1243);
				match(NEW);
				setState(1244);
				classOrInterfaceType();
				setState(1245);
				dimExprs(0);
				setState(1247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1246);
					dims(0);
					}
					break;
				}
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

	public static class DimExprsContext extends ParserRuleContext {
		public DimExprContext dimExpr() {
			return getRuleContext(DimExprContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDimExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		return dimExprs(0);
	}

	private DimExprsContext dimExprs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DimExprsContext _localctx = new DimExprsContext(_ctx, _parentState);
		DimExprsContext _prevctx = _localctx;
		int _startState = 254;
		enterRecursionRule(_localctx, 254, RULE_dimExprs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1252);
			dimExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(1258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DimExprsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dimExprs);
					setState(1254);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1255);
					dimExpr();
					}
					} 
				}
				setState(1260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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

	public static class DimExprContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(JavaParser.AC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FC() { return getToken(JavaParser.FC, 0); }
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDimExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitDimExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_dimExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			match(AC);
			setState(1262);
			expression();
			setState(1263);
			match(FC);
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

	public static class DimsContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(JavaParser.AC, 0); }
		public TerminalNode FC() { return getToken(JavaParser.FC, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		return dims(0);
	}

	private DimsContext dims(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DimsContext _localctx = new DimsContext(_ctx, _parentState);
		DimsContext _prevctx = _localctx;
		int _startState = 258;
		enterRecursionRule(_localctx, 258, RULE_dims, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1266);
			match(AC);
			setState(1267);
			match(FC);
			}
			_ctx.stop = _input.LT(-1);
			setState(1274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DimsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dims);
					setState(1269);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1270);
					match(AC);
					setState(1271);
					match(FC);
					}
					} 
				}
				setState(1276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode Ponto() { return getToken(JavaParser.Ponto, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPackageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 260;
		enterRecursionRule(_localctx, 260, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1278);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(1285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(1280);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1281);
					match(Ponto);
					setState(1282);
					match(ID);
					}
					} 
				}
				setState(1287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode Ponto() { return getToken(JavaParser.Ponto, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_typeName);
		try {
			setState(1293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1288);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1289);
				packageName(0);
				setState(1290);
				match(Ponto);
				setState(1291);
				match(ID);
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

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSimpleTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSimpleTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
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

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode Ponto() { return getToken(JavaParser.Ponto, 0); }
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpressionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_expressionName);
		try {
			setState(1300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1297);
				match(ID);
				}
				break;
			case Ponto:
				enterOuterAlt(_localctx, 2);
				{
				setState(1298);
				match(Ponto);
				setState(1299);
				match(ID);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatingPointLiteralContext floatingPointLiteral() {
			return getRuleContext(FloatingPointLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode Character() { return getToken(JavaParser.Character, 0); }
		public TerminalNode String() { return getToken(JavaParser.String, 0); }
		public TerminalNode NULL() { return getToken(JavaParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_literal);
		try {
			setState(1308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DecimalNumeral:
			case OctalNumeral:
			case HexNumeral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1302);
				integerLiteral();
				}
				break;
			case FloatNumeral:
			case DoubleNumeral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1303);
				floatingPointLiteral();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1304);
				booleanLiteral();
				}
				break;
			case Character:
				enterOuterAlt(_localctx, 4);
				{
				setState(1305);
				match(Character);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 5);
				{
				setState(1306);
				match(String);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1307);
				match(NULL);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumeral() { return getToken(JavaParser.DecimalNumeral, 0); }
		public TerminalNode HexNumeral() { return getToken(JavaParser.HexNumeral, 0); }
		public TerminalNode OctalNumeral() { return getToken(JavaParser.OctalNumeral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (DecimalNumeral - 87)) | (1L << (OctalNumeral - 87)) | (1L << (HexNumeral - 87)))) != 0)) ) {
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

	public static class FloatingPointLiteralContext extends ParserRuleContext {
		public TerminalNode FloatNumeral() { return getToken(JavaParser.FloatNumeral, 0); }
		public TerminalNode DoubleNumeral() { return getToken(JavaParser.DoubleNumeral, 0); }
		public FloatingPointLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFloatingPointLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFloatingPointLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFloatingPointLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointLiteralContext floatingPointLiteral() throws RecognitionException {
		FloatingPointLiteralContext _localctx = new FloatingPointLiteralContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_floatingPointLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			_la = _input.LA(1);
			if ( !(_la==FloatNumeral || _la==DoubleNumeral) ) {
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(JavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JavaParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return importDeclarations_sempred((ImportDeclarationsContext)_localctx, predIndex);
		case 6:
			return typeDeclarations_sempred((TypeDeclarationsContext)_localctx, predIndex);
		case 9:
			return classModifiers_sempred((ClassModifiersContext)_localctx, predIndex);
		case 13:
			return interfaceTypeList_sempred((InterfaceTypeListContext)_localctx, predIndex);
		case 15:
			return classBodyDeclarations_sempred((ClassBodyDeclarationsContext)_localctx, predIndex);
		case 19:
			return constructorModifiers_sempred((ConstructorModifiersContext)_localctx, predIndex);
		case 22:
			return formalParameterList_sempred((FormalParameterListContext)_localctx, predIndex);
		case 24:
			return classTypeList_sempred((ClassTypeListContext)_localctx, predIndex);
		case 28:
			return fieldModifiers_sempred((FieldModifiersContext)_localctx, predIndex);
		case 30:
			return variableDeclarators_sempred((VariableDeclaratorsContext)_localctx, predIndex);
		case 32:
			return variableDeclaratorId_sempred((VariableDeclaratorIdContext)_localctx, predIndex);
		case 37:
			return methodModifiers_sempred((MethodModifiersContext)_localctx, predIndex);
		case 42:
			return interfaceModifiers_sempred((InterfaceModifiersContext)_localctx, predIndex);
		case 44:
			return extendsInterfaces_sempred((ExtendsInterfacesContext)_localctx, predIndex);
		case 46:
			return interfaceMemberDeclarations_sempred((InterfaceMemberDeclarationsContext)_localctx, predIndex);
		case 51:
			return abstractMethodModifiers_sempred((AbstractMethodModifiersContext)_localctx, predIndex);
		case 54:
			return variableInitializers_sempred((VariableInitializersContext)_localctx, predIndex);
		case 55:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 66:
			return blockStatements_sempred((BlockStatementsContext)_localctx, predIndex);
		case 81:
			return switchBlockStatementGroups_sempred((SwitchBlockStatementGroupsContext)_localctx, predIndex);
		case 91:
			return statementExpressionList_sempred((StatementExpressionListContext)_localctx, predIndex);
		case 98:
			return catches_sempred((CatchesContext)_localctx, predIndex);
		case 105:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 106:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 107:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 108:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 109:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 110:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 111:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 112:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 113:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 114:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 120:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 122:
			return primary_sempred((PrimaryContext)_localctx, predIndex);
		case 123:
			return primaryNoNewArray_sempred((PrimaryNoNewArrayContext)_localctx, predIndex);
		case 125:
			return argumentList_sempred((ArgumentListContext)_localctx, predIndex);
		case 127:
			return dimExprs_sempred((DimExprsContext)_localctx, predIndex);
		case 129:
			return dims_sempred((DimsContext)_localctx, predIndex);
		case 130:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean importDeclarations_sempred(ImportDeclarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeDeclarations_sempred(TypeDeclarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean classModifiers_sempred(ClassModifiersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean interfaceTypeList_sempred(InterfaceTypeListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean classBodyDeclarations_sempred(ClassBodyDeclarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean constructorModifiers_sempred(ConstructorModifiersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean formalParameterList_sempred(FormalParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean classTypeList_sempred(ClassTypeListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean fieldModifiers_sempred(FieldModifiersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean variableDeclarators_sempred(VariableDeclaratorsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean variableDeclaratorId_sempred(VariableDeclaratorIdContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean methodModifiers_sempred(MethodModifiersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean interfaceModifiers_sempred(InterfaceModifiersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean extendsInterfaces_sempred(ExtendsInterfacesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean interfaceMemberDeclarations_sempred(InterfaceMemberDeclarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean abstractMethodModifiers_sempred(AbstractMethodModifiersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean variableInitializers_sempred(VariableInitializersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockStatements_sempred(BlockStatementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean switchBlockStatementGroups_sempred(SwitchBlockStatementGroupsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statementExpressionList_sempred(StatementExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean catches_sempred(CatchesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 2);
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 5);
		case 30:
			return precpred(_ctx, 4);
		case 31:
			return precpred(_ctx, 3);
		case 32:
			return precpred(_ctx, 2);
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 3);
		case 35:
			return precpred(_ctx, 2);
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 2);
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 3);
		case 40:
			return precpred(_ctx, 2);
		case 41:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 2);
		case 43:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primary_sempred(PrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return precpred(_ctx, 6);
		case 45:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean primaryNoNewArray_sempred(PrimaryNoNewArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argumentList_sempred(ArgumentListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dimExprs_sempred(DimExprsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dims_sempred(DimsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3n\u0527\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\3\2\5\2\u0118\n\2\3\2\5\2\u011b\n\2\3"+
		"\2\5\2\u011e\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4\u0129\n\4\f\4"+
		"\16\4\u012c\13\4\3\5\3\5\5\5\u0130\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u0141\n\b\f\b\16\b\u0144\13\b\3\t\3\t"+
		"\3\t\5\t\u0149\n\t\3\n\5\n\u014c\n\n\3\n\3\n\3\n\5\n\u0151\n\n\3\n\5\n"+
		"\u0154\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u015d\n\13\f\13\16\13"+
		"\u0160\13\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\7\17\u0170\n\17\f\17\16\17\u0173\13\17\3\20\3\20\5\20\u0177\n"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u0180\n\21\f\21\16\21\u0183"+
		"\13\21\3\22\3\22\5\22\u0187\n\22\3\23\3\23\5\23\u018b\n\23\3\24\5\24\u018e"+
		"\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0198\n\25\f\25\16"+
		"\25\u019b\13\25\3\26\3\26\3\27\3\27\3\27\5\27\u01a2\n\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u01ac\n\30\f\30\16\30\u01af\13\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01ba\n\32\f\32\16\32\u01bd"+
		"\13\32\3\33\3\33\5\33\u01c1\n\33\3\33\5\33\u01c4\n\33\3\33\3\33\3\34\3"+
		"\34\3\34\5\34\u01cb\n\34\3\34\3\34\3\34\3\34\5\34\u01d1\n\34\3\34\5\34"+
		"\u01d4\n\34\3\35\5\35\u01d7\n\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\7\36\u01e2\n\36\f\36\16\36\u01e5\13\36\3\37\3\37\3 \3 \3 \3 "+
		"\3 \3 \7 \u01ef\n \f \16 \u01f2\13 \3!\3!\3!\3!\3!\5!\u01f9\n!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\7\"\u0201\n\"\f\"\16\"\u0204\13\"\3#\3#\5#\u0208\n#\3"+
		"$\3$\3$\3%\5%\u020e\n%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\7\'\u021a\n"+
		"\'\f\'\16\'\u021d\13\'\3(\3(\3)\3)\3)\5)\u0224\n)\3)\3)\3*\3*\5*\u022a"+
		"\n*\3+\5+\u022d\n+\3+\3+\3+\5+\u0232\n+\3+\3+\3,\3,\3,\3,\3,\7,\u023b"+
		"\n,\f,\16,\u023e\13,\3-\3-\3.\3.\3.\3.\3.\3.\3.\7.\u0249\n.\f.\16.\u024c"+
		"\13.\3/\3/\5/\u0250\n/\3/\3/\3\60\3\60\3\60\3\60\3\60\7\60\u0259\n\60"+
		"\f\60\16\60\u025c\13\60\3\61\3\61\5\61\u0260\n\61\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\64\5\64\u0269\n\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\7\65\u0274\n\65\f\65\16\65\u0277\13\65\3\66\3\66\3\67\3\67\5\67"+
		"\u027d\n\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\78\u0289\n8\f8\168\u028c"+
		"\138\39\39\39\59\u0291\n9\39\39\39\79\u0296\n9\f9\169\u0299\139\3:\3:"+
		"\5:\u029d\n:\3;\3;\5;\u02a1\n;\3<\3<\3=\3=\3>\3>\5>\u02a9\n>\3?\3?\5?"+
		"\u02ad\n?\3@\3@\3A\3A\3B\3B\3B\3B\3C\3C\5C\u02b9\nC\3C\3C\3D\3D\3D\3D"+
		"\3D\7D\u02c2\nD\fD\16D\u02c5\13D\3E\3E\5E\u02c9\nE\3F\3F\3F\3G\3G\3G\3"+
		"H\3H\3H\3H\3H\5H\u02d6\nH\3I\3I\3I\3I\5I\u02dc\nI\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\5J\u02e9\nJ\3K\3K\3L\3L\3L\3L\3M\3M\3M\3M\3N\3N\3N\3O\3"+
		"O\3O\3O\3O\5O\u02fd\nO\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\5R\u030d"+
		"\nR\3R\5R\u0310\nR\3R\3R\3S\3S\3S\3S\3S\7S\u0319\nS\fS\16S\u031c\13S\3"+
		"T\3T\3T\3U\3U\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3Y\3Y\3Y\5Y\u033a\nY\3Y\3Y\5Y\u033e\nY\3Y\3Y\5Y\u0342\nY\3Y\3Y\3"+
		"Y\3Z\3Z\3Z\5Z\u034a\nZ\3Z\3Z\5Z\u034e\nZ\3Z\3Z\5Z\u0352\nZ\3Z\3Z\3Z\3"+
		"[\3[\5[\u0359\n[\3\\\3\\\3]\3]\3]\3]\3]\3]\7]\u0363\n]\f]\16]\u0366\13"+
		"]\3^\3^\5^\u036a\n^\3^\3^\3_\3_\5_\u0370\n_\3_\3_\3`\3`\5`\u0376\n`\3"+
		"`\3`\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\5c\u038b\nc\5"+
		"c\u038d\nc\3d\3d\3d\3d\3d\7d\u0394\nd\fd\16d\u0397\13d\3e\3e\3e\3e\3e"+
		"\3e\3f\3f\3g\3g\5g\u03a3\ng\3h\3h\3h\3i\3i\3j\3j\3j\3j\3j\3j\3j\5j\u03b1"+
		"\nj\3k\3k\3k\3k\3k\3k\7k\u03b9\nk\fk\16k\u03bc\13k\3l\3l\3l\3l\3l\3l\7"+
		"l\u03c4\nl\fl\16l\u03c7\13l\3m\3m\3m\3m\3m\3m\7m\u03cf\nm\fm\16m\u03d2"+
		"\13m\3n\3n\3n\3n\3n\3n\7n\u03da\nn\fn\16n\u03dd\13n\3o\3o\3o\3o\3o\3o"+
		"\7o\u03e5\no\fo\16o\u03e8\13o\3p\3p\3p\3p\3p\3p\3p\3p\3p\7p\u03f3\np\f"+
		"p\16p\u03f6\13p\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q"+
		"\7q\u040a\nq\fq\16q\u040d\13q\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\7r\u041b"+
		"\nr\fr\16r\u041e\13r\3s\3s\3s\3s\3s\3s\3s\3s\3s\7s\u0429\ns\fs\16s\u042c"+
		"\13s\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\7t\u043a\nt\ft\16t\u043d\13t"+
		"\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\5u\u0449\nu\3v\3v\3v\3v\3v\3v\5v\u0451"+
		"\nv\3w\3w\3w\3w\3w\3w\5w\u0459\nw\3x\3x\3x\3y\3y\3y\3z\3z\3z\5z\u0464"+
		"\nz\3z\3z\3z\3z\7z\u046a\nz\fz\16z\u046d\13z\3{\3{\5{\u0471\n{\3{\3{\3"+
		"{\3{\3{\3{\5{\u0479\n{\3{\3{\3{\3{\3{\3{\3{\5{\u0482\n{\3{\5{\u0485\n"+
		"{\3|\3|\3|\5|\u048a\n|\3|\3|\3|\3|\3|\3|\5|\u0492\n|\3|\3|\3|\3|\3|\3"+
		"|\5|\u049a\n|\3|\3|\3|\3|\3|\5|\u04a1\n|\3|\3|\3|\3|\7|\u04a7\n|\f|\16"+
		"|\u04aa\13|\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u04b9\n}\3}\3}\3"+
		"}\3}\3}\7}\u04c0\n}\f}\16}\u04c3\13}\3~\3~\3~\3~\5~\u04c9\n~\3~\3~\3\177"+
		"\3\177\3\177\3\177\3\177\3\177\7\177\u04d3\n\177\f\177\16\177\u04d6\13"+
		"\177\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u04dc\n\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\5\u0080\u04e2\n\u0080\5\u0080\u04e4\n\u0080\3\u0081\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u04eb\n\u0081\f\u0081\16\u0081"+
		"\u04ee\13\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u04fb\n\u0083\f\u0083\16\u0083"+
		"\u04fe\13\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084"+
		"\u0506\n\u0084\f\u0084\16\u0084\u0509\13\u0084\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\5\u0085\u0510\n\u0085\3\u0086\3\u0086\3\u0087\3\u0087"+
		"\3\u0087\5\u0087\u0517\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\5\u0088\u051f\n\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b"+
		"\3\u008b\3\u008b\2)\6\16\24\34 (.\62:>BLVZ^hnp\u0086\u00a4\u00b8\u00c6"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00f2\u00f6"+
		"\u00f8\u00fc\u0100\u0104\u0106\u008c\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\2\16\5\2\3\3\22\22##\3\2!#\7\2\22\22!#&&--\60\60\b\2\3\3"+
		"\22\22\36\36!#&&))\4\2\3\3##\5\2\22\22##&&\7\2\6\6\t\t\33\33\35\35%%\4"+
		"\2\17\17\24\24\5\2\66\66GNVX\3\2Y[\3\2\\]\3\2\63\64\2\u053d\2\u0117\3"+
		"\2\2\2\4\u011f\3\2\2\2\6\u0123\3\2\2\2\b\u012f\3\2\2\2\n\u0131\3\2\2\2"+
		"\f\u0135\3\2\2\2\16\u013b\3\2\2\2\20\u0148\3\2\2\2\22\u014b\3\2\2\2\24"+
		"\u0157\3\2\2\2\26\u0161\3\2\2\2\30\u0163\3\2\2\2\32\u0166\3\2\2\2\34\u0169"+
		"\3\2\2\2\36\u0174\3\2\2\2 \u017a\3\2\2\2\"\u0186\3\2\2\2$\u018a\3\2\2"+
		"\2&\u018d\3\2\2\2(\u0192\3\2\2\2*\u019c\3\2\2\2,\u019e\3\2\2\2.\u01a5"+
		"\3\2\2\2\60\u01b0\3\2\2\2\62\u01b3\3\2\2\2\64\u01be\3\2\2\2\66\u01d3\3"+
		"\2\2\28\u01d6\3\2\2\2:\u01dc\3\2\2\2<\u01e6\3\2\2\2>\u01e8\3\2\2\2@\u01f8"+
		"\3\2\2\2B\u01fa\3\2\2\2D\u0207\3\2\2\2F\u0209\3\2\2\2H\u020d\3\2\2\2J"+
		"\u0212\3\2\2\2L\u0214\3\2\2\2N\u021e\3\2\2\2P\u0220\3\2\2\2R\u0229\3\2"+
		"\2\2T\u022c\3\2\2\2V\u0235\3\2\2\2X\u023f\3\2\2\2Z\u0241\3\2\2\2\\\u024d"+
		"\3\2\2\2^\u0253\3\2\2\2`\u025f\3\2\2\2b\u0261\3\2\2\2d\u0265\3\2\2\2f"+
		"\u0268\3\2\2\2h\u026e\3\2\2\2j\u0278\3\2\2\2l\u027a\3\2\2\2n\u0282\3\2"+
		"\2\2p\u0290\3\2\2\2r\u029c\3\2\2\2t\u02a0\3\2\2\2v\u02a2\3\2\2\2x\u02a4"+
		"\3\2\2\2z\u02a8\3\2\2\2|\u02ac\3\2\2\2~\u02ae\3\2\2\2\u0080\u02b0\3\2"+
		"\2\2\u0082\u02b2\3\2\2\2\u0084\u02b6\3\2\2\2\u0086\u02bc\3\2\2\2\u0088"+
		"\u02c8\3\2\2\2\u008a\u02ca\3\2\2\2\u008c\u02cd\3\2\2\2\u008e\u02d5\3\2"+
		"\2\2\u0090\u02db\3\2\2\2\u0092\u02e8\3\2\2\2\u0094\u02ea\3\2\2\2\u0096"+
		"\u02ec\3\2\2\2\u0098\u02f0\3\2\2\2\u009a\u02f4\3\2\2\2\u009c\u02fc\3\2"+
		"\2\2\u009e\u02fe\3\2\2\2\u00a0\u0304\3\2\2\2\u00a2\u030a\3\2\2\2\u00a4"+
		"\u0313\3\2\2\2\u00a6\u031d\3\2\2\2\u00a8\u0320\3\2\2\2\u00aa\u0322\3\2"+
		"\2\2\u00ac\u0328\3\2\2\2\u00ae\u032e\3\2\2\2\u00b0\u0336\3\2\2\2\u00b2"+
		"\u0346\3\2\2\2\u00b4\u0358\3\2\2\2\u00b6\u035a\3\2\2\2\u00b8\u035c\3\2"+
		"\2\2\u00ba\u0367\3\2\2\2\u00bc\u036d\3\2\2\2\u00be\u0373\3\2\2\2\u00c0"+
		"\u0379\3\2\2\2\u00c2\u037d\3\2\2\2\u00c4\u038c\3\2\2\2\u00c6\u038e\3\2"+
		"\2\2\u00c8\u0398\3\2\2\2\u00ca\u039e\3\2\2\2\u00cc\u03a2\3\2\2\2\u00ce"+
		"\u03a4\3\2\2\2\u00d0\u03a7\3\2\2\2\u00d2\u03b0\3\2\2\2\u00d4\u03b2\3\2"+
		"\2\2\u00d6\u03bd\3\2\2\2\u00d8\u03c8\3\2\2\2\u00da\u03d3\3\2\2\2\u00dc"+
		"\u03de\3\2\2\2\u00de\u03e9\3\2\2\2\u00e0\u03f7\3\2\2\2\u00e2\u040e\3\2"+
		"\2\2\u00e4\u041f\3\2\2\2\u00e6\u042d\3\2\2\2\u00e8\u0448\3\2\2\2\u00ea"+
		"\u0450\3\2\2\2\u00ec\u0458\3\2\2\2\u00ee\u045a\3\2\2\2\u00f0\u045d\3\2"+
		"\2\2\u00f2\u0463\3\2\2\2\u00f4\u0484\3\2\2\2\u00f6\u0499\3\2\2\2\u00f8"+
		"\u04b8\3\2\2\2\u00fa\u04c4\3\2\2\2\u00fc\u04cc\3\2\2\2\u00fe\u04e3\3\2"+
		"\2\2\u0100\u04e5\3\2\2\2\u0102\u04ef\3\2\2\2\u0104\u04f3\3\2\2\2\u0106"+
		"\u04ff\3\2\2\2\u0108\u050f\3\2\2\2\u010a\u0511\3\2\2\2\u010c\u0516\3\2"+
		"\2\2\u010e\u051e\3\2\2\2\u0110\u0520\3\2\2\2\u0112\u0522\3\2\2\2\u0114"+
		"\u0524\3\2\2\2\u0116\u0118\5\4\3\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u011a\3\2\2\2\u0119\u011b\5\6\4\2\u011a\u0119\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011e\5\16\b\2\u011d\u011c\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\3\3\2\2\2\u011f\u0120\7 \2\2\u0120\u0121"+
		"\5\u0106\u0084\2\u0121\u0122\7m\2\2\u0122\5\3\2\2\2\u0123\u0124\b\4\1"+
		"\2\u0124\u0125\5\b\5\2\u0125\u012a\3\2\2\2\u0126\u0127\f\3\2\2\u0127\u0129"+
		"\5\b\5\2\u0128\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\7\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0130\5\n\6\2"+
		"\u012e\u0130\5\f\7\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\t\3"+
		"\2\2\2\u0131\u0132\7\31\2\2\u0132\u0133\5\u0108\u0085\2\u0133\u0134\7"+
		"m\2\2\u0134\13\3\2\2\2\u0135\u0136\7\31\2\2\u0136\u0137\5\u0106\u0084"+
		"\2\u0137\u0138\7k\2\2\u0138\u0139\7@\2\2\u0139\u013a\7m\2\2\u013a\r\3"+
		"\2\2\2\u013b\u013c\b\b\1\2\u013c\u013d\5\20\t\2\u013d\u0142\3\2\2\2\u013e"+
		"\u013f\f\3\2\2\u013f\u0141\5\20\t\2\u0140\u013e\3\2\2\2\u0141\u0144\3"+
		"\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\17\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0149\5\22\n\2\u0146\u0149\5T+\2\u0147\u0149\7m\2"+
		"\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\21"+
		"\3\2\2\2\u014a\u014c\5\24\13\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2"+
		"\u014c\u014d\3\2\2\2\u014d\u014e\7\n\2\2\u014e\u0150\7\65\2\2\u014f\u0151"+
		"\5\30\r\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2"+
		"\u0152\u0154\5\32\16\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u0156\5\36\20\2\u0156\23\3\2\2\2\u0157\u0158\b\13\1\2\u0158"+
		"\u0159\5\26\f\2\u0159\u015e\3\2\2\2\u015a\u015b\f\3\2\2\u015b\u015d\5"+
		"\26\f\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\25\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\t\2\2"+
		"\2\u0162\27\3\2\2\2\u0163\u0164\7\21\2\2\u0164\u0165\5~@\2\u0165\31\3"+
		"\2\2\2\u0166\u0167\7\30\2\2\u0167\u0168\5\34\17\2\u0168\33\3\2\2\2\u0169"+
		"\u016a\b\17\1\2\u016a\u016b\5\u0080A\2\u016b\u0171\3\2\2\2\u016c\u016d"+
		"\f\3\2\2\u016d\u016e\7i\2\2\u016e\u0170\5\u0080A\2\u016f\u016c\3\2\2\2"+
		"\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\35"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0176\7g\2\2\u0175\u0177\5 \21\2\u0176"+
		"\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\7h"+
		"\2\2\u0179\37\3\2\2\2\u017a\u017b\b\21\1\2\u017b\u017c\5\"\22\2\u017c"+
		"\u0181\3\2\2\2\u017d\u017e\f\3\2\2\u017e\u0180\5\"\22\2\u017f\u017d\3"+
		"\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"!\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0187\5$\23\2\u0185\u0187\5&\24\2"+
		"\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187#\3\2\2\2\u0188\u018b\5"+
		"8\35\2\u0189\u018b\5F$\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b"+
		"%\3\2\2\2\u018c\u018e\5(\25\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2"+
		"\u018e\u018f\3\2\2\2\u018f\u0190\5,\27\2\u0190\u0191\5\64\33\2\u0191\'"+
		"\3\2\2\2\u0192\u0193\b\25\1\2\u0193\u0194\5*\26\2\u0194\u0199\3\2\2\2"+
		"\u0195\u0196\f\3\2\2\u0196\u0198\5*\26\2\u0197\u0195\3\2\2\2\u0198\u019b"+
		"\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a)\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019c\u019d\t\3\2\2\u019d+\3\2\2\2\u019e\u019f\5\u010a"+
		"\u0086\2\u019f\u01a1\7c\2\2\u01a0\u01a2\5.\30\2\u01a1\u01a0\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7d\2\2\u01a4-\3\2\2\2\u01a5"+
		"\u01a6\b\30\1\2\u01a6\u01a7\5\60\31\2\u01a7\u01ad\3\2\2\2\u01a8\u01a9"+
		"\f\3\2\2\u01a9\u01aa\7m\2\2\u01aa\u01ac\5\60\31\2\u01ab\u01a8\3\2\2\2"+
		"\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae/\3"+
		"\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\5p9\2\u01b1\u01b2\5B\"\2\u01b2"+
		"\61\3\2\2\2\u01b3\u01b4\b\32\1\2\u01b4\u01b5\5~@\2\u01b5\u01bb\3\2\2\2"+
		"\u01b6\u01b7\f\3\2\2\u01b7\u01b8\7i\2\2\u01b8\u01ba\5~@\2\u01b9\u01b6"+
		"\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\63\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c0\7g\2\2\u01bf\u01c1\5\66\34"+
		"\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c4"+
		"\5\u0086D\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2"+
		"\2\u01c5\u01c6\7h\2\2\u01c6\65\3\2\2\2\u01c7\u01c8\7*\2\2\u01c8\u01ca"+
		"\7c\2\2\u01c9\u01cb\5\u00fc\177\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2"+
		"\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d4\7d\2\2\u01cd\u01ce\7\'\2\2\u01ce"+
		"\u01d0\7c\2\2\u01cf\u01d1\5\u00fc\177\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1"+
		"\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\7d\2\2\u01d3\u01c7\3\2\2\2\u01d3"+
		"\u01cd\3\2\2\2\u01d4\67\3\2\2\2\u01d5\u01d7\5:\36\2\u01d6\u01d5\3\2\2"+
		"\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\5p9\2\u01d9\u01da"+
		"\5> \2\u01da\u01db\7m\2\2\u01db9\3\2\2\2\u01dc\u01dd\b\36\1\2\u01dd\u01de"+
		"\5<\37\2\u01de\u01e3\3\2\2\2\u01df\u01e0\f\3\2\2\u01e0\u01e2\5<\37\2\u01e1"+
		"\u01df\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4;\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7\t\4\2\2\u01e7=\3\2"+
		"\2\2\u01e8\u01e9\b \1\2\u01e9\u01ea\5@!\2\u01ea\u01f0\3\2\2\2\u01eb\u01ec"+
		"\f\3\2\2\u01ec\u01ed\7i\2\2\u01ed\u01ef\5@!\2\u01ee\u01eb\3\2\2\2\u01ef"+
		"\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1?\3\2\2\2"+
		"\u01f2\u01f0\3\2\2\2\u01f3\u01f9\5B\"\2\u01f4\u01f5\5B\"\2\u01f5\u01f6"+
		"\7\66\2\2\u01f6\u01f7\5D#\2\u01f7\u01f9\3\2\2\2\u01f8\u01f3\3\2\2\2\u01f8"+
		"\u01f4\3\2\2\2\u01f9A\3\2\2\2\u01fa\u01fb\b\"\1\2\u01fb\u01fc\7\65\2\2"+
		"\u01fc\u0202\3\2\2\2\u01fd\u01fe\f\3\2\2\u01fe\u01ff\7e\2\2\u01ff\u0201"+
		"\7f\2\2\u0200\u01fd\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203C\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0208\5\u00ca"+
		"f\2\u0206\u0208\5l\67\2\u0207\u0205\3\2\2\2\u0207\u0206\3\2\2\2\u0208"+
		"E\3\2\2\2\u0209\u020a\5H%\2\u020a\u020b\5R*\2\u020bG\3\2\2\2\u020c\u020e"+
		"\5L\'\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0210\5J&\2\u0210\u0211\5P)\2\u0211I\3\2\2\2\u0212\u0213\5p9\2\u0213"+
		"K\3\2\2\2\u0214\u0215\b\'\1\2\u0215\u0216\5N(\2\u0216\u021b\3\2\2\2\u0217"+
		"\u0218\f\3\2\2\u0218\u021a\5N(\2\u0219\u0217\3\2\2\2\u021a\u021d\3\2\2"+
		"\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021cM\3\2\2\2\u021d\u021b"+
		"\3\2\2\2\u021e\u021f\t\5\2\2\u021fO\3\2\2\2\u0220\u0221\7\65\2\2\u0221"+
		"\u0223\7c\2\2\u0222\u0224\5.\30\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\u0225\3\2\2\2\u0225\u0226\7d\2\2\u0226Q\3\2\2\2\u0227\u022a"+
		"\5\u0084C\2\u0228\u022a\7m\2\2\u0229\u0227\3\2\2\2\u0229\u0228\3\2\2\2"+
		"\u022aS\3\2\2\2\u022b\u022d\5V,\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2"+
		"\2\2\u022d\u022e\3\2\2\2\u022e\u022f\7\34\2\2\u022f\u0231\7\65\2\2\u0230"+
		"\u0232\5Z.\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2"+
		"\2\u0233\u0234\5\\/\2\u0234U\3\2\2\2\u0235\u0236\b,\1\2\u0236\u0237\5"+
		"X-\2\u0237\u023c\3\2\2\2\u0238\u0239\f\3\2\2\u0239\u023b\5X-\2\u023a\u0238"+
		"\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"W\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0240\t\6\2\2\u0240Y\3\2\2\2\u0241"+
		"\u0242\b.\1\2\u0242\u0243\7\21\2\2\u0243\u0244\5\u0080A\2\u0244\u024a"+
		"\3\2\2\2\u0245\u0246\f\3\2\2\u0246\u0247\7i\2\2\u0247\u0249\5\u0080A\2"+
		"\u0248\u0245\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b"+
		"\3\2\2\2\u024b[\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u024f\7g\2\2\u024e\u0250"+
		"\5^\60\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u0252\7h\2\2\u0252]\3\2\2\2\u0253\u0254\b\60\1\2\u0254\u0255\5`\61\2"+
		"\u0255\u025a\3\2\2\2\u0256\u0257\f\3\2\2\u0257\u0259\5`\61\2\u0258\u0256"+
		"\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"_\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u0260\5b\62\2\u025e\u0260\5f\64\2"+
		"\u025f\u025d\3\2\2\2\u025f\u025e\3\2\2\2\u0260a\3\2\2\2\u0261\u0262\5"+
		"d\63\2\u0262\u0263\5p9\2\u0263\u0264\5@!\2\u0264c\3\2\2\2\u0265\u0266"+
		"\t\7\2\2\u0266e\3\2\2\2\u0267\u0269\5h\65\2\u0268\u0267\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\5J&\2\u026b\u026c\5P)\2"+
		"\u026c\u026d\7m\2\2\u026dg\3\2\2\2\u026e\u026f\b\65\1\2\u026f\u0270\5"+
		"j\66\2\u0270\u0275\3\2\2\2\u0271\u0272\f\3\2\2\u0272\u0274\5j\66\2\u0273"+
		"\u0271\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2"+
		"\2\2\u0276i\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u0279\t\6\2\2\u0279k\3\2"+
		"\2\2\u027a\u027c\7g\2\2\u027b\u027d\5n8\2\u027c\u027b\3\2\2\2\u027c\u027d"+
		"\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\7i\2\2\u027f\u0280\7l\2\2\u0280"+
		"\u0281\7h\2\2\u0281m\3\2\2\2\u0282\u0283\b8\1\2\u0283\u0284\5D#\2\u0284"+
		"\u028a\3\2\2\2\u0285\u0286\f\3\2\2\u0286\u0287\7i\2\2\u0287\u0289\5D#"+
		"\2\u0288\u0285\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b"+
		"\3\2\2\2\u028bo\3\2\2\2\u028c\u028a\3\2\2\2\u028d\u028e\b9\1\2\u028e\u0291"+
		"\5r:\2\u028f\u0291\5|?\2\u0290\u028d\3\2\2\2\u0290\u028f\3\2\2\2\u0291"+
		"\u0297\3\2\2\2\u0292\u0293\f\3\2\2\u0293\u0294\7e\2\2\u0294\u0296\7f\2"+
		"\2\u0295\u0292\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298"+
		"\3\2\2\2\u0298q\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029d\5t;\2\u029b\u029d"+
		"\7\4\2\2\u029c\u029a\3\2\2\2\u029c\u029b\3\2\2\2\u029ds\3\2\2\2\u029e"+
		"\u02a1\5v<\2\u029f\u02a1\5x=\2\u02a0\u029e\3\2\2\2\u02a0\u029f\3\2\2\2"+
		"\u02a1u\3\2\2\2\u02a2\u02a3\t\b\2\2\u02a3w\3\2\2\2\u02a4\u02a5\t\t\2\2"+
		"\u02a5y\3\2\2\2\u02a6\u02a9\5|?\2\u02a7\u02a9\5\u0082B\2\u02a8\u02a6\3"+
		"\2\2\2\u02a8\u02a7\3\2\2\2\u02a9{\3\2\2\2\u02aa\u02ad\5~@\2\u02ab\u02ad"+
		"\5\u0080A\2\u02ac\u02aa\3\2\2\2\u02ac\u02ab\3\2\2\2\u02ad}\3\2\2\2\u02ae"+
		"\u02af\5\u0108\u0085\2\u02af\177\3\2\2\2\u02b0\u02b1\5\u0108\u0085\2\u02b1"+
		"\u0081\3\2\2\2\u02b2\u02b3\5p9\2\u02b3\u02b4\7e\2\2\u02b4\u02b5\7f\2\2"+
		"\u02b5\u0083\3\2\2\2\u02b6\u02b8\7g\2\2\u02b7\u02b9\5\u0086D\2\u02b8\u02b7"+
		"\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\7h\2\2\u02bb"+
		"\u0085\3\2\2\2\u02bc\u02bd\bD\1\2\u02bd\u02be\5\u0088E\2\u02be\u02c3\3"+
		"\2\2\2\u02bf\u02c0\f\3\2\2\u02c0\u02c2\5\u0088E\2\u02c1\u02bf\3\2\2\2"+
		"\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u0087"+
		"\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c9\5\u008aF\2\u02c7\u02c9\5\u008e"+
		"H\2\u02c8\u02c6\3\2\2\2\u02c8\u02c7\3\2\2\2\u02c9\u0089\3\2\2\2\u02ca"+
		"\u02cb\5\u008cG\2\u02cb\u02cc\7m\2\2\u02cc\u008b\3\2\2\2\u02cd\u02ce\5"+
		"p9\2\u02ce\u02cf\5> \2\u02cf\u008d\3\2\2\2\u02d0\u02d6\5\u0092J\2\u02d1"+
		"\u02d6\5\u0096L\2\u02d2\u02d6\5\u009eP\2\u02d3\u02d6\5\u00aaV\2\u02d4"+
		"\u02d6\5\u00b0Y\2\u02d5\u02d0\3\2\2\2\u02d5\u02d1\3\2\2\2\u02d5\u02d2"+
		"\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d4\3\2\2\2\u02d6\u008f\3\2\2\2\u02d7"+
		"\u02dc\5\u0092J\2\u02d8\u02dc\5\u0098M\2\u02d9\u02dc\5\u00acW\2\u02da"+
		"\u02dc\5\u00b2Z\2\u02db\u02d7\3\2\2\2\u02db\u02d8\3\2\2\2\u02db\u02d9"+
		"\3\2\2\2\u02db\u02da\3\2\2\2\u02dc\u0091\3\2\2\2\u02dd\u02e9\5\u0084C"+
		"\2\u02de\u02e9\5\u0094K\2\u02df\u02e9\5\u009aN\2\u02e0\u02e9\5\u00a0Q"+
		"\2\u02e1\u02e9\5\u00aeX\2\u02e2\u02e9\5\u00ba^\2\u02e3\u02e9\5\u00bc_"+
		"\2\u02e4\u02e9\5\u00be`\2\u02e5\u02e9\5\u00c2b\2\u02e6\u02e9\5\u00c0a"+
		"\2\u02e7\u02e9\5\u00c4c\2\u02e8\u02dd\3\2\2\2\u02e8\u02de\3\2\2\2\u02e8"+
		"\u02df\3\2\2\2\u02e8\u02e0\3\2\2\2\u02e8\u02e1\3\2\2\2\u02e8\u02e2\3\2"+
		"\2\2\u02e8\u02e3\3\2\2\2\u02e8\u02e4\3\2\2\2\u02e8\u02e5\3\2\2\2\u02e8"+
		"\u02e6\3\2\2\2\u02e8\u02e7\3\2\2\2\u02e9\u0093\3\2\2\2\u02ea\u02eb\7m"+
		"\2\2\u02eb\u0095\3\2\2\2\u02ec\u02ed\7\65\2\2\u02ed\u02ee\7j\2\2\u02ee"+
		"\u02ef\5\u008eH\2\u02ef\u0097\3\2\2\2\u02f0\u02f1\7\65\2\2\u02f1\u02f2"+
		"\7j\2\2\u02f2\u02f3\5\u0090I\2\u02f3\u0099\3\2\2\2\u02f4\u02f5\5\u009c"+
		"O\2\u02f5\u02f6\7m\2\2\u02f6\u009b\3\2\2\2\u02f7\u02fd\5\u00ceh\2\u02f8"+
		"\u02fd\5\u00f0y\2\u02f9\u02fd\5\u00eex\2\u02fa\u02fd\5\u00f4{\2\u02fb"+
		"\u02fd\5\u00fa~\2\u02fc\u02f7\3\2\2\2\u02fc\u02f8\3\2\2\2\u02fc\u02f9"+
		"\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fb\3\2\2\2\u02fd\u009d\3\2\2\2\u02fe"+
		"\u02ff\7\27\2\2\u02ff\u0300\7c\2\2\u0300\u0301\5\u00caf\2\u0301\u0302"+
		"\7d\2\2\u0302\u0303\5\u008eH\2\u0303\u009f\3\2\2\2\u0304\u0305\7(\2\2"+
		"\u0305\u0306\7c\2\2\u0306\u0307\5\u00caf\2\u0307\u0308\7d\2\2\u0308\u0309"+
		"\5\u00a2R\2\u0309\u00a1\3\2\2\2\u030a\u030c\7g\2\2\u030b\u030d\5\u00a4"+
		"S\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030f\3\2\2\2\u030e"+
		"\u0310\5\u00a8U\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311"+
		"\3\2\2\2\u0311\u0312\7h\2\2\u0312\u00a3\3\2\2\2\u0313\u0314\bS\1\2\u0314"+
		"\u0315\5\u00a6T\2\u0315\u031a\3\2\2\2\u0316\u0317\f\3\2\2\u0317\u0319"+
		"\5\u00a6T\2\u0318\u0316\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2"+
		"\2\u031a\u031b\3\2\2\2\u031b\u00a5\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u031e"+
		"\5\u00a8U\2\u031e\u031f\5\u0086D\2\u031f\u00a7\3\2\2\2\u0320\u0321\7("+
		"\2\2\u0321\u00a9\3\2\2\2\u0322\u0323\7\61\2\2\u0323\u0324\7c\2\2\u0324"+
		"\u0325\5\u00caf\2\u0325\u0326\7d\2\2\u0326\u0327\5\u008eH\2\u0327\u00ab"+
		"\3\2\2\2\u0328\u0329\7\61\2\2\u0329\u032a\7c\2\2\u032a\u032b\5\u00caf"+
		"\2\u032b\u032c\7d\2\2\u032c\u032d\5\u0090I\2\u032d\u00ad\3\2\2\2\u032e"+
		"\u032f\7\16\2\2\u032f\u0330\5\u008eH\2\u0330\u0331\7\61\2\2\u0331\u0332"+
		"\7c\2\2\u0332\u0333\5\u00caf\2\u0333\u0334\7d\2\2\u0334\u0335\7m\2\2\u0335"+
		"\u00af\3\2\2\2\u0336\u0337\7\25\2\2\u0337\u0339\7c\2\2\u0338\u033a\5\u00b4"+
		"[\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b"+
		"\u033d\7m\2\2\u033c\u033e\5\u00caf\2\u033d\u033c\3\2\2\2\u033d\u033e\3"+
		"\2\2\2\u033e\u033f\3\2\2\2\u033f\u0341\7m\2\2\u0340\u0342\5\u00b6\\\2"+
		"\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344"+
		"\7d\2\2\u0344\u0345\5\u008eH\2\u0345\u00b1\3\2\2\2\u0346\u0347\7\25\2"+
		"\2\u0347\u0349\7c\2\2\u0348\u034a\5\u00b4[\2\u0349\u0348\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d\7m\2\2\u034c\u034e\5\u00ca"+
		"f\2\u034d\u034c\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"\u0351\7m\2\2\u0350\u0352\5\u00b6\\\2\u0351\u0350\3\2\2\2\u0351\u0352"+
		"\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\7d\2\2\u0354\u0355\5\u0090I\2"+
		"\u0355\u00b3\3\2\2\2\u0356\u0359\5\u00b8]\2\u0357\u0359\5\u008cG\2\u0358"+
		"\u0356\3\2\2\2\u0358\u0357\3\2\2\2\u0359\u00b5\3\2\2\2\u035a\u035b\5\u00b8"+
		"]\2\u035b\u00b7\3\2\2\2\u035c\u035d\b]\1\2\u035d\u035e\5\u009cO\2\u035e"+
		"\u0364\3\2\2\2\u035f\u0360\f\3\2\2\u0360\u0361\7i\2\2\u0361\u0363\5\u009c"+
		"O\2\u0362\u035f\3\2\2\2\u0363\u0366\3\2\2\2\u0364\u0362\3\2\2\2\u0364"+
		"\u0365\3\2\2\2\u0365\u00b9\3\2\2\2\u0366\u0364\3\2\2\2\u0367\u0369\7\5"+
		"\2\2\u0368\u036a\7\65\2\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u036b\3\2\2\2\u036b\u036c\7m\2\2\u036c\u00bb\3\2\2\2\u036d\u036f\7\f"+
		"\2\2\u036e\u0370\7\65\2\2\u036f\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370"+
		"\u0371\3\2\2\2\u0371\u0372\7m\2\2\u0372\u00bd\3\2\2\2\u0373\u0375\7$\2"+
		"\2\u0374\u0376\5\u00caf\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376"+
		"\u0377\3\2\2\2\u0377\u0378\7m\2\2\u0378\u00bf\3\2\2\2\u0379\u037a\7+\2"+
		"\2\u037a\u037b\5\u00caf\2\u037b\u037c\7m\2\2\u037c\u00c1\3\2\2\2\u037d"+
		"\u037e\7)\2\2\u037e\u037f\7c\2\2\u037f\u0380\5\u00caf\2\u0380\u0381\7"+
		"d\2\2\u0381\u0382\5\u0084C\2\u0382\u00c3\3\2\2\2\u0383\u0384\7.\2\2\u0384"+
		"\u0385\5\u0084C\2\u0385\u0386\5\u00c6d\2\u0386\u038d\3\2\2\2\u0387\u0388"+
		"\7.\2\2\u0388\u038a\5\u0084C\2\u0389\u038b\5\u00c6d\2\u038a\u0389\3\2"+
		"\2\2\u038a\u038b\3\2\2\2\u038b\u038d\3\2\2\2\u038c\u0383\3\2\2\2\u038c"+
		"\u0387\3\2\2\2\u038d\u00c5\3\2\2\2\u038e\u038f\bd\1\2\u038f\u0390\5\u00c8"+
		"e\2\u0390\u0395\3\2\2\2\u0391\u0392\f\3\2\2\u0392\u0394\5\u00c8e\2\u0393"+
		"\u0391\3\2\2\2\u0394\u0397\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2"+
		"\2\2\u0396\u00c7\3\2\2\2\u0397\u0395\3\2\2\2\u0398\u0399\7\b\2\2\u0399"+
		"\u039a\7c\2\2\u039a\u039b\5\60\31\2\u039b\u039c\7d\2\2\u039c\u039d\5\u0084"+
		"C\2\u039d\u00c9\3\2\2\2\u039e\u039f\5\u00ccg\2\u039f\u00cb\3\2\2\2\u03a0"+
		"\u03a3\5\u00d2j\2\u03a1\u03a3\5\u00ceh\2\u03a2\u03a0\3\2\2\2\u03a2\u03a1"+
		"\3\2\2\2\u03a3\u00cd\3\2\2\2\u03a4\u03a5\5\u00d0i\2\u03a5\u03a6\5\u00cc"+
		"g\2\u03a6\u00cf\3\2\2\2\u03a7\u03a8\t\n\2\2\u03a8\u00d1\3\2\2\2\u03a9"+
		"\u03b1\5\u00d4k\2\u03aa\u03ab\5\u00d4k\2\u03ab\u03ac\7l\2\2\u03ac\u03ad"+
		"\5\u00caf\2\u03ad\u03ae\7j\2\2\u03ae\u03af\5\u00d2j\2\u03af\u03b1\3\2"+
		"\2\2\u03b0\u03a9\3\2\2\2\u03b0\u03aa\3\2\2\2\u03b1\u00d3\3\2\2\2\u03b2"+
		"\u03b3\bk\1\2\u03b3\u03b4\5\u00d6l\2\u03b4\u03ba\3\2\2\2\u03b5\u03b6\f"+
		"\3\2\2\u03b6\u03b7\7R\2\2\u03b7\u03b9\5\u00d6l\2\u03b8\u03b5\3\2\2\2\u03b9"+
		"\u03bc\3\2\2\2\u03ba\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u00d5\3\2"+
		"\2\2\u03bc\u03ba\3\2\2\2\u03bd\u03be\bl\1\2\u03be\u03bf\5\u00d8m\2\u03bf"+
		"\u03c5\3\2\2\2\u03c0\u03c1\f\3\2\2\u03c1\u03c2\7Q\2\2\u03c2\u03c4\5\u00d8"+
		"m\2\u03c3\u03c0\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5"+
		"\u03c6\3\2\2\2\u03c6\u00d7\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03c9\bm"+
		"\1\2\u03c9\u03ca\5\u00dan\2\u03ca\u03d0\3\2\2\2\u03cb\u03cc\f\3\2\2\u03cc"+
		"\u03cd\79\2\2\u03cd\u03cf\5\u00dan\2\u03ce\u03cb\3\2\2\2\u03cf\u03d2\3"+
		"\2\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u00d9\3\2\2\2\u03d2"+
		"\u03d0\3\2\2\2\u03d3\u03d4\bn\1\2\u03d4\u03d5\5\u00dco\2\u03d5\u03db\3"+
		"\2\2\2\u03d6\u03d7\f\3\2\2\u03d7\u03d8\7:\2\2\u03d8\u03da\5\u00dco\2\u03d9"+
		"\u03d6\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2"+
		"\2\2\u03dc\u00db\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03df\bo\1\2\u03df"+
		"\u03e0\5\u00dep\2\u03e0\u03e6\3\2\2\2\u03e1\u03e2\f\3\2\2\u03e2\u03e3"+
		"\78\2\2\u03e3\u03e5\5\u00dep\2\u03e4\u03e1\3\2\2\2\u03e5\u03e8\3\2\2\2"+
		"\u03e6\u03e4\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u00dd\3\2\2\2\u03e8\u03e6"+
		"\3\2\2\2\u03e9\u03ea\bp\1\2\u03ea\u03eb\5\u00e0q\2\u03eb\u03f4\3\2\2\2"+
		"\u03ec\u03ed\f\4\2\2\u03ed\u03ee\7C\2\2\u03ee\u03f3\5\u00e0q\2\u03ef\u03f0"+
		"\f\3\2\2\u03f0\u03f1\7D\2\2\u03f1\u03f3\5\u00e0q\2\u03f2\u03ec\3\2\2\2"+
		"\u03f2\u03ef\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f5"+
		"\3\2\2\2\u03f5\u00df\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7\u03f8\bq\1\2\u03f8"+
		"\u03f9\5\u00e2r\2\u03f9\u040b\3\2\2\2\u03fa\u03fb\f\7\2\2\u03fb\u03fc"+
		"\7<\2\2\u03fc\u040a\5\u00e2r\2\u03fd\u03fe\f\6\2\2\u03fe\u03ff\7=\2\2"+
		"\u03ff\u040a\5\u00e2r\2\u0400\u0401\f\5\2\2\u0401\u0402\7E\2\2\u0402\u040a"+
		"\5\u00e2r\2\u0403\u0404\f\4\2\2\u0404\u0405\7F\2\2\u0405\u040a\5\u00e2"+
		"r\2\u0406\u0407\f\3\2\2\u0407\u0408\7\32\2\2\u0408\u040a\5z>\2\u0409\u03fa"+
		"\3\2\2\2\u0409\u03fd\3\2\2\2\u0409\u0400\3\2\2\2\u0409\u0403\3\2\2\2\u0409"+
		"\u0406\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2"+
		"\2\2\u040c\u00e1\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u040f\br\1\2\u040f"+
		"\u0410\5\u00e4s\2\u0410\u041c\3\2\2\2\u0411\u0412\f\5\2\2\u0412\u0413"+
		"\7S\2\2\u0413\u041b\5\u00e4s\2\u0414\u0415\f\4\2\2\u0415\u0416\7T\2\2"+
		"\u0416\u041b\5\u00e4s\2\u0417\u0418\f\3\2\2\u0418\u0419\7U\2\2\u0419\u041b"+
		"\5\u00e4s\2\u041a\u0411\3\2\2\2\u041a\u0414\3\2\2\2\u041a\u0417\3\2\2"+
		"\2\u041b\u041e\3\2\2\2\u041c\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u00e3"+
		"\3\2\2\2\u041e\u041c\3\2\2\2\u041f\u0420\bs\1\2\u0420\u0421\5\u00e6t\2"+
		"\u0421\u042a\3\2\2\2\u0422\u0423\f\4\2\2\u0423\u0424\7>\2\2\u0424\u0429"+
		"\5\u00e6t\2\u0425\u0426\f\3\2\2\u0426\u0427\7?\2\2\u0427\u0429\5\u00e6"+
		"t\2\u0428\u0422\3\2\2\2\u0428\u0425\3\2\2\2\u0429\u042c\3\2\2\2\u042a"+
		"\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u00e5\3\2\2\2\u042c\u042a\3\2"+
		"\2\2\u042d\u042e\bt\1\2\u042e\u042f\5\u00eav\2\u042f\u043b\3\2\2\2\u0430"+
		"\u0431\f\5\2\2\u0431\u0432\7@\2\2\u0432\u043a\5\u00eav\2\u0433\u0434\f"+
		"\4\2\2\u0434\u0435\7A\2\2\u0435\u043a\5\u00eav\2\u0436\u0437\f\3\2\2\u0437"+
		"\u0438\7B\2\2\u0438\u043a\5\u00eav\2\u0439\u0430\3\2\2\2\u0439\u0433\3"+
		"\2\2\2\u0439\u0436\3\2\2\2\u043a\u043d\3\2\2\2\u043b\u0439\3\2\2\2\u043b"+
		"\u043c\3\2\2\2\u043c\u00e7\3\2\2\2\u043d\u043b\3\2\2\2\u043e\u043f\7c"+
		"\2\2\u043f\u0440\5r:\2\u0440\u0441\7d\2\2\u0441\u0442\5\u00eav\2\u0442"+
		"\u0449\3\2\2\2\u0443\u0444\7c\2\2\u0444\u0445\5z>\2\u0445\u0446\7d\2\2"+
		"\u0446\u0447\5\u00ecw\2\u0447\u0449\3\2\2\2\u0448\u043e\3\2\2\2\u0448"+
		"\u0443\3\2\2\2\u0449\u00e9\3\2\2\2\u044a\u0451\3\2\2\2\u044b\u044c\7>"+
		"\2\2\u044c\u0451\5\u00eav\2\u044d\u044e\7?\2\2\u044e\u0451\5\u00eav\2"+
		"\u044f\u0451\5\u00ecw\2\u0450\u044a\3\2\2\2\u0450\u044b\3\2\2\2\u0450"+
		"\u044d\3\2\2\2\u0450\u044f\3\2\2\2\u0451\u00eb\3\2\2\2\u0452\u0459\5\u00f2"+
		"z\2\u0453\u0454\7;\2\2\u0454\u0459\5\u00eav\2\u0455\u0456\7\67\2\2\u0456"+
		"\u0459\5\u00eav\2\u0457\u0459\5\u00e8u\2\u0458\u0452\3\2\2\2\u0458\u0453"+
		"\3\2\2\2\u0458\u0455\3\2\2\2\u0458\u0457\3\2\2\2\u0459\u00ed\3\2\2\2\u045a"+
		"\u045b\5\u00f2z\2\u045b\u045c\7P\2\2\u045c\u00ef\3\2\2\2\u045d\u045e\5"+
		"\u00f2z\2\u045e\u045f\7O\2\2\u045f\u00f1\3\2\2\2\u0460\u0461\bz\1\2\u0461"+
		"\u0464\5\u00f6|\2\u0462\u0464\5\u010c\u0087\2\u0463\u0460\3\2\2\2\u0463"+
		"\u0462\3\2\2\2\u0464\u046b\3\2\2\2\u0465\u0466\f\4\2\2\u0466\u046a\7O"+
		"\2\2\u0467\u0468\f\3\2\2\u0468\u046a\7P\2\2\u0469\u0465\3\2\2\2\u0469"+
		"\u0467\3\2\2\2\u046a\u046d\3\2\2\2\u046b\u0469\3\2\2\2\u046b\u046c\3\2"+
		"\2\2\u046c\u00f3\3\2\2\2\u046d\u046b\3\2\2\2\u046e\u0470\7c\2\2\u046f"+
		"\u0471\5\u00fc\177\2\u0470\u046f\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0472"+
		"\3\2\2\2\u0472\u0485\7d\2\2\u0473\u0474\5\u00f6|\2\u0474\u0475\7k\2\2"+
		"\u0475\u0476\7\65\2\2\u0476\u0478\7c\2\2\u0477\u0479\5\u00fc\177\2\u0478"+
		"\u0477\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b\7d"+
		"\2\2\u047b\u0485\3\2\2\2\u047c\u047d\7\'\2\2\u047d\u047e\7k\2\2\u047e"+
		"\u047f\7\65\2\2\u047f\u0481\7c\2\2\u0480\u0482\5\u00fc\177\2\u0481\u0480"+
		"\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0485\7d\2\2\u0484"+
		"\u046e\3\2\2\2\u0484\u0473\3\2\2\2\u0484\u047c\3\2\2\2\u0485\u00f5\3\2"+
		"\2\2\u0486\u0487\b|\1\2\u0487\u0489\7c\2\2\u0488\u048a\5\u00fc\177\2\u0489"+
		"\u0488\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u049a\7d"+
		"\2\2\u048c\u048d\7\'\2\2\u048d\u048e\7k\2\2\u048e\u048f\7\65\2\2\u048f"+
		"\u0491\7c\2\2\u0490\u0492\5\u00fc\177\2\u0491\u0490\3\2\2\2\u0491\u0492"+
		"\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u049a\7d\2\2\u0494\u049a\5\u00f8}\2"+
		"\u0495\u0496\7\'\2\2\u0496\u0497\7k\2\2\u0497\u049a\7\65\2\2\u0498\u049a"+
		"\5\u00fe\u0080\2\u0499\u0486\3\2\2\2\u0499\u048c\3\2\2\2\u0499\u0494\3"+
		"\2\2\2\u0499\u0495\3\2\2\2\u0499\u0498\3\2\2\2\u049a\u04a8\3\2\2\2\u049b"+
		"\u049c\f\b\2\2\u049c\u049d\7k\2\2\u049d\u049e\7\65\2\2\u049e\u04a0\7c"+
		"\2\2\u049f\u04a1\5\u00fc\177\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2"+
		"\u04a1\u04a2\3\2\2\2\u04a2\u04a7\7d\2\2\u04a3\u04a4\f\5\2\2\u04a4\u04a5"+
		"\7k\2\2\u04a5\u04a7\7\65\2\2\u04a6\u049b\3\2\2\2\u04a6\u04a3\3\2\2\2\u04a7"+
		"\u04aa\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u00f7\3\2"+
		"\2\2\u04aa\u04a8\3\2\2\2\u04ab\u04ac\b}\1\2\u04ac\u04b9\5\u010e\u0088"+
		"\2\u04ad\u04b9\7*\2\2\u04ae\u04af\7c\2\2\u04af\u04b0\5\u00caf\2\u04b0"+
		"\u04b1\7d\2\2\u04b1\u04b9\3\2\2\2\u04b2\u04b9\5\u00fa~\2\u04b3\u04b4\5"+
		"\u010c\u0087\2\u04b4\u04b5\7e\2\2\u04b5\u04b6\5\u00caf\2\u04b6\u04b7\7"+
		"f\2\2\u04b7\u04b9\3\2\2\2\u04b8\u04ab\3\2\2\2\u04b8\u04ad\3\2\2\2\u04b8"+
		"\u04ae\3\2\2\2\u04b8\u04b2\3\2\2\2\u04b8\u04b3\3\2\2\2\u04b9\u04c1\3\2"+
		"\2\2\u04ba\u04bb\f\3\2\2\u04bb\u04bc\7e\2\2\u04bc\u04bd\5\u00caf\2\u04bd"+
		"\u04be\7f\2\2\u04be\u04c0\3\2\2\2\u04bf\u04ba\3\2\2\2\u04c0\u04c3\3\2"+
		"\2\2\u04c1\u04bf\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u00f9\3\2\2\2\u04c3"+
		"\u04c1\3\2\2\2\u04c4\u04c5\7\37\2\2\u04c5\u04c6\5~@\2\u04c6\u04c8\7c\2"+
		"\2\u04c7\u04c9\5\u00fc\177\2\u04c8\u04c7\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9"+
		"\u04ca\3\2\2\2\u04ca\u04cb\7d\2\2\u04cb\u00fb\3\2\2\2\u04cc\u04cd\b\177"+
		"\1\2\u04cd\u04ce\5\u00caf\2\u04ce\u04d4\3\2\2\2\u04cf\u04d0\f\3\2\2\u04d0"+
		"\u04d1\7i\2\2\u04d1\u04d3\5\u00caf\2\u04d2\u04cf\3\2\2\2\u04d3\u04d6\3"+
		"\2\2\2\u04d4\u04d2\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u00fd\3\2\2\2\u04d6"+
		"\u04d4\3\2\2\2\u04d7\u04d8\7\37\2\2\u04d8\u04d9\5r:\2\u04d9\u04db\5\u0100"+
		"\u0081\2\u04da\u04dc\5\u0104\u0083\2\u04db\u04da\3\2\2\2\u04db\u04dc\3"+
		"\2\2\2\u04dc\u04e4\3\2\2\2\u04dd\u04de\7\37\2\2\u04de\u04df\5|?\2\u04df"+
		"\u04e1\5\u0100\u0081\2\u04e0\u04e2\5\u0104\u0083\2\u04e1\u04e0\3\2\2\2"+
		"\u04e1\u04e2\3\2\2\2\u04e2\u04e4\3\2\2\2\u04e3\u04d7\3\2\2\2\u04e3\u04dd"+
		"\3\2\2\2\u04e4\u00ff\3\2\2\2\u04e5\u04e6\b\u0081\1\2\u04e6\u04e7\5\u0102"+
		"\u0082\2\u04e7\u04ec\3\2\2\2\u04e8\u04e9\f\3\2\2\u04e9\u04eb\5\u0102\u0082"+
		"\2\u04ea\u04e8\3\2\2\2\u04eb\u04ee\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed"+
		"\3\2\2\2\u04ed\u0101\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ef\u04f0\7e\2\2\u04f0"+
		"\u04f1\5\u00caf\2\u04f1\u04f2\7f\2\2\u04f2\u0103\3\2\2\2\u04f3\u04f4\b"+
		"\u0083\1\2\u04f4\u04f5\7e\2\2\u04f5\u04f6\7f\2\2\u04f6\u04fc\3\2\2\2\u04f7"+
		"\u04f8\f\3\2\2\u04f8\u04f9\7e\2\2\u04f9\u04fb\7f\2\2\u04fa\u04f7\3\2\2"+
		"\2\u04fb\u04fe\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u0105"+
		"\3\2\2\2\u04fe\u04fc\3\2\2\2\u04ff\u0500\b\u0084\1\2\u0500\u0501\7\65"+
		"\2\2\u0501\u0507\3\2\2\2\u0502\u0503\f\3\2\2\u0503\u0504\7k\2\2\u0504"+
		"\u0506\7\65\2\2\u0505\u0502\3\2\2\2\u0506\u0509\3\2\2\2\u0507\u0505\3"+
		"\2\2\2\u0507\u0508\3\2\2\2\u0508\u0107\3\2\2\2\u0509\u0507\3\2\2\2\u050a"+
		"\u0510\7\65\2\2\u050b\u050c\5\u0106\u0084\2\u050c\u050d\7k\2\2\u050d\u050e"+
		"\7\65\2\2\u050e\u0510\3\2\2\2\u050f\u050a\3\2\2\2\u050f\u050b\3\2\2\2"+
		"\u0510\u0109\3\2\2\2\u0511\u0512\7\65\2\2\u0512\u010b\3\2\2\2\u0513\u0517"+
		"\7\65\2\2\u0514\u0515\7k\2\2\u0515\u0517\7\65\2\2\u0516\u0513\3\2\2\2"+
		"\u0516\u0514\3\2\2\2\u0517\u010d\3\2\2\2\u0518\u051f\5\u0110\u0089\2\u0519"+
		"\u051f\5\u0112\u008a\2\u051a\u051f\5\u0114\u008b\2\u051b\u051f\7^\2\2"+
		"\u051c\u051f\7_\2\2\u051d\u051f\7\62\2\2\u051e\u0518\3\2\2\2\u051e\u0519"+
		"\3\2\2\2\u051e\u051a\3\2\2\2\u051e\u051b\3\2\2\2\u051e\u051c\3\2\2\2\u051e"+
		"\u051d\3\2\2\2\u051f\u010f\3\2\2\2\u0520\u0521\t\13\2\2\u0521\u0111\3"+
		"\2\2\2\u0522\u0523\t\f\2\2\u0523\u0113\3\2\2\2\u0524\u0525\t\r\2\2\u0525"+
		"\u0115\3\2\2\2}\u0117\u011a\u011d\u012a\u012f\u0142\u0148\u014b\u0150"+
		"\u0153\u015e\u0171\u0176\u0181\u0186\u018a\u018d\u0199\u01a1\u01ad\u01bb"+
		"\u01c0\u01c3\u01ca\u01d0\u01d3\u01d6\u01e3\u01f0\u01f8\u0202\u0207\u020d"+
		"\u021b\u0223\u0229\u022c\u0231\u023c\u024a\u024f\u025a\u025f\u0268\u0275"+
		"\u027c\u028a\u0290\u0297\u029c\u02a0\u02a8\u02ac\u02b8\u02c3\u02c8\u02d5"+
		"\u02db\u02e8\u02fc\u030c\u030f\u031a\u0339\u033d\u0341\u0349\u034d\u0351"+
		"\u0358\u0364\u0369\u036f\u0375\u038a\u038c\u0395\u03a2\u03b0\u03ba\u03c5"+
		"\u03d0\u03db\u03e6\u03f2\u03f4\u0409\u040b\u041a\u041c\u0428\u042a\u0439"+
		"\u043b\u0448\u0450\u0458\u0463\u0469\u046b\u0470\u0478\u0481\u0484\u0489"+
		"\u0491\u0499\u04a0\u04a6\u04a8\u04b8\u04c1\u04c8\u04d4\u04db\u04e1\u04e3"+
		"\u04ec\u04fc\u0507\u050f\u0516\u051e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}