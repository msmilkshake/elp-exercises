grammar Json;



jValue:
    jString
    | jNumber
    | jBoolean
    | jNull
    | jArray
    | jObject;

jArray: '[' (jValue ',')* jValue? ']';

jNumber: INT | FLOAT;
jString: STR;
jBoolean: TRUE | FALSE;
jNull: NULL;

jField: FIELD ':' jValue;
jObject: '{' (jField ',')* jField? '}';

FIELD: '"' [a-zA-Z0-9]+ '"';
STR: '"' ~('"'|'\n'|'\r')* '"';
TRUE: 'true';
FALSE: 'false';
INT: [0-9]+;
FLOAT: ([0-9]+)?'.'[0-9]+;
NULL: 'null';

NEWLINE: ('\r'? '\n')+;
SPACE: ' '+ -> skip;