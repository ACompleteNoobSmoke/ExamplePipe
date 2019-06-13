package com.revature.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		
		Map<String, String> imTheMap = new HashMap();
		
		imTheMap.put("key1", "value1");
		imTheMap.put("key5", "null value");
		imTheMap.put("key2", "value2");
		//If you use the same key more than once, Java will simply
		//update the value associated with that key
		imTheMap.put("key2", "value3");
		
		System.out.println(imTheMap);
		
		imTheMap.get("key 1");
		
		/*
		 * Maps aren't iterable, so we can't explicitly iterate
		 * over them. We have to instead iterate over the keys.
		 * We can do so by using the keySet() method.
		 */
		
		Set<String> theKeys = imTheMap.keySet();
		
		for(String s : theKeys) {
			if(s.equals("key1")) {
				System.out.println(imTheMap.get(s));
			}
		}
	}
}
