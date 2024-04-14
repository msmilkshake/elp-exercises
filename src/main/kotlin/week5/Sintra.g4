grammar Sintra;

script: ((instruction | COMMENT) NEWLINE+)* instruction (NEWLINE | COMMENT)* NEWLINE* EOF;

instruction:(assign | print) COMMENT?;

assign:
    variable ASSIGN expression;
    
print:
    PRINT '(' expression ')';

literal: INT;
variable: ID;

expression:
    literal                                                  #literalExpression
    | variable                                               #variableExpression
    | '(' expression ')'                                     #parenthesisExpression
    |  left = expression OPERATOR_MUL_DIV right = expression #binaryExpression
    |  left = expression OPERATOR_ADD_SUB right = expression #binaryExpression;
    

PRINT: 'print';
ID: [a-z][a-z0-9]*;
INT: [0-9]+;
OPERATOR_MUL_DIV: '*'|'/';
OPERATOR_ADD_SUB: '+'|'-';
ASSIGN: '=';

NEWLINE: ('\r'? '\n')+;
COMMENT: '#' ~('\r'|'\n')*;
SPACE: ' '+ -> skip;
