package com.revature.designpatterns;

/*
 * A singleton is a sole instance of a class. In other words, there
 * only ever exists one instance of the class in this application.
 * 
 * SO we only ever use the "new" keyword once to create an instance
 * of this class for the duration of this application.
 */

class Wand{}

public class Singleton {
	
	private static Wand w = null;
	
	public static Wand getWand() {
		
		if(w == null) {
			w = new Wand();
		}
		return w;
	}
}
