package java실습;

import java.util.Scanner;

public class 팩토리얼 {
	
	
	static int showFactor(int n) {
	    String resultStr = "";
	    int result = 1;
	    for (int i = n; i >= 1; i--) {
	        result *= i;
	        if (i == 1) {
	            resultStr += i;
	        } else {
	            resultStr += i + " * ";
	        }
	    }
	    System.out.print("결과값 = " + resultStr + " = " + result);
	    
	    return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int n = sc.nextInt();
		
		showFactor(n);
		
	}
	
}
