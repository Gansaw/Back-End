package chapter11;

public class Test01 {

	public static void main(String[] args) {
		try {
			int arr[] = new int[3];
			arr[3] = 30;
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length();
			
		}

		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("array 에러발생!" + e1.toString());
			e1.printStackTrace();
		}

		catch (NullPointerException e2) {
			e2.getMessage();
			e2.toString();
			System.out.println("null 에러발생!" + e2);
		}

	}
}