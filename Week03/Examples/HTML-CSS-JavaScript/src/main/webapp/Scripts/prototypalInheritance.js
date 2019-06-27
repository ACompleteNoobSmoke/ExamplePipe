/*All objects in JavaScript inherit from a prototype. We refer to this
type of inheritance as prototypal inheritance.

Don't, however, confuse prototypal inheritance with classical inheritance.
The two are fundamentally different.

When an object inherits from a prototype, it doesn't inherit its own
copies of the prototype's functions and variables. Rather, JavaScript
creates a link between the prototype and the child object and travels
up the "prototype chain" to find any functions and variables which exist
for objects of the prototype.

So how do we take advantage of prototypal inheritance? By using
JavaScript functions as constructors.*/

function Associates(){};


/*We can use a function in JavaScript to create an object which inherits
 * from that function.
 * 
 * Associate has a prototype which we can access via the prototype
 * property.
 */



