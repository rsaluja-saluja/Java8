package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsImpl implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}
public class DemoConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(2,4,6,8,1);
		
		Consumer<Integer> c = new ConsImpl();
		list.forEach(c);
		
		System.out.println("Implementing Consumer interface directly");
		Consumer<Integer> c1 = new Consumer<Integer>() 
				{
					public void accept(Integer i)
					{
						System.out.println(i);
					}
				};
		list.forEach(c1);
		
		System.out.println("using Lambda Expresison");
		list.forEach(i -> System.out.println(i));
	}

}
