//create two classes which have two method each
//both method must have a different return type
//call them in main class and allocate memory
package com.java.test;
class One11{
	public void one1() {
		System.out.println("hello first class 1");
	}
	public static int one2() {
		System.out.println("hello first class 2");
		return 0;
	}
}
class Two22{
	public void two1() {
		System.out.println("hello second class 1");
	}
	public static int two2() {
		System.out.println("hello second class 2");
		return 0;
	}
}
public class program {
	public static void main(String[] args){
		//class object = new class
		One11 one = new One11();
		one.one1();
		one.one2();
		Two22 two = new Two22();
		two.two1();
		two.two2();
	}
	
}