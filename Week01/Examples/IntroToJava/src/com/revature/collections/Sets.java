package com.revature.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		Set<String> mySet = new HashSet<>();
		
		mySet.add("string one");
		mySet.add("string two");
		mySet.add("string two"); //this will NOT be added to the set because sets don't support duplicates
		mySet.add("string three");
		
		System.out.println(mySet);
		
		mySet.remove("string three");
		
		System.out.println(mySet);
		
		/*
		 * You can use a TreeSet if you want a sorted set since
		 * sorts aren't by default sorted and don't maintain
		 * order.
		 */
		SortedSet anotherSet = new TreeSet();
		anotherSet.add("hair");
		anotherSet.add("zoo");
		anotherSet.add("alphabet");
		
		
		System.out.println(anotherSet);
	}
}
