package com.java.test;
//what is constructor 
//method with same class name, no return type and it should be public.
class person
{
	public person()
	{
		System.out.println("called");
	}
	public void show()
	{
		System.out.println("hi frm show");
	}
}
public class TestConst {
	public static void main(String[] args) {
		new person().show();
		
	}

}
