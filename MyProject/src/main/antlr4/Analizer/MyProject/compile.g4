grammar compile;

program:PROGRAM ID ILLAVE
analizer*
RLLAVE
;

//TOKENS
AND						: '&&';//Y
OR						: '||';//O
NOT						: '!';//NO
DOUBLEPLUS				: '++';//AUMENTO
DOUBLEMINUS				: '--';//DISMINUYE
COMILLA					: '"';//COMILLAS
MAS                     : '+'; //MAS
MENOS                   : '-'; //MENOS
POR                     : '*'; //MILTIPLICA
DIV                     : '/'; //DIVIDE
MAYOR					: '>';//MAYOR
MENOR					: '<';//MENOR
PLUSEQ					: '>=';//MAYOR IGUAL
MINEQ					: '<=';//MENOR IGUAL
DOUBLEEQ				: '==';// IGUAL SI O SI 
NEGATE					: '!=';// NEGACION
EQUAL					: '=';// IGUAL

ILLAVE               : '{'; //ABRIR LLAVES
RLLAVE               : '}'; //CERRAR LLAVES
LPAR        		  : '('; //ABRIR PARENTESIS
RPAR        		  : ')'; //CERRAR PARENTESIS
DOTDOT                  : ':'; //DOS PUNTOS
SEMIDOT					: ';'; //PUNTO Y COMA
TRUE  						: 'true';//VERDADERO
FALSE 						: 'false';//FALSO
IF                          : 'if'; //SI
ELSE                        : 'else'; //SINO
END                         : 'end';//FIN
WHILE                       : 'while';//WHILE
DO                          : 'do';//DO
WRITE                       : 'write';//ESCRIBIR
BREAK						: 'break';//ROMPER CICLO
FOR							: 'for';//FOR
PROGRAM:'program' ;
VAR: 'var';
PRINTLN: 'println';
ID : [a-zA-Z_] [a-zA-Z_0-9]*;// IDENTIFICADOR DE VARIABLES NUMERICAS Y LETRAS
NUMBER : [0-9]+;//DIGITOS
PRINT:  ' System.out.println ';//IMPRIMIR
COMMENT :'//'+? ('\n'|EOF) -> skip;// COMENTARIOS
WS : [ \t\n\r]+ -> skip; //ESPACIO EN BLANCO O SALTO DE LINEA

//OPCIONES DE EVALUACION PARA EL INGRESO DE LAS EXPRESIONES
analizer: vardec|varasig|arithmetic_expr|numeric_result|if_statement|do_statement|for_statement|println;


if_statement: IF LPAR numeric_ent MAYOR numeric_ent RPAR
ILLAVE numeric_ent SEMIDOT RLLAVE
;

do_statement: DO ILLAVE PRINTLN numeric_ent SEMIDOT RLLAVE WHILE LPAR
numeric_ent EQUAL numeric_ent RPAR
;

for_statement: FOR LPAR numeric_ent+ ID MAYOR 
numeric_ent SEMIDOT ID DOUBLEEQ numeric_ent SEMIDOT
ID DOUBLEPLUS RPAR ILLAVE PRINTLN 
COMILLA ID* COMILLA SEMIDOT RLLAVE 
;


vardec: VAR ID SEMIDOT;// DECLARACION DE VARIABLES
varasig: ID EQUAL NUMBER SEMIDOT;//ASIGNACION DE VARIABLES
println: PRINTLN NUMBER SEMIDOT;//SECUENCIA DE IMPRESION DE LINEA


//TODA EXPRESION LOGICA SE DEFINE AQUI
logicexpr:
 logicexpr AND logicexpr 					
| logicexpr OR logicexpr 					
| logicexpr NOT logicexpr 						
| comprex			   					
| LPAR logicexpr RPAR    
| logical_ent 			   					
; 

COMP	: 		MAYOR
				|MENOR
				|PLUSEQ
				|MINEQ
				|DOUBLEEQ
				|NEGATE
				|EQUAL
				;


comprex: comparop COMP comparop 
					 |LPAR comparop RPAR;
					 
comparop: arithmetic_expr;//OPERADOR PARA COMPARAR

//ESTRUCTURA DE EXPRESIONES ARITMETICAS
arithmetic_expr
: arithmetic_expr POR arithmetic_expr				
| arithmetic_expr DIV arithmetic_expr					
| arithmetic_expr MAS arithmetic_expr				
| arithmetic_expr MENOS arithmetic_expr				
| MENOS arithmetic_expr									
| LPAR arithmetic_expr RPAR	
| numeric_ent												
;

numeric_result: EQUAL numeric_ent;

logical_ent : (TRUE | FALSE)		
			   | ID		
			   ;

numeric_ent : ID	
			     | NUMBER			
			     ;