package java실습;

import java.util.Scanner;

public class 원기둥 {
	protected static int radius;
	protected static int height;
	
	
	
	static double getVolume(int r, int h) {
		
		return 3.14*Math.pow(r, 2)*h;
		
	}
	
	static double getArea(int r, int h) {
		
		return ((2*3.14*r*h) + 2*3.14*Math.pow(r, 2));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요.");
		radius = sc.nextInt();
		
		System.out.println("높이를 입력하세요.");
		height = sc.nextInt();
		
		System.out.println("원기둥의 부피 : ");
		System.out.println(getVolume(radius, height));
		System.out.println("원기둥의 겉넓이 : ");
		System.out.println(getArea(radius, height));
		
	}

}

