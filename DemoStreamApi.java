package com.java8;

import java.util.Arrays;
import java.util.List;

public class DemoStreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> p = Arrays.asList(
				new Person("Cheryl","Daniel",23),
				new Person("alpha","Sharma",32),
				new Person("Chealpha","Dwqs",32),
				new Person("Rajni","Saluja",32)
				);
		
		p.stream()
		.forEach(per -> System.out.println(per.getFirstName()));
		
		p.stream()
		.filter(per -> per.getFirstName().startsWith("Ch"))
		.forEach(per -> System.out.println(per.getFirstName()));
		
		long count = p.stream()
		.filter(per -> per.getLastName().startsWith("D"))
		.count();
		System.out.println(count);
		
		System.out.println("stream on list of ints");
		List<Integer> values = Arrays.asList(2,4,6,8,3);
		values.forEach(System.out::println);
		System.out.println("1. stream on list of ints");

		values.stream().forEach(System.out::println);
		System.out.println("Parallel Stream on list of ints");

		values.parallelStream().forEach(value -> System.out.println(value));
		
		System.out.println("Parallel stream on list of ints");
		values.parallelStream().forEachOrdered(value -> System.out.println(value));
		
		

	}

}
