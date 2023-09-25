package chapter3;

import java.util.Scanner;

public class Test22_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Op(+,-,*,/)");
		
		String op = sc.next();
		
		switch(op) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		default:
			System.out.println("잘못된 연산입니다.");
			break;

		}

	}
	
}
