package chapter7.abstraction1;

// 추상 표현 - abstract

abstract class Employee {
	String name;
	int salary;

// abstract로 인해 method body를 가지지 못함 <{} 부분>
	public abstract void calcSalary();

	public abstract void calcBonus();

}

// abstract로 인해 객체(instance)를 가질 수 없음 (s.Salesman = new Salesman();)
class Salesman extends Employee {
	public void calcSalary() {

		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}

	// abstract로 인해 구현 강제
	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}

}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}

}

// abstract를 다시 지정
abstract class Manager extends Employee {
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}

}

// abstract class Manager extends Employee{
//	public void calcBonus() {
//		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
//	}
//
//}

// 자식 class인 Director에도 영향 -> 오버라이딩(부모class에서 제외한 나머지 선언 모두 작성)
// 여기선 첫 번째로 적용				or 본인이 추상 클래스
class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}

}
//class Director extends Manager{	
//	public void calcSalary() {
//		System.out.println("Director 보너스 = 기본급 * 12 * 6");
//	}
//
//}

public class HRSTest_1 {

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
//		Manager m = new Manager();
		Director d = new Director();

		
		s.calcBonus(); c.calcBonus();
		c.calcBonus();
//		abstract는 인스턴스를 만들 수 없으므로 m.calcSalary() X
//		m.calcSalary();
		d.calcBonus();

	}

}
