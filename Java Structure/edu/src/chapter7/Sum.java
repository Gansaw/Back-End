package chapter7;
public class Sum {
	
	public static void main(String[] args) {
		
		int oddSum = 0;
		int evenSum = 0;
		int totalSum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				oddSum = oddSum + i;
			} else evenSum = evenSum + i;
		}
		
		for(int i = 1; i <= 1000; i++) {
			totalSum = totalSum + i;
		}
		
		System.out.println("홀수 합 : " + oddSum);
		System.out.println("짝수 합 : " + evenSum);
		System.out.println("전체 합 : " + totalSum);
		
	}
	
}
