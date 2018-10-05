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
NULL : 'null';
TRUE : 'true';
FALSE : 'false';

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

IntSufix : 'l' | 'L';
DecimalNumeral : '0' | NonZeroDigit Digit*;
OctalNumeral : '0' OctalDigit*;
HexNumeral : '0x' HexDigit* | '0X' HexDigit*;
FloatNumeral : Digit+ (((('.' Digit+)? (('e' | 'E') Digit+)?) ('f' | 'F')?) | ('.' ('f' | 'F')) | (('.' ('e' | 'E') Digit+) ('f' | 'F')?));
DoubleNumeral : Digit+ (((('.' Digit+)? (('e' | 'E') Digit+)?) ('f' | 'F' | 'd' | 'D')?) | ('.' ('f' | 'F' | 'd' | 'D')) | (('.' ('e' | 'E') Digit+) ('f' | 'F' | 'd' | 'D')?));
Character : '\''~('\'' | '\\')'\'' | '\'' EscapeSequence '\'';
String : '"'(~('"' | '\\') | EscapeSequence)*'"';
Espaco : ('\t' | ' ' | '\r' | '\n' | '\u000C')+ -> skip;
ComentarioLinha : '//' ~[\r\n]* -> skip;
ComentarioBloco : '/*' .*? '*/' -> skip;

// identificador
ID: (('a'..'z') | ('A'..'Z') | '_' | '$') (('a'..'z') | ('A'..'Z') | ('0'..'9') | '_' | '$')*;

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

// erro
ERROR : .;