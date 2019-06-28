/*Remember that this is the way we usually create functions in JavaScript:*/

function boringFunction(){
	console.log("I am boring.");
	console.log("I don't need a semicolon, right?")
}

/*We can also, however, create functions by using "arrow notation."*/

(shoes, hats) => {
	console.log("I am not boring.");
	console.log("I am also not exactly the same as a regular function.");
}

/*When you use arrow notation, the binding of the "this" keyword changes
 * for that function. We also refer to functions created using arrow notation as "arrow
 * functions".
 */
