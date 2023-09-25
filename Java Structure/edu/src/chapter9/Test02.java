package chapter9;

public class Test02 {

	public static void main(String[] args) {

		String s1 = new String("java");
		String s2 = "java";

		String s3 = new String("java");
		String s4 = "java";

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

//		1. s1, s2 비교 (String과 "java" 비교)
		if (s1.equals(s2)) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}

		if (s1 == s2) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}

//		2. s1, s3 비교 (String 비교)

		if (s1.equals(s3)) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}

		if (s1 == s3) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
			
		}

//		3. s2, s4 비교 ("java 비교")

		if (s2.equals(s4)) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}

		if (s2 == s4) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}

	}

}
