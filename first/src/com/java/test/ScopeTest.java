package com.java.test;

public class ScopeTest {
	private void call()
	{
		System.out.println("private method");
	}
	public static void main(String[] args) {
		ScopeTest scope = new ScopeTest();
				scope.call();
				VerifyScope scope2=new VerifyScope();
				scope2.call();
				Verifying scope3 = new Verifying();
				scope3.call();
	}

}

