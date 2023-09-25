package chapter14;

//1개 이상의 추상 매서드가 선언될 때 밑줄친 곳에 컴파일 오류 발생
@FunctionalInterface
interface MultiplyTest {
	double getValue();
//		double print();
}

@FunctionalInterface
interface verify {
	boolean check(int n);

}

@FunctionalInterface
interface verify2 {
	boolean check(int a, int b);

}



public class TestMultiply {
	public static void main(String[] args) {
		verify v = (n) -> (n%2) == 0;
		verify2 ab = (a,b) -> (a%b) == 0;
		MultiplyTest m;
		m = () -> 3.14 * 2;
		System.out.println("m = " + m.getValue());
		System.out.println("v = " + v.check(10));
		System.out.println("ab = " + ab.check(24,3));
	}

}
