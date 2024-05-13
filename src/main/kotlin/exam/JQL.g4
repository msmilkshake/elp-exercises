grammar JQL;

script: sequence EOF;

sequence: (instruction NEWLINE+)* instruction;

instruction: load | save | assign;

load: 'load' (arg | STR) 'to' variable;
save: 'save' variable 'to' (arg | STR);

assign:
    variable '=' expression;
    
expression:(
    | variable
    | accessor
    | finder
    | jObject
    )
    (aggregator)?
;

aggregator: '|' AGGREGATORS;
accessor: (variable | finder) '.' (accessor | variable | finder);
finder: variable '*';

jValue:
    jString
    | jNumber
    | jBoolean
    | jNull
    | jArray
    | jObject
    | jVar;

jField: name ':' jValue;
jObject: '{' NEWLINE* (jField (',' NEWLINE* jField)*)? NEWLINE* '}';
jArray: '[' NEWLINE* (jValue (',' NEWLINE* jValue)*)? NEWLINE* ']';

jNumber: INT | FLOAT;
jString: STR;
jBoolean: TRUE | FALSE;
jNull: NULL;
jVar: variable;

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