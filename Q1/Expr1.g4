grammar Expr1;
prog:	(expr NEWLINE)* ;
term:	'(' expr ')'
	|	ID
	|	NUM
	;
expr:   '-' expr
    |   expr ('*'|'/') (expr|term)
    |   expr ('+'|'-') (expr|term)
    |   term
	|	term
    ;
NUM     : [0-9]+ ;
ID		: [a-zA-Z]+ ;
NEWLINE : [\r\n]+ ;