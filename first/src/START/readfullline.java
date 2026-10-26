//4.Write a Java program to read a full line of text including spaces, using nextLine().  
package START;
import java.util.Scanner;
public class readfullline {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x: ");
		String x = sc.nextLine();
		System.out.println(x);
		
	}
}
