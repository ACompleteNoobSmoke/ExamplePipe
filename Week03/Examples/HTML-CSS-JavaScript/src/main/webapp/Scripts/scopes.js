/*
 * JavaScript has three scopes: global, functional, and block
 * scope. 
 * --Global variables are accessible from anywhere within your code; any
 * variable that is declared outside of the scope of a function is 
 * globally scoped.
 * 
 * --Functionally scoped variables are only accessible within the scope
 * of the functions in which which they are declared.
 * 
 * --Block-scoped variables are accessible only within the blocks in which
 * they are declared; in order to create a block-scoped variable, you must
 * use the "let" or "const" keyword.
 * 
 * FUN FACT: In JavaScript, variables with the same name can be created
 * at multiple layers of nested scopes. IN these cases, local variables
 * will take precedence over global variables (depending on how you
 * reference them). 
 * 
 * For instance:
 */

let a = 5;
let a = 2;

function turnUp(){
	let a = "Turn down for what?!";
	
}

/*If you use JavaScript in strict mode by typing 'use strict', you will
 * not be able redeclare variables, etc.
 */

