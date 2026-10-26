//Write a Java program to demonstrate reading an integer value from the user at run time using nextInt().  
package START;
import java.util.Scanner;
public class readint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x: ");
		int x = sc.nextInt();
		System.out.println(x);
		
	}

}
