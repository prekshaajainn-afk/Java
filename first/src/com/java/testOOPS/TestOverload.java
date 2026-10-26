package com.java.testOOPS;
class User{
	int x=10;
	public User(){
		System.out.println("Hi from constructor");
	}
	public void show() {
		System.out.println("hi from parent class");
		return;
	}
}
class newUser extends User{
	@Override
	public void show() {
		System.out.println("hi from child class");
	}
}
public class TestOverload {
	public static void main(String[] args) {
		//User newUser;
		User newUser = new newUser();
		System.out.println(newUser.x);
		newUser.show();
	}
}