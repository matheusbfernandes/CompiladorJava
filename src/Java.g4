lexer grammar Java;

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

DecimalNumeral : '0' ('l' | 'L') | NonZeroDigit Digit* ('l' | 'L');
OctalNumeral : '0' OctalDigit* ('l' | 'L');
HexNumeral : '0x' HexDigit* ('l' | 'L') | '0X' HexDigit* ('l' | 'L');
FloatNumeral : Digit+ (((('.' Digit+)? (('e' | 'E') Digit+)?) ('f' | 'F')?) | ('.' ('f' | 'F')) | (('.' ('e' | 'E') Digit+) ('f' | 'F')?));
DoubleNumeral : Digit+ (((('.' Digit+)? (('e' | 'E') Digit+)?) ('f' | 'F' | 'd' | 'D')?) | ('.' ('f' | 'F' | 'd' | 'D')) | (('.' ('e' | 'E') Digit+) ('f' | 'F' | 'd' | 'D')?));
Character : '\''~('"' | '\\')'\'' | '\'' EscapeSequence '\'';
String : '"'(~('"' | '\\') | EscapeSequence)*'"';
BooleanLiteral : 'true' | 'false';
NULL : 'null';
Espaco : ('\t' | ' ' | '\r' | '\n' | '\u000C')+ -> skip;
ComentarioLinha : '//' ~[\r\n]* -> skip;
ComentarioBloco : '/*' .*? '*/' -> skip;

// simbolo de pontuação
AP : '(';
FP : ')';
AC : '[';
FC : ']';
ACh : '{';
Fch : '}';
Virgula : ',';
DoisPontos : ':';
Ponto : '.';
Interrogacao : '?';
PontoVirgula : ';';

// identificador
ID: (('a'..'z') | ('A'..'Z') | '_' | '$') (('a'..'z') | ('A'..'Z') | ('0'..'9') | '_' | '$')*;