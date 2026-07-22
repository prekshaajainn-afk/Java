package first;

class helloNew
{
	public void call()
	{
		System.out.println("hiiii from call method");
	}
}



public class hello{
	public static void main(String[] args) {
		helloNew obj = new helloNew();
		obj.call();
		System.out.println("TEST");
	}
}
