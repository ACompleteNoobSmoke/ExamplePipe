package com.revauture.compare;

/*
 * The Comparable interface provides a way of comparing objects
 * that is internal to the class. Any class that implements
 * Comparable must override the compareTo() method.
 */
public class ComparableClass implements Comparable<ComparableClass> {
	
	public int id;
	public String name;
	
	public ComparableClass(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(ComparableClass o) {
		/*
		 * The "instanceof" keyword checks whether or not an object
		 * is an instance of a class.
		 */
		if(!(o instanceof ComparableClass)) return -1;
		if(!(this == o)) return -1;
		else return 0;
	}
	


	
}
