grammar test;
prog: input;
identifier : IDF;
input: IN '(' identifier ')' ';';

PUBLIC: 'public';
PRIVATE: 'protected';
CLASS: 'class_SJ';
MAIN: 'main_SJ';
OUT: 'OUT_SJ';
IN: 'in_sj';
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
// condition
SI: 'si';
ALORS: 'alors';
SINON: 'sinon';
//texte
IDF: [a-z][a-z0-9]*; //identificateur ne dépasse pas 10 lettre
CLASSNAME: [A-Z][A-Za-z0-9]*;
TEXT : [a-zA-Z][a-zA-Z]*;
//val idf
VALUEOFSTRING: '"'(~["]|'\\"')*'"';
VALUEOFFLOAT: [+-]?[0-9]+('.'[0-9]+) ;
VALUEOFINTEGER: '0'|[+-]?[1-9][0-9]* ;

//skip some values
WHITESPACE : [ \n\t\r] -> skip;
