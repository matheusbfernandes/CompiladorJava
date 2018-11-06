grammar Java;

/*
*
*ANALISADOR SINTATICO
*
*/

//Programs
compilationUnit : packageDeclaration? importDeclarations? typeDeclarations?;//<compilation unit> ::= <package declaration>? <import declarations>? <type declarations>?

//Declarations
packageDeclaration : PACKAGE packageName PontoVirgula;//<package declaration> ::= package <package name> ;
importDeclarations : importDeclaration | importDeclarations importDeclaration;//<import declarations> ::= <import declaration> | <import declarations> <import declaration>
importDeclaration : singleTypeImportDeclaration | typeImportOnDemandDeclaration;//<import declaration> ::= <single type import declaration> | <type import on demand declaration>
singleTypeImportDeclaration : IMPORT typeName PontoVirgula;//<single type import declaration> ::= import <type name> ;
typeImportOnDemandDeclaration : IMPORT packageName Ponto OpMulti PontoVirgula;//<type import on demand declaration> ::= import <package name> . * ;
typeDeclarations : typeDeclaration | typeDeclarations typeDeclaration;//<type declarations> ::= <type declaration> | <type declarations> <type declaration>
typeDeclaration : classDeclaration | interfaceDeclaration | PontoVirgula;//<type declaration> ::= <class declaration> | <interface declaration> | ;
classDeclaration : classModifiers? CLASS ID superRule? interfaces? classBody;//<class declaration> ::= <class modifiers>? class <identifier> <super>? <interfaces>? <class body>
classModifiers : classModifier | classModifiers classModifier;//<class modifiers> ::= <class modifier> | <class modifiers> <class modifier>
classModifier : PUBLIC | ABSTRACT | FINAL;//<class modifier> ::= public | abstract | final
superRule : EXTENDS classType;//<super> ::= extends <class type>
interfaces : IMPLEMENTS interfaceTypeList;//<interfaces> ::= implements <interface type list>
interfaceTypeList : interfaceType | interfaceTypeList Virgula interfaceType;//<interface type list> ::= <interface type> | <interface type list> , <interface type>
classBody : ACh classBodyDeclarations? FCh;//<class body> ::= { <class body declarations>? }
classBodyDeclarations : classBodyDeclaration | classBodyDeclarations classBodyDeclaration;//<class body declarations> ::= <class body declaration> | <class body declarations> <class body declaration>
classBodyDeclaration : classMemberDeclaration | staticInitializer | constructorDeclaration;//<class body declaration> ::= <class member declaration> | <static initializer> | <constructor declaration>
classMemberDeclaration : fieldDeclaration | methodDeclaration;//<class member declaration> ::= <field declaration> | <method declaration>
staticInitializer : STATIC block;//<static initializer> ::= static <block>
constructorDeclaration : constructorModifiers? constructorDeclarator throwsRule? constructorBody;//<constructor declaration> ::= <constructor modifiers>? <constructor declarator> <throws>? <constructor body>
constructorModifiers : constructorModifier | constructorModifiers constructorModifier;//<constructor modifiers> ::= <constructor modifier> | <constructor modifiers> <constructor modifier>
constructorModifier : PUBLIC | PROTECTED | PRIVATE;//<constructor modifier> ::= public | protected | private
constructorDeclarator : simpleTypeName AP formalParameterList? FP;//<constructor declarator> ::= <simple type name> ( <formal parameter list>? )
formalParameterList : formalParameter | formalParameterList PontoVirgula formalParameter;//<formal parameter list> ::= <formal parameter> | <formal parameter list> , <formal parameter>
formalParameter : type variableDeclaratorId;//<formal parameter> ::= <type> <variable declarator id>
throwsRule : THROWS classTypeList;//<throws> ::= throws <class type list>
classTypeList : classType | classTypeList Virgula classType;//<class type list> ::= <class type> | <class type list> , <class type>
constructorBody :ACh explicitConstructorInvocation? blockStatements? FCh;//<constructor body> ::= { <explicit constructor invocation>? <block statements>? }
explicitConstructorInvocation : THIS AP argumentList? FP | SUPER AP argumentList? FP;//<explicit constructor invocation>::= this ( <argument list>? ) | super ( <argument list>? )
fieldDeclaration : fieldModifiers? type variableDeclarators PontoVirgula;//<field declaration> ::= <field modifiers>? <type> <variable declarators> ;
fieldModifiers : fieldModifier | fieldModifiers fieldModifier;//<field modifiers> ::= <field modifier> | <field modifiers> <field modifier>
fieldModifier : PUBLIC | PROTECTED | PRIVATE | STATIC | FINAL | TRANSIENT | VOLATILE;//<field modifier> ::= public | protected | private | static | final | transient | volatile
variableDeclarators : variableDeclarator | variableDeclarators Virgula variableDeclarator;//<variable declarators> ::= <variable declarator> | <variable declarators> , <variable declarator>
variableDeclarator : variableDeclaratorId | variableDeclaratorId OpAtribuicao variableInitializer;//<variable declarator> ::= <variable declarator id> | <variable declarator id> = <variable initializer>
variableDeclaratorId : ID | variableDeclaratorId AC FC;//<variable declarator id> ::= <identifier> | <variable declarator id> [ ]
variableInitializer : expression | arrayInitializer;//<variable initializer> ::= <expression> | <array initializer>
methodDeclaration : methodHeader methodBody;//<method declaration> ::= <method header> <method body>
methodHeader : methodModifiers? resultType methodDeclarator throwsRule?;//<method header> ::= <method modifiers>? <result type> <method declarator> <throws>?
resultType : type | VOID;//<result type> ::= <type> | void
methodModifiers : methodModifier | methodModifiers methodModifier;//<method modifiers> ::= <method modifier> | <method modifiers> <method modifier>
methodModifier : PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | FINAL | SYNCHRONIZED | NATIVE;//<method modifier> ::= public | protected | private | static | abstract | final | synchronized | native
methodDeclarator : ID AP formalParameterList? FP;//<method declarator> ::= <identifier> ( <formal parameter list>? )
methodBody : block | PontoVirgula;//<method body> ::= <block> | ;
interfaceDeclaration : interfaceModifiers? INTERFACE ID extendsInterfaces? interfaceBody;//<interface declaration> ::= <interface modifiers>? interface <identifier> <extends interfaces>? <interface body>
interfaceModifiers : interfaceModifier | interfaceModifiers interfaceModifier;//<interface modifiers> ::= <interface modifier> | <interface modifiers> <interface modifier>
interfaceModifier : PUBLIC | ABSTRACT;//<interface modifier> ::= public | abstract
extendsInterfaces : EXTENDS interfaceType | extendsInterfaces Virgula interfaceType;//<extends interfaces> ::= extends <interface type> | <extends interfaces> , <interface type>
interfaceBody : ACh interfaceMemberDeclarations? FCh;//<interface body> ::= { <interface member declarations>? }
interfaceMemberDeclarations : interfaceMemberDeclaration | interfaceMemberDeclarations interfaceMemberDeclaration;//<interface member declarations> ::= <interface member declaration> | <interface member declarations> <interface member declaration>
interfaceMemberDeclaration : constantDeclaration | abstractMethodDeclaration;//<interface member declaration> ::= <constant declaration> | <abstract method declaration>
constantDeclaration : constantModifiers type variableDeclarator;//<constant declaration> ::= <constant modifiers> <type> <variable declarator>
constantModifiers : PUBLIC | STATIC | FINAL;//<constant modifiers> ::= public | static | final
abstractMethodDeclaration : abstractMethodModifiers? resultType methodDeclarator throwsRule? PontoVirgula;//<abstract method declaration>::= <abstract method modifiers>? <result type> <method declarator> <throws>? ;
abstractMethodModifiers : abstractMethodModifier | abstractMethodModifiers abstractMethodModifier;//<abstract method modifiers> ::= <abstract method modifier> | <abstract method modifiers> <abstract method modifier>
abstractMethodModifier : PUBLIC | ABSTRACT;//<abstract method modifier> ::= public | abstract
arrayInitializer : ACh variableInitializers? Virgula Interrogacao FCh;//<array initializer> ::= { <variable initializers>? , ? }
variableInitializers : variableInitializer | variableInitializers Virgula variableInitializer;//<variable initializers> ::= <variable initializer> | <variable initializers> , <variable initializer>

//Types
type : primitiveType | classOrInterfaceType | type AC FC;//<type> ::= <primitive type> | <reference type>
primitiveType : numericType | BOOLEAN;//<primitive type> ::= <numeric type> | boolean
numericType : integralType | floatingPointType;//<numeric type> ::= <integral type> | <floating-point type>
integralType : BYTE | SHORT | INT | LONG | CHAR;//<integral type> ::= byte | short | int | long | char
floatingPointType : FLOAT | DOUBLE;//<floating-point type> ::= float | double
referenceType : classOrInterfaceType | arrayType;//<reference type> ::= <class or interface type> | <array type>
classOrInterfaceType : classType | interfaceType;//<class or interface type> ::= <class type> | <interface type>
classType : typeName;//<class type> ::= <type name>
interfaceType : typeName;//<interface type> ::= <type name>
arrayType : type AC FC;//<array type> ::= <type> [ ]

//Blocks and Commands
block : ACh blockStatements? FCh;//<block> ::= { <block statements>? }
blockStatements : blockStatement | blockStatements blockStatement;//<block statements> ::= <block statement> | <block statements> <block statement>
blockStatement : localVariableDeclarationStatement | statement;//<block statement> ::= <local variable declaration statement> | <statement>
localVariableDeclarationStatement : localVariableDeclaration ';';//<local variable declaration statement> ::= <local variable declaration> ;
localVariableDeclaration : type variableDeclarators;//<local variable declaration> ::= <type> <variable declarators>
statement : statementWithoutTrailingSubstatement | labeledStatement | ifThenStatement | ifThenElseStatement | whileStatement | forStatement;//<statement> ::= <statement without trailing substatement> | <labeled statement> | <if then statement> | <if then else statement> | <while statement> | <for statement>
statementNoShortIf : statementWithoutTrailingSubstatement | labeledStatementNoShortIf | ifThenElseStatementNoShortIf | whileStatementNoShortIf | forStatementNoShortIf;//<statement no short if> ::= <statement without trailing substatement> | <labeled statement no short if> | <if then else statement no short if> | <while statement no short if> | <for statement no short if>
statementWithoutTrailingSubstatement : block | emptyStatement | expressionStatement | switchStatement | doStatement | breakStatement | continueStatement | returnStatement | synchronizedStatement | throwsStatement | tryStatement;//<statement without trailing substatement> ::= <block> | <empty statement> | <expression statement> | <switch statement> | <do statement> | <break statement> | <continue statement> | <return statement> | <synchronized statement> | <throws statements> | <try statement>
emptyStatement : PontoVirgula;//<empty statement> ::= ;
labeledStatement : ID DoisPontos statement;//<labeled statement> ::= <identifier> : <statement>
labeledStatementNoShortIf : ID DoisPontos statementNoShortIf;//<labeled statement no short if> ::= <identifier> : <statement no short if>
expressionStatement : statementExpression PontoVirgula;//<expression statement> ::= <statement expression> ;
statementExpression : assignment | preincrementExpression | postincrementExpression | predecrementExpression | postdecrementExpression | methodInvocation | classInstanceCreationExpression;//<statement expression> ::= <assignment> | <preincrement expression> | <postincrement expression> | <predecrement expression> | <postdecrement expression> | <method invocation> | <class instance creation expression>
ifThenStatement : IF AP expression FP statement;//<if then statement>::= if ( <expression> ) <statement>
ifThenElseStatement : IF AP expression FP statementNoShortIf ELSE statement;//<if then else statement>::= if ( <expression> ) <statement no short if> else <statement>
ifThenElseStatementNoShortIf : IF AP expression FP statementNoShortIf ELSE statementNoShortIf;//<if then else statement no short if> ::= if ( <expression> ) <statement no short if> else <statement no short if>
switchStatement : SWITCH AP expression FP switchBlock;//<switch statement> ::= switch ( <expression> ) <switch block>
switchBlock : ACh switchBlockStatementGroups? switchLabels? FCh;//<switch block> ::= { <switch block statement groups>? <switch labels>? }
switchBlockStatementGroups : switchBlockStatementGroup | switchBlockStatementGroups switchBlockStatementGroup;//<switch block statement groups> ::= <switch block statement group> | <switch block statement groups> <switch block statement group>
switchBlockStatementGroup : switchLabels blockStatements;//<switch block statement group> ::= <switch labels> <block statements>
switchLabels : switchLabel | switchLabels switchLabel;//<switch labels> ::= <switch label> | <switch labels> <switch label>
switchLabel : CASE constantExpression DoisPontos | DEFAULT DoisPontos;//<switch label> ::= case <constant expression> : | default :
whileStatement : WHILE AP expression FP statement;//<while statement> ::= while ( <expression> ) <statement>
whileStatementNoShortIf : WHILE AP expression FP statementNoShortIf;//<while statement no short if> ::= while ( <expression> ) <statement no short if>
doStatement : DO statement WHILE AP expression FP PontoVirgula;//<do statement> ::= do <statement> while ( <expression> ) ;
forStatement : FOR AP forInit? PontoVirgula expression? PontoVirgula forUpdate? FP statement;//<for statement> ::= for ( <for init>? ; <expression>? ; <for update>? ) <statement>
forStatementNoShortIf : FOR AP forInit? PontoVirgula expression? PontoVirgula forUpdate? FP statementNoShortIf;//<for statement no short if> ::= for ( <for init>? ; <expression>? ; <for update>? ) <statement no short if>
forInit : statementExpressionList | localVariableDeclaration;//<for init> ::= <statement expression list> | <local variable declaration>
forUpdate : statementExpressionList;//<for update> ::= <statement expression list>
statementExpressionList : statementExpression | statementExpressionList Virgula statementExpression;//<statement expression list> ::= <statement expression> | <statement expression list> , <statement expression>
breakStatement : BREAK ID? PontoVirgula;//<break statement> ::= break <identifier>? ;
continueStatement : CONTINUE ID? PontoVirgula;//<continue statement> ::= continue <identifier>? ;
returnStatement : RETURN expression? PontoVirgula;//<return statement> ::= return <expression>? ;
throwsStatement : THROW expression PontoVirgula;//<throws statement> ::= throw <expression> ;
synchronizedStatement : SYNCHRONIZED AP expression FP block;//<synchronized statement> ::= synchronized ( <expression> ) <block>
tryStatement : TRY block catches | TRY block catches? finallyRule;//<try statement> ::= try <block> <catches> | try <block> <catches>? <finally>
catches : catchClause | catches catchClause;//<catches> ::= <catch clause> | <catches> <catch clause>
catchClause : CATCH AP formalParameter FP block;//<catch clause> ::= catch ( <formal parameter> ) <block>
finallyRule : FINALLY block;//<finally > ::= finally <block>

//Expressions
constantExpression : expression;//<constant expression> ::= <expression>
expression : assignmentExpression;//<expression> ::= <assignment expression>
assignmentExpression : conditionalExpression | assignment;//<assignment expression> ::= <conditional expression> | <assignment>
assignment : leftHandSide assignmentOperator assignmentExpression;//<assignment> ::= <left hand side> <assignment operator> <assignment expression>
leftHandSide : expressionName | fieldAccess | arrayAccess;//<left hand side> ::= <expression name> | <field access> | <array access>
assignmentOperator : OpAtribuicao | OpMultiAtribuicao | OpDivAtribuicao | OpRestoAtribuicao | OpSomaAtribuicao | OpSubAtribuicao | OpLeftAtribuicao | OpRightAtribuicao | OpRightZeroAtribuicao | OpANDAtribuicao | OpXORAtribuicao | OpORAtribuicao;//<assignment operator> ::= = | *= | /= | %= | += | -= | <<= | >>= | >>>= | &= | ^= | |=
conditionalExpression : conditionalOrExpression | conditionalOrExpression Interrogacao expression DoisPontos conditionalExpression;//<conditional expression> ::= <conditional or expression> | <conditional or expression> ? <expression> : <conditional expression>
conditionalOrExpression : conditionalAndExpression | conditionalOrExpression OpOR conditionalAndExpression;//<conditional or expression> ::= <conditional and expression> | <conditional or expression> || <conditional and expression>
conditionalAndExpression : inclusiveOrExpression | conditionalAndExpression OpAND inclusiveOrExpression;//<conditional and expression> ::= <inclusive or expression> | <conditional and expression> && <inclusive or expression>
inclusiveOrExpression : exclusiveOrExpression | inclusiveOrExpression OpBitOR exclusiveOrExpression;//<inclusive or expression> ::= <exclusive or expression> | <inclusive or expression> | <exclusive or expression>
exclusiveOrExpression : andExpression | exclusiveOrExpression OpBitXOR andExpression;//<exclusive or expression> ::= <and expression> | <exclusive or expression> ^ <and expression>
andExpression : equalityExpression | andExpression OpBitAND equalityExpression;//<and expression> ::= <equality expression> | <and expression> & <equality expression>
equalityExpression : relationalExpression | equalityExpression OpIgualdade relationalExpression | equalityExpression OpDesigualdade relationalExpression;//<equality expression> ::= <relational expression> | <equality expression> == <relational expression> | <equality expression> != <relational expression>
relationalExpression : shiftExpression | relationalExpression OpMenor shiftExpression | relationalExpression OpMaior shiftExpression | relationalExpression OpMenorIgual shiftExpression | relationalExpression OpMaiorIgual shiftExpression | relationalExpression INSTANCEOF referenceType;//<relational expression> ::= <shift expression> | <relational expression> < <shift expression> | <relational expression> > <shift expression> | <relational expression> <= <shift expression> | <relational expression> >= <shift expression> | <relational expression> instanceof <reference type>
shiftExpression : additiveExpression | shiftExpression OpShitLeft additiveExpression | shiftExpression OpShitRight additiveExpression | shiftExpression OpShiftZeroRight additiveExpression;//<shift expression> ::= <additive expression> | <shift expression> << <additive expression> | <shift expression> >> <additive expression> | <shift expression> >>> <additive expression>
additiveExpression : multiplicativeExpression | additiveExpression OpSoma multiplicativeExpression | additiveExpression OpSub multiplicativeExpression;//<additive expression> ::= <multiplicative expression> | <additive expression> + <multiplicative expression> | <additive expression> - <multiplicative expression>
multiplicativeExpression : unaryExpression | multiplicativeExpression OpMulti unaryExpression | multiplicativeExpression OpDiv unaryExpression | multiplicativeExpression OpResto unaryExpression;//<multiplicative expression> ::= <unary expression> | <multiplicative expression> * <unary expression> | <multiplicative expression> / <unary expression> | <multiplicative expression> % <unary expression>
castExpression : AP primitiveType FP unaryExpression | AP referenceType FP unaryExpressionNotPlusMinus;//<cast expression> ::= ( <primitive type> ) <unary expression> | ( <reference type> ) <unary expression not plus minus>
unaryExpression : preincrementExpression | predecrementExpression | OpSoma unaryExpression | OpSub unaryExpression | unaryExpressionNotPlusMinus;//<unary expression> ::= <preincrement expression> | <predecrement expression> | + <unary expression> | - <unary expression> | <unary expression not plus minus>
predecrementExpression : Decremento unaryExpression;//<predecrement expression> ::= -- <unary expression>
preincrementExpression : Incremento unaryExpression;//<preincrement expression> ::= ++ <unary expression>
unaryExpressionNotPlusMinus : postfixExpression | OpBitComp unaryExpression | OpNOT unaryExpression | castExpression;//<unary expression not plus minus> ::= <postfix expression> | ~ <unary expression> | ! <unary expression> | <cast expression>
postdecrementExpression : postfixExpression Decremento;//<postdecrement expression> ::= <postfix expression> --
postincrementExpression : postfixExpression Incremento;//<postincrement expression> ::= <postfix expression> ++
postfixExpression : primary | expressionName | postfixExpression Incremento |  postfixExpression Decremento;//<postfix expression> ::= <primary> | <expression name> | <postincrement expression> | <postdecrement expression>
methodInvocation : methodName AP argumentList? FP | primary Ponto ID AP argumentList? FP | SUPER Ponto ID AP argumentList? FP;//<method invocation> ::= <method name> ( <argument list>? ) | <primary> . <identifier> ( <argument list>? ) | super . <identifier> ( <argument list>? )
fieldAccess : primary Ponto ID | SUPER Ponto ID;//<field access> ::= <primary> . <identifier> | super . <identifier>
primary : methodName AP argumentList? FP | primary Ponto ID AP argumentList? FP | SUPER Ponto ID AP argumentList? FP | primaryNoNewArray | primary Ponto ID | SUPER Ponto ID | arrayCreationExpression;//<primary> ::= <primary no new array> | <array creation expression>
primaryNoNewArray : literal | THIS | AP expression FP | classInstanceCreationExpression | expressionName AC expression FC | primaryNoNewArray AC expression FC;//<primary no new array> ::= <literal> | this | ( <expression> ) | <class instance creation expression> | <field access> | <method invocation> | <array access>
classInstanceCreationExpression : NEW classType AP argumentList? FP;//<class instance creation expression> ::= new <class type> ( <argument list>? )
argumentList : expression | argumentList Virgula expression;//<argument list> ::= <expression> | <argument list> , <expression>
arrayCreationExpression : NEW primitiveType dimExprs dims? | NEW classOrInterfaceType dimExprs dims?;//<array creation expression> ::= new <primitive type> <dim exprs> <dims>? | new <class or interface type> <dim exprs> <dims>?
dimExprs : dimExpr | dimExprs dimExpr;//<dim exprs> ::= <dim expr> | <dim exprs> <dim expr>
dimExpr : AC expression FC;//<dim expr> ::= [ <expression> ]
dims : AC FC | dims AC FC;//<dims> ::= [ ] | <dims> [ ]
arrayAccess : expressionName AC expression FC | primaryNoNewArray AC expression FC;//<array access> ::= <expression name> [ <expression> ] | <primary no new array> [ <expression>]

//Tokens
packageName : ID | packageName Ponto ID;//<package name> ::= <identifier> | <package name> . <identifier>
typeName : ID | packageName Ponto ID;//<type name> ::= <identifier> | <package name> . <identifier>
simpleTypeName : ID;//<simple type name> ::= <identifier>
expressionName : ID | ambiguousName Ponto ID;//<expression name> ::= <identifier> | <ambiguous name> . <identifier>
methodName : ID | ambiguousName Ponto ID;//<method name> ::= <identifier> | <ambiguous name>. <identifier>
ambiguousName : ID | ambiguousName Ponto ID;//<ambiguous name>::= <identifier> | <ambiguous name>. <identifier>
literal : integerLiteral | floatingPointLiteral | booleanLiteral | Character | String | NULL;//<literal> ::= <integer literal> | <floating-point literal> | <boolean literal> | <character literal> | <string literal> | <null literal>
integerLiteral : DecimalNumeral | HexNumeral | OctalNumeral;
floatingPointLiteral : FloatNumeral | DoubleNumeral;
booleanLiteral : TRUE | FALSE;//<boolean literal> ::= true | false

/*
*
*ANALISADOR LEXICO
*
*/

// Palavras reservadas
ABSTRACT : 'abstract';
BOOLEAN : 'boolean';
BREAK : 'break';
BYTE : 'byte';
CASE : 'case';
CATCH : 'catch';
CHAR : 'char';
CLASS : 'class';
CONST : 'const';
CONTINUE : 'continue';
DEFAULT : 'default';
DO : 'do';
DOUBLE : 'double';
ELSE : 'else';
EXTENDS : 'extends';
FINAL : 'final';
FINALLY : 'finally';
FLOAT : 'float';
FOR : 'for';
GOTO : 'goto';
IF : 'if';
IMPLEMENTS : 'implements';
IMPORT : 'import';
INSTANCEOF : 'instanceof';
INT : 'int';
INTERFACE : 'interface';
LONG : 'long';
NATIVE : 'native';
NEW : 'new';
PACKAGE : 'package';
PRIVATE : 'private';
PROTECTED : 'protected';
PUBLIC : 'public';
RETURN : 'return';
SHORT : 'short';
STATIC : 'static';
SUPER : 'super';
SWITCH : 'switch';
SYNCHRONIZED : 'synchronized';
THIS : 'this';
THROW : 'throw';
THROWS : 'throws';
TRANSIENT : 'transient';
TRY : 'try';
VOID : 'void';
VOLATILE : 'volatile';
WHILE : 'while';
NULL : 'null';
TRUE : 'true';
FALSE : 'false';

// identificador
ID: (('a'..'z') | ('A'..'Z') | '_' | '$') (('a'..'z') | ('A'..'Z') | ('0'..'9') | '_' | '$')*;

// operadores
OpAtribuicao : '=';
OpNOT : '!';
OpBitAND : '&';
OpBitOR : '|';
OpBitXOR : '^';
OpBitComp : '~';
OpMenor : '<';
OpMaior : '>';
OpSoma : '+';
OpSub : '-';
OpMulti : '*';
OpDiv : '/';
OpResto : '%';
OpIgualdade : '==';
OpDesigualdade : '!=';
OpMenorIgual : '<=';
OpMaiorIgual : '>=';
OpMultiAtribuicao : '*=';
OpDivAtribuicao : '/=';
OpRestoAtribuicao : '%=';
OpSomaAtribuicao : '+=';
OpSubAtribuicao : '-=';
OpANDAtribuicao : '&=';
OpXORAtribuicao : '^=';
OpORAtribuicao : '|=';
Incremento : '++';
Decremento : '--';
OpAND : '&&';
OpOR : '||';
OpShitLeft : '<<';
OpShitRight : '>>';
OpShiftZeroRight : '>>>';
OpLeftAtribuicao : '<<=';
OpRightAtribuicao : '>>=';
OpRightZeroAtribuicao : '>>>=';

// constantes
fragment
NonZeroDigit : '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';

fragment
Digit : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';

fragment
OctalDigit : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7';

fragment
HexDigit : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';

fragment
EscapeSequence : '\\''t' | '\\''b' | '\\''n' | '\\''r' | '\\''f' | '\\''\'' | '\\''\\' | '\\''"';

DecimalNumeral : '0' ('l' | 'L')? | NonZeroDigit Digit* ('l' | 'L')?;
OctalNumeral : '0' OctalDigit* ('l' | 'L')?;
HexNumeral : '0x' HexDigit* ('l' | 'L')? | '0X' HexDigit* ('l' | 'L')?;
FloatNumeral : Digit+ (((('.' Digit+)? (('e' | 'E') Digit+)?) ('f' | 'F')?) | ('.' ('f' | 'F')) | (('.' ('e' | 'E') Digit+) ('f' | 'F')?));
DoubleNumeral : Digit+ (((('.' Digit+)? (('e' | 'E') Digit+)?) ('f' | 'F' | 'd' | 'D')?) | ('.' ('f' | 'F' | 'd' | 'D')) | (('.' ('e' | 'E') Digit+) ('f' | 'F' | 'd' | 'D')?));
Character : '\''~('"' | '\\')'\'' | '\'' EscapeSequence '\'';
String : '"'(~('"' | '\\') | EscapeSequence)*'"';
Espaco : ('\t' | ' ' | '\r' | '\n' | '\u000C')+ -> skip;
ComentarioLinha : '//' ~[\r\n]* -> skip;
ComentarioBloco : '/*' .*? '*/' -> skip;

// simbolo de pontuação
AP : '(';
FP : ')';
AC : '[';
FC : ']';
ACh : '{';
FCh : '}';
Virgula : ',';
DoisPontos : ':';
Ponto : '.';
Interrogacao : '?';
PontoVirgula : ';';

// erro
StringNaoTerminada: '"' ('\\' ["\\] | ~["\\\r\n])*;
ComentarioNaoTerminado: '/*' ('*' ~'/' | ~'*')*? EOF -> channel(HIDDEN);
ERROR : .;