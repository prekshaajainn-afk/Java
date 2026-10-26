package com.java.test;
import java.util.Scanner;
class Test{
	public int calSumOfD(int n) {
		int sum = 0;
		for (;n>0 || n<0;) {             //234   //23    //2
			int rem = n%10;       //4     //3     //2
			sum = sum *10 + rem; //0+4   //40+3   //430+2
			n = n/10;
			if (rem ==0) {
				System.out.println("enter the number again!");
				break;
			}//23    //2      //432
			System.out.println("sum ="+sum);
			
		}
		return sum;
	}
}

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number: ");
		Test test = new Test();
		int num = sc.nextInt();
		System.out.println(test.calSumOfD(num));
	}
}
		
