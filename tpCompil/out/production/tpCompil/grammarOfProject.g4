grammar grammarOfProject;
//rules
prog: (|imports) (|modificateur) CLASS CLASSNAME '{' declaration MAIN '{' insts '}' '}';
imports : IMPORT libraryName ';' imports | IMPORT libraryName ';';
libraryName: JAVAIO | JAVALONG;
modificateur: PUBLIC | PRIVATE;

//declaration part
declaration: (decvar declaration) | decvar;
decvar: type variablelist ';';
type: INT | FLOAT | STRING;
variablelist: (IDF ',' variablelist) | IDF;

//instructions part
insts: (inst ';' insts) | inst ';' | siinsts insts | siinsts;
inst : assignment  | input | output;

//assignment
assignment: identifier ':=' arithmetic_expression  ;
identifier : IDF;

//arithmetic exprission
arithmetic_expression: '(' arithmetic_expression ')'
                     | arithmetic_expression DIV arithmetic_expression
                     | arithmetic_expression MUL arithmetic_expression
                     | arithmetic_expression PLUS arithmetic_expression
                     | arithmetic_expression MINUS arithmetic_expression
                     | val
                     | identifier
                     |'\'' TEXT '\'';
val: VALUEOFFLOAT | VALUEOFINTEGER | VALUEOFSTRING;

//input
input: IN '(' '\'' format '\'' ','  identifier  ')';
format: INTFORMAT | FLOATFORMAT | STRINGFORMAT;

//output
output: OUT '(' '\''  format '\'' ',' identifier')'
    | OUT '(' '\'' IDF  format '\'' ',' identifier')';

//conditions
siinsts: SI '(' condition ')' alors '{' insts '}'
    | SI '(' condition ')' alors '{' insts '}' sinon;
alors: ALORS;
sinon: SINON '{' insts '}';
condition: logic | arithmetic;
logic: NOT logic
    |logic AND logic
    | logic OR logic
    | '(' condition ')';
arithmetic: arithmetic_expression GREATER arithmetic_expression
    | arithmetic_expression LESS arithmetic_expression
    | arithmetic_expression GREATEROREQUAL arithmetic_expression
    | arithmetic_expression LESSOREQUAL arithmetic_expression
    | arithmetic_expression EQUAL arithmetic_expression
    | arithmetic_expression DIFFERENT arithmetic_expression;

//declare key words
PUBLIC: 'public';
PRIVATE: 'protected';
CLASS: 'class_SJ';
MAIN: 'main_SJ';
IMPORT: 'import';

//type
INT: 'int_SJ';
FLOAT: 'float_SJ';
STRING: 'string_SJ';

//imports
JAVAIO: 'Small_Java.io';
JAVALONG: 'Small_Java.lang';

//arithmetic operator
PLUS: '+';
MUL: '*';
DIV: '/';
MINUS: '-';

//login operator
GREATER: '>';
LESS: '<';
EQUAL: '=';
DIFFERENT: '!=';
GREATEROREQUAL: '>=';
LESSOREQUAL: '<=';
AND: '&';
OR: '|';
NOT: '!';

//format
INTFORMAT: '%d';
FLOATFORMAT: '%f';
STRINGFORMAT: '%s';

//input/output expression
OUT: 'OUT_SJ';
IN: 'IN_SJ';

// condition
SI: 'si';
ALORS: 'alors';
SINON: 'sinon';

//texte
IDF: [a-z][a-z0-9]*; //identificateur ne dépasse pas 10 lettre
CLASSNAME: [A-Z][A-Za-z0-9]*;
TEXT : [a-zA-Z]+;

//val idf
VALUEOFSTRING: '"'(~["]|'\\"')*'"';
VALUEOFFLOAT: [+-]?[0-9]+'.'[0-9]+ ;
VALUEOFINTEGER: '0'|[+-]?[1-9][0-9]* ;

//skip some values
WHITESPACE : [ \n\t\r] -> skip;


