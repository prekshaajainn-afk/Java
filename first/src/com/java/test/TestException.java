package com.java.test;
import java.util.Scanner;
public class TestException {
	public static void main(String [] args) {
		System.out.println("enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			System.out.println(a/b);
		}
		catch
			(Exception xyz) {
			System.out.println("Please enter diff no and enter again!!!");
			//TestException.main(args); //this would prevent 
		}
		finally {
			System.out.println("program is executed successfully!!!!");
		}
	}

}
