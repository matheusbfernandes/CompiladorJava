// Generated from D:/CompiladorJava/src/analisadores\Java.g4 by ANTLR 4.7
package analisadores;
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
		StringNaoTerminada=108, ComentarioNaoTerminado=109, ERROR=110;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclarations = 2, 
		RULE_importDeclaration = 3, RULE_singleTypeImportDeclaration = 4, RULE_typeImportOnDemandDeclaration = 5, 
		RULE_typeDeclarations = 6, RULE_typeDeclaration = 7, RULE_classDeclaration = 8, 
		RULE_classModifiers = 9, RULE_classModifier = 10, RULE_superRule = 11, 
		RULE_interfaces = 12, RULE_interfaceTypeList = 13, RULE_classBody = 14, 
		RULE_classBodyDeclarations = 15, RULE_classBodyDeclaration = 16, RULE_classMemberDeclaration = 17, 
		RULE_staticInitializer = 18, RULE_constructorDeclaration = 19, RULE_constructorModifiers = 20, 
		RULE_constructorModifier = 21, RULE_constructorDeclarator = 22, RULE_formalParameterList = 23, 
		RULE_formalParameter = 24, RULE_throwsRule = 25, RULE_classTypeList = 26, 
		RULE_constructorBody = 27, RULE_explicitConstructorInvocation = 28, RULE_fieldDeclaration = 29, 
		RULE_fieldModifiers = 30, RULE_fieldModifier = 31, RULE_variableDeclarators = 32, 
		RULE_variableDeclarator = 33, RULE_variableDeclaratorId = 34, RULE_variableInitializer = 35, 
		RULE_methodDeclaration = 36, RULE_methodHeader = 37, RULE_resultType = 38, 
		RULE_methodModifiers = 39, RULE_methodModifier = 40, RULE_methodDeclarator = 41, 
		RULE_methodBody = 42, RULE_interfaceDeclaration = 43, RULE_interfaceModifiers = 44, 
		RULE_interfaceModifier = 45, RULE_extendsInterfaces = 46, RULE_interfaceBody = 47, 
		RULE_interfaceMemberDeclarations = 48, RULE_interfaceMemberDeclaration = 49, 
		RULE_constantDeclaration = 50, RULE_constantModifiers = 51, RULE_abstractMethodDeclaration = 52, 
		RULE_abstractMethodModifiers = 53, RULE_abstractMethodModifier = 54, RULE_arrayInitializer = 55, 
		RULE_variableInitializers = 56, RULE_type = 57, RULE_primitiveType = 58, 
		RULE_numericType = 59, RULE_integralType = 60, RULE_floatingPointType = 61, 
		RULE_referenceType = 62, RULE_classOrInterfaceType = 63, RULE_classType = 64, 
		RULE_interfaceType = 65, RULE_arrayType = 66, RULE_block = 67, RULE_blockStatements = 68, 
		RULE_blockStatement = 69, RULE_localVariableDeclarationStatement = 70, 
		RULE_localVariableDeclaration = 71, RULE_statement = 72, RULE_statementNoShortIf = 73, 
		RULE_statementWithoutTrailingSubstatement = 74, RULE_emptyStatement = 75, 
		RULE_labeledStatement = 76, RULE_labeledStatementNoShortIf = 77, RULE_expressionStatement = 78, 
		RULE_statementExpression = 79, RULE_ifThenStatement = 80, RULE_ifThenElseStatement = 81, 
		RULE_ifThenElseStatementNoShortIf = 82, RULE_switchStatement = 83, RULE_switchBlock = 84, 
		RULE_switchBlockStatementGroups = 85, RULE_switchBlockStatementGroup = 86, 
		RULE_switchLabels = 87, RULE_switchLabel = 88, RULE_whileStatement = 89, 
		RULE_whileStatementNoShortIf = 90, RULE_doStatement = 91, RULE_forStatement = 92, 
		RULE_forStatementNoShortIf = 93, RULE_forInit = 94, RULE_forUpdate = 95, 
		RULE_statementExpressionList = 96, RULE_breakStatement = 97, RULE_continueStatement = 98, 
		RULE_returnStatement = 99, RULE_throwsStatement = 100, RULE_synchronizedStatement = 101, 
		RULE_tryStatement = 102, RULE_catches = 103, RULE_catchClause = 104, RULE_finallyRule = 105, 
		RULE_constantExpression = 106, RULE_expression = 107, RULE_assignmentExpression = 108, 
		RULE_assignment = 109, RULE_leftHandSide = 110, RULE_assignmentOperator = 111, 
		RULE_conditionalExpression = 112, RULE_conditionalOrExpression = 113, 
		RULE_conditionalAndExpression = 114, RULE_inclusiveOrExpression = 115, 
		RULE_exclusiveOrExpression = 116, RULE_andExpression = 117, RULE_equalityExpression = 118, 
		RULE_relationalExpression = 119, RULE_shiftExpression = 120, RULE_additiveExpression = 121, 
		RULE_multiplicativeExpression = 122, RULE_castExpression = 123, RULE_unaryExpression = 124, 
		RULE_predecrementExpression = 125, RULE_preincrementExpression = 126, 
		RULE_unaryExpressionNotPlusMinus = 127, RULE_postdecrementExpression = 128, 
		RULE_postincrementExpression = 129, RULE_postfixExpression = 130, RULE_methodInvocation = 131, 
		RULE_fieldAccess = 132, RULE_primary = 133, RULE_primaryNoNewArray = 134, 
		RULE_classInstanceCreationExpression = 135, RULE_argumentList = 136, RULE_arrayCreationExpression = 137, 
		RULE_dimExprs = 138, RULE_dimExpr = 139, RULE_dims = 140, RULE_arrayAccess = 141, 
		RULE_packageName = 142, RULE_typeName = 143, RULE_simpleTypeName = 144, 
		RULE_expressionName = 145, RULE_methodName = 146, RULE_ambiguousName = 147, 
		RULE_literal = 148, RULE_integerLiteral = 149, RULE_floatingPointLiteral = 150, 
		RULE_booleanLiteral = 151;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclarations", "importDeclaration", 
		"singleTypeImportDeclaration", "typeImportOnDemandDeclaration", "typeDeclarations", 
		"typeDeclaration", "classDeclaration", "classModifiers", "classModifier", 
		"superRule", "interfaces", "interfaceTypeList", "classBody", "classBodyDeclarations", 
		"classBodyDeclaration", "classMemberDeclaration", "staticInitializer", 
		"constructorDeclaration", "constructorModifiers", "constructorModifier", 
		"constructorDeclarator", "formalParameterList", "formalParameter", "throwsRule", 
		"classTypeList", "constructorBody", "explicitConstructorInvocation", "fieldDeclaration", 
		"fieldModifiers", "fieldModifier", "variableDeclarators", "variableDeclarator", 
		"variableDeclaratorId", "variableInitializer", "methodDeclaration", "methodHeader", 
		"resultType", "methodModifiers", "methodModifier", "methodDeclarator", 
		"methodBody", "interfaceDeclaration", "interfaceModifiers", "interfaceModifier", 
		"extendsInterfaces", "interfaceBody", "interfaceMemberDeclarations", "interfaceMemberDeclaration", 
		"constantDeclaration", "constantModifiers", "abstractMethodDeclaration", 
		"abstractMethodModifiers", "abstractMethodModifier", "arrayInitializer", 
		"variableInitializers", "type", "primitiveType", "numericType", "integralType", 
		"floatingPointType", "referenceType", "classOrInterfaceType", "classType", 
		"interfaceType", "arrayType", "block", "blockStatements", "blockStatement", 
		"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
		"statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement", 
		"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
		"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
		"switchStatement", "switchBlock", "switchBlockStatementGroups", "switchBlockStatementGroup", 
		"switchLabels", "switchLabel", "whileStatement", "whileStatementNoShortIf", 
		"doStatement", "forStatement", "forStatementNoShortIf", "forInit", "forUpdate", 
		"statementExpressionList", "breakStatement", "continueStatement", "returnStatement", 
		"throwsStatement", "synchronizedStatement", "tryStatement", "catches", 
		"catchClause", "finallyRule", "constantExpression", "expression", "assignmentExpression", 
		"assignment", "leftHandSide", "assignmentOperator", "conditionalExpression", 
		"conditionalOrExpression", "conditionalAndExpression", "inclusiveOrExpression", 
		"exclusiveOrExpression", "andExpression", "equalityExpression", "relationalExpression", 
		"shiftExpression", "additiveExpression", "multiplicativeExpression", "castExpression", 
		"unaryExpression", "predecrementExpression", "preincrementExpression", 
		"unaryExpressionNotPlusMinus", "postdecrementExpression", "postincrementExpression", 
		"postfixExpression", "methodInvocation", "fieldAccess", "primary", "primaryNoNewArray", 
		"classInstanceCreationExpression", "argumentList", "arrayCreationExpression", 
		"dimExprs", "dimExpr", "dims", "arrayAccess", "packageName", "typeName", 
		"simpleTypeName", "expressionName", "methodName", "ambiguousName", "literal", 
		"integerLiteral", "floatingPointLiteral", "booleanLiteral"
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
		"StringNaoTerminada", "ComentarioNaoTerminado", "ERROR"
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
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(304);
				packageDeclaration();
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORT) {
				{
				setState(307);
				importDeclarations(0);
				}
			}

			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << FINAL) | (1L << INTERFACE) | (1L << PUBLIC))) != 0) || _la==PontoVirgula) {
				{
				setState(310);
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
			setState(313);
			match(PACKAGE);
			setState(314);
			packageName(0);
			setState(315);
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
			setState(318);
			importDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(324);
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
					setState(320);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(321);
					importDeclaration();
					}
					} 
				}
				setState(326);
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
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
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
			setState(331);
			match(IMPORT);
			setState(332);
			typeName();
			setState(333);
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
			setState(335);
			match(IMPORT);
			setState(336);
			packageName(0);
			setState(337);
			match(Ponto);
			setState(338);
			match(OpMulti);
			setState(339);
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
			setState(342);
			typeDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
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
					setState(344);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(345);
					typeDeclaration();
					}
					} 
				}
				setState(350);
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
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
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
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PUBLIC))) != 0)) {
				{
				setState(356);
				classModifiers(0);
				}
			}

			setState(359);
			match(CLASS);
			setState(360);
			match(ID);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(361);
				superRule();
				}
			}

			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(364);
				interfaces();
				}
			}

			setState(367);
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
			setState(370);
			classModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(376);
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
					setState(372);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(373);
					classModifier();
					}
					} 
				}
				setState(378);
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
			setState(379);
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
			setState(381);
			match(EXTENDS);
			setState(382);
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
			setState(384);
			match(IMPLEMENTS);
			setState(385);
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
			setState(388);
			interfaceType();
			}
			_ctx.stop = _input.LT(-1);
			setState(395);
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
					setState(390);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(391);
					match(Virgula);
					setState(392);
					interfaceType();
					}
					} 
				}
				setState(397);
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
			setState(398);
			match(ACh);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << ID))) != 0)) {
				{
				setState(399);
				classBodyDeclarations(0);
				}
			}

			setState(402);
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
			setState(405);
			classBodyDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
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
					setState(407);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(408);
					classBodyDeclaration();
					}
					} 
				}
				setState(413);
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
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
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
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				classMemberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				staticInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
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
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
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

	public static class StaticInitializerContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStaticInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitStaticInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(STATIC);
			setState(424);
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
		public ThrowsRuleContext throwsRule() {
			return getRuleContext(ThrowsRuleContext.class,0);
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
		enterRule(_localctx, 38, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(426);
				constructorModifiers(0);
				}
			}

			setState(429);
			constructorDeclarator();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(430);
				throwsRule();
				}
			}

			setState(433);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_constructorModifiers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(436);
			constructorModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstructorModifiersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constructorModifiers);
					setState(438);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(439);
					constructorModifier();
					}
					} 
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 42, RULE_constructorModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
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
		enterRule(_localctx, 44, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			simpleTypeName();
			setState(448);
			match(AP);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << ID))) != 0)) {
				{
				setState(449);
				formalParameterList(0);
				}
			}

			setState(452);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_formalParameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(455);
			formalParameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FormalParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_formalParameterList);
					setState(457);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(458);
					match(PontoVirgula);
					setState(459);
					formalParameter();
					}
					} 
				}
				setState(464);
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
		enterRule(_localctx, 48, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			type(0);
			setState(466);
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

	public static class ThrowsRuleContext extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public ClassTypeListContext classTypeList() {
			return getRuleContext(ClassTypeListContext.class,0);
		}
		public ThrowsRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwsRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterThrowsRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitThrowsRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitThrowsRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowsRuleContext throwsRule() throws RecognitionException {
		ThrowsRuleContext _localctx = new ThrowsRuleContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_throwsRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(THROWS);
			setState(469);
			classTypeList(0);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_classTypeList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(472);
			classType();
			}
			_ctx.stop = _input.LT(-1);
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ClassTypeListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_classTypeList);
					setState(474);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(475);
					match(Virgula);
					setState(476);
					classType();
					}
					} 
				}
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 54, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(ACh);
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(483);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << WHILE) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)) | (1L << (ACh - 77)) | (1L << (PontoVirgula - 77)))) != 0)) {
				{
				setState(486);
				blockStatements(0);
				}
			}

			setState(489);
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
		enterRule(_localctx, 56, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				match(THIS);
				setState(492);
				match(AP);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpNOT) | (1L << OpBitComp) | (1L << OpSoma) | (1L << OpSub))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)))) != 0)) {
					{
					setState(493);
					argumentList(0);
					}
				}

				setState(496);
				match(FP);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(SUPER);
				setState(498);
				match(AP);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpNOT) | (1L << OpBitComp) | (1L << OpSoma) | (1L << OpSub))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)))) != 0)) {
					{
					setState(499);
					argumentList(0);
					}
				}

				setState(502);
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
		enterRule(_localctx, 58, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) {
				{
				setState(505);
				fieldModifiers(0);
				}
			}

			setState(508);
			type(0);
			setState(509);
			variableDeclarators(0);
			setState(510);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_fieldModifiers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(513);
			fieldModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FieldModifiersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fieldModifiers);
					setState(515);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(516);
					fieldModifier();
					}
					} 
				}
				setState(521);
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
		enterRule(_localctx, 62, RULE_fieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_variableDeclarators, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(525);
			variableDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableDeclaratorsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variableDeclarators);
					setState(527);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(528);
					match(Virgula);
					setState(529);
					variableDeclarator();
					}
					} 
				}
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 66, RULE_variableDeclarator);
		try {
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				variableDeclaratorId(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				variableDeclaratorId(0);
				setState(537);
				match(OpAtribuicao);
				setState(538);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_variableDeclaratorId, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(543);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableDeclaratorIdContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variableDeclaratorId);
					setState(545);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(546);
					match(AC);
					setState(547);
					match(FC);
					}
					} 
				}
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 70, RULE_variableInitializer);
		try {
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
			case SUPER:
			case THIS:
			case NULL:
			case TRUE:
			case FALSE:
			case ID:
			case OpNOT:
			case OpBitComp:
			case OpSoma:
			case OpSub:
			case Incremento:
			case Decremento:
			case DecimalNumeral:
			case OctalNumeral:
			case HexNumeral:
			case FloatNumeral:
			case DoubleNumeral:
			case Character:
			case String:
			case AP:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				expression();
				}
				break;
			case ACh:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				arrayInitializer();
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
		enterRule(_localctx, 72, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			methodHeader();
			setState(558);
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
		public ThrowsRuleContext throwsRule() {
			return getRuleContext(ThrowsRuleContext.class,0);
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
		enterRule(_localctx, 74, RULE_methodHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << SYNCHRONIZED))) != 0)) {
				{
				setState(560);
				methodModifiers(0);
				}
			}

			setState(563);
			resultType();
			setState(564);
			methodDeclarator();
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(565);
				throwsRule();
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

	public static class ResultTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
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
		enterRule(_localctx, 76, RULE_resultType);
		try {
			setState(570);
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
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				type(0);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				match(VOID);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_methodModifiers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(573);
			methodModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MethodModifiersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_methodModifiers);
					setState(575);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(576);
					methodModifier();
					}
					} 
				}
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 80, RULE_methodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
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
		enterRule(_localctx, 82, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(ID);
			setState(585);
			match(AP);
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << ID))) != 0)) {
				{
				setState(586);
				formalParameterList(0);
				}
			}

			setState(589);
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
		enterRule(_localctx, 84, RULE_methodBody);
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACh:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				block();
				}
				break;
			case PontoVirgula:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
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
		enterRule(_localctx, 86, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==PUBLIC) {
				{
				setState(595);
				interfaceModifiers(0);
				}
			}

			setState(598);
			match(INTERFACE);
			setState(599);
			match(ID);
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(600);
				extendsInterfaces(0);
				}
			}

			setState(603);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_interfaceModifiers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(606);
			interfaceModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InterfaceModifiersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_interfaceModifiers);
					setState(608);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(609);
					interfaceModifier();
					}
					} 
				}
				setState(614);
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
		enterRule(_localctx, 90, RULE_interfaceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_extendsInterfaces, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(618);
			match(EXTENDS);
			setState(619);
			interfaceType();
			}
			_ctx.stop = _input.LT(-1);
			setState(626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExtendsInterfacesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_extendsInterfaces);
					setState(621);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(622);
					match(Virgula);
					setState(623);
					interfaceType();
					}
					} 
				}
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 94, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(ACh);
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				setState(630);
				interfaceMemberDeclarations(0);
				}
			}

			setState(633);
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_interfaceMemberDeclarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(636);
			interfaceMemberDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InterfaceMemberDeclarationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_interfaceMemberDeclarations);
					setState(638);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(639);
					interfaceMemberDeclaration();
					}
					} 
				}
				setState(644);
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
		enterRule(_localctx, 98, RULE_interfaceMemberDeclaration);
		try {
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
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
		enterRule(_localctx, 100, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			constantModifiers();
			setState(650);
			type(0);
			setState(651);
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
		enterRule(_localctx, 102, RULE_constantModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
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
		public ThrowsRuleContext throwsRule() {
			return getRuleContext(ThrowsRuleContext.class,0);
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
		enterRule(_localctx, 104, RULE_abstractMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT || _la==PUBLIC) {
				{
				setState(655);
				abstractMethodModifiers(0);
				}
			}

			setState(658);
			resultType();
			setState(659);
			methodDeclarator();
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(660);
				throwsRule();
				}
			}

			setState(663);
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
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_abstractMethodModifiers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(666);
			abstractMethodModifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AbstractMethodModifiersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_abstractMethodModifiers);
					setState(668);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(669);
					abstractMethodModifier();
					}
					} 
				}
				setState(674);
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
		enterRule(_localctx, 108, RULE_abstractMethodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
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
		enterRule(_localctx, 110, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(ACh);
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpNOT) | (1L << OpBitComp) | (1L << OpSoma) | (1L << OpSub))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)) | (1L << (ACh - 77)))) != 0)) {
				{
				setState(678);
				variableInitializers(0);
				}
			}

			setState(681);
			match(Virgula);
			setState(682);
			match(Interrogacao);
			setState(683);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_variableInitializers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(686);
			variableInitializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(693);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableInitializersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variableInitializers);
					setState(688);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(689);
					match(Virgula);
					setState(690);
					variableInitializer();
					}
					} 
				}
				setState(695);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
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
				setState(697);
				primitiveType();
				}
				break;
			case ID:
				{
				setState(698);
				classOrInterfaceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(706);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(701);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(702);
					match(AC);
					setState(703);
					match(FC);
					}
					} 
				}
				setState(708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		enterRule(_localctx, 116, RULE_primitiveType);
		try {
			setState(711);
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
				setState(709);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
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
		enterRule(_localctx, 118, RULE_numericType);
		try {
			setState(715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
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
		enterRule(_localctx, 120, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
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
		enterRule(_localctx, 122, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
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
		enterRule(_localctx, 124, RULE_referenceType);
		try {
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
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
		enterRule(_localctx, 126, RULE_classOrInterfaceType);
		try {
			setState(727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
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
		enterRule(_localctx, 128, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
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
		enterRule(_localctx, 130, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
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
		enterRule(_localctx, 132, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			type(0);
			setState(734);
			match(AC);
			setState(735);
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
		enterRule(_localctx, 134, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(ACh);
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << WHILE) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)) | (1L << (ACh - 77)) | (1L << (PontoVirgula - 77)))) != 0)) {
				{
				setState(738);
				blockStatements(0);
				}
			}

			setState(741);
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
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_blockStatements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(744);
			blockStatement();
			}
			_ctx.stop = _input.LT(-1);
			setState(750);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockStatementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockStatements);
					setState(746);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(747);
					blockStatement();
					}
					} 
				}
				setState(752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		enterRule(_localctx, 138, RULE_blockStatement);
		try {
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
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
		enterRule(_localctx, 140, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			localVariableDeclaration();
			setState(758);
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
		enterRule(_localctx, 142, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			type(0);
			setState(761);
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
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
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
		enterRule(_localctx, 144, RULE_statement);
		try {
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(765);
				ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(766);
				ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(767);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(768);
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
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
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
		enterRule(_localctx, 146, RULE_statementNoShortIf);
		try {
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(773);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(774);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(775);
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
		enterRule(_localctx, 148, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACh:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				block();
				}
				break;
			case PontoVirgula:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
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
			case Incremento:
			case Decremento:
			case DecimalNumeral:
			case OctalNumeral:
			case HexNumeral:
			case FloatNumeral:
			case DoubleNumeral:
			case Character:
			case String:
			case AP:
				enterOuterAlt(_localctx, 3);
				{
				setState(780);
				expressionStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(781);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(782);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 6);
				{
				setState(783);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(784);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(785);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 9);
				{
				setState(786);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 10);
				{
				setState(787);
				throwsStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 11);
				{
				setState(788);
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
		enterRule(_localctx, 150, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
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
		enterRule(_localctx, 152, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(ID);
			setState(794);
			match(DoisPontos);
			setState(795);
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
		enterRule(_localctx, 154, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(ID);
			setState(798);
			match(DoisPontos);
			setState(799);
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
		enterRule(_localctx, 156, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			statementExpression();
			setState(802);
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
		public PreincrementExpressionContext preincrementExpression() {
			return getRuleContext(PreincrementExpressionContext.class,0);
		}
		public PostincrementExpressionContext postincrementExpression() {
			return getRuleContext(PostincrementExpressionContext.class,0);
		}
		public PredecrementExpressionContext predecrementExpression() {
			return getRuleContext(PredecrementExpressionContext.class,0);
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
		enterRule(_localctx, 158, RULE_statementExpression);
		try {
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				preincrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(806);
				postincrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(807);
				predecrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(808);
				postdecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(809);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(810);
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
		enterRule(_localctx, 160, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(IF);
			setState(814);
			match(AP);
			setState(815);
			expression();
			setState(816);
			match(FP);
			setState(817);
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

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitIfThenElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitIfThenElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(IF);
			setState(820);
			match(AP);
			setState(821);
			expression();
			setState(822);
			match(FP);
			setState(823);
			statementNoShortIf();
			setState(824);
			match(ELSE);
			setState(825);
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

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public TerminalNode AP() { return getToken(JavaParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(JavaParser.FP, 0); }
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitIfThenElseStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitIfThenElseStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(IF);
			setState(828);
			match(AP);
			setState(829);
			expression();
			setState(830);
			match(FP);
			setState(831);
			statementNoShortIf();
			setState(832);
			match(ELSE);
			setState(833);
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
		enterRule(_localctx, 166, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(SWITCH);
			setState(836);
			match(AP);
			setState(837);
			expression();
			setState(838);
			match(FP);
			setState(839);
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
		enterRule(_localctx, 168, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(ACh);
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(842);
				switchBlockStatementGroups(0);
				}
				break;
			}
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==DEFAULT) {
				{
				setState(845);
				switchLabels(0);
				}
			}

			setState(848);
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
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_switchBlockStatementGroups, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(851);
			switchBlockStatementGroup();
			}
			_ctx.stop = _input.LT(-1);
			setState(857);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SwitchBlockStatementGroupsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_switchBlockStatementGroups);
					setState(853);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(854);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(859);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		enterRule(_localctx, 172, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			switchLabels(0);
			setState(861);
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
		public SwitchLabelContext switchLabel() {
			return getRuleContext(SwitchLabelContext.class,0);
		}
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
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
		return switchLabels(0);
	}

	private SwitchLabelsContext switchLabels(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, _parentState);
		SwitchLabelsContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_switchLabels, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(864);
			switchLabel();
			}
			_ctx.stop = _input.LT(-1);
			setState(870);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SwitchLabelsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_switchLabels);
					setState(866);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(867);
					switchLabel();
					}
					} 
				}
				setState(872);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode DoisPontos() { return getToken(JavaParser.DoisPontos, 0); }
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_switchLabel);
		try {
			setState(879);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				match(CASE);
				setState(874);
				constantExpression();
				setState(875);
				match(DoisPontos);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				match(DEFAULT);
				setState(878);
				match(DoisPontos);
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
		enterRule(_localctx, 178, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(WHILE);
			setState(882);
			match(AP);
			setState(883);
			expression();
			setState(884);
			match(FP);
			setState(885);
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
		enterRule(_localctx, 180, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(WHILE);
			setState(888);
			match(AP);
			setState(889);
			expression();
			setState(890);
			match(FP);
			setState(891);
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
		enterRule(_localctx, 182, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(DO);
			setState(894);
			statement();
			setState(895);
			match(WHILE);
			setState(896);
			match(AP);
			setState(897);
			expression();
			setState(898);
			match(FP);
			setState(899);
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
		enterRule(_localctx, 184, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(FOR);
			setState(902);
			match(AP);
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)))) != 0)) {
				{
				setState(903);
				forInit();
				}
			}

			setState(906);
			match(PontoVirgula);
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpNOT) | (1L << OpBitComp) | (1L << OpSoma) | (1L << OpSub))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)))) != 0)) {
				{
				setState(907);
				expression();
				}
			}

			setState(910);
			match(PontoVirgula);
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)))) != 0)) {
				{
				setState(911);
				forUpdate();
				}
			}

			setState(914);
			match(FP);
			setState(915);
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
		enterRule(_localctx, 186, RULE_forStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			match(FOR);
			setState(918);
			match(AP);
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)))) != 0)) {
				{
				setState(919);
				forInit();
				}
			}

			setState(922);
			match(PontoVirgula);
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpNOT) | (1L << OpBitComp) | (1L << OpSoma) | (1L << OpSub))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)))) != 0)) {
				{
				setState(923);
				expression();
				}
			}

			setState(926);
			match(PontoVirgula);
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)))) != 0)) {
				{
				setState(927);
				forUpdate();
				}
			}

			setState(930);
			match(FP);
			setState(931);
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
		enterRule(_localctx, 188, RULE_forInit);
		try {
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(933);
				statementExpressionList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(934);
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
		enterRule(_localctx, 190, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
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
		int _startState = 192;
		enterRecursionRule(_localctx, 192, RULE_statementExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(940);
			statementExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(947);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementExpressionList);
					setState(942);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(943);
					match(Virgula);
					setState(944);
					statementExpression();
					}
					} 
				}
				setState(949);
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
		enterRule(_localctx, 194, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			match(BREAK);
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(951);
				match(ID);
				}
			}

			setState(954);
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
		enterRule(_localctx, 196, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(CONTINUE);
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(957);
				match(ID);
				}
			}

			setState(960);
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
		enterRule(_localctx, 198, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(RETURN);
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpNOT) | (1L << OpBitComp) | (1L << OpSoma) | (1L << OpSub))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)))) != 0)) {
				{
				setState(963);
				expression();
				}
			}

			setState(966);
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
		enterRule(_localctx, 200, RULE_throwsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(THROW);
			setState(969);
			expression();
			setState(970);
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
		enterRule(_localctx, 202, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(SYNCHRONIZED);
			setState(973);
			match(AP);
			setState(974);
			expression();
			setState(975);
			match(FP);
			setState(976);
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
		public FinallyRuleContext finallyRule() {
			return getRuleContext(FinallyRuleContext.class,0);
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
		enterRule(_localctx, 204, RULE_tryStatement);
		int _la;
		try {
			setState(989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				match(TRY);
				setState(979);
				block();
				setState(980);
				catches(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(982);
				match(TRY);
				setState(983);
				block();
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(984);
					catches(0);
					}
				}

				setState(987);
				finallyRule();
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
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_catches, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(992);
			catchClause();
			}
			_ctx.stop = _input.LT(-1);
			setState(998);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CatchesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_catches);
					setState(994);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(995);
					catchClause();
					}
					} 
				}
				setState(1000);
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
		enterRule(_localctx, 208, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(CATCH);
			setState(1002);
			match(AP);
			setState(1003);
			formalParameter();
			setState(1004);
			match(FP);
			setState(1005);
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

	public static class FinallyRuleContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(JavaParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFinallyRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFinallyRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFinallyRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyRuleContext finallyRule() throws RecognitionException {
		FinallyRuleContext _localctx = new FinallyRuleContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_finallyRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			match(FINALLY);
			setState(1008);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
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
		enterRule(_localctx, 214, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
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
		enterRule(_localctx, 216, RULE_assignmentExpression);
		try {
			setState(1016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1014);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1015);
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
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
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
		enterRule(_localctx, 218, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			leftHandSide();
			setState(1019);
			assignmentOperator();
			setState(1020);
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

	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLeftHandSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLeftHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_leftHandSide);
		try {
			setState(1025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1022);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1023);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1024);
				arrayAccess();
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
		enterRule(_localctx, 222, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
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
		enterRule(_localctx, 224, RULE_conditionalExpression);
		try {
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1029);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1030);
				conditionalOrExpression(0);
				setState(1031);
				match(Interrogacao);
				setState(1032);
				expression();
				setState(1033);
				match(DoisPontos);
				setState(1034);
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
		int _startState = 226;
		enterRecursionRule(_localctx, 226, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1039);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1046);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(1041);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1042);
					match(OpOR);
					setState(1043);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(1048);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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
		int _startState = 228;
		enterRecursionRule(_localctx, 228, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1050);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1057);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(1052);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1053);
					match(OpAND);
					setState(1054);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(1059);
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
		int _startState = 230;
		enterRecursionRule(_localctx, 230, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1061);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1068);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(1063);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1064);
					match(OpBitOR);
					setState(1065);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(1070);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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
		int _startState = 232;
		enterRecursionRule(_localctx, 232, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1072);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1079);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(1074);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1075);
					match(OpBitXOR);
					setState(1076);
					andExpression(0);
					}
					} 
				}
				setState(1081);
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
		int _startState = 234;
		enterRecursionRule(_localctx, 234, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1083);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1090);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(1085);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1086);
					match(OpBitAND);
					setState(1087);
					equalityExpression(0);
					}
					} 
				}
				setState(1092);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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
		int _startState = 236;
		enterRecursionRule(_localctx, 236, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1094);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(1096);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1097);
						match(OpIgualdade);
						setState(1098);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(1099);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1100);
						match(OpDesigualdade);
						setState(1101);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(1106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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
		int _startState = 238;
		enterRecursionRule(_localctx, 238, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1108);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1110);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1111);
						match(OpMenor);
						setState(1112);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1113);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1114);
						match(OpMaior);
						setState(1115);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1116);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1117);
						match(OpMenorIgual);
						setState(1118);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1119);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1120);
						match(OpMaiorIgual);
						setState(1121);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(1122);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1123);
						match(INSTANCEOF);
						setState(1124);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(1129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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
		int _startState = 240;
		enterRecursionRule(_localctx, 240, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1131);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(1133);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1134);
						match(OpShitLeft);
						setState(1135);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(1136);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1137);
						match(OpShitRight);
						setState(1138);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(1139);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1140);
						match(OpShiftZeroRight);
						setState(1141);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(1146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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
		int _startState = 242;
		enterRecursionRule(_localctx, 242, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1148);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1156);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(1150);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1151);
						match(OpSoma);
						setState(1152);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(1153);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1154);
						match(OpSub);
						setState(1155);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(1160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
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
		int _startState = 244;
		enterRecursionRule(_localctx, 244, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1162);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1173);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1164);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1165);
						match(OpMulti);
						setState(1166);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1167);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1168);
						match(OpDiv);
						setState(1169);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(1170);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1171);
						match(OpResto);
						setState(1172);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(1177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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
		enterRule(_localctx, 246, RULE_castExpression);
		try {
			setState(1188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1178);
				match(AP);
				setState(1179);
				primitiveType();
				setState(1180);
				match(FP);
				setState(1181);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1183);
				match(AP);
				setState(1184);
				referenceType();
				setState(1185);
				match(FP);
				setState(1186);
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
		public PreincrementExpressionContext preincrementExpression() {
			return getRuleContext(PreincrementExpressionContext.class,0);
		}
		public PredecrementExpressionContext predecrementExpression() {
			return getRuleContext(PredecrementExpressionContext.class,0);
		}
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
		enterRule(_localctx, 248, RULE_unaryExpression);
		try {
			setState(1197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Incremento:
				enterOuterAlt(_localctx, 1);
				{
				setState(1190);
				preincrementExpression();
				}
				break;
			case Decremento:
				enterOuterAlt(_localctx, 2);
				{
				setState(1191);
				predecrementExpression();
				}
				break;
			case OpSoma:
				enterOuterAlt(_localctx, 3);
				{
				setState(1192);
				match(OpSoma);
				setState(1193);
				unaryExpression();
				}
				break;
			case OpSub:
				enterOuterAlt(_localctx, 4);
				{
				setState(1194);
				match(OpSub);
				setState(1195);
				unaryExpression();
				}
				break;
			case NEW:
			case SUPER:
			case THIS:
			case NULL:
			case TRUE:
			case FALSE:
			case ID:
			case OpNOT:
			case OpBitComp:
			case DecimalNumeral:
			case OctalNumeral:
			case HexNumeral:
			case FloatNumeral:
			case DoubleNumeral:
			case Character:
			case String:
			case AP:
				enterOuterAlt(_localctx, 5);
				{
				setState(1196);
				unaryExpressionNotPlusMinus();
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

	public static class PredecrementExpressionContext extends ParserRuleContext {
		public TerminalNode Decremento() { return getToken(JavaParser.Decremento, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PredecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPredecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPredecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPredecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredecrementExpressionContext predecrementExpression() throws RecognitionException {
		PredecrementExpressionContext _localctx = new PredecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_predecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(Decremento);
			setState(1200);
			unaryExpression();
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

	public static class PreincrementExpressionContext extends ParserRuleContext {
		public TerminalNode Incremento() { return getToken(JavaParser.Incremento, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreincrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preincrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPreincrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPreincrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPreincrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreincrementExpressionContext preincrementExpression() throws RecognitionException {
		PreincrementExpressionContext _localctx = new PreincrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_preincrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			match(Incremento);
			setState(1203);
			unaryExpression();
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
		enterRule(_localctx, 254, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(1211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1205);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1206);
				match(OpBitComp);
				setState(1207);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1208);
				match(OpNOT);
				setState(1209);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1210);
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
		enterRule(_localctx, 256, RULE_postdecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			postfixExpression(0);
			setState(1214);
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
		enterRule(_localctx, 258, RULE_postincrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			postfixExpression(0);
			setState(1217);
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
		int _startState = 260;
		enterRecursionRule(_localctx, 260, RULE_postfixExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1220);
				primary(0);
				}
				break;
			case 2:
				{
				setState(1221);
				expressionName();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(1224);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1225);
						match(Incremento);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(1226);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1227);
						match(Decremento);
						}
						break;
					}
					} 
				}
				setState(1232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
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
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
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
		enterRule(_localctx, 262, RULE_methodInvocation);
		int _la;
		try {
			setState(1257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1233);
				methodName();
				setState(1234);
				match(AP);
				setState(1236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpNOT) | (1L << OpBitComp) | (1L << OpSoma) | (1L << OpSub))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)))) != 0)) {
					{
					setState(1235);
					argumentList(0);
					}
				}

				setState(1238);
				match(FP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1240);
				primary(0);
				setState(1241);
				match(Ponto);
				setState(1242);
				match(ID);
				setState(1243);
				match(AP);
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpNOT) | (1L << OpBitComp) | (1L << OpSoma) | (1L << OpSub))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)))) != 0)) {
					{
					setState(1244);
					argumentList(0);
					}
				}

				setState(1247);
				match(FP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1249);
				match(SUPER);
				setState(1250);
				match(Ponto);
				setState(1251);
				match(ID);
				setState(1252);
				match(AP);
				setState(1254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpNOT) | (1L << OpBitComp) | (1L << OpSoma) | (1L << OpSub))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)))) != 0)) {
					{
					setState(1253);
					argumentList(0);
					}
				}

				setState(1256);
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

	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode Ponto() { return getToken(JavaParser.Ponto, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_fieldAccess);
		try {
			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1259);
				primary(0);
				setState(1260);
				match(Ponto);
				setState(1261);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1263);
				match(SUPER);
				setState(1264);
				match(Ponto);
				setState(1265);
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

	public static class PrimaryContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
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
		int _startState = 266;
		enterRecursionRule(_localctx, 266, RULE_primary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1269);
				methodName();
				setState(1270);
				match(AP);
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpNOT) | (1L << OpBitComp) | (1L << OpSoma) | (1L << OpSub))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)))) != 0)) {
					{
					setState(1271);
					argumentList(0);
					}
				}

				setState(1274);
				match(FP);
				}
				break;
			case 2:
				{
				setState(1276);
				match(SUPER);
				setState(1277);
				match(Ponto);
				setState(1278);
				match(ID);
				setState(1279);
				match(AP);
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpNOT) | (1L << OpBitComp) | (1L << OpSoma) | (1L << OpSub))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)))) != 0)) {
					{
					setState(1280);
					argumentList(0);
					}
				}

				setState(1283);
				match(FP);
				}
				break;
			case 3:
				{
				setState(1284);
				primaryNoNewArray(0);
				}
				break;
			case 4:
				{
				setState(1285);
				match(SUPER);
				setState(1286);
				match(Ponto);
				setState(1287);
				match(ID);
				}
				break;
			case 5:
				{
				setState(1288);
				arrayCreationExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primary);
						setState(1291);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1292);
						match(Ponto);
						setState(1293);
						match(ID);
						setState(1294);
						match(AP);
						setState(1296);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpNOT) | (1L << OpBitComp) | (1L << OpSoma) | (1L << OpSub))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)))) != 0)) {
							{
							setState(1295);
							argumentList(0);
							}
						}

						setState(1298);
						match(FP);
						}
						break;
					case 2:
						{
						_localctx = new PrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_primary);
						setState(1299);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1300);
						match(Ponto);
						setState(1301);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(1306);
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
		int _startState = 268;
		enterRecursionRule(_localctx, 268, RULE_primaryNoNewArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
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
				setState(1308);
				literal();
				}
				break;
			case THIS:
				{
				setState(1309);
				match(THIS);
				}
				break;
			case AP:
				{
				setState(1310);
				match(AP);
				setState(1311);
				expression();
				setState(1312);
				match(FP);
				}
				break;
			case NEW:
				{
				setState(1314);
				classInstanceCreationExpression();
				}
				break;
			case ID:
				{
				setState(1315);
				expressionName();
				setState(1316);
				match(AC);
				setState(1317);
				expression();
				setState(1318);
				match(FC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryNoNewArrayContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryNoNewArray);
					setState(1322);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1323);
					match(AC);
					setState(1324);
					expression();
					setState(1325);
					match(FC);
					}
					} 
				}
				setState(1331);
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
		enterRule(_localctx, 270, RULE_classInstanceCreationExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			match(NEW);
			setState(1333);
			classType();
			setState(1334);
			match(AP);
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << SUPER) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << OpNOT) | (1L << OpBitComp) | (1L << OpSoma) | (1L << OpSub))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Incremento - 77)) | (1L << (Decremento - 77)) | (1L << (DecimalNumeral - 77)) | (1L << (OctalNumeral - 77)) | (1L << (HexNumeral - 77)) | (1L << (FloatNumeral - 77)) | (1L << (DoubleNumeral - 77)) | (1L << (Character - 77)) | (1L << (String - 77)) | (1L << (AP - 77)))) != 0)) {
				{
				setState(1335);
				argumentList(0);
				}
			}

			setState(1338);
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
		int _startState = 272;
		enterRecursionRule(_localctx, 272, RULE_argumentList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1341);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentList);
					setState(1343);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1344);
					match(Virgula);
					setState(1345);
					expression();
					}
					} 
				}
				setState(1350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
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
		enterRule(_localctx, 274, RULE_arrayCreationExpression);
		try {
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1351);
				match(NEW);
				setState(1352);
				primitiveType();
				setState(1353);
				dimExprs(0);
				setState(1355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1354);
					dims(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				match(NEW);
				setState(1358);
				classOrInterfaceType();
				setState(1359);
				dimExprs(0);
				setState(1361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1360);
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
		int _startState = 276;
		enterRecursionRule(_localctx, 276, RULE_dimExprs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1366);
			dimExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(1372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DimExprsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dimExprs);
					setState(1368);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1369);
					dimExpr();
					}
					} 
				}
				setState(1374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
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
		enterRule(_localctx, 278, RULE_dimExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			match(AC);
			setState(1376);
			expression();
			setState(1377);
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
		int _startState = 280;
		enterRecursionRule(_localctx, 280, RULE_dims, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1380);
			match(AC);
			setState(1381);
			match(FC);
			}
			_ctx.stop = _input.LT(-1);
			setState(1388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DimsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dims);
					setState(1383);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1384);
					match(AC);
					setState(1385);
					match(FC);
					}
					} 
				}
				setState(1390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode AC() { return getToken(JavaParser.AC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FC() { return getToken(JavaParser.FC, 0); }
		public PrimaryNoNewArrayContext primaryNoNewArray() {
			return getRuleContext(PrimaryNoNewArrayContext.class,0);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_arrayAccess);
		try {
			setState(1401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1391);
				expressionName();
				setState(1392);
				match(AC);
				setState(1393);
				expression();
				setState(1394);
				match(FC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1396);
				primaryNoNewArray(0);
				setState(1397);
				match(AC);
				setState(1398);
				expression();
				setState(1399);
				match(FC);
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
		int _startState = 284;
		enterRecursionRule(_localctx, 284, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1404);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(1411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(1406);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1407);
					match(Ponto);
					setState(1408);
					match(ID);
					}
					} 
				}
				setState(1413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
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
		enterRule(_localctx, 286, RULE_typeName);
		try {
			setState(1419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1414);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1415);
				packageName(0);
				setState(1416);
				match(Ponto);
				setState(1417);
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
		enterRule(_localctx, 288, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
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
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
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
		enterRule(_localctx, 290, RULE_expressionName);
		try {
			setState(1428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1423);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1424);
				ambiguousName(0);
				setState(1425);
				match(Ponto);
				setState(1426);
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode Ponto() { return getToken(JavaParser.Ponto, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_methodName);
		try {
			setState(1435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1430);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1431);
				ambiguousName(0);
				setState(1432);
				match(Ponto);
				setState(1433);
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

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode Ponto() { return getToken(JavaParser.Ponto, 0); }
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAmbiguousName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAmbiguousName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 294;
		enterRecursionRule(_localctx, 294, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1438);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(1445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(1440);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1441);
					match(Ponto);
					setState(1442);
					match(ID);
					}
					} 
				}
				setState(1447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
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
		enterRule(_localctx, 296, RULE_literal);
		try {
			setState(1454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DecimalNumeral:
			case OctalNumeral:
			case HexNumeral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1448);
				integerLiteral();
				}
				break;
			case FloatNumeral:
			case DoubleNumeral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1449);
				floatingPointLiteral();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1450);
				booleanLiteral();
				}
				break;
			case Character:
				enterOuterAlt(_localctx, 4);
				{
				setState(1451);
				match(Character);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 5);
				{
				setState(1452);
				match(String);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1453);
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
		enterRule(_localctx, 298, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
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
		enterRule(_localctx, 300, RULE_floatingPointLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
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
		enterRule(_localctx, 302, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
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
		case 20:
			return constructorModifiers_sempred((ConstructorModifiersContext)_localctx, predIndex);
		case 23:
			return formalParameterList_sempred((FormalParameterListContext)_localctx, predIndex);
		case 26:
			return classTypeList_sempred((ClassTypeListContext)_localctx, predIndex);
		case 30:
			return fieldModifiers_sempred((FieldModifiersContext)_localctx, predIndex);
		case 32:
			return variableDeclarators_sempred((VariableDeclaratorsContext)_localctx, predIndex);
		case 34:
			return variableDeclaratorId_sempred((VariableDeclaratorIdContext)_localctx, predIndex);
		case 39:
			return methodModifiers_sempred((MethodModifiersContext)_localctx, predIndex);
		case 44:
			return interfaceModifiers_sempred((InterfaceModifiersContext)_localctx, predIndex);
		case 46:
			return extendsInterfaces_sempred((ExtendsInterfacesContext)_localctx, predIndex);
		case 48:
			return interfaceMemberDeclarations_sempred((InterfaceMemberDeclarationsContext)_localctx, predIndex);
		case 53:
			return abstractMethodModifiers_sempred((AbstractMethodModifiersContext)_localctx, predIndex);
		case 56:
			return variableInitializers_sempred((VariableInitializersContext)_localctx, predIndex);
		case 57:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 68:
			return blockStatements_sempred((BlockStatementsContext)_localctx, predIndex);
		case 85:
			return switchBlockStatementGroups_sempred((SwitchBlockStatementGroupsContext)_localctx, predIndex);
		case 87:
			return switchLabels_sempred((SwitchLabelsContext)_localctx, predIndex);
		case 96:
			return statementExpressionList_sempred((StatementExpressionListContext)_localctx, predIndex);
		case 103:
			return catches_sempred((CatchesContext)_localctx, predIndex);
		case 113:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 114:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 115:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 116:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 117:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 118:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 119:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 120:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 121:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 122:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 130:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 133:
			return primary_sempred((PrimaryContext)_localctx, predIndex);
		case 134:
			return primaryNoNewArray_sempred((PrimaryNoNewArrayContext)_localctx, predIndex);
		case 136:
			return argumentList_sempred((ArgumentListContext)_localctx, predIndex);
		case 138:
			return dimExprs_sempred((DimExprsContext)_localctx, predIndex);
		case 140:
			return dims_sempred((DimsContext)_localctx, predIndex);
		case 142:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 147:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
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
	private boolean switchLabels_sempred(SwitchLabelsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statementExpressionList_sempred(StatementExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean catches_sempred(CatchesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 2);
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 5);
		case 31:
			return precpred(_ctx, 4);
		case 32:
			return precpred(_ctx, 3);
		case 33:
			return precpred(_ctx, 2);
		case 34:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 3);
		case 36:
			return precpred(_ctx, 2);
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 2);
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 3);
		case 41:
			return precpred(_ctx, 2);
		case 42:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return precpred(_ctx, 2);
		case 44:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primary_sempred(PrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return precpred(_ctx, 6);
		case 46:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean primaryNoNewArray_sempred(PrimaryNoNewArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argumentList_sempred(ArgumentListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dimExprs_sempred(DimExprsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dims_sempred(DimsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3p\u05b9\4\2\t\2\4"+
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
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\3\2\5\2\u0134\n\2\3\2\5\2\u0137"+
		"\n\2\3\2\5\2\u013a\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4\u0145\n"+
		"\4\f\4\16\4\u0148\13\4\3\5\3\5\5\5\u014c\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u015d\n\b\f\b\16\b\u0160\13\b\3"+
		"\t\3\t\3\t\5\t\u0165\n\t\3\n\5\n\u0168\n\n\3\n\3\n\3\n\5\n\u016d\n\n\3"+
		"\n\5\n\u0170\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u0179\n\13\f\13"+
		"\16\13\u017c\13\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\7\17\u018c\n\17\f\17\16\17\u018f\13\17\3\20\3\20\5\20\u0193"+
		"\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u019c\n\21\f\21\16\21\u019f"+
		"\13\21\3\22\3\22\3\22\5\22\u01a4\n\22\3\23\3\23\5\23\u01a8\n\23\3\24\3"+
		"\24\3\24\3\25\5\25\u01ae\n\25\3\25\3\25\5\25\u01b2\n\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u01bb\n\26\f\26\16\26\u01be\13\26\3\27\3\27"+
		"\3\30\3\30\3\30\5\30\u01c5\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u01cf\n\31\f\31\16\31\u01d2\13\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u01e0\n\34\f\34\16\34\u01e3\13\34"+
		"\3\35\3\35\5\35\u01e7\n\35\3\35\5\35\u01ea\n\35\3\35\3\35\3\36\3\36\3"+
		"\36\5\36\u01f1\n\36\3\36\3\36\3\36\3\36\5\36\u01f7\n\36\3\36\5\36\u01fa"+
		"\n\36\3\37\5\37\u01fd\n\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \7 \u0208"+
		"\n \f \16 \u020b\13 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0215\n\"\f\"\16"+
		"\"\u0218\13\"\3#\3#\3#\3#\3#\5#\u021f\n#\3$\3$\3$\3$\3$\3$\7$\u0227\n"+
		"$\f$\16$\u022a\13$\3%\3%\5%\u022e\n%\3&\3&\3&\3\'\5\'\u0234\n\'\3\'\3"+
		"\'\3\'\5\'\u0239\n\'\3(\3(\5(\u023d\n(\3)\3)\3)\3)\3)\7)\u0244\n)\f)\16"+
		")\u0247\13)\3*\3*\3+\3+\3+\5+\u024e\n+\3+\3+\3,\3,\5,\u0254\n,\3-\5-\u0257"+
		"\n-\3-\3-\3-\5-\u025c\n-\3-\3-\3.\3.\3.\3.\3.\7.\u0265\n.\f.\16.\u0268"+
		"\13.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0273\n\60\f\60\16"+
		"\60\u0276\13\60\3\61\3\61\5\61\u027a\n\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\7\62\u0283\n\62\f\62\16\62\u0286\13\62\3\63\3\63\5\63\u028a\n\63"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\66\5\66\u0293\n\66\3\66\3\66\3\66\5\66"+
		"\u0298\n\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\7\67\u02a1\n\67\f\67\16"+
		"\67\u02a4\13\67\38\38\39\39\59\u02aa\n9\39\39\39\39\3:\3:\3:\3:\3:\3:"+
		"\7:\u02b6\n:\f:\16:\u02b9\13:\3;\3;\3;\5;\u02be\n;\3;\3;\3;\7;\u02c3\n"+
		";\f;\16;\u02c6\13;\3<\3<\5<\u02ca\n<\3=\3=\5=\u02ce\n=\3>\3>\3?\3?\3@"+
		"\3@\5@\u02d6\n@\3A\3A\5A\u02da\nA\3B\3B\3C\3C\3D\3D\3D\3D\3E\3E\5E\u02e6"+
		"\nE\3E\3E\3F\3F\3F\3F\3F\7F\u02ef\nF\fF\16F\u02f2\13F\3G\3G\5G\u02f6\n"+
		"G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3J\3J\3J\5J\u0304\nJ\3K\3K\3K\3K\3K\5K\u030b"+
		"\nK\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0318\nL\3M\3M\3N\3N\3N\3N\3O"+
		"\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u032e\nQ\3R\3R\3R\3R\3R\3R"+
		"\3S\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3V"+
		"\3V\5V\u034e\nV\3V\5V\u0351\nV\3V\3V\3W\3W\3W\3W\3W\7W\u035a\nW\fW\16"+
		"W\u035d\13W\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\7Y\u0367\nY\fY\16Y\u036a\13Y\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\5Z\u0372\nZ\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"]\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\5^\u038b\n^\3^\3^\5^\u038f\n^\3^\3^\5"+
		"^\u0393\n^\3^\3^\3^\3_\3_\3_\5_\u039b\n_\3_\3_\5_\u039f\n_\3_\3_\5_\u03a3"+
		"\n_\3_\3_\3_\3`\3`\5`\u03aa\n`\3a\3a\3b\3b\3b\3b\3b\3b\7b\u03b4\nb\fb"+
		"\16b\u03b7\13b\3c\3c\5c\u03bb\nc\3c\3c\3d\3d\5d\u03c1\nd\3d\3d\3e\3e\5"+
		"e\u03c7\ne\3e\3e\3f\3f\3f\3f\3g\3g\3g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3h\5"+
		"h\u03dc\nh\3h\3h\5h\u03e0\nh\3i\3i\3i\3i\3i\7i\u03e7\ni\fi\16i\u03ea\13"+
		"i\3j\3j\3j\3j\3j\3j\3k\3k\3k\3l\3l\3m\3m\3n\3n\5n\u03fb\nn\3o\3o\3o\3"+
		"o\3p\3p\3p\5p\u0404\np\3q\3q\3r\3r\3r\3r\3r\3r\3r\5r\u040f\nr\3s\3s\3"+
		"s\3s\3s\3s\7s\u0417\ns\fs\16s\u041a\13s\3t\3t\3t\3t\3t\3t\7t\u0422\nt"+
		"\ft\16t\u0425\13t\3u\3u\3u\3u\3u\3u\7u\u042d\nu\fu\16u\u0430\13u\3v\3"+
		"v\3v\3v\3v\3v\7v\u0438\nv\fv\16v\u043b\13v\3w\3w\3w\3w\3w\3w\7w\u0443"+
		"\nw\fw\16w\u0446\13w\3x\3x\3x\3x\3x\3x\3x\3x\3x\7x\u0451\nx\fx\16x\u0454"+
		"\13x\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\7y\u0468\n"+
		"y\fy\16y\u046b\13y\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\7z\u0479\nz\fz"+
		"\16z\u047c\13z\3{\3{\3{\3{\3{\3{\3{\3{\3{\7{\u0487\n{\f{\16{\u048a\13"+
		"{\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\7|\u0498\n|\f|\16|\u049b\13|\3}"+
		"\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u04a7\n}\3~\3~\3~\3~\3~\3~\3~\5~\u04b0"+
		"\n~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\5\u0081\u04be\n\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\5\u0084\u04c9\n\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u04cf\n\u0084\f\u0084\16\u0084"+
		"\u04d2\13\u0084\3\u0085\3\u0085\3\u0085\5\u0085\u04d7\n\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u04e0\n\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u04e9"+
		"\n\u0085\3\u0085\5\u0085\u04ec\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\5\u0086\u04f5\n\u0086\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\5\u0087\u04fb\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\5\u0087\u0504\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\5\u0087\u050c\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\5\u0087\u0513\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087"+
		"\u0519\n\u0087\f\u0087\16\u0087\u051c\13\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\5\u0088\u052b\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\7\u0088\u0532\n\u0088\f\u0088\16\u0088\u0535\13\u0088\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\5\u0089\u053b\n\u0089\3\u0089\3\u0089\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\7\u008a\u0545\n\u008a\f\u008a\16\u008a"+
		"\u0548\13\u008a\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u054e\n\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0554\n\u008b\5\u008b\u0556\n"+
		"\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\7\u008c\u055d\n\u008c\f"+
		"\u008c\16\u008c\u0560\13\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u056d\n\u008e"+
		"\f\u008e\16\u008e\u0570\13\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u057c\n\u008f\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u0584\n\u0090\f\u0090"+
		"\16\u0090\u0587\13\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091"+
		"\u058e\n\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\5\u0093\u0597\n\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094"+
		"\u059e\n\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\7\u0095"+
		"\u05a6\n\u0095\f\u0095\16\u0095\u05a9\13\u0095\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\5\u0096\u05b1\n\u0096\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0099\3\u0099\3\u0099\2+\6\16\24\34 *\60\66>BFPZ^blrt\u008a"+
		"\u00ac\u00b0\u00c2\u00d0\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u0106\u010c\u010e\u0112\u0116\u011a\u011e\u0128\u009a\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\2\16\5\2\3\3\22"+
		"\22##\3\2!#\7\2\22\22!#&&--\60\60\b\2\3\3\22\22\36\36!#&&))\4\2\3\3##"+
		"\5\2\22\22##&&\7\2\6\6\t\t\33\33\35\35%%\4\2\17\17\24\24\5\2\66\66GNV"+
		"X\3\2Y[\3\2\\]\3\2\63\64\2\u05d3\2\u0133\3\2\2\2\4\u013b\3\2\2\2\6\u013f"+
		"\3\2\2\2\b\u014b\3\2\2\2\n\u014d\3\2\2\2\f\u0151\3\2\2\2\16\u0157\3\2"+
		"\2\2\20\u0164\3\2\2\2\22\u0167\3\2\2\2\24\u0173\3\2\2\2\26\u017d\3\2\2"+
		"\2\30\u017f\3\2\2\2\32\u0182\3\2\2\2\34\u0185\3\2\2\2\36\u0190\3\2\2\2"+
		" \u0196\3\2\2\2\"\u01a3\3\2\2\2$\u01a7\3\2\2\2&\u01a9\3\2\2\2(\u01ad\3"+
		"\2\2\2*\u01b5\3\2\2\2,\u01bf\3\2\2\2.\u01c1\3\2\2\2\60\u01c8\3\2\2\2\62"+
		"\u01d3\3\2\2\2\64\u01d6\3\2\2\2\66\u01d9\3\2\2\28\u01e4\3\2\2\2:\u01f9"+
		"\3\2\2\2<\u01fc\3\2\2\2>\u0202\3\2\2\2@\u020c\3\2\2\2B\u020e\3\2\2\2D"+
		"\u021e\3\2\2\2F\u0220\3\2\2\2H\u022d\3\2\2\2J\u022f\3\2\2\2L\u0233\3\2"+
		"\2\2N\u023c\3\2\2\2P\u023e\3\2\2\2R\u0248\3\2\2\2T\u024a\3\2\2\2V\u0253"+
		"\3\2\2\2X\u0256\3\2\2\2Z\u025f\3\2\2\2\\\u0269\3\2\2\2^\u026b\3\2\2\2"+
		"`\u0277\3\2\2\2b\u027d\3\2\2\2d\u0289\3\2\2\2f\u028b\3\2\2\2h\u028f\3"+
		"\2\2\2j\u0292\3\2\2\2l\u029b\3\2\2\2n\u02a5\3\2\2\2p\u02a7\3\2\2\2r\u02af"+
		"\3\2\2\2t\u02bd\3\2\2\2v\u02c9\3\2\2\2x\u02cd\3\2\2\2z\u02cf\3\2\2\2|"+
		"\u02d1\3\2\2\2~\u02d5\3\2\2\2\u0080\u02d9\3\2\2\2\u0082\u02db\3\2\2\2"+
		"\u0084\u02dd\3\2\2\2\u0086\u02df\3\2\2\2\u0088\u02e3\3\2\2\2\u008a\u02e9"+
		"\3\2\2\2\u008c\u02f5\3\2\2\2\u008e\u02f7\3\2\2\2\u0090\u02fa\3\2\2\2\u0092"+
		"\u0303\3\2\2\2\u0094\u030a\3\2\2\2\u0096\u0317\3\2\2\2\u0098\u0319\3\2"+
		"\2\2\u009a\u031b\3\2\2\2\u009c\u031f\3\2\2\2\u009e\u0323\3\2\2\2\u00a0"+
		"\u032d\3\2\2\2\u00a2\u032f\3\2\2\2\u00a4\u0335\3\2\2\2\u00a6\u033d\3\2"+
		"\2\2\u00a8\u0345\3\2\2\2\u00aa\u034b\3\2\2\2\u00ac\u0354\3\2\2\2\u00ae"+
		"\u035e\3\2\2\2\u00b0\u0361\3\2\2\2\u00b2\u0371\3\2\2\2\u00b4\u0373\3\2"+
		"\2\2\u00b6\u0379\3\2\2\2\u00b8\u037f\3\2\2\2\u00ba\u0387\3\2\2\2\u00bc"+
		"\u0397\3\2\2\2\u00be\u03a9\3\2\2\2\u00c0\u03ab\3\2\2\2\u00c2\u03ad\3\2"+
		"\2\2\u00c4\u03b8\3\2\2\2\u00c6\u03be\3\2\2\2\u00c8\u03c4\3\2\2\2\u00ca"+
		"\u03ca\3\2\2\2\u00cc\u03ce\3\2\2\2\u00ce\u03df\3\2\2\2\u00d0\u03e1\3\2"+
		"\2\2\u00d2\u03eb\3\2\2\2\u00d4\u03f1\3\2\2\2\u00d6\u03f4\3\2\2\2\u00d8"+
		"\u03f6\3\2\2\2\u00da\u03fa\3\2\2\2\u00dc\u03fc\3\2\2\2\u00de\u0403\3\2"+
		"\2\2\u00e0\u0405\3\2\2\2\u00e2\u040e\3\2\2\2\u00e4\u0410\3\2\2\2\u00e6"+
		"\u041b\3\2\2\2\u00e8\u0426\3\2\2\2\u00ea\u0431\3\2\2\2\u00ec\u043c\3\2"+
		"\2\2\u00ee\u0447\3\2\2\2\u00f0\u0455\3\2\2\2\u00f2\u046c\3\2\2\2\u00f4"+
		"\u047d\3\2\2\2\u00f6\u048b\3\2\2\2\u00f8\u04a6\3\2\2\2\u00fa\u04af\3\2"+
		"\2\2\u00fc\u04b1\3\2\2\2\u00fe\u04b4\3\2\2\2\u0100\u04bd\3\2\2\2\u0102"+
		"\u04bf\3\2\2\2\u0104\u04c2\3\2\2\2\u0106\u04c8\3\2\2\2\u0108\u04eb\3\2"+
		"\2\2\u010a\u04f4\3\2\2\2\u010c\u050b\3\2\2\2\u010e\u052a\3\2\2\2\u0110"+
		"\u0536\3\2\2\2\u0112\u053e\3\2\2\2\u0114\u0555\3\2\2\2\u0116\u0557\3\2"+
		"\2\2\u0118\u0561\3\2\2\2\u011a\u0565\3\2\2\2\u011c\u057b\3\2\2\2\u011e"+
		"\u057d\3\2\2\2\u0120\u058d\3\2\2\2\u0122\u058f\3\2\2\2\u0124\u0596\3\2"+
		"\2\2\u0126\u059d\3\2\2\2\u0128\u059f\3\2\2\2\u012a\u05b0\3\2\2\2\u012c"+
		"\u05b2\3\2\2\2\u012e\u05b4\3\2\2\2\u0130\u05b6\3\2\2\2\u0132\u0134\5\4"+
		"\3\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135"+
		"\u0137\5\6\4\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2"+
		"\2\2\u0138\u013a\5\16\b\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\3\3\2\2\2\u013b\u013c\7 \2\2\u013c\u013d\5\u011e\u0090\2\u013d\u013e"+
		"\7m\2\2\u013e\5\3\2\2\2\u013f\u0140\b\4\1\2\u0140\u0141\5\b\5\2\u0141"+
		"\u0146\3\2\2\2\u0142\u0143\f\3\2\2\u0143\u0145\5\b\5\2\u0144\u0142\3\2"+
		"\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\7\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014c\5\n\6\2\u014a\u014c\5\f\7\2"+
		"\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c\t\3\2\2\2\u014d\u014e\7"+
		"\31\2\2\u014e\u014f\5\u0120\u0091\2\u014f\u0150\7m\2\2\u0150\13\3\2\2"+
		"\2\u0151\u0152\7\31\2\2\u0152\u0153\5\u011e\u0090\2\u0153\u0154\7k\2\2"+
		"\u0154\u0155\7@\2\2\u0155\u0156\7m\2\2\u0156\r\3\2\2\2\u0157\u0158\b\b"+
		"\1\2\u0158\u0159\5\20\t\2\u0159\u015e\3\2\2\2\u015a\u015b\f\3\2\2\u015b"+
		"\u015d\5\20\t\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3"+
		"\2\2\2\u015e\u015f\3\2\2\2\u015f\17\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0165\5\22\n\2\u0162\u0165\5X-\2\u0163\u0165\7m\2\2\u0164\u0161\3\2\2"+
		"\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\21\3\2\2\2\u0166\u0168"+
		"\5\24\13\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2"+
		"\u0169\u016a\7\n\2\2\u016a\u016c\7\65\2\2\u016b\u016d\5\30\r\2\u016c\u016b"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u0170\5\32\16\2"+
		"\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172"+
		"\5\36\20\2\u0172\23\3\2\2\2\u0173\u0174\b\13\1\2\u0174\u0175\5\26\f\2"+
		"\u0175\u017a\3\2\2\2\u0176\u0177\f\3\2\2\u0177\u0179\5\26\f\2\u0178\u0176"+
		"\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\25\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\t\2\2\2\u017e\27\3\2\2\2\u017f"+
		"\u0180\7\21\2\2\u0180\u0181\5\u0082B\2\u0181\31\3\2\2\2\u0182\u0183\7"+
		"\30\2\2\u0183\u0184\5\34\17\2\u0184\33\3\2\2\2\u0185\u0186\b\17\1\2\u0186"+
		"\u0187\5\u0084C\2\u0187\u018d\3\2\2\2\u0188\u0189\f\3\2\2\u0189\u018a"+
		"\7i\2\2\u018a\u018c\5\u0084C\2\u018b\u0188\3\2\2\2\u018c\u018f\3\2\2\2"+
		"\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\35\3\2\2\2\u018f\u018d"+
		"\3\2\2\2\u0190\u0192\7g\2\2\u0191\u0193\5 \21\2\u0192\u0191\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\7h\2\2\u0195\37\3\2\2\2"+
		"\u0196\u0197\b\21\1\2\u0197\u0198\5\"\22\2\u0198\u019d\3\2\2\2\u0199\u019a"+
		"\f\3\2\2\u019a\u019c\5\"\22\2\u019b\u0199\3\2\2\2\u019c\u019f\3\2\2\2"+
		"\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e!\3\2\2\2\u019f\u019d\3"+
		"\2\2\2\u01a0\u01a4\5$\23\2\u01a1\u01a4\5&\24\2\u01a2\u01a4\5(\25\2\u01a3"+
		"\u01a0\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4#\3\2\2\2"+
		"\u01a5\u01a8\5<\37\2\u01a6\u01a8\5J&\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6"+
		"\3\2\2\2\u01a8%\3\2\2\2\u01a9\u01aa\7&\2\2\u01aa\u01ab\5\u0088E\2\u01ab"+
		"\'\3\2\2\2\u01ac\u01ae\5*\26\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2"+
		"\u01ae\u01af\3\2\2\2\u01af\u01b1\5.\30\2\u01b0\u01b2\5\64\33\2\u01b1\u01b0"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\58\35\2\u01b4"+
		")\3\2\2\2\u01b5\u01b6\b\26\1\2\u01b6\u01b7\5,\27\2\u01b7\u01bc\3\2\2\2"+
		"\u01b8\u01b9\f\3\2\2\u01b9\u01bb\5,\27\2\u01ba\u01b8\3\2\2\2\u01bb\u01be"+
		"\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd+\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01bf\u01c0\t\3\2\2\u01c0-\3\2\2\2\u01c1\u01c2\5\u0122"+
		"\u0092\2\u01c2\u01c4\7c\2\2\u01c3\u01c5\5\60\31\2\u01c4\u01c3\3\2\2\2"+
		"\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7d\2\2\u01c7/\3\2"+
		"\2\2\u01c8\u01c9\b\31\1\2\u01c9\u01ca\5\62\32\2\u01ca\u01d0\3\2\2\2\u01cb"+
		"\u01cc\f\3\2\2\u01cc\u01cd\7m\2\2\u01cd\u01cf\5\62\32\2\u01ce\u01cb\3"+
		"\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\61\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\5t;\2\u01d4\u01d5\5F$\2\u01d5"+
		"\63\3\2\2\2\u01d6\u01d7\7,\2\2\u01d7\u01d8\5\66\34\2\u01d8\65\3\2\2\2"+
		"\u01d9\u01da\b\34\1\2\u01da\u01db\5\u0082B\2\u01db\u01e1\3\2\2\2\u01dc"+
		"\u01dd\f\3\2\2\u01dd\u01de\7i\2\2\u01de\u01e0\5\u0082B\2\u01df\u01dc\3"+
		"\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\67\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e6\7g\2\2\u01e5\u01e7\5:\36\2"+
		"\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01ea"+
		"\5\u008aF\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2"+
		"\2\u01eb\u01ec\7h\2\2\u01ec9\3\2\2\2\u01ed\u01ee\7*\2\2\u01ee\u01f0\7"+
		"c\2\2\u01ef\u01f1\5\u0112\u008a\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2"+
		"\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01fa\7d\2\2\u01f3\u01f4\7\'\2\2\u01f4"+
		"\u01f6\7c\2\2\u01f5\u01f7\5\u0112\u008a\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\7d\2\2\u01f9\u01ed\3\2\2\2\u01f9"+
		"\u01f3\3\2\2\2\u01fa;\3\2\2\2\u01fb\u01fd\5> \2\u01fc\u01fb\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\5t;\2\u01ff\u0200\5B\""+
		"\2\u0200\u0201\7m\2\2\u0201=\3\2\2\2\u0202\u0203\b \1\2\u0203\u0204\5"+
		"@!\2\u0204\u0209\3\2\2\2\u0205\u0206\f\3\2\2\u0206\u0208\5@!\2\u0207\u0205"+
		"\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"?\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\t\4\2\2\u020dA\3\2\2\2\u020e"+
		"\u020f\b\"\1\2\u020f\u0210\5D#\2\u0210\u0216\3\2\2\2\u0211\u0212\f\3\2"+
		"\2\u0212\u0213\7i\2\2\u0213\u0215\5D#\2\u0214\u0211\3\2\2\2\u0215\u0218"+
		"\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217C\3\2\2\2\u0218"+
		"\u0216\3\2\2\2\u0219\u021f\5F$\2\u021a\u021b\5F$\2\u021b\u021c\7\66\2"+
		"\2\u021c\u021d\5H%\2\u021d\u021f\3\2\2\2\u021e\u0219\3\2\2\2\u021e\u021a"+
		"\3\2\2\2\u021fE\3\2\2\2\u0220\u0221\b$\1\2\u0221\u0222\7\65\2\2\u0222"+
		"\u0228\3\2\2\2\u0223\u0224\f\3\2\2\u0224\u0225\7e\2\2\u0225\u0227\7f\2"+
		"\2\u0226\u0223\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229"+
		"\3\2\2\2\u0229G\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022e\5\u00d8m\2\u022c"+
		"\u022e\5p9\2\u022d\u022b\3\2\2\2\u022d\u022c\3\2\2\2\u022eI\3\2\2\2\u022f"+
		"\u0230\5L\'\2\u0230\u0231\5V,\2\u0231K\3\2\2\2\u0232\u0234\5P)\2\u0233"+
		"\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\5N"+
		"(\2\u0236\u0238\5T+\2\u0237\u0239\5\64\33\2\u0238\u0237\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u0239M\3\2\2\2\u023a\u023d\5t;\2\u023b\u023d\7/\2\2\u023c"+
		"\u023a\3\2\2\2\u023c\u023b\3\2\2\2\u023dO\3\2\2\2\u023e\u023f\b)\1\2\u023f"+
		"\u0240\5R*\2\u0240\u0245\3\2\2\2\u0241\u0242\f\3\2\2\u0242\u0244\5R*\2"+
		"\u0243\u0241\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246"+
		"\3\2\2\2\u0246Q\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249\t\5\2\2\u0249"+
		"S\3\2\2\2\u024a\u024b\7\65\2\2\u024b\u024d\7c\2\2\u024c\u024e\5\60\31"+
		"\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250"+
		"\7d\2\2\u0250U\3\2\2\2\u0251\u0254\5\u0088E\2\u0252\u0254\7m\2\2\u0253"+
		"\u0251\3\2\2\2\u0253\u0252\3\2\2\2\u0254W\3\2\2\2\u0255\u0257\5Z.\2\u0256"+
		"\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\7\34"+
		"\2\2\u0259\u025b\7\65\2\2\u025a\u025c\5^\60\2\u025b\u025a\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\5`\61\2\u025eY\3\2\2\2"+
		"\u025f\u0260\b.\1\2\u0260\u0261\5\\/\2\u0261\u0266\3\2\2\2\u0262\u0263"+
		"\f\3\2\2\u0263\u0265\5\\/\2\u0264\u0262\3\2\2\2\u0265\u0268\3\2\2\2\u0266"+
		"\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267[\3\2\2\2\u0268\u0266\3\2\2\2"+
		"\u0269\u026a\t\6\2\2\u026a]\3\2\2\2\u026b\u026c\b\60\1\2\u026c\u026d\7"+
		"\21\2\2\u026d\u026e\5\u0084C\2\u026e\u0274\3\2\2\2\u026f\u0270\f\3\2\2"+
		"\u0270\u0271\7i\2\2\u0271\u0273\5\u0084C\2\u0272\u026f\3\2\2\2\u0273\u0276"+
		"\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275_\3\2\2\2\u0276"+
		"\u0274\3\2\2\2\u0277\u0279\7g\2\2\u0278\u027a\5b\62\2\u0279\u0278\3\2"+
		"\2\2\u0279\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\7h\2\2\u027c"+
		"a\3\2\2\2\u027d\u027e\b\62\1\2\u027e\u027f\5d\63\2\u027f\u0284\3\2\2\2"+
		"\u0280\u0281\f\3\2\2\u0281\u0283\5d\63\2\u0282\u0280\3\2\2\2\u0283\u0286"+
		"\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285c\3\2\2\2\u0286"+
		"\u0284\3\2\2\2\u0287\u028a\5f\64\2\u0288\u028a\5j\66\2\u0289\u0287\3\2"+
		"\2\2\u0289\u0288\3\2\2\2\u028ae\3\2\2\2\u028b\u028c\5h\65\2\u028c\u028d"+
		"\5t;\2\u028d\u028e\5D#\2\u028eg\3\2\2\2\u028f\u0290\t\7\2\2\u0290i\3\2"+
		"\2\2\u0291\u0293\5l\67\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0294\3\2\2\2\u0294\u0295\5N(\2\u0295\u0297\5T+\2\u0296\u0298\5\64\33"+
		"\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a"+
		"\7m\2\2\u029ak\3\2\2\2\u029b\u029c\b\67\1\2\u029c\u029d\5n8\2\u029d\u02a2"+
		"\3\2\2\2\u029e\u029f\f\3\2\2\u029f\u02a1\5n8\2\u02a0\u029e\3\2\2\2\u02a1"+
		"\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3m\3\2\2\2"+
		"\u02a4\u02a2\3\2\2\2\u02a5\u02a6\t\6\2\2\u02a6o\3\2\2\2\u02a7\u02a9\7"+
		"g\2\2\u02a8\u02aa\5r:\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa"+
		"\u02ab\3\2\2\2\u02ab\u02ac\7i\2\2\u02ac\u02ad\7l\2\2\u02ad\u02ae\7h\2"+
		"\2\u02aeq\3\2\2\2\u02af\u02b0\b:\1\2\u02b0\u02b1\5H%\2\u02b1\u02b7\3\2"+
		"\2\2\u02b2\u02b3\f\3\2\2\u02b3\u02b4\7i\2\2\u02b4\u02b6\5H%\2\u02b5\u02b2"+
		"\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8"+
		"s\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bb\b;\1\2\u02bb\u02be\5v<\2\u02bc"+
		"\u02be\5\u0080A\2\u02bd\u02ba\3\2\2\2\u02bd\u02bc\3\2\2\2\u02be\u02c4"+
		"\3\2\2\2\u02bf\u02c0\f\3\2\2\u02c0\u02c1\7e\2\2\u02c1\u02c3\7f\2\2\u02c2"+
		"\u02bf\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2"+
		"\2\2\u02c5u\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02ca\5x=\2\u02c8\u02ca"+
		"\7\4\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02c8\3\2\2\2\u02caw\3\2\2\2\u02cb"+
		"\u02ce\5z>\2\u02cc\u02ce\5|?\2\u02cd\u02cb\3\2\2\2\u02cd\u02cc\3\2\2\2"+
		"\u02cey\3\2\2\2\u02cf\u02d0\t\b\2\2\u02d0{\3\2\2\2\u02d1\u02d2\t\t\2\2"+
		"\u02d2}\3\2\2\2\u02d3\u02d6\5\u0080A\2\u02d4\u02d6\5\u0086D\2\u02d5\u02d3"+
		"\3\2\2\2\u02d5\u02d4\3\2\2\2\u02d6\177\3\2\2\2\u02d7\u02da\5\u0082B\2"+
		"\u02d8\u02da\5\u0084C\2\u02d9\u02d7\3\2\2\2\u02d9\u02d8\3\2\2\2\u02da"+
		"\u0081\3\2\2\2\u02db\u02dc\5\u0120\u0091\2\u02dc\u0083\3\2\2\2\u02dd\u02de"+
		"\5\u0120\u0091\2\u02de\u0085\3\2\2\2\u02df\u02e0\5t;\2\u02e0\u02e1\7e"+
		"\2\2\u02e1\u02e2\7f\2\2\u02e2\u0087\3\2\2\2\u02e3\u02e5\7g\2\2\u02e4\u02e6"+
		"\5\u008aF\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3\2\2"+
		"\2\u02e7\u02e8\7h\2\2\u02e8\u0089\3\2\2\2\u02e9\u02ea\bF\1\2\u02ea\u02eb"+
		"\5\u008cG\2\u02eb\u02f0\3\2\2\2\u02ec\u02ed\f\3\2\2\u02ed\u02ef\5\u008c"+
		"G\2\u02ee\u02ec\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u008b\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f6\5\u008e"+
		"H\2\u02f4\u02f6\5\u0092J\2\u02f5\u02f3\3\2\2\2\u02f5\u02f4\3\2\2\2\u02f6"+
		"\u008d\3\2\2\2\u02f7\u02f8\5\u0090I\2\u02f8\u02f9\7m\2\2\u02f9\u008f\3"+
		"\2\2\2\u02fa\u02fb\5t;\2\u02fb\u02fc\5B\"\2\u02fc\u0091\3\2\2\2\u02fd"+
		"\u0304\5\u0096L\2\u02fe\u0304\5\u009aN\2\u02ff\u0304\5\u00a2R\2\u0300"+
		"\u0304\5\u00a4S\2\u0301\u0304\5\u00b4[\2\u0302\u0304\5\u00ba^\2\u0303"+
		"\u02fd\3\2\2\2\u0303\u02fe\3\2\2\2\u0303\u02ff\3\2\2\2\u0303\u0300\3\2"+
		"\2\2\u0303\u0301\3\2\2\2\u0303\u0302\3\2\2\2\u0304\u0093\3\2\2\2\u0305"+
		"\u030b\5\u0096L\2\u0306\u030b\5\u009cO\2\u0307\u030b\5\u00a6T\2\u0308"+
		"\u030b\5\u00b6\\\2\u0309\u030b\5\u00bc_\2\u030a\u0305\3\2\2\2\u030a\u0306"+
		"\3\2\2\2\u030a\u0307\3\2\2\2\u030a\u0308\3\2\2\2\u030a\u0309\3\2\2\2\u030b"+
		"\u0095\3\2\2\2\u030c\u0318\5\u0088E\2\u030d\u0318\5\u0098M\2\u030e\u0318"+
		"\5\u009eP\2\u030f\u0318\5\u00a8U\2\u0310\u0318\5\u00b8]\2\u0311\u0318"+
		"\5\u00c4c\2\u0312\u0318\5\u00c6d\2\u0313\u0318\5\u00c8e\2\u0314\u0318"+
		"\5\u00ccg\2\u0315\u0318\5\u00caf\2\u0316\u0318\5\u00ceh\2\u0317\u030c"+
		"\3\2\2\2\u0317\u030d\3\2\2\2\u0317\u030e\3\2\2\2\u0317\u030f\3\2\2\2\u0317"+
		"\u0310\3\2\2\2\u0317\u0311\3\2\2\2\u0317\u0312\3\2\2\2\u0317\u0313\3\2"+
		"\2\2\u0317\u0314\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0316\3\2\2\2\u0318"+
		"\u0097\3\2\2\2\u0319\u031a\7m\2\2\u031a\u0099\3\2\2\2\u031b\u031c\7\65"+
		"\2\2\u031c\u031d\7j\2\2\u031d\u031e\5\u0092J\2\u031e\u009b\3\2\2\2\u031f"+
		"\u0320\7\65\2\2\u0320\u0321\7j\2\2\u0321\u0322\5\u0094K\2\u0322\u009d"+
		"\3\2\2\2\u0323\u0324\5\u00a0Q\2\u0324\u0325\7m\2\2\u0325\u009f\3\2\2\2"+
		"\u0326\u032e\5\u00dco\2\u0327\u032e\5\u00fe\u0080\2\u0328\u032e\5\u0104"+
		"\u0083\2\u0329\u032e\5\u00fc\177\2\u032a\u032e\5\u0102\u0082\2\u032b\u032e"+
		"\5\u0108\u0085\2\u032c\u032e\5\u0110\u0089\2\u032d\u0326\3\2\2\2\u032d"+
		"\u0327\3\2\2\2\u032d\u0328\3\2\2\2\u032d\u0329\3\2\2\2\u032d\u032a\3\2"+
		"\2\2\u032d\u032b\3\2\2\2\u032d\u032c\3\2\2\2\u032e\u00a1\3\2\2\2\u032f"+
		"\u0330\7\27\2\2\u0330\u0331\7c\2\2\u0331\u0332\5\u00d8m\2\u0332\u0333"+
		"\7d\2\2\u0333\u0334\5\u0092J\2\u0334\u00a3\3\2\2\2\u0335\u0336\7\27\2"+
		"\2\u0336\u0337\7c\2\2\u0337\u0338\5\u00d8m\2\u0338\u0339\7d\2\2\u0339"+
		"\u033a\5\u0094K\2\u033a\u033b\7\20\2\2\u033b\u033c\5\u0092J\2\u033c\u00a5"+
		"\3\2\2\2\u033d\u033e\7\27\2\2\u033e\u033f\7c\2\2\u033f\u0340\5\u00d8m"+
		"\2\u0340\u0341\7d\2\2\u0341\u0342\5\u0094K\2\u0342\u0343\7\20\2\2\u0343"+
		"\u0344\5\u0094K\2\u0344\u00a7\3\2\2\2\u0345\u0346\7(\2\2\u0346\u0347\7"+
		"c\2\2\u0347\u0348\5\u00d8m\2\u0348\u0349\7d\2\2\u0349\u034a\5\u00aaV\2"+
		"\u034a\u00a9\3\2\2\2\u034b\u034d\7g\2\2\u034c\u034e\5\u00acW\2\u034d\u034c"+
		"\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0350\3\2\2\2\u034f\u0351\5\u00b0Y"+
		"\2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353"+
		"\7h\2\2\u0353\u00ab\3\2\2\2\u0354\u0355\bW\1\2\u0355\u0356\5\u00aeX\2"+
		"\u0356\u035b\3\2\2\2\u0357\u0358\f\3\2\2\u0358\u035a\5\u00aeX\2\u0359"+
		"\u0357\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035c\3\2"+
		"\2\2\u035c\u00ad\3\2\2\2\u035d\u035b\3\2\2\2\u035e\u035f\5\u00b0Y\2\u035f"+
		"\u0360\5\u008aF\2\u0360\u00af\3\2\2\2\u0361\u0362\bY\1\2\u0362\u0363\5"+
		"\u00b2Z\2\u0363\u0368\3\2\2\2\u0364\u0365\f\3\2\2\u0365\u0367\5\u00b2"+
		"Z\2\u0366\u0364\3\2\2\2\u0367\u036a\3\2\2\2\u0368\u0366\3\2\2\2\u0368"+
		"\u0369\3\2\2\2\u0369\u00b1\3\2\2\2\u036a\u0368\3\2\2\2\u036b\u036c\7\7"+
		"\2\2\u036c\u036d\5\u00d6l\2\u036d\u036e\7j\2\2\u036e\u0372\3\2\2\2\u036f"+
		"\u0370\7\r\2\2\u0370\u0372\7j\2\2\u0371\u036b\3\2\2\2\u0371\u036f\3\2"+
		"\2\2\u0372\u00b3\3\2\2\2\u0373\u0374\7\61\2\2\u0374\u0375\7c\2\2\u0375"+
		"\u0376\5\u00d8m\2\u0376\u0377\7d\2\2\u0377\u0378\5\u0092J\2\u0378\u00b5"+
		"\3\2\2\2\u0379\u037a\7\61\2\2\u037a\u037b\7c\2\2\u037b\u037c\5\u00d8m"+
		"\2\u037c\u037d\7d\2\2\u037d\u037e\5\u0094K\2\u037e\u00b7\3\2\2\2\u037f"+
		"\u0380\7\16\2\2\u0380\u0381\5\u0092J\2\u0381\u0382\7\61\2\2\u0382\u0383"+
		"\7c\2\2\u0383\u0384\5\u00d8m\2\u0384\u0385\7d\2\2\u0385\u0386\7m\2\2\u0386"+
		"\u00b9\3\2\2\2\u0387\u0388\7\25\2\2\u0388\u038a\7c\2\2\u0389\u038b\5\u00be"+
		"`\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u038e\7m\2\2\u038d\u038f\5\u00d8m\2\u038e\u038d\3\2\2\2\u038e\u038f\3"+
		"\2\2\2\u038f\u0390\3\2\2\2\u0390\u0392\7m\2\2\u0391\u0393\5\u00c0a\2\u0392"+
		"\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\7d"+
		"\2\2\u0395\u0396\5\u0092J\2\u0396\u00bb\3\2\2\2\u0397\u0398\7\25\2\2\u0398"+
		"\u039a\7c\2\2\u0399\u039b\5\u00be`\2\u039a\u0399\3\2\2\2\u039a\u039b\3"+
		"\2\2\2\u039b\u039c\3\2\2\2\u039c\u039e\7m\2\2\u039d\u039f\5\u00d8m\2\u039e"+
		"\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\7m"+
		"\2\2\u03a1\u03a3\5\u00c0a\2\u03a2\u03a1\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3"+
		"\u03a4\3\2\2\2\u03a4\u03a5\7d\2\2\u03a5\u03a6\5\u0094K\2\u03a6\u00bd\3"+
		"\2\2\2\u03a7\u03aa\5\u00c2b\2\u03a8\u03aa\5\u0090I\2\u03a9\u03a7\3\2\2"+
		"\2\u03a9\u03a8\3\2\2\2\u03aa\u00bf\3\2\2\2\u03ab\u03ac\5\u00c2b\2\u03ac"+
		"\u00c1\3\2\2\2\u03ad\u03ae\bb\1\2\u03ae\u03af\5\u00a0Q\2\u03af\u03b5\3"+
		"\2\2\2\u03b0\u03b1\f\3\2\2\u03b1\u03b2\7i\2\2\u03b2\u03b4\5\u00a0Q\2\u03b3"+
		"\u03b0\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2"+
		"\2\2\u03b6\u00c3\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b8\u03ba\7\5\2\2\u03b9"+
		"\u03bb\7\65\2\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3"+
		"\2\2\2\u03bc\u03bd\7m\2\2\u03bd\u00c5\3\2\2\2\u03be\u03c0\7\f\2\2\u03bf"+
		"\u03c1\7\65\2\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\3"+
		"\2\2\2\u03c2\u03c3\7m\2\2\u03c3\u00c7\3\2\2\2\u03c4\u03c6\7$\2\2\u03c5"+
		"\u03c7\5\u00d8m\2\u03c6\u03c5\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8"+
		"\3\2\2\2\u03c8\u03c9\7m\2\2\u03c9\u00c9\3\2\2\2\u03ca\u03cb\7+\2\2\u03cb"+
		"\u03cc\5\u00d8m\2\u03cc\u03cd\7m\2\2\u03cd\u00cb\3\2\2\2\u03ce\u03cf\7"+
		")\2\2\u03cf\u03d0\7c\2\2\u03d0\u03d1\5\u00d8m\2\u03d1\u03d2\7d\2\2\u03d2"+
		"\u03d3\5\u0088E\2\u03d3\u00cd\3\2\2\2\u03d4\u03d5\7.\2\2\u03d5\u03d6\5"+
		"\u0088E\2\u03d6\u03d7\5\u00d0i\2\u03d7\u03e0\3\2\2\2\u03d8\u03d9\7.\2"+
		"\2\u03d9\u03db\5\u0088E\2\u03da\u03dc\5\u00d0i\2\u03db\u03da\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\5\u00d4k\2\u03de\u03e0"+
		"\3\2\2\2\u03df\u03d4\3\2\2\2\u03df\u03d8\3\2\2\2\u03e0\u00cf\3\2\2\2\u03e1"+
		"\u03e2\bi\1\2\u03e2\u03e3\5\u00d2j\2\u03e3\u03e8\3\2\2\2\u03e4\u03e5\f"+
		"\3\2\2\u03e5\u03e7\5\u00d2j\2\u03e6\u03e4\3\2\2\2\u03e7\u03ea\3\2\2\2"+
		"\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u00d1\3\2\2\2\u03ea\u03e8"+
		"\3\2\2\2\u03eb\u03ec\7\b\2\2\u03ec\u03ed\7c\2\2\u03ed\u03ee\5\62\32\2"+
		"\u03ee\u03ef\7d\2\2\u03ef\u03f0\5\u0088E\2\u03f0\u00d3\3\2\2\2\u03f1\u03f2"+
		"\7\23\2\2\u03f2\u03f3\5\u0088E\2\u03f3\u00d5\3\2\2\2\u03f4\u03f5\5\u00d8"+
		"m\2\u03f5\u00d7\3\2\2\2\u03f6\u03f7\5\u00dan\2\u03f7\u00d9\3\2\2\2\u03f8"+
		"\u03fb\5\u00e2r\2\u03f9\u03fb\5\u00dco\2\u03fa\u03f8\3\2\2\2\u03fa\u03f9"+
		"\3\2\2\2\u03fb\u00db\3\2\2\2\u03fc\u03fd\5\u00dep\2\u03fd\u03fe\5\u00e0"+
		"q\2\u03fe\u03ff\5\u00dan\2\u03ff\u00dd\3\2\2\2\u0400\u0404\5\u0124\u0093"+
		"\2\u0401\u0404\5\u010a\u0086\2\u0402\u0404\5\u011c\u008f\2\u0403\u0400"+
		"\3\2\2\2\u0403\u0401\3\2\2\2\u0403\u0402\3\2\2\2\u0404\u00df\3\2\2\2\u0405"+
		"\u0406\t\n\2\2\u0406\u00e1\3\2\2\2\u0407\u040f\5\u00e4s\2\u0408\u0409"+
		"\5\u00e4s\2\u0409\u040a\7l\2\2\u040a\u040b\5\u00d8m\2\u040b\u040c\7j\2"+
		"\2\u040c\u040d\5\u00e2r\2\u040d\u040f\3\2\2\2\u040e\u0407\3\2\2\2\u040e"+
		"\u0408\3\2\2\2\u040f\u00e3\3\2\2\2\u0410\u0411\bs\1\2\u0411\u0412\5\u00e6"+
		"t\2\u0412\u0418\3\2\2\2\u0413\u0414\f\3\2\2\u0414\u0415\7R\2\2\u0415\u0417"+
		"\5\u00e6t\2\u0416\u0413\3\2\2\2\u0417\u041a\3\2\2\2\u0418\u0416\3\2\2"+
		"\2\u0418\u0419\3\2\2\2\u0419\u00e5\3\2\2\2\u041a\u0418\3\2\2\2\u041b\u041c"+
		"\bt\1\2\u041c\u041d\5\u00e8u\2\u041d\u0423\3\2\2\2\u041e\u041f\f\3\2\2"+
		"\u041f\u0420\7Q\2\2\u0420\u0422\5\u00e8u\2\u0421\u041e\3\2\2\2\u0422\u0425"+
		"\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u00e7\3\2\2\2\u0425"+
		"\u0423\3\2\2\2\u0426\u0427\bu\1\2\u0427\u0428\5\u00eav\2\u0428\u042e\3"+
		"\2\2\2\u0429\u042a\f\3\2\2\u042a\u042b\79\2\2\u042b\u042d\5\u00eav\2\u042c"+
		"\u0429\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2"+
		"\2\2\u042f\u00e9\3\2\2\2\u0430\u042e\3\2\2\2\u0431\u0432\bv\1\2\u0432"+
		"\u0433\5\u00ecw\2\u0433\u0439\3\2\2\2\u0434\u0435\f\3\2\2\u0435\u0436"+
		"\7:\2\2\u0436\u0438\5\u00ecw\2\u0437\u0434\3\2\2\2\u0438\u043b\3\2\2\2"+
		"\u0439\u0437\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u00eb\3\2\2\2\u043b\u0439"+
		"\3\2\2\2\u043c\u043d\bw\1\2\u043d\u043e\5\u00eex\2\u043e\u0444\3\2\2\2"+
		"\u043f\u0440\f\3\2\2\u0440\u0441\78\2\2\u0441\u0443\5\u00eex\2\u0442\u043f"+
		"\3\2\2\2\u0443\u0446\3\2\2\2\u0444\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445"+
		"\u00ed\3\2\2\2\u0446\u0444\3\2\2\2\u0447\u0448\bx\1\2\u0448\u0449\5\u00f0"+
		"y\2\u0449\u0452\3\2\2\2\u044a\u044b\f\4\2\2\u044b\u044c\7C\2\2\u044c\u0451"+
		"\5\u00f0y\2\u044d\u044e\f\3\2\2\u044e\u044f\7D\2\2\u044f\u0451\5\u00f0"+
		"y\2\u0450\u044a\3\2\2\2\u0450\u044d\3\2\2\2\u0451\u0454\3\2\2\2\u0452"+
		"\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u00ef\3\2\2\2\u0454\u0452\3\2"+
		"\2\2\u0455\u0456\by\1\2\u0456\u0457\5\u00f2z\2\u0457\u0469\3\2\2\2\u0458"+
		"\u0459\f\7\2\2\u0459\u045a\7<\2\2\u045a\u0468\5\u00f2z\2\u045b\u045c\f"+
		"\6\2\2\u045c\u045d\7=\2\2\u045d\u0468\5\u00f2z\2\u045e\u045f\f\5\2\2\u045f"+
		"\u0460\7E\2\2\u0460\u0468\5\u00f2z\2\u0461\u0462\f\4\2\2\u0462\u0463\7"+
		"F\2\2\u0463\u0468\5\u00f2z\2\u0464\u0465\f\3\2\2\u0465\u0466\7\32\2\2"+
		"\u0466\u0468\5~@\2\u0467\u0458\3\2\2\2\u0467\u045b\3\2\2\2\u0467\u045e"+
		"\3\2\2\2\u0467\u0461\3\2\2\2\u0467\u0464\3\2\2\2\u0468\u046b\3\2\2\2\u0469"+
		"\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u00f1\3\2\2\2\u046b\u0469\3\2"+
		"\2\2\u046c\u046d\bz\1\2\u046d\u046e\5\u00f4{\2\u046e\u047a\3\2\2\2\u046f"+
		"\u0470\f\5\2\2\u0470\u0471\7S\2\2\u0471\u0479\5\u00f4{\2\u0472\u0473\f"+
		"\4\2\2\u0473\u0474\7T\2\2\u0474\u0479\5\u00f4{\2\u0475\u0476\f\3\2\2\u0476"+
		"\u0477\7U\2\2\u0477\u0479\5\u00f4{\2\u0478\u046f\3\2\2\2\u0478\u0472\3"+
		"\2\2\2\u0478\u0475\3\2\2\2\u0479\u047c\3\2\2\2\u047a\u0478\3\2\2\2\u047a"+
		"\u047b\3\2\2\2\u047b\u00f3\3\2\2\2\u047c\u047a\3\2\2\2\u047d\u047e\b{"+
		"\1\2\u047e\u047f\5\u00f6|\2\u047f\u0488\3\2\2\2\u0480\u0481\f\4\2\2\u0481"+
		"\u0482\7>\2\2\u0482\u0487\5\u00f6|\2\u0483\u0484\f\3\2\2\u0484\u0485\7"+
		"?\2\2\u0485\u0487\5\u00f6|\2\u0486\u0480\3\2\2\2\u0486\u0483\3\2\2\2\u0487"+
		"\u048a\3\2\2\2\u0488\u0486\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u00f5\3\2"+
		"\2\2\u048a\u0488\3\2\2\2\u048b\u048c\b|\1\2\u048c\u048d\5\u00fa~\2\u048d"+
		"\u0499\3\2\2\2\u048e\u048f\f\5\2\2\u048f\u0490\7@\2\2\u0490\u0498\5\u00fa"+
		"~\2\u0491\u0492\f\4\2\2\u0492\u0493\7A\2\2\u0493\u0498\5\u00fa~\2\u0494"+
		"\u0495\f\3\2\2\u0495\u0496\7B\2\2\u0496\u0498\5\u00fa~\2\u0497\u048e\3"+
		"\2\2\2\u0497\u0491\3\2\2\2\u0497\u0494\3\2\2\2\u0498\u049b\3\2\2\2\u0499"+
		"\u0497\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u00f7\3\2\2\2\u049b\u0499\3\2"+
		"\2\2\u049c\u049d\7c\2\2\u049d\u049e\5v<\2\u049e\u049f\7d\2\2\u049f\u04a0"+
		"\5\u00fa~\2\u04a0\u04a7\3\2\2\2\u04a1\u04a2\7c\2\2\u04a2\u04a3\5~@\2\u04a3"+
		"\u04a4\7d\2\2\u04a4\u04a5\5\u0100\u0081\2\u04a5\u04a7\3\2\2\2\u04a6\u049c"+
		"\3\2\2\2\u04a6\u04a1\3\2\2\2\u04a7\u00f9\3\2\2\2\u04a8\u04b0\5\u00fe\u0080"+
		"\2\u04a9\u04b0\5\u00fc\177\2\u04aa\u04ab\7>\2\2\u04ab\u04b0\5\u00fa~\2"+
		"\u04ac\u04ad\7?\2\2\u04ad\u04b0\5\u00fa~\2\u04ae\u04b0\5\u0100\u0081\2"+
		"\u04af\u04a8\3\2\2\2\u04af\u04a9\3\2\2\2\u04af\u04aa\3\2\2\2\u04af\u04ac"+
		"\3\2\2\2\u04af\u04ae\3\2\2\2\u04b0\u00fb\3\2\2\2\u04b1\u04b2\7P\2\2\u04b2"+
		"\u04b3\5\u00fa~\2\u04b3\u00fd\3\2\2\2\u04b4\u04b5\7O\2\2\u04b5\u04b6\5"+
		"\u00fa~\2\u04b6\u00ff\3\2\2\2\u04b7\u04be\5\u0106\u0084\2\u04b8\u04b9"+
		"\7;\2\2\u04b9\u04be\5\u00fa~\2\u04ba\u04bb\7\67\2\2\u04bb\u04be\5\u00fa"+
		"~\2\u04bc\u04be\5\u00f8}\2\u04bd\u04b7\3\2\2\2\u04bd\u04b8\3\2\2\2\u04bd"+
		"\u04ba\3\2\2\2\u04bd\u04bc\3\2\2\2\u04be\u0101\3\2\2\2\u04bf\u04c0\5\u0106"+
		"\u0084\2\u04c0\u04c1\7P\2\2\u04c1\u0103\3\2\2\2\u04c2\u04c3\5\u0106\u0084"+
		"\2\u04c3\u04c4\7O\2\2\u04c4\u0105\3\2\2\2\u04c5\u04c6\b\u0084\1\2\u04c6"+
		"\u04c9\5\u010c\u0087\2\u04c7\u04c9\5\u0124\u0093\2\u04c8\u04c5\3\2\2\2"+
		"\u04c8\u04c7\3\2\2\2\u04c9\u04d0\3\2\2\2\u04ca\u04cb\f\4\2\2\u04cb\u04cf"+
		"\7O\2\2\u04cc\u04cd\f\3\2\2\u04cd\u04cf\7P\2\2\u04ce\u04ca\3\2\2\2\u04ce"+
		"\u04cc\3\2\2\2\u04cf\u04d2\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04d1\3\2"+
		"\2\2\u04d1\u0107\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d3\u04d4\5\u0126\u0094"+
		"\2\u04d4\u04d6\7c\2\2\u04d5\u04d7\5\u0112\u008a\2\u04d6\u04d5\3\2\2\2"+
		"\u04d6\u04d7\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\7d\2\2\u04d9\u04ec"+
		"\3\2\2\2\u04da\u04db\5\u010c\u0087\2\u04db\u04dc\7k\2\2\u04dc\u04dd\7"+
		"\65\2\2\u04dd\u04df\7c\2\2\u04de\u04e0\5\u0112\u008a\2\u04df\u04de\3\2"+
		"\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\7d\2\2\u04e2"+
		"\u04ec\3\2\2\2\u04e3\u04e4\7\'\2\2\u04e4\u04e5\7k\2\2\u04e5\u04e6\7\65"+
		"\2\2\u04e6\u04e8\7c\2\2\u04e7\u04e9\5\u0112\u008a\2\u04e8\u04e7\3\2\2"+
		"\2\u04e8\u04e9\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04ec\7d\2\2\u04eb\u04d3"+
		"\3\2\2\2\u04eb\u04da\3\2\2\2\u04eb\u04e3\3\2\2\2\u04ec\u0109\3\2\2\2\u04ed"+
		"\u04ee\5\u010c\u0087\2\u04ee\u04ef\7k\2\2\u04ef\u04f0\7\65\2\2\u04f0\u04f5"+
		"\3\2\2\2\u04f1\u04f2\7\'\2\2\u04f2\u04f3\7k\2\2\u04f3\u04f5\7\65\2\2\u04f4"+
		"\u04ed\3\2\2\2\u04f4\u04f1\3\2\2\2\u04f5\u010b\3\2\2\2\u04f6\u04f7\b\u0087"+
		"\1\2\u04f7\u04f8\5\u0126\u0094\2\u04f8\u04fa\7c\2\2\u04f9\u04fb\5\u0112"+
		"\u008a\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc"+
		"\u04fd\7d\2\2\u04fd\u050c\3\2\2\2\u04fe\u04ff\7\'\2\2\u04ff\u0500\7k\2"+
		"\2\u0500\u0501\7\65\2\2\u0501\u0503\7c\2\2\u0502\u0504\5\u0112\u008a\2"+
		"\u0503\u0502\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u050c"+
		"\7d\2\2\u0506\u050c\5\u010e\u0088\2\u0507\u0508\7\'\2\2\u0508\u0509\7"+
		"k\2\2\u0509\u050c\7\65\2\2\u050a\u050c\5\u0114\u008b\2\u050b\u04f6\3\2"+
		"\2\2\u050b\u04fe\3\2\2\2\u050b\u0506\3\2\2\2\u050b\u0507\3\2\2\2\u050b"+
		"\u050a\3\2\2\2\u050c\u051a\3\2\2\2\u050d\u050e\f\b\2\2\u050e\u050f\7k"+
		"\2\2\u050f\u0510\7\65\2\2\u0510\u0512\7c\2\2\u0511\u0513\5\u0112\u008a"+
		"\2\u0512\u0511\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0519"+
		"\7d\2\2\u0515\u0516\f\5\2\2\u0516\u0517\7k\2\2\u0517\u0519\7\65\2\2\u0518"+
		"\u050d\3\2\2\2\u0518\u0515\3\2\2\2\u0519\u051c\3\2\2\2\u051a\u0518\3\2"+
		"\2\2\u051a\u051b\3\2\2\2\u051b\u010d\3\2\2\2\u051c\u051a\3\2\2\2\u051d"+
		"\u051e\b\u0088\1\2\u051e\u052b\5\u012a\u0096\2\u051f\u052b\7*\2\2\u0520"+
		"\u0521\7c\2\2\u0521\u0522\5\u00d8m\2\u0522\u0523\7d\2\2\u0523\u052b\3"+
		"\2\2\2\u0524\u052b\5\u0110\u0089\2\u0525\u0526\5\u0124\u0093\2\u0526\u0527"+
		"\7e\2\2\u0527\u0528\5\u00d8m\2\u0528\u0529\7f\2\2\u0529\u052b\3\2\2\2"+
		"\u052a\u051d\3\2\2\2\u052a\u051f\3\2\2\2\u052a\u0520\3\2\2\2\u052a\u0524"+
		"\3\2\2\2\u052a\u0525\3\2\2\2\u052b\u0533\3\2\2\2\u052c\u052d\f\3\2\2\u052d"+
		"\u052e\7e\2\2\u052e\u052f\5\u00d8m\2\u052f\u0530\7f\2\2\u0530\u0532\3"+
		"\2\2\2\u0531\u052c\3\2\2\2\u0532\u0535\3\2\2\2\u0533\u0531\3\2\2\2\u0533"+
		"\u0534\3\2\2\2\u0534\u010f\3\2\2\2\u0535\u0533\3\2\2\2\u0536\u0537\7\37"+
		"\2\2\u0537\u0538\5\u0082B\2\u0538\u053a\7c\2\2\u0539\u053b\5\u0112\u008a"+
		"\2\u053a\u0539\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053d"+
		"\7d\2\2\u053d\u0111\3\2\2\2\u053e\u053f\b\u008a\1\2\u053f\u0540\5\u00d8"+
		"m\2\u0540\u0546\3\2\2\2\u0541\u0542\f\3\2\2\u0542\u0543\7i\2\2\u0543\u0545"+
		"\5\u00d8m\2\u0544\u0541\3\2\2\2\u0545\u0548\3\2\2\2\u0546\u0544\3\2\2"+
		"\2\u0546\u0547\3\2\2\2\u0547\u0113\3\2\2\2\u0548\u0546\3\2\2\2\u0549\u054a"+
		"\7\37\2\2\u054a\u054b\5v<\2\u054b\u054d\5\u0116\u008c\2\u054c\u054e\5"+
		"\u011a\u008e\2\u054d\u054c\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0556\3\2"+
		"\2\2\u054f\u0550\7\37\2\2\u0550\u0551\5\u0080A\2\u0551\u0553\5\u0116\u008c"+
		"\2\u0552\u0554\5\u011a\u008e\2\u0553\u0552\3\2\2\2\u0553\u0554\3\2\2\2"+
		"\u0554\u0556\3\2\2\2\u0555\u0549\3\2\2\2\u0555\u054f\3\2\2\2\u0556\u0115"+
		"\3\2\2\2\u0557\u0558\b\u008c\1\2\u0558\u0559\5\u0118\u008d\2\u0559\u055e"+
		"\3\2\2\2\u055a\u055b\f\3\2\2\u055b\u055d\5\u0118\u008d\2\u055c\u055a\3"+
		"\2\2\2\u055d\u0560\3\2\2\2\u055e\u055c\3\2\2\2\u055e\u055f\3\2\2\2\u055f"+
		"\u0117\3\2\2\2\u0560\u055e\3\2\2\2\u0561\u0562\7e\2\2\u0562\u0563\5\u00d8"+
		"m\2\u0563\u0564\7f\2\2\u0564\u0119\3\2\2\2\u0565\u0566\b\u008e\1\2\u0566"+
		"\u0567\7e\2\2\u0567\u0568\7f\2\2\u0568\u056e\3\2\2\2\u0569\u056a\f\3\2"+
		"\2\u056a\u056b\7e\2\2\u056b\u056d\7f\2\2\u056c\u0569\3\2\2\2\u056d\u0570"+
		"\3\2\2\2\u056e\u056c\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u011b\3\2\2\2\u0570"+
		"\u056e\3\2\2\2\u0571\u0572\5\u0124\u0093\2\u0572\u0573\7e\2\2\u0573\u0574"+
		"\5\u00d8m\2\u0574\u0575\7f\2\2\u0575\u057c\3\2\2\2\u0576\u0577\5\u010e"+
		"\u0088\2\u0577\u0578\7e\2\2\u0578\u0579\5\u00d8m\2\u0579\u057a\7f\2\2"+
		"\u057a\u057c\3\2\2\2\u057b\u0571\3\2\2\2\u057b\u0576\3\2\2\2\u057c\u011d"+
		"\3\2\2\2\u057d\u057e\b\u0090\1\2\u057e\u057f\7\65\2\2\u057f\u0585\3\2"+
		"\2\2\u0580\u0581\f\3\2\2\u0581\u0582\7k\2\2\u0582\u0584\7\65\2\2\u0583"+
		"\u0580\3\2\2\2\u0584\u0587\3\2\2\2\u0585\u0583\3\2\2\2\u0585\u0586\3\2"+
		"\2\2\u0586\u011f\3\2\2\2\u0587\u0585\3\2\2\2\u0588\u058e\7\65\2\2\u0589"+
		"\u058a\5\u011e\u0090\2\u058a\u058b\7k\2\2\u058b\u058c\7\65\2\2\u058c\u058e"+
		"\3\2\2\2\u058d\u0588\3\2\2\2\u058d\u0589\3\2\2\2\u058e\u0121\3\2\2\2\u058f"+
		"\u0590\7\65\2\2\u0590\u0123\3\2\2\2\u0591\u0597\7\65\2\2\u0592\u0593\5"+
		"\u0128\u0095\2\u0593\u0594\7k\2\2\u0594\u0595\7\65\2\2\u0595\u0597\3\2"+
		"\2\2\u0596\u0591\3\2\2\2\u0596\u0592\3\2\2\2\u0597\u0125\3\2\2\2\u0598"+
		"\u059e\7\65\2\2\u0599\u059a\5\u0128\u0095\2\u059a\u059b\7k\2\2\u059b\u059c"+
		"\7\65\2\2\u059c\u059e\3\2\2\2\u059d\u0598\3\2\2\2\u059d\u0599\3\2\2\2"+
		"\u059e\u0127\3\2\2\2\u059f\u05a0\b\u0095\1\2\u05a0\u05a1\7\65\2\2\u05a1"+
		"\u05a7\3\2\2\2\u05a2\u05a3\f\3\2\2\u05a3\u05a4\7k\2\2\u05a4\u05a6\7\65"+
		"\2\2\u05a5\u05a2\3\2\2\2\u05a6\u05a9\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a7"+
		"\u05a8\3\2\2\2\u05a8\u0129\3\2\2\2\u05a9\u05a7\3\2\2\2\u05aa\u05b1\5\u012c"+
		"\u0097\2\u05ab\u05b1\5\u012e\u0098\2\u05ac\u05b1\5\u0130\u0099\2\u05ad"+
		"\u05b1\7^\2\2\u05ae\u05b1\7_\2\2\u05af\u05b1\7\62\2\2\u05b0\u05aa\3\2"+
		"\2\2\u05b0\u05ab\3\2\2\2\u05b0\u05ac\3\2\2\2\u05b0\u05ad\3\2\2\2\u05b0"+
		"\u05ae\3\2\2\2\u05b0\u05af\3\2\2\2\u05b1\u012b\3\2\2\2\u05b2\u05b3\t\13"+
		"\2\2\u05b3\u012d\3\2\2\2\u05b4\u05b5\t\f\2\2\u05b5\u012f\3\2\2\2\u05b6"+
		"\u05b7\t\r\2\2\u05b7\u0131\3\2\2\2\u0088\u0133\u0136\u0139\u0146\u014b"+
		"\u015e\u0164\u0167\u016c\u016f\u017a\u018d\u0192\u019d\u01a3\u01a7\u01ad"+
		"\u01b1\u01bc\u01c4\u01d0\u01e1\u01e6\u01e9\u01f0\u01f6\u01f9\u01fc\u0209"+
		"\u0216\u021e\u0228\u022d\u0233\u0238\u023c\u0245\u024d\u0253\u0256\u025b"+
		"\u0266\u0274\u0279\u0284\u0289\u0292\u0297\u02a2\u02a9\u02b7\u02bd\u02c4"+
		"\u02c9\u02cd\u02d5\u02d9\u02e5\u02f0\u02f5\u0303\u030a\u0317\u032d\u034d"+
		"\u0350\u035b\u0368\u0371\u038a\u038e\u0392\u039a\u039e\u03a2\u03a9\u03b5"+
		"\u03ba\u03c0\u03c6\u03db\u03df\u03e8\u03fa\u0403\u040e\u0418\u0423\u042e"+
		"\u0439\u0444\u0450\u0452\u0467\u0469\u0478\u047a\u0486\u0488\u0497\u0499"+
		"\u04a6\u04af\u04bd\u04c8\u04ce\u04d0\u04d6\u04df\u04e8\u04eb\u04f4\u04fa"+
		"\u0503\u050b\u0512\u0518\u051a\u052a\u0533\u053a\u0546\u054d\u0553\u0555"+
		"\u055e\u056e\u057b\u0585\u058d\u0596\u059d\u05a7\u05b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}