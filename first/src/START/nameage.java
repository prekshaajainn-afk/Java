package START;
import java.util.Scanner;
class Student {
    String name;
    int age;
}
public class nameage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter your name: ");
        s1.name = sc.nextLine();
        System.out.println("Enter your age: ");
        s1.age = sc.nextInt();
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}