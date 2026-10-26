package com.java.test;
import java.util.Scanner;
class eveod{
	public String LogicToReturn(int num) {
		if (num % 2 == 0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
}

public class eveodd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int a = sc.nextInt();
		eveod e = new eveod();
		System.out.println(e.LogicToReturn(a));
		
	}

}
