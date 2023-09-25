package chapter2;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 2;

		a+=b;
		System.out.println("a+=b = " + a);
		boolean gender = true;
		System.out.println(a == 12 & gender == false);
		System.out.println(a == 12 && gender == false);
		System.out.println(a == 12 | gender == false);
		System.out.println(a == 12 | gender == false);
		
		if(a==10 & !gender) {
			a++;
			System.out.println();
		}
				
	}

}
