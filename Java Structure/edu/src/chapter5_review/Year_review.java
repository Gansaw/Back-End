package chapter5_review;

public class Year_review {
	
// repeat를 사용하기 위해서는 void를 사용해서는 안된다. 따라서 static void가 아닌 static이 와야 한다!
	public static boolean isYear(int i) {

		if(i % 4 == 0 && i % 100 !=0 || i%400 ==0) {

// 특정 조건을 만족하면(True) return(true)를 통해 반복한다. (지문에서 10개를 구하라 했으므로 repeat가 필요하다)
		return(true); 
		}
// 마지막엔 return(false)를 수행한다.
		return(false);
	}
		
	public static void main(String[] args) {
				
		int[] arr = new int[10];
			int array = 0;
		for(int i = 2023; ; i++) {
			arr[array] = i;
			
		if(isYear(i)) {
			arr[array++]= i;
				
		}
				
		if(array == 10) break;
									
		}

		for (int c : arr) {
						
		System.out.println(c);
		}
						
	}
	
}


