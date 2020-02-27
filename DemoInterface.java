package com.java8;

interface A 
{
	default void show()
	{
		System.out.println("interface A");
	}
	
	static void show1() 
	{
		System.out.println("interface A static");
	}
}

interface B 
{
	default void show()
	{
		System.out.println("interface B");
	}
}

class C implements A,B
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("class C");
	}
	
}
public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		obj.show();
		
		A.show1();
	}

}
