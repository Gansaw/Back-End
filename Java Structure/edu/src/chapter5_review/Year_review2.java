package chapter5_review;

public class Year_review2 {

	public static boolean isYear(int year) {
		if((year % 4 ==0 ) && (year % 100 == 0 || year % 400 == 0)) {
			
			return(true);
		}
	return(false);

	}
		
	public static void main(String[] args) {
			int i = 0;
			for(int year = 2023;i<10;year++) {
				if(isYear(year)) {
					System.out.println(year);
					i++;
				}
			}
	}

}
