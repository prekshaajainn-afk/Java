package com.java.test;
import java.util.Scanner;
class User
{
	public static void access()
	{
		System.out.println("access without object");
	}
}

public class DataInput {
	public static void main(String[] args) {
		User.access();
	}

}