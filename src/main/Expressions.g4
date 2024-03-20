lexer grammar Expressions;

INT: [0-9]+;

FLOAT: ([0-9]+)?'.'[0-9]+;

OPERATOR: [+-\\*/];

OPENING_PARENTHESIS: [(];

CLOSING_PARENTHESIS: [)];

IF: 'if';

ID: [a-zA-Z_]+;

SPACE: ' '+ -> skip;