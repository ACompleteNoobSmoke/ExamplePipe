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
 * use the "let" (ALWAYS use either this keyword "const") or "const" keyword.
 * 
 * FUN FACT: In JavaScript, variables with the same name can be created
 * at multiple layers of nested scopes. IN these cases, local variables
 * will take precedence over global variables (depending on how you
 * reference them). 
 * 
 * For instance:
 */

var a = 5;
var a = 2;

/*If we were to call this function, it would print "2"*/
function turnUp(){
	var a = "Turn down for what?!";
	console.log(this.a);
}

/*But be careful! The following code doesn't produce the same result:*/

var b = 8;

function turnUpAgain(){
	b = "Turn down for what? For accidentally declaring a global variable. That's what.";
}

/*
 * So what's the problem with this? Variables declared without a keyword
 * such as "let" or "const" or "var" are by default "global" variables. In
 * other words, assigning "b" a new value in this case will absolutely
 * overwrite the first "b"'s value. Oops!
 */

/*Now let's talk about variable hoisting.
 * 
 * JavaScript variables are composed of two parts: declarations and
 * assignments.
 * 
 * A declaration includes a keyword such as "let" and a variable name.
 * 
 * An assignment entails using the assignment operator to actually assign
 * the variable a value.
 */

var macaroni; //variable declaration

macaroni = 7; //variable assignment

var macaroni = "Less macaroni. More cheese. Too much macaroni." //variable declaration and assignment
	
/*
 * So why the emphasis on variable declarations versus assignments?
 * Because all variable declarations (NOT assignments) in JavaScript
 * are move to the top of their scopes. This is referred to as variable
 * "hoisting" since these variable declarations are literally hoisted
 * to the tops of their scopes.
 */
	
	console.log(boy);
	var boy = "good";

/*
 * Hoisting also affects function declarations (NOT function expressions).
 */	
	
function chaChaSlide(){} //function declaration

var catDaddy = function() {}; //function expression


/*If you use JavaScript in strict mode by typing 'use strict', you will
 * not be able redeclare variables, etc.
 */


