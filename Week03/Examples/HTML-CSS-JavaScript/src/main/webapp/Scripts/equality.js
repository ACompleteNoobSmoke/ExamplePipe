/*There are two versions of the equality operator in JavaScript. We
can use the == or === operators. The first operator (==) compares the
values of the two objects wheres the second (===) compares the values
AND data type of the two.

When we compare objects using the == operator, JavaScript uses type
coercion to force type equality (a pseudo conversion actually occurs
under the hood*/

var num1 = 4;
var string1 = "4";


num1 == string1; //true
num1 === string1; //false