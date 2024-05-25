grammar Json;

jValue:
    jString
    | jNumber
    | jBoolean
    | jNull
    | jArray
    | jObject;

jField: name ':' jValue;
jObject: '{' (jField (',' jField)*)? '}';
jArray: '[' (jValue (',' jValue)*)? ']';

jNumber: (INT | FLOAT);
jString: STR;
jBoolean: TRUE | FALSE;
jNull: NULL;

name: STR;


STR: '"' ~('"'|'\n'|'\r')* '"';
TRUE: 'true';
FALSE: 'false';
INT: '-'? [0-9]+;
FLOAT: '-'? ([0-9]+)?'.'[0-9]+;
NULL: 'null';

SPACE: (' '|'\n'|'\r')+ -> skip;
