package com.java.test;
import java.util.Scanner;
class One{
	public int uAge(int age) {
	return age;
	}
	String uName() {
		String n;
		return n;
	}
	public void ufees() {
		// TODO Auto-generated method stub
		
	}
}
class Two{
	public float ufees(float fees) {
		return fees;
	}
	String uini() {
		String u;
		return u;
	}
}

public class enter {
	public static void main(String[] args) {
	System.out.println("enter age : ");
	System.out.println("enter name : ");
	System.out.println("enter fees : ");
	System.out.println("enter initial : ");
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	System.out.println(age);
	One oone = new One();
	oone.uAge(age);
	char n = sc.next().charAt(0);
	System.out.println(n);
	One oonee = new One();
	oonee.uName();
	float fees = sc.nextFloat();
	System.out.println(fees);
	Two ttwo = new Two();
	ttwo.ufees(fees);
	char u = sc.next().charAt(0);
	System.out.println(u);
	Two ttwoo = new Two();
	ttwoo.uini();
	
	
	
	}
}
