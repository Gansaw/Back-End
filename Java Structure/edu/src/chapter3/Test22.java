package chapter3;

import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a = 12;
		//int b = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Op(+,-,*,/)");
		
	while(true) {
				
		char op = sc.next().charAt(0);
		int a = 0;
		int b = 0;
		
		if (op == '+' || op == '-' || op == '*' || op == '/') {
			System.out.println("첫번째 숫자를 입력하세요.");
			a = sc.nextInt();
			
			System.out.println("두번째 숫자를 입력하세요.");
			b = sc.nextInt();
		}
		
		switch(op) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("잘못된 연산입니다.");
			break;
			
		}

	}

}
	
}
