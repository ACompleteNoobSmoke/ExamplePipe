/*What is the DOM?

The DOM is the Document Object Model. It is a representation of all of
the elements that are present on the page. We can use JavaScript to
interact with the DOM (e.g. place new elements on the page, remove
existing elements, alter existing elements, etc.)

So let's jump right into some DOM manipulation. We'll start by simply
selecting elements on a webpage using various JavaScript functions which
allow us to grab elements and manipulate them.

We can get elements by:

-id (very common)
-class name
-tag name
-css selectors

Of course, we can also create new elements and apend to existing elements.


But DOM manipulation is not extremely useful without events! In
JavaScript and HTML, an event is something that happens to an element
on our frontend (e.g. click, mouseover, scroll, hover, load, etc...). Using
JavaScript, we can respond to these events. More specifically, we can
bind our JavaScript functions to events on our frontend.

 */

function hideHeader() {
	let header = document.getElementById("header");
	if (header.hidden === false) {
		header.setAttribute("hidden", "true");
	}
}

//This is called form validation. We are validating whether or not the
//form information that is entered is correct on the client side. Note,
//however, that client side validation is not enough on its own. It
//should always be accompanied by server-side validation, etc.
function validateUsername(){
	if(document.getElementsByName("username")[0].value.length < 10){
		let errorMessage = document.getElementById("usernameError");
		errorMessage.removeAttribute("hidden");
	}
}


/*So I've written this function. Now I have to bind it to my element
(our header in this case).

We can do this by using what is called an "Event Listener".*/

let header = document.getElementById("header");
header.addEventListener("onload", hideHeader);

let usernameBox = document.getElementsByName("username")[0];
usernameBox.addEventListener("change", validateUsername);
