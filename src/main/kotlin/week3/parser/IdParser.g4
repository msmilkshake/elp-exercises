grammar IdParser;

test:
    id (',' id)*
;

id: ID;

ID: [a-zA-Z]+;

SPACE: ' '+ -> skip;