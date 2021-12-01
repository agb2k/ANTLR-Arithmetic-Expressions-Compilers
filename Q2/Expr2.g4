// Task 2 Grammar for Arithmetic Expressions and Conversion to Postfix with Semantic Actions (Section 5.3 No.1)
grammar Expr2;
prog:   (expr NEWLINE)* {System.out.println();};
term:   '(' expr ')'
    |   ID {System.out.print($ID.text);}
    |   NUM {System.out.print($NUM.text);}
    ;
expr:   '-' expr {System.out.print("-");}
    |   '+' expr {System.out.print("-");}
    |   expr '*' (expr|term) {System.out.print("*");}
    |   expr '/' (expr|term) {System.out.print("/");}
    |   expr '+' (expr|term) {System.out.print("+");}
    |   expr '-' (expr|term) {System.out.print("-");}
    |   term
    ;
NUM     : [0-9]+ ;
ID      : [a-zA-Z]+ ;
NEWLINE : [\r\n]+ ;