grammar MSDGrammar;

options {
  language = Java;
}

@parser:: header {
  package edu.asu.msd;
}

@lexer::header {
  package edu.asu.msd;
}

program_body 
	: 
    (
    	(statements 
    | 	function)+? 
    	main
    )
    ;
main : ( 'main()'
		(statements)+ 
		'$'
		|'main() $'
		);
    
statements
	: 
	( 	declare
	|	assignment
	| 	call
	|   display
	|	loop
	)
	;  
declare
	:	(DATATYPE IDENTIFIER_NAME (',' IDENTIFIER_NAME)*| DATATYPE IDENTIFIER_NAME '=' VAL (',' IDENTIFIER_NAME '=' VAL)*) ;

assignment
	: (IDENTIFIER_NAME '=' expression
		|IDENTIFIER_NAME '=' VAL);
	
call : 	IDENTIFIER_NAME( '('parameterList?')');

display : 
	('print(' ( '"' STRING '"')')'
	|'print(' ':'IDENTIFIER_NAME ')'
	|'print(' ( '"' STRING '"')? ( ':'IDENTIFIER_NAME)?)')';

loop: (ifElse | whileLoop);

ifElse : 'if' '(' condition ')'
				'$'
					(statements+)?
				'$'
		('else'
				'$'
					(statements+)?
				'$')?;
		
whileLoop : 'while ('condition')'
			'$'
			(statements+)?
			'$' ;
		
function 
	: 	'fun' IDENTIFIER_NAME '(' (parameterList)? ')'
		'$'
        	(statements+)?
       '$'
    ;
 parameterList : DATATYPE IDENTIFIER_NAME (',' DATATYPE IDENTIFIER_NAME)*;
 
 DATATYPE : ('num'|'bool'|'str');
    

	
expression : 	
	( (UNARY_OPERATOR ?) NUMBER (UNARY_OPERATOR ?)
	|NUMBER math_operator NUMBER
	);
	
condition :
(
	NUMBER comparison_operator NUMBER
	|'(' NUMBER comparison_operator NUMBER ')' (relational_operator '(' NUMBER comparison_operator NUMBER ')' )*
);	

math_operator :
 ( '+'
 	|'-'
 	|'*'
 	|'/'
 	|'%' 	
 );
 
 comparison_operator :
 (
 	'<'
 	|'>'
 	|'<='
 	|'>='
 	|'=='
 	|'!='
 );
 
 relational_operator :
 ('|'
 |'&'	
 );
 
 UNARY_OPERATOR: ('++'|'--');
 
 
 IDENTIFIER_NAME: 	
 	(	('a'..'z')('_'?)('a'..'z'?)('A'..'Z'?)(NUMBER ?)
	| 	'A'..'Z'('_'?)('a'..'z'?)('A'..'Z'?)(NUMBER ?)
	)+
	; 
VAL : (('+'|'-')? NUMBER+ ('.'NUMBER+)? );

NUMBER: ('0'..'9');

STRING : '"' ( c = ~('"' | '\n' | '\r') )* '"';

BOOLEAN
	:	('true' | 'false')
	;
	
WHITESPACE 
	: 
	(	' ' 
	| 	'\t' 
	| 	'\r' 
	| 	'\n' 
	|	'\f'
	)+ -> skip 
	;   	  