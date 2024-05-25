grammar JQL;

script: sequence EOF;

sequence: ((instruction | COMMENT) NEWLINE+)* instruction (NEWLINE | COMMENT)* ;

instruction: (load | save | assign) COMMENT?;

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
jqObject: '{' (COMMENT? NEWLINE)* (jqField (',' (COMMENT? NEWLINE)* jqField)*)? (COMMENT? NEWLINE)* '}';
jqArray: '[' (COMMENT? NEWLINE)* (jqValue (',' (COMMENT? NEWLINE)* jqValue)*)? (COMMENT? NEWLINE)* ']';

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
TRUE: 'true';
FALSE: 'false';
ID: [a-z][a-zA-Z0-9]*;
INT: [0-9]+;
FLOAT: ([0-9]+)?'.'[0-9]+;
NULL: 'null';

NEWLINE: ('\r'? '\n')+;
COMMENT: '#' ~('\r'|'\n')*;
SPACE: ' '+ -> skip;