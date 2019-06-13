package com.revature.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.revature.classes.Wizard;

public class Lists {

	public static void main(String[] args) {
		/*
		 * Our reference type is actually the List interface. This is
		 * valid and is called "covariance". Notice, however, that we
		 * are still instantiating an ArrayList -- we're just using
		 * a List reference to point to it.
		 */
		
		/*
		 * Notice that this list has no type safety. I can add whatever
		 * objects I want to it.
		 */
		List datList = new ArrayList();
		
		datList.add(new Wizard("Some Name"));
		datList.add("A String");
		datList.add(new Integer(4));
		/*
		 * Java is autoboxing this primitive data type for us.
		 * This means that Java wraps the primitive as a Wrapper
		 * Class object for us.
		 */
		datList.add(4);
		
		System.out.println(datList);
		
		/*
		 * I can create any Collection with type safety by using what
		 * we refer to as Generics in Java. Generics enforce a type
		 * on a collection.
		 */
		
		List<String> betterList = new ArrayList<>();
//		betterList.add(new Wizard("harry")); //DOES NOT COMPILE
		betterList.add("string");
		betterList.add("another string");
		betterList.add("third string");
		betterList.add("fourth string");
		
		/*
		 * Collections don't support primitives. As a result,
		 * I can't enforce a primitive type on a collection.
		 */
//		List<int> aList = new ArrayList<>(); //DOES NOT COMPILE
		
		for(Object o : datList) {
			System.out.println(o);
		}
		
		/*
		 * This is an iterator. It points to objects in our Collection
		 * and provides a clean way of iterating through a Collection.
		 * 
		 * But...
		 * 
		 * #EnhancedForLoopOrDie
		 */
		Iterator<List> it = datList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		/*
		 * There are several methods worth knowing when working with
		 * lists.
		 */
		
		betterList.add(1, "new string");
		System.out.println(betterList);
		System.out.println(betterList.contains("new string"));
		System.out.println(betterList.get(0));
		betterList.remove("new string"); //removes object if it exists
		betterList.remove(1); //removes object by index
		
		List<Integer> ints = new ArrayList<>();
		ints.add(2);
		ints.add(4);
		ints.add(5);
		
		System.out.println(ints);
		ints.remove(new Integer(2)); //if you want to remove a primitive, pass a Wrapper Class object to the method
		System.out.println(ints);
	}
}
