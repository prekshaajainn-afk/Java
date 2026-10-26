package START;
import java.util.Scanner;
public class greaterthendivide {
	public static void main (String[] args){
		System.out.print("enter first number : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("enter second number : ");
		int y = sc.nextInt();
		if (x>y) {
			System.out.print("the remainder is : "+(x%y));
		}
		else {
			System.out.print("Value of x is not greater than y please enter again!");
		}
		
	}

}
