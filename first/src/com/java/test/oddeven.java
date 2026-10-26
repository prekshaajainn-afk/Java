package com.java.test;
import java.util.Scanner;
//even and odd 0 neither odd or even and negative should not be considered
public class oddeven {
	public static void main (String[] args) {
		System.out.println("enter the number: ");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x == 0) {
			System.out.println("0 is neither even not odd");
		}
		else if (x<0) {
			System.out.println("invalid no");
		}
		else if (x %2 == 0) {
			System.out.println("no is even");
		}
		else {
			System.out.println("no is odd");
		}
	}
}
