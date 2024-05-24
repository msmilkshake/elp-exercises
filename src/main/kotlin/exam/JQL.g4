grammar JQL;

script: sequence EOF;

sequence: (instruction NEWLINE+)* instruction NEWLINE*;

instruction: load | save | assign;

load: 'load' (arg | STR) 'to' variable;
save: 'save' variable 'to' (arg | STR);

assign:
    variable '=' expression;
    
    
expression: (accessor | jqValue) aggregator?;

accessor: variable ('.' key)*;

aggregator: '|' AGGREGATORS;
key: ID finder?;
finder: '*';

jqValue:
    | jqString
    | jqNumber
    | jqBoolean
    | jqNull
    | jqArray
    | jqObject
    | jqVar;

jqField: name ':' jqValue;
jqObject: '{' NEWLINE* (jqField (',' NEWLINE* jqField)*)? NEWLINE* '}';
jqArray: '[' NEWLINE* (jqValue (',' NEWLINE* jqValue)*)? NEWLINE* ']';

jqNumber: INT | FLOAT;
jqString: STR;
jqBoolean: TRUE | FALSE;
jqNull: NULL;
jqVar: variable;

name: STR;

arg: '$' INT;
variable: ID;


STR: '"' ~('"'|'\n'|'\r')* '"';
AGGREGATORS: 'max' | 'min' | 'count' | 'sum' | 'avg';
ID: [a-z][a-zA-Z0-9]*;
TRUE: 'true';
FALSE: 'false';
INT: [0-9]+;
FLOAT: ([0-9]+)?'.'[0-9]+;
NULL: 'null';

NEWLINE: ('\r'? '\n')+;
SPACE: ' '+ -> skip;