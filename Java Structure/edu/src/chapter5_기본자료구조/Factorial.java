package chapter5_기본자료구조;

import java.util.Scanner;

public class Factorial {
	
	// 함수 결과가 자기 자신을 부르는 경우 => 재귀함수	
	static int factorial(int n) {
		return (n>0)?n*factorial(n-1) : 1;
		/*
		 * if(n>0) return n*factorial(n-1); else return 1;
		 */
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int x = sc.nextInt();
		
		System.out.println("x! = " + factorial(x) + "입니다.");
	}

}
