package chapter2_review;

public class Test3_review {

	public static void main(String[] args) {
//		각각의 변수 type로 지정
		byte age;
		short point;
		int price;
		long totalSales;
		
		age = 23;
		point = 32000;
		price = 3500000;
//		int 범위가 초과되는 경우 long을 사용하고 이 때 숫자 뒤에 'L'을 붙인다!! 
		totalSales = 2147483648L;
		
		System.out.println(age);
		System.out.println(point);
		System.out.println(price);
		System.out.println(totalSales);
		

	}

}
