package chapter8.polymorphism;

import java.util.Scanner;

public class Convert {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("숫자를 입력하세요.");
			int i = sc.nextInt();			
			System.out.println(Integer.toBinaryString(i));
			break;

		}

	}
}