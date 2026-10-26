//logically class is a data type
package com.java.test;
class Car{
	int a = 10;
	public void fourTyres() {
		System.out.println("i have four tyres");
	}
}
class Santro extends Car{
	int b = 20;
	public void powerWindows() {
		System.out.println("i have power window");
	}
}
class BMW extends Santro{
	
	public void airbags() {
		System.out.println("i have air bags");
		System.out.println("without object = "+(a+b));
	}
}
public class TestInherit {
	public static void main (String a[]) {
		//Car c = new Santro();
		//Santro s = new BMW();
		BMW w = new BMW();
		w.fourTyres();
		w.powerWindows();
		w.airbags();
		System.out.println("with object = "+(w.a+w.b));
	}
}