package com.ruby.java.ch06;

public class StaticMethodTest {
	static int num = 123;
	
	public static void main(String[] args) {
		
		StaticMethodTest s = new StaticMethodTest();

		// void이기 때문에 다음과 같은 방법은 성립하지 않는다 
//		System.out.println("num = " + StaticMethodTest.print1());

		// 따라서 다음과 같은 방식으로 코딩을 진행하여야 한다 
		System.out.println("num = " + StaticMethodTest.num);
		System.out.println("num = " + s.num);
		
		StaticMethodTest.print1();
		s.print1();
		print1();
		

		
//		StaticMethodTest.print1();
//		StaticMethodTest.print2();
	}

	public static void print1() {

		System.out.println("hello");
	}

	public void print2() {
		int num;
		System.out.println("java");
	}
	
}