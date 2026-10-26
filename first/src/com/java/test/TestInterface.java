package com.java.test;
//implement your logic
interface Gmail
{
	public void name();
	public void password();
	public void zipcode();
}
interface Sharda
{
	int systemid();
	String studName();
}
class UserMail implements Gmail, Sharda
{

	@Override
	public int systemid() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String studName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void password() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zipcode() {
		// TODO Auto-generated method stub
		
	}
	
}
public class TestInterface {
	public static void main(String[] args) {
		Sharda mail = new UserMail();
	}

}
