package com.revauture.compare;

import java.util.Comparator;

public class ComparatorClass implements Comparator<ComparableClass>{

	@Override
	public int compare(ComparableClass o1, ComparableClass o2) {
		if(o1.name.equals(o2.name)) return 1;
		else return 0;
	}

	public static void main(String[] args) {
		
		ComparatorClass cc = new ComparatorClass();
		ComparableClass c1 = new ComparableClass(1, "name");
		ComparableClass c2 = new ComparableClass(2, "name");
		ComparableClass c3 = new ComparableClass(3, "name 2");
		
		System.out.println(cc.compare(c1, c2));
		System.out.println(cc.compare(c1, c3));
	}
	
}
