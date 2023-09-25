package chapter9;


public class Test01 {
	
	class MyObject {
		public String toString() {
			return "My Object";
		}
	}

	public static void main(String[] args) {
		Test01 t = new Test01();
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		Class c = obj1.getClass();
		MyObject obj4 = t.new MyObject();
		MyObject obj5 = t.new MyObject();

		System.out.println(obj4.hashCode());
		System.out.println(obj5.hashCode());

//	.equals는 hashcode의 동일여부를 비교한다.
		if (obj4.equals(obj5)) {
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}

//		==는 단순히 변수값이 같은지를 비교한다.
		if (obj4 == obj5) {
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(c.getName());
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}

}
