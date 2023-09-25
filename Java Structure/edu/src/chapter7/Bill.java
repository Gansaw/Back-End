package chapter7;

public class Bill {
	
 	public static void main(String[] args) {
 		int a = 50000;
 		int b = 10000;
 		int c = 5000;
 		int d = 1000;
 		int totalBill = 167000;
 		
 		int counta = totalBill / a; 
 		System.out.println("5만원 : " + totalBill / a + "장");
 		int resb = totalBill % a;
 			
 		int countb = resb / b;
		System.out.println("1만원 : " + resb / b + "장");
			int resc = resb % b;
		
		int countc = resc / c; 
		System.out.println("5천원 : " + resc / c + "장");
		int resd = resc % c;

		int countd = resd / d;
		System.out.println("1천원 : " + resd / d + "장");
	

	}

}
