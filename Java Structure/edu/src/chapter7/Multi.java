package chapter7;

public class Multi {
	
	int oddSum = 0;
	int evenSum = 0;	
	int totalSum = 0;
	public int getOddSum() {
		return oddSum;
	}
	public void setOddSum(int oddSum) {
		this.oddSum = oddSum;
	}
	public int getEvenSum() {
		return evenSum;
	}
	public void setEvenSum(int evenSum) {
		this.evenSum = evenSum;
	}
	public int getTotalSum() {
		return totalSum;
	}
	public void setTotalSum(int totalSum) {
		this.totalSum = totalSum;
	}
	

	public static void main(String[] args) {
		
		int oddSum = 0;
		for(int i = 0; i % 2 == 1 && i <= 1000; i++) {
			oddSum = oddSum + i;			
		}
		
		int evenSum = 0;
		for(int i = 0; i % 2 == 0 && i <= 1000; i++) {
			evenSum = evenSum + i;			
		}
		
		int totalSum = 0;
		for(int i = 0; i<=1000 ; i++) {
			totalSum = totalSum + i;
		}
	
		System.out.println("홀수 합 : " + oddSum);
		System.out.println("짝수 합 : " + evenSum);
		System.out.println("전체 합 : " + totalSum);		
	
	}
	
}
