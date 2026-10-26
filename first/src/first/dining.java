import java.util.Scanner;



class Person1 extends Thread
{
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("Running P1");
		}
	}
}


class Person2 extends Thread
{
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("Running P2");
		}
	}
}


public class TestThread {
	public static void main(String[] args) {
		Person1 person1=new Person1();
		person1.start();
		Person2 person2=new Person2();
		person2.start();
		
		
		
	}

}