package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStreamApi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = Arrays.asList(2,4,6,8,3);
		Stream<Integer> s = values.stream();
		s.forEach(value -> System.out.println(value));
		//s.forEach(value -> System.out.println(value)); // throws exception
		
		System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e)->c+e));
		
		System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e)->Integer.sum(c, e)));
		
		System.out.println(values.stream().map(i -> i*2).reduce(0,Integer::sum));
		
		
		List<Integer> val = Arrays.asList(12,20,35,46,55,68,75);
		
		// Add all values divisible by 5
		
		System.out.println(val.stream().filter(e -> e.remainderUnsigned(e, 5)==0).reduce(0,(c,e) -> c+e));
		
		System.out.println(val.stream().filter(e -> e%5 == 0).reduce(0,(c,e) -> c+e));
		
		
		System.out.println(val.stream()
				.filter(e -> e%5==0)
				.findFirst()
				.orElse(0));
		
		System.out.println(val.stream()
				.filter(DemoStreamApi1::isDivisible) // it will not filter all values. Its lazy function as findFirst only needs one value so it would filter till that value.
				.map(DemoStreamApi1::mapDouble)// also lazy function so work only on first element given by filter function
				.findFirst()
				.orElse(0));
		
		// print distinct squares
		List<Integer> val1 = Arrays.asList(2,4,3,2,5,3);
		val1.stream().map(i -> i*i).distinct().forEach(System.out::println);
		
		List<Integer> sqVal1 = val1.stream().map(i->i*i).distinct().collect(Collectors.toList());
		sqVal1.forEach(System.out::println);
		
		System.out.println("Join distinct string with , and print");
		List<String> listStr1 = Arrays.asList("ABC","","qwe","asd","ABC","","qwe","abc");
		System.out.println(listStr1.stream().distinct().collect(Collectors.joining(",")));
		
		//print count of empty string 
		List<String> listStr = Arrays.asList("ab","","bc","we","","er","","ty");
		System.out.println(listStr.stream().filter(str -> str.isEmpty()).count());
		
		System.out.println("Print list of string in sorted order");
		listStr.stream().sorted().forEach(System.out::println);
		
		//print 10 Random numbers
		System.out.println("Print 5 random numbers");
		Random rand = new Random();
		rand.ints().limit(5).forEach(System.out::println);
		
		System.out.println("Print 5 Random number in sorted order");
		rand.ints().limit(5).sorted().forEach(System.out::println);
				
	}

	public static boolean isDivisible(int i)
	{
		System.out.println("is div "+i);
		return i%5 == 0;
	}
	
	public static int mapDouble(int i)
	{
		System.out.println("map double "+i);
		return i*2;
	}

}
