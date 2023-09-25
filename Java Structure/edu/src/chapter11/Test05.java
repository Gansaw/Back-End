package chapter11;

class NegativeNumberException extends Exception {
	public NegativeNumberException() {
		super("음수는 허용하지 않는다.");

	}
}

public class Test05 {
	int battery = 0;

	public void charge(int time) {
		if (time < 0) {
			time = 0;
		
		try {
			throw new NegativeNumberException();
		} catch (NegativeNumberException e) {
//			stack 추적 -> 함수의 호출관계를 보여줌
			e.printStackTrace();
		}
	}

	battery += time;
	System.out.println("현재 배터리 : " + battery);
	}

	
	public static void main(String[] args) {
		Test05 test = new Test05();
		test.charge(30);
		test.charge(20);
		test.charge(-10);
	}

}
