package chapter5;

public class Year {
	
	public static boolean isYear(int i) {

		if(i % 4 == 0 && i % 100 !=0 || i%400 ==0) {

			return(true); 
				
		
	}
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


