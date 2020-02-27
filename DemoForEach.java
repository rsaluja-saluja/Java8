package com.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(1,3,5,7);
		
		System.out.println(values);
		
		for(int i=0; i<values.size(); i++) {
			System.out.println(values.get(i));
		}
		System.out.println("Enhanced For loop");
		for (int i:values) {
			System.out.println(i);
		}
		
		System.out.println("For Each");
		values.forEach(i -> System.out.println(i));
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "ABC");
		map.put(2, "XYZ");
		map.put(3, "QWE");
		
		System.out.println(map);
		for(Entry<Integer,String> e : map.entrySet()) 
		{
			System.out.println(e.getKey()+" :::: "+e.getValue());
		}
		
		System.out.println("map for each using set");
		Set<Entry<Integer,String>> s = map.entrySet();
		s.forEach(i -> System.out.println(i));
		
		System.out.println("Map for each");
		map.forEach((k,v) -> System.out.println("Key: "+k+" value: "+v));
		
		}

}
