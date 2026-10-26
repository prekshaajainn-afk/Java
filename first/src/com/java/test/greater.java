package com.java.test;
import java.util.Scanner;
public class greater {
	public static void main(String[] args) {
		System.out.print("enter the number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a>10) {
			System.out.println("a is greater than 10!");
		}
		else {
			System.out.println("a is lesser than 10!");
		}
	}
}
