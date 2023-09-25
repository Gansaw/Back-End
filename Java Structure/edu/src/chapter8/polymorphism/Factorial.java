package chapter8.polymorphism;


import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("숫자를 입력하세요.");
			int n = sc.nextInt();
			int fac = 1;

			if (n < 0) {
				System.out.println("음수는 입력할 수 없습니다.");
				continue;
			}

			for (int i = 1; i <= n; i++) {
				fac = fac * i;
			}
			
			System.out.println(fac);
			
			break;
		}
		

	}
	
}