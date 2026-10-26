package com.java.test;
import java.util.Scanner;
class fact{
	int count3 = 0;
	int count4 = 0;
	int count5 = 0;
	public void rangee(int a, int b) {
		for (int i=a; i<b+1; i++) {
			if (i%3 == 0) {
				count3++;
				System.out.println(i+ "\3");
			}
			if (i%4 ==0) {
				count4++;
				System.out.println(i+ "\4");
			}
			if (i%5 == 0) {
				count5++;
				System.out.println(i+ "\5");
			}
			else {
				System.out.println("not div by 3,4 or 5");
			}
			
			
		}
	}
}
public class factorsinrange {
	public static void main(String[] args) {
		System.out.println("enter start and end range: ");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		fact f = new fact();
		f.rangee(start,end); 
	}

}
