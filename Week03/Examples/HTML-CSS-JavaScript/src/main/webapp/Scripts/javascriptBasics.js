/*What exactly is JavaScript? Well, it's an interpreted script language
that is weakly typed and is based on prototypal inheritance rather than
classical inheritance. Developers often use it to create more responsive
web pages in order to create more user-friendly web applications.

But enough about that. Let's dive right in. We'll start by learning the
most basic JavaScript concept: declaring objects.*/

/*These are JavaScript variable declarations and assignments. We'll touch
more on the "let", "var", and "const" keywords later.*/

let x = 7;
var cat = "American Shorthair";
const aristocat = "Everybody. Everybody. Everybody wants to be a cat!";

/*Now let's cover the different data types in JavaScript. There are 7 in
total.*/

let func = function(){} //function
let undef = undefined//undefined
let num = 7 //number
let t = true; //boolean
let obj = {name:'Christina', hairType:4}; //object
let nul = null //null
let str = "Christina"//string
	
/*
 * Of these 7 data types, two are "objects" whereas the others(minus
 * null and undefined) are primitives.
 * 
 * Functions and objects are objects, which means their prototype is
 * object. And, technically, null is an object, but this was not
 * intentional.
 * 
 */
	
/*These are Wrapper classes in JavaScript. It's bad practice to use them.*/
let s = new String();
let b = new Boolean();
let n = new Number();


//Template Literals
	
/*Template Literals are string literals that allow for embedded expressions
 * and interpolation. In order to use string literals, you must backticks (`).
 */
	
//console.log() is the equivalent of sysout in Java
console.log(`Whaddup, my name is ${str}`);
console.log(`${num + num}`);

//Undefined vs Null

/*The "undefined" data type signifies that a property of an object does
 * not exist whereas "null" is used for the intentional absence of a value,
 * referenced object, etc.
 */


