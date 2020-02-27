//Lambda
package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

interface Abc 
{
	void show();
}

interface Abc1 
{
	void show(int i);
}

class Xyz implements Abc
{
	public void show()
	{
		System.out.println("Hello ");
	}
}
public class DemoLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Xyz obj = new Xyz();
//		obj.show();
//		
//		Abc obj = new Abc() {
//			public void show()
//			{
//				System.out.println("Hello");
//			}
//		};
//		obj.show();
	
	
		
	Abc obj;
	obj = ()-> System.out.println("Hello") ;
	obj.show();
	
	int j=5;
	// j=6; // not allowed as var used in lambda shoudl be final or effectively final
	
	Abc1 obj1;
	obj1 = i -> System.out.println("Hello "+i+j);
	obj1.show(2);
	}

}
