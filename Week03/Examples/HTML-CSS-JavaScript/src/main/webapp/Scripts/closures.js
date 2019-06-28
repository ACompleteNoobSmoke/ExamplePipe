/*Recall that we can create "classes" in JavaScript by using a function
as a constructor. How, though, can we "privatize" the properties of a
function?

By using closures.

Let's create a class:*/

function Christina(hair, skin, eyes, allHailLordAndre){
	this.hair = hair;
	this.skin = skin;
	this.eyes = eyes;
	this.allHailLordAndre = allHailLordAndre;
	
	/*
	 * Technically speaking, the above variables should be out of scope
	 * (and no longer accessible) once the Christina function runs its
	 * course. By closuring these variables, however, I can preserve
	 * the scope and access these variables even after this function
	 * terminates.
	 */
	return {
		getHair: function(){
			return hair;
		},
		setHair: function(newHair){
			hair = newHair;
		},
		getSkin: () =>{
			return skin;
		},
		setSkin: (newSkin) => {
			skin = newSkin;
		}
	}
}