package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoStringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listStr = Arrays.asList("ABC","Rajni","Sauja","Kamal","Akshaj","Akshu");
		
//		listStr.sort(null);
//		System.out.println(listStr);
		
//		Collections.sort(listStr);
//		System.out.println(listStr);
		
Object[] obj = listStr.toArray();		
		Arrays.sort( listStr.toArray());
		System.out.println(listStr);
	}

}
