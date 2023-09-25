package chapter7;

//  new class -> browse -> superclass를 person으로 지정
public class Employee extends Person {
	
	private String dept;


	public Employee(){
		System.out.println("Employee 생성자가 호출되었습니다.");
	}

//	부모 생성자, Employee 생성자, toString() 호출
	public Employee(String name, int age, String dept) {
//		setName(name);
//		setAge(age);
		super(name, age);		
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
//	private이기 때문에 name과 age는 호출 불가능
//	 =>게터를 가져온다(get은 public이므로)
	public String toString() {
		return "Employee [name=" + getName() + ", age=" + getAge() + ", dept=" + dept + "]";

	}	
	
	
	
}
