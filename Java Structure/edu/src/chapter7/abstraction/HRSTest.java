package chapter7.abstraction;

// 추상 표현 - abstract
abstract class Employee{
	String name;
	int salary;
// abstract로 인해 method body를 가지지 못함 <{} 부분>
	public abstract void calcSalary();
	
}
// abstract로 인해 객체(instance)를 가질 수 없음 (s.Salesman = new Salesman();)
class Salesman extends Employee{
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}
}

class Consultant extends Employee{
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}
}

class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
}

class Director extends Manager{
	
}

public class HRSTest {
	
 // abstract로 인해 구현 강제
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Manager m = new Manager();

		s.calcSalary();
		c.calcSalary();
		m.calcSalary();
	}
	
}
