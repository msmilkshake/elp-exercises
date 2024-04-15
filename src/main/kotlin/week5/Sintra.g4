grammar Sintra;

script: sequence EOF;

sequence: ((instruction | COMMENT) NEWLINE+)*;

instruction: (assign | print | controlStructure) COMMENT?;

controlStructure:
    ifElse
    | while;

guard: expression;

ifElse:
    IF '(' guard ')' '{' NEWLINE
    sequence
    '}' alternative?;
    
alternative:
    ELSE '{' NEWLINE
    sequence
    '}';

while:
    WHILE '(' guard ')' '{' NEWLINE
    sequence
    '}';

assign:
    variable '=' expression;
    
print:
    PRINT '(' expression ')';

literal: INT;
variable: ID;

expression:
    literal                                                  #literalExpression
    | variable                                               #variableExpression
    | '(' expression ')'                                     #parenthesisExpression
    | left = expression OPERATOR_MUL_DIV_MOD right = expression #binaryExpression
    | left = expression OPERATOR_ADD_SUB right = expression #binaryExpression
    | left = expression OPERATOR_COMPARE right = expression #binaryExpression
    | left = expression OPERATOR_LOGIC right = expression #binaryExpression;
    
    
WHILE: 'while';
IF: 'if';
ELSE: 'else';
PRINT: 'print';

ID: [a-z][a-z0-9]*;
INT: [0-9]+;
OPERATOR_COMPARE: '<'|'<='|'=='|'>'|'>=';
OPERATOR_LOGIC: '&&'|'||';
OPERATOR_MUL_DIV_MOD: '*'|'/'|'%';
OPERATOR_ADD_SUB: '+'|'-';



NEWLINE: ('\r'? '\n')+;
COMMENT: '#' ~('\r'|'\n')*;
SPACE: ' '+ -> skip;
