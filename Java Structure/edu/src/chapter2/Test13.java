package chapter2;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 0b1011;
		byte b = 0b0111;
				
		int c = a & b;
		System.out.println("a = " + Integer.toBinaryString(a));
		System.out.println("c = " + Integer.toBinaryString(c));

		int d = a | b;
		System.out.println("d = " + Integer.toBinaryString(d));
		
		int e = a ^ b;
		System.out.println("e = " + Integer.toBinaryString(e));
		
		int f = 12;
		int g = (~f) + 1;
		System.out.println("\n~f = " + (~f));
		System.out.println("g = " + g);
		System.out.println("bin-g = " + Integer.toBinaryString(g));
	
		int h = f << 1;
		int i = f << 2;
		int j = f >> 1;
		System.out.println("\nh = " + Integer.toBinaryString(i));
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		
	}

}
