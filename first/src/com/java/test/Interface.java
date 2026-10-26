package com.java.test;
interface Shoe{
	public void colour();
	public void brand();
}
interface Sneakers{
	int size();
	String condition();
}
class Footwear implements Shoe, Sneakers{

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String condition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brand() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Interface {
	public static void main(String[] args) {
		Footwear footwear = new Footwear();
		System.out.println(footwear.condition());
	}

}
