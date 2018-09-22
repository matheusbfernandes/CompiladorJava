lexer grammar Java;

//Programs
CompilationUnit : PackageDeclaration? ImportDeclarations? TypeDeclarations?;//<compilation unit> ::= <package declaration>? <import declarations>? <type declarations>?

//Declarations
PackageDeclaration : 'package' PackageName ';';//<package declaration> ::= package <package name> ;
ImportDeclarations : ImportDeclaration | ImportDeclarations ImportDeclaration;//<import declarations> ::= <import declaration> | <import declarations> <import declaration>
ImportDeclaration : SingleTypeImportDeclaration | TypeImportOnDemandDeclaration;//<import declaration> ::= <single type import declaration> | <type import on demand declaration>
SingleTypeImportDeclaration : 'import' TypeName ';';//<single type import declaration> ::= import <type name> ;
TypeImportOnDemandDeclaration : 'import' PackageName .* ';';//<type import on demand declaration> ::= import <package name> . * ;
TypeDeclarations : TypeDeclaration | TypeDeclarations TypeDeclaration;//<type declarations> ::= <type declaration> | <type declarations> <type declaration>
TypeDeclaration : ClassDeclaration | InterfaceDeclaration | ';';//<type declaration> ::= <class declaration> | <interface declaration> | ;
ClassDeclaration : ClassModifiers? 'class' Identifier Super? Interfaces? ClassBody;//<class declaration> ::= <class modifiers>? class <identifier> <super>? <interfaces>? <class body>
ClassModifiers : ClassModifier | ClassModifiers ClassModifier;//<class modifiers> ::= <class modifier> | <class modifiers> <class modifier>
ClassModifier : 'public' | 'abstract' | 'final';//<class modifier> ::= public | abstract | final
Super : 'extends' ClassType;//<super> ::= extends <class type>
Interfaces : 'implements' InterfaceTypeList;//<interfaces> ::= implements <interface type list>
InterfaceTypeList : InterfaceType | InterfaceTypeList ',' InterfaceType;//<interface type list> ::= <interface type> | <interface type list> , <interface type>
ClassBody : '{' ClassBodyDeclarations? '}';//<class body> ::= { <class body declarations>? }
ClassBodyDeclarations : ClassBodyDeclaration | ClassBodyDeclarations ClassBodyDeclaration;//<class body declarations> ::= <class body declaration> | <class body declarations> <class body declaration>
ClassBodyDeclaration : ClassMemberDeclaration | StaticInitializer | ConstructorDeclaration;//<class body declaration> ::= <class member declaration> | <static initializer> | <constructor declaration>
ClassMemberDeclaration : FieldDeclaration | MethodDeclaration;//<class member declaration> ::= <field declaration> | <method declaration>
StaticInitializer : 'static' Block;//<static initializer> ::= static <block>
ConstructorDeclaration : ConstructorModifiers? ConstructorDeclarator Throws? ConstructorBody;//<constructor declaration> ::= <constructor modifiers>? <constructor declarator> <throws>? <constructor body>
ConstructorModifiers : ConstructorModifier | ConstructorModifiers ConstructorModifier;//<constructor modifiers> ::= <constructor modifier> | <constructor modifiers> <constructor modifier>
ConstructorModifier : 'public' | 'protected' | 'private';//<constructor modifier> ::= public | protected | private
ConstructorDeclarator : SimpleTypeName '(' FormalParameterList? ')';//<constructor declarator> ::= <simple type name> ( <formal parameter list>? )
FormalParameterList : FormalParameter | FormalParameterList ',' FormalParameter;//<formal parameter list> ::= <formal parameter> | <formal parameter list> , <formal parameter>
FormalParameter : Type VariableDeclaratorId;//<formal parameter> ::= <type> <variable declarator id>
Throws : 'throws' ClassTypeList;//<throws> ::= throws <class type list>
ClassTypeList : ClassType | ClassTypeList ',' ClassType;//<class type list> ::= <class type> | <class type list> , <class type>
ConstructorBody :'{' ExplicitConstructorInvocation? BlockStatements? '}';//<constructor body> ::= { <explicit constructor invocation>? <block statements>? }
ExplicitConstructorInvocation : 'this' '(' ArgumentList? ')' | 'super' '(' ArgumentList? ')';//<explicit constructor invocation>::= this ( <argument list>? ) | super ( <argument list>? )
FieldDeclaration : FieldModifiers? Type VariableDeclarators ';';//<field declaration> ::= <field modifiers>? <type> <variable declarators> ;
FieldModifiers : FieldModifier | FieldModifiers FieldModifier;//<field modifiers> ::= <field modifier> | <field modifiers> <field modifier>
FieldModifier : 'public' | 'protected' | 'private' | 'static' | 'final' | 'transient' | 'volatile';//<field modifier> ::= public | protected | private | static | final | transient | volatile
VariableDeclarators : VariableDeclarator | VariableDeclarators ',' VariableDeclarator;//<variable declarators> ::= <variable declarator> | <variable declarators> , <variable declarator>
VariableDeclarator : VariableDeclaratorId | VariableDeclaratorId '=' VariableInitializer;//<variable declarator> ::= <variable declarator id> | <variable declarator id> = <variable initializer>
VariableDeclaratorId : Identifier | VariableDeclaratorId '[' ']';//<variable declarator id> ::= <identifier> | <variable declarator id> [ ]
VariableInitializer : Expression | ArrayInitializer;//<variable initializer> ::= <expression> | <array initializer>
MethodDeclaration : MethodHeader MethodBody;//<method declaration> ::= <method header> <method body>
MethodHeader : MethodModifiers? ResultType MethodDeclarator Throws?;//<method header> ::= <method modifiers>? <result type> <method declarator> <throws>?
ResultType : Type | 'void';//<result type> ::= <type> | void
MethodModifiers : MethodModifier | MethodModifiers MethodModifier;//<method modifiers> ::= <method modifier> | <method modifiers> <method modifier>
MethodModifier : 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'synchronized' | 'native';//<method modifier> ::= public | protected | private | static | abstract | final | synchronized | native
MethodDeclarator : Identifier '(' FormalParameterList? ')';//<method declarator> ::= <identifier> ( <formal parameter list>? )
MethodBody : Block | ';';//<method body> ::= <block> | ;
InterfaceDeclaration : InterfaceModifiers? 'interface' Identifier ExtendsInterfaces? InterfaceBody;//<interface declaration> ::= <interface modifiers>? interface <identifier> <extends interfaces>? <interface body>
InterfaceModifiers : InterfaceModifier | InterfaceModifiers InterfaceModifier;//<interface modifiers> ::= <interface modifier> | <interface modifiers> <interface modifier>
InterfaceModifier : 'public' | 'abstract';//<interface modifier> ::= public | abstract
ExtendsInterfaces : 'extends' InterfaceType | ExtendsInterfaces '' InterfaceType;//<extends interfaces> ::= extends <interface type> | <extends interfaces> , <interface type>
InterfaceBody : '{' InterfaceMemberDeclarations? '}';//<interface body> ::= { <interface member declarations>? }
InterfaceMemberDeclarations : InterfaceMemberDeclaration | InterfaceMemberDeclarations InterfaceMemberDeclaration;//<interface member declarations> ::= <interface member declaration> | <interface member declarations> <interface member declaration>
InterfaceMemberDeclaration : ConstantDeclaration | AbstractMethodDeclaration;//<interface member declaration> ::= <constant declaration> | <abstract method declaration>
ConstantDeclaration : ConstantModifiers Type VariableDeclarator;//<constant declaration> ::= <constant modifiers> <type> <variable declarator>
ConstantModifiers : 'public' | 'static' | 'final';//<constant modifiers> ::= public | static | final
AbstractMethodDeclaration : AbstractMethodModifiers? ResultType MethodDeclarator Throws? ';';//<abstract method declaration>::= <abstract method modifiers>? <result type> <method declarator> <throws>? ;
AbstractMethodModifiers : AbstractMethodModifier | AbstractMethodModifiers AbstractMethodModifier;//<abstract method modifiers> ::= <abstract method modifier> | <abstract method modifiers> <abstract method modifier>
AbstractMethodModifier : 'public' | 'abstract';//<abstract method modifier> ::= public | abstract
ArrayInitializer : '{' VariableInitializers? ','? '}';//<array initializer> ::= { <variable initializers>? , ? }
VariableInitializers : VariableInitializer | VariableInitializers ',' VariableInitializer;//<variable initializers> ::= <variable initializer> | <variable initializers> , <variable initializer>

//Types
Type : PrimitiveType | ReferenceType;//<type> ::= <primitive type> | <reference type>
PrimitiveType : NumericType | 'boolean';//<primitive type> ::= <numeric type> | boolean
NumericType : IntegralType | FloatingPointType;//<numeric type> ::= <integral type> | <floating-point type>
IntegralType : 'byte' | 'short' | 'int' | 'long' | 'char';//<integral type> ::= byte | short | int | long | char
FloatingPointType : 'float' | 'double';//<floating-point type> ::= float | double
ReferenceType : ClassOrInterfaceType | ArrayType;//<reference type> ::= <class or interface type> | <array type>
ClassOrInterfaceType : ClassType | InterfaceType;//<class or interface type> ::= <class type> | <interface type>
ClassType : TypeName;//<class type> ::= <type name>
InterfaceType : TypeName;//<interface type> ::= <type name>
ArrayType : Type '['']';//<array type> ::= <type> [ ]

//Blocks and Commands
Block : '{' BlockStatements? '}';//<block> ::= { <block statements>? }
BlockStatements : BlockStatement | BlockStatements BlockStatement;//<block statements> ::= <block statement> | <block statements> <block statement>
BlockStatement : LocalVariableDeclarationStatement | Statement;//<block statement> ::= <local variable declaration statement> | <statement>
LocalVariableDeclarationStatement : LocalVariableDeclaration ';';//<local variable declaration statement> ::= <local variable declaration> ;
LocalVariableDeclaration : Type VariableDeclarators;//<local variable declaration> ::= <type> <variable declarators>
Statement : StatementWithoutTrailingSubstatement | LabeledStatement | IfThenStatement | IfThenElseStatement | WhileStatement | ForStatement;//<statement> ::= <statement without trailing substatement> | <labeled statement> | <if then statement> | <if then else statement> | <while statement> | <for statement>
StatementNoShortIf : StatementWithoutTrailingSubstatement | LabeledStatementNoShortIf | IfThenElseStatementNoShortIf | WhileStatementNoShortIf | ForStatementNoShortIf;//<statement no short if> ::= <statement without trailing substatement> | <labeled statement no short if> | <if then else statement no short if> | <while statement no short if> | <for statement no short if>
StatementWithoutTrailingSubstatement : Block | EmptyStatement | ExpressionStatement | SwitchStatement | DoStatement | BreakStatement | ContinueStatement | ReturnStatement | SynchronizedStatement | ThrowsStatements | TryStatement;//<statement without trailing substatement> ::= <block> | <empty statement> | <expression statement> | <switch statement> | <do statement> | <break statement> | <continue statement> | <return statement> | <synchronized statement> | <throws statements> | <try statement>
EmptyStatement : ';';//<empty statement> ::= ;
LabeledStatement : Identifier ':' Statement;//<labeled statement> ::= <identifier> : <statement>
LabeledStatementNoShortIf : Identifier ':' StatementNoShortIf;//<labeled statement no short if> ::= <identifier> : <statement no short if>
ExpressionStatement : StatementExpression ';';//<expression statement> ::= <statement expression> ;
StatementExpression : Assignment | PreincrementExpression | PostincrementExpression | PredecrementExpression | PostdecrementExpression | MethodInvocation | ClassInstanceCreationExpression;//<statement expression> ::= <assignment> | <preincrement expression> | <postincrement expression> | <predecrement expression> | <postdecrement expression> | <method invocation> | <class instance creation expression>
IfThenStatement : 'if' '(' Expression ')' Statement;//<if then statement>::= if ( <expression> ) <statement>
IfThenElseStatement : 'if' '(' Expression ')' StatementNoShortIf 'else' Statement;//<if then else statement>::= if ( <expression> ) <statement no short if> else <statement>
IfThenElseStatementNoShortIf : 'if' '(' Expression ')' StatementNoShortIf 'else' StatementNoShortIf;//<if then else statement no short if> ::= if ( <expression> ) <statement no short if> else <statement no short if>
SwitchStatement : 'switch' '(' Expression ')' SwitchBlock;//<switch statement> ::= switch ( <expression> ) <switch block>
SwitchBlock : '{' SwitchBlockStatementGroups? SwitchLabels? '}';//<switch block> ::= { <switch block statement groups>? <switch labels>? }
SwitchBlockStatementGroups : SwitchBlockStatementGroup | SwitchBlockStatementGroups SwitchBlockStatementGroup;//<switch block statement groups> ::= <switch block statement group> | <switch block statement groups> <switch block statement group>
SwitchBlockStatementGroup : SwitchLabels BlockStatements;//<switch block statement group> ::= <switch labels> <block statements>
SwitchLabels : SwitchLabel | SwitchLabels SwitchLabel;//<switch labels> ::= <switch label> | <switch labels> <switch label>
SwitchLabel : 'case' ConstantExpression ':' | 'default' ':';//<switch label> ::= case <constant expression> : | default :
WhileStatement : 'while' '(' Expression ')' Statement;//<while statement> ::= while ( <expression> ) <statement>
WhileStatementNoShortIf : 'while' '(' Expression ')' StatementNoShortIf;//<while statement no short if> ::= while ( <expression> ) <statement no short if>
DoStatement : 'do' Statement 'while' '(' Expression ')' ';';//<do statement> ::= do <statement> while ( <expression> ) ;
ForStatement : 'for' '(' ForInit? ';' Expression? ';' ForUpdate? ')' Statement;//<for statement> ::= for ( <for init>? ; <expression>? ; <for update>? ) <statement>
ForStatementNoShortIf : 'for' '(' ForInit? ';' Expression? ';' ForUpdate? ')' StatementNoShortIf;//<for statement no short if> ::= for ( <for init>? ; <expression>? ; <for update>? ) <statement no short if>
ForInit : StatementExpressionList | LocalVariableDeclaration;//<for init> ::= <statement expression list> | <local variable declaration>
ForUpdate : StatementExpressionList;//<for update> ::= <statement expression list>
StatementExpressionList : StatementExpression | StatementExpressionList ',' StatementExpression;//<statement expression list> ::= <statement expression> | <statement expression list> , <statement expression>
BreakStatement : 'break' Identifier? ';';//<break statement> ::= break <identifier>? ;
ContinueStatement : 'continue' Identifier? ';';//<continue statement> ::= continue <identifier>? ;
ReturnStatement : 'return' Expression? ';';//<return statement> ::= return <expression>? ;
ThrowsStatement : 'throw' Expression ';';//<throws statement> ::= throw <expression> ;
SynchronizedStatement : 'synchronized' '(' Expression ')' Block;//<synchronized statement> ::= synchronized ( <expression> ) <block>
TryStatement : 'try' Block Catches | 'try' Block Catches? Finally;//<try statement> ::= try <block> <catches> | try <block> <catches>? <finally>
Catches : CatchClause | Catches CatchClause;//<catches> ::= <catch clause> | <catches> <catch clause>
CatchClause : 'catch' '(' FormalParameter ')' Block;//<catch clause> ::= catch ( <formal parameter> ) <block>
Finally : 'finally' Block;//<finally > ::= finally <block>

//Expressions
ConstantExpression : Expression;//<constant expression> ::= <expression>
Expression : AssignmentExpression;//<expression> ::= <assignment expression>
AssignmentExpression : ConditionalExpression | Assignment;//<assignment expression> ::= <conditional expression> | <assignment>
Assignment : LeftHandSide AssignmentOperator AssignmentExpression;//<assignment> ::= <left hand side> <assignment operator> <assignment expression>
LeftHandSide : ExpressionName | FieldAccess | ArrayAccess;//<left hand side> ::= <expression name> | <field access> | <array access>
AssignmentOperator : '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '>>>=' | '&=' | '^=' | '|=';//<assignment operator> ::= = | *= | /= | %= | += | -= | <<= | >>= | >>>= | &= | ^= | |=
ConditionalExpression : ConditionalOrExpression | ConditionalOrExpression '?' Expression ':' ConditionalExpression;//<conditional expression> ::= <conditional or expression> | <conditional or expression> ? <expression> : <conditional expression>
ConditionalOrExpression : ConditionalAndExpression | ConditionalOrExpression '||' ConditionalAndExpression;//<conditional or expression> ::= <conditional and expression> | <conditional or expression> || <conditional and expression>
ConditionalAndExpression : InclusiveOrExpression | ConditionalAndExpression '&&' InclusiveOrExpression;//<conditional and expression> ::= <inclusive or expression> | <conditional and expression> && <inclusive or expression>
InclusiveOrExpression : ExclusiveOrExpression | InclusiveOrExpression '|' ExclusiveOrExpression;//<inclusive or expression> ::= <exclusive or expression> | <inclusive or expression> | <exclusive or expression>
ExclusiveOrExpression : AndExpression | ExclusiveOrExpression '^' AndExpression;//<exclusive or expression> ::= <and expression> | <exclusive or expression> ^ <and expression>
AndExpression : EqualityExpression | AndExpression '&' EqualityExpression;//<and expression> ::= <equality expression> | <and expression> & <equality expression>
EqualityExpression : RelationalExpression | EqualityExpression '==' RelationalExpression | EqualityExpression '!=' RelationalExpression;//<equality expression> ::= <relational expression> | <equality expression> == <relational expression> | <equality expression> != <relational expression>
RelationalExpression : ShiftExpression | RelationalExpression '<' ShiftExpression | RelationalExpression '>' ShiftExpression | RelationalExpression '<=' ShiftExpression | RelationalExpression '>=' ShiftExpression | RelationalExpression 'instanceof' ReferenceType;//<relational expression> ::= <shift expression> | <relational expression> < <shift expression> | <relational expression> > <shift expression> | <relational expression> <= <shift expression> | <relational expression> >= <shift expression> | <relational expression> instanceof <reference type>
ShiftExpression : AdditiveExpression | ShiftExpression '<<' AdditiveExpression | ShiftExpression '>>' AdditiveExpression | ShiftExpression '>>>' AdditiveExpression;//<shift expression> ::= <additive expression> | <shift expression> << <additive expression> | <shift expression> >> <additive expression> | <shift expression> >>> <additive expression>
AdditiveExpression : MultiplicativeExpression | AdditiveExpression '+' MultiplicativeExpression | AdditiveExpression '-' MultiplicativeExpression;//<additive expression> ::= <multiplicative expression> | <additive expression> + <multiplicative expression> | <additive expression> - <multiplicative expression>
MultiplicativeExpression : UnaryExpression | MultiplicativeExpression '*' UnaryExpression | MultiplicativeExpression '/' UnaryExpression | MultiplicativeExpression '%' UnaryExpression;//<multiplicative expression> ::= <unary expression> | <multiplicative expression> * <unary expression> | <multiplicative expression> / <unary expression> | <multiplicative expression> % <unary expression>
CastExpression : '(' PrimitiveType ')' UnaryExpression | '(' ReferenceType ')' UnaryExpressionNotPlusMinus;//<cast expression> ::= ( <primitive type> ) <unary expression> | ( <reference type> ) <unary expression not plus minus>
UnaryExpression : PreincrementExpression | PredecrementExpression | '+' UnaryExpression | '-' UnaryExpression | UnaryExpressionNotPlusMinus;//<unary expression> ::= <preincrement expression> | <predecrement expression> | + <unary expression> | - <unary expression> | <unary expression not plus minus>
PredecrementExpression : '--' UnaryExpression;//<predecrement expression> ::= -- <unary expression>
PreincrementExpression : '++' UnaryExpression;//<preincrement expression> ::= ++ <unary expression>
UnaryExpressionNotPlusMinus : PostfixExpression | '~' UnaryExpression | '!' UnaryExpression | CastExpression;//<unary expression not plus minus> ::= <postfix expression> | ~ <unary expression> | ! <unary expression> | <cast expression>
PostdecrementExpression : PostfixExpression '--';//<postdecrement expression> ::= <postfix expression> --
PostincrementExpression : PostfixExpression '++';//<postincrement expression> ::= <postfix expression> ++
PostfixExpression : Primary | ExpressionName | PostincrementExpression | PostdecrementExpression;//<postfix expression> ::= <primary> | <expression name> | <postincrement expression> | <postdecrement expression>
MethodInvocation : MethodName '(' ArgumentList? ')' | Primary '.' Identifier '(' ArgumentList? ')' | 'super' '.' Identifier '(' ArgumentList? ')';//<method invocation> ::= <method name> ( <argument list>? ) | <primary> . <identifier> ( <argument list>? ) | super . <identifier> ( <argument list>? )
FieldAccess : Primary '.' Identifier | 'super' '.' Identifier;//<field access> ::= <primary> . <identifier> | super . <identifier>
Primary : PrimaryNoNewArray | ArrayCreationExpression;//<primary> ::= <primary no new array> | <array creation expression>
PrimaryNoNewArray : Literal | 'this' | '(' Expression ')' | ClassInstanceCreationExpression | FieldAccess | MethodInvocation | ArrayAccess;//<primary no new array> ::= <literal> | this | ( <expression> ) | <class instance creation expression> | <field access> | <method invocation> | <array access>
ClassInstanceCreationExpression : 'new' ClassType '(' ArgumentList? ')';//<class instance creation expression> ::= new <class type> ( <argument list>? )
ArgumentList : Expression | ArgumentList ',' Expression;//<argument list> ::= <expression> | <argument list> , <expression>
ArrayCreationExpression : 'new' PrimitiveType DimExprs Dims? | 'new' ClassOrInterfaceType DimExprs Dims?;//<array creation expression> ::= new <primitive type> <dim exprs> <dims>? | new <class or interface type> <dim exprs> <dims>?
DimExprs : DimExpr | DimExprs DimExpr;//<dim exprs> ::= <dim expr> | <dim exprs> <dim expr>
DimExpr : '[' Expression ']';//<dim expr> ::= [ <expression> ]
Dims : '[' ']' | Dims '[' ']';//<dims> ::= [ ] | <dims> [ ]
ArrayAccess : ExpressionName '[' Expression ']' | PrimaryNoNewArray '[' Expression']';//<array access> ::= <expression name> [ <expression> ] | <primary no new array> [ <expression>]

//Tokens
PackageName : Identifier | PackageName '.' Identifier;//<package name> ::= <identifier> | <package name> . <identifier>
TypeName : Identifier | PackageName '.' Identifier;//<type name> ::= <identifier> | <package name> . <identifier>
SimpleTypeName : Identifier;//<simple type name> ::= <identifier>
ExpressionName : Identifier | AmbiguousName '.' Identifier;//<expression name> ::= <identifier> | <ambiguous name> . <identifier>
MethodName : Identifier | AmbiguousName. Identifier;//<method name> ::= <identifier> | <ambiguous name>. <identifier>
AmbiguousName : Identifier | AmbiguousName. Identifier;//<ambiguous name>::= <identifier> | <ambiguous name>. <identifier>
Literal : IntegerLiteral | FloatingPointLiteral | BooleanLiteral | CharacterLiteral | StringLiteral | NullLiteral;//<literal> ::= <integer literal> | <floating-point literal> | <boolean literal> | <character literal> | <string literal> | <null literal>
IntegerLiteral : DecimalIntegerLiteral | HexIntegerLiteral | OctalIntegerLiteral;//<integer literal> ::= <decimal integer literal> | <hex integer literal> | <octal integer literal>
DecimalIntegerLiteral : DecimalNumeral IntegerTypeSuffix?;//<decimal integer literal> ::= <decimal numeral> <integer type suffix>?
HexIntegerLiteral : HexNumeral IntegerTypeSuffix?;//<hex integer literal> ::= <hex numeral> <integer type suffix>?
OctalIntegerLiteral : OctalNumeral IntegerTypeSuffix?;//<octal integer literal> ::= <octal numeral> <integer type suffix>?
IntegerTypeSuffix : 'l' | 'L';//<integer type suffix> ::= l | L
DecimalNumeral : '0' | NonZeroDigit Digits?;//<decimal numeral> ::= 0 | <non zero digit> <digits>?
Digits : Digit | Digits Digit;//<digits> ::= <digit> | <digits> <digit>
Digit : '0' | NonZeroDigit;//<digit> ::= 0 | <non zero digit>
NonZeroDigit : '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';//<non zero digit> ::= 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
HexNumeral : '0' 'x' HexDigit | '0' 'X' HexDigit | HexNumeral HexDigit;//<hex numeral> ::= 0 x <hex digit> | 0 X <hex digit> | <hex numeral> <hex digit>
HexDigit : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';//<hex digit> :: = 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | a | b | c | d | e | f | A | B | C | D | E | F
OctalNumeral : '0' OctalDigit | OctalNumeral OctalDigit;//<octal numeral> ::= 0 <octal digit> | <octal numeral> <octal digit>
OctalDigit : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7';//<octal digit> ::= 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7
FloatingPointLiteral : Digits '.' Digits? ExponentPart? FloatTypeSuffix?;//<floating-point literal> ::= <digits> . <digits>? <exponent part>? <float type suffix>?
//<digits> <exponent part>? <float type suffix>?
ExponentPart : ExponentIndicator SignedInteger;//<exponent part> ::= <exponent indicator> <signed integer>
ExponentIndicator : 'e' | 'E';//<exponent indicator> ::= e | E
SignedInteger : Sign? Digits;//<signed integer> ::= <sign>? <digits>
Sign : '+' | '-';//<sign> ::= + | -
FloatTypeSuffix : 'f' | 'F' | 'd' | 'D';//<float type suffix> ::= f | F | d | D
BooleanLiteral : 'true' | 'false';//<boolean literal> ::= true | false
CharacterLiteral : '\'' SingleCharacter '\'' | '\'' EscapeSequence '\'';//<character literal> ::= ' <single character> ' | ' <escape sequence> '
SingleCharacter : InputCharacter ~('\'' | '\\');//<single character> ::= <input character> except ' and \
StringLiteral : '"' StringCharacters?'"';//<string literal> ::= " <string characters>?"
StringCharacters : StringCharacter | StringCharacters StringCharacter;//<string characters> ::= <string character> | <string characters> <string character>
StringCharacter : InputCharacter ~('"' | '\\') | EscapeSequence;//<string character> ::= <input character> except " and \ | <escape character>
NullLiteral : 'null';//<null literal> ::= null
EscapeSequence : '\\''t' | '\\''b' | '\\''n' | '\\''r' | '\\''f' | '\\''\'' | '\\''\\' | '\\''"';
Keyword : 'abstract' | 'boolean' | 'break' | 'byte' | 'case' | 'catch' | 'char' | 'class' | 'const' | 'continue' | 'default' | 'do' | 'double' | 'else' | 'extends' | 'final' | 'finally' | 'float' | 'for' | 'goto' | 'if' | 'implements' | 'import' | 'instanceof' | 'int' | 'interface' | 'long' | 'native' | 'new' | 'package' | 'private' | 'protected' | 'public' | 'return' | 'short' | 'static' | 'super' | 'switch' | 'synchronized' | 'this' | 'throw' | 'throws' | 'transient' | 'try' | 'void' | 'volatile' | 'while';//<keyword> ::= abstract | boolean | break | byte | case | catch | char | class | const | continue | default | do | double | else | extends | final | finally | float | for | goto | if | implements | import | instanceof | int | interface | long | native | new | package | private | protected | public | return | short | static | super | switch | synchronized | this | throw | throws | transient | try | void | volatile | while