package chapter8.polymorphism;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("숫자1를 입력하세요.");			
			int i = sc.nextInt();
			System.out.println("숫자2를 입력하세요.");
			int j = sc.nextInt();


			
			for(int divNumi = 1; i/(divNumi*2)==1;divNumi++) {
				System.out.println(divNumi*2);
				for(int divNumj = 1; j/(divNumj*2)==1;divNumj++) {
					System.out.println(divNumj*2);
				}
				
			}
			


	}
}
}