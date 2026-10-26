package START;
import java.util.Scanner;
public class sqofanumber {
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int x = sc.nextInt();
		int square = x*x;
		System.out.println("the square of "+ x + " is : " +square);
	}
}
