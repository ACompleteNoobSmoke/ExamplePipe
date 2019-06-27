/*
 *We'll now discuss the "this" keyword in JavaScript. So what is it?
 *Well, in JavaScript, this keyword refers to the "owning object".
 *What "this" refers to depends entirely on where you use this
 *keyword.
 *
 *--when used outside of a function, it refers to the global window
 *object
 *
 *--when used inside of a function, it can also refer to the global
 *window object (or it can refer to an owning object within a function)
 *
 *--when used within an object, this refers to the object
 */

var bigFoot = "Bigfoot is real.";

function mythicalBigfoot(){
	var bigFoot = "Bigfoot is a myth";
	console.log(this.bigFoot);
	return {
		bigFoot: "Bigfoot is Chewy",
		getChewy: function(){
			console.log(this.bigFoot);
		},
		bigFoot2: window.bigFoot
	}
}

/*
 * Within this mythicalBigFoot function, we are returning a JavaScript
 * object. The syntax for creating an object in JavaScript is:
 * 
 * {}
 * 
 * If I want to give my object properties, I can do so by:
 * 
 * var x = {prop1: 7, prop2: function(){}, prop3: true}
 */

