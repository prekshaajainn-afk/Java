package com.java.test;
import java.util.Scanner;
class Testt{
	public int calSumOfD(int n) {
		int sum = 0;
		for (;n>0;) { 
			int rem = n%10;  
			sum = sum + rem; 
			n = n/10;  
			System.out.println("sum ="+sum);
		}
		return sum;
	}
}

public class sumofd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number: ");
		Testt test = new Testt();
		int num = sc.nextInt();
		System.out.println(test.calSumOfD(num));
	}
}