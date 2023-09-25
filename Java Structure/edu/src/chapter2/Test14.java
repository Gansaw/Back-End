package chapter2;

public class Test14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 0b1011;
		byte b = 0b0111;
		char c = 'A';
		
		c = (char)a; //직접 타입 변경 시 주의 필요!!!!
		int p;
		p = a;
		a = (byte)p;
		
		int n = c;
		System.out.println(Integer.toBinaryString(c));
		c ^= (1 << 5 );
		System.out.println("c = " + c);
		int x = c;
		System.out.println("x = " + x);
		System.out.println(Integer.toBinaryString(x));
		
	}
}