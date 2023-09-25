package chapter2_review;

public class Test13_review {
//	main + ctrl spacebar -> public static void main(string[]args)
	public static void main(String[] args) {
//	byte는 2진수로 숫자 앞에 0b를 붙여야 한다!
		byte a = 0b00010001;
		byte b = 0b00100010;
		
//		<< : 왼쪽으로 비트 이동 / >> : 오른쪽으로 비트 이동(부호비트) / >>> : 오른쪽으로 비트 이동(무조건0)
		int f = 12;
		int h = f << 1;
		int i = f >> 1;
		
		System.out.println(h);
		System.out.println(i);
		
	}
}
