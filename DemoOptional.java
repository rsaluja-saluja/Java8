package com.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class DemoOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str = "SAASBWQ";
		//Character c = getFirstNonrepeatedChar(str);
		//System.out.println(c);
		
		String str1 = "SAASBWWB";
		//Character c1 = getFirstNonrepeatedChar(str1);
		//System.out.println(c1.toString()); // will throw null pointer exception without Optional
		
		Optional<Character> c1 = getFirstNonrepeatedChar(str1);
		System.out.println(c1.toString());
		if(c1.isPresent()) {
			System.out.println(c1.toString());
		}
		else {
			System.out.println("No Unique Characters");
		}
	}

	public  static Optional<Character> getFirstNonrepeatedChar(String str)
	{
		Map<Character,Integer> countCharacter = new LinkedHashMap<Character,Integer>();
		
		for(int i =0; i<str.length();i++)
		{
			Character c = str.charAt(i);
			if (countCharacter.containsKey(c))
			{
				countCharacter.put(c, countCharacter.get(c)+1);
			}
			else {
				countCharacter.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> e :countCharacter.entrySet()) {
			if (e.getValue() == 1)
//				return e.getKey();
				return Optional.of(e.getKey());
		
		}
//		return null;
		return Optional.ofNullable(null);
		
	}
}
