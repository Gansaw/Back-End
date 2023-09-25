package java실습;

import java.util.Scanner;

public class Food클래스 {

	private static String name;
	private static int price;
	
	public static String toString(String name, int price) {
		return "Food {name : " + name + ", price : " + price + "원}";
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("음식 이름을 입력하세요!");
		name = sc.next();
		System.out.println("음식 가격을 입력하세요!");
		price = sc.nextInt();
		System.out.println(toString(name, price));
		
		
	}

}
