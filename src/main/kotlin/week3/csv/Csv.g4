grammar Csv;

csv:
    line
    (NEWLINE line)*
    NEWLINE?
;

line:
    value
    (SEP value)*
;
bool: TRUE | FALSE;

value: (STR|number|bool)?;

number: FLOAT|INT;

STR: '"' ~('"'|'\n'|'\r')* '"';

SPACE: ' '+ -> skip;

NEWLINE: '\n'|'\n\r';

SEP: [,;];

TRUE: 'true';
FALSE: 'false';

INT: [0-9]+;
FLOAT: ([0-9]+)?'.'[0-9]+;
