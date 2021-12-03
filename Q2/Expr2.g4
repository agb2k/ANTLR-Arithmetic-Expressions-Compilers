// Task 2 Grammar for Arithmetic Expressions and Conversion to Postfix with Semantic Actions (Section 5.3 No.1)

//Defining grammar
grammar Expr2;

//Defines the expected input and uses embedded actions to print a new line to separate expressions
prog:   (expr NEWLINE)* {System.out.println();};

// Grammar to enforce precedence and takes negative and positive numbers into account
// Semantic actions are used to support postfix expression generation while leftmost derivations of the parse tree take place
expr:   '-' expr {System.out.print("-");}
    |   '+' expr {System.out.print("+");}
    |   expr '/' expr {System.out.print("/");}
    |   expr '*' expr {System.out.print("*");}
    |   expr '-' expr {System.out.print("-");}
    |   expr '+' expr {System.out.print("+");}
    |   term
    ;

// Grammar for all the terminals as well as expressions within brackets
// Semantic actions are used similarly to support postfix expression generation
term:   '(' expr ')'
    |   ID {System.out.print($ID.text);}
    |   NUM {System.out.print($NUM.text);}
    ;

// Definition of Numbers, IDs and Newlines with ReGex
NUM     : [0-9]+ ;
ID      : [a-zA-Z]+ ;
NEWLINE : [\r\n]+ ;