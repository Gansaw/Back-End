package chapter8.polymorphism;

import java.util.Scanner;

public class numCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("숫자를 입력하세요.");

			int numb = sc.nextInt();
			if (numb < 10 || numb > 100) {
				System.out.println("10~100사이를 입력하세요.");
				continue;
			}

	            int num5g = Math.min(numb / 5, 10); 
	            int num3g = Math.min((numb - 5 * num5g) / 3, 10); 
	            int num2g = Math.min((numb - 5 * num5g - 3 * num3g) / 2, 10);

	            System.out.println("필요한 추가 추의 수:");
	            System.out.println("2g: " + (num2g));
	            System.out.println("3g: " + (num3g));
	            System.out.println("5g: " + (num5g));
                        
		}
	}
}