package chapter14;

interface MyInterface {
	public void print();

}

class Myclass1 implements MyInterface {
	public void print() {
		System.out.println("Myclass1");
	}

	class Myclass2 implements MyInterface {
		public void print() {
			System.out.println("Myclass2");
		}

	}

	public class Test01 {
		public static void test(MyInterface mi) {
			mi.print();

		}

		public static MyInterface test2() {
			MyInterface mi = new MyInterface() {

				public void print() {
					System.out.println("리턴 객체");
				}
			};
			return mi;
		}
	}

	public static void main(String[] args) {
			/*
			 * MyInterface mi = new MyInterface() { public void print() {
			 * System.out.println("익명 클래스 구현"); } };
			 */

			(new MyInterface() {
				public void print() {
					System.out.println("익명 클래스 구현");
				}
			}).print();

//		mi.print();
			Myclass1 mc1 = new Myclass1();
			Myclass2 mc2 = new Myclass2();
			mc1.print();
			mc2.print();

}
