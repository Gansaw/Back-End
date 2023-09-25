package chapter7;

public class LMSTest2 {

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e);
		Professor p = new Professor();
		System.out.println(p);
		Student s = new Student();
		System.out.println(s);
		
		Employee e1 = new Employee("오정임", 47, "입학처");
		System.out.println(e1);
		Professor p1 = new Professor("김푸름", 52, "빅데이터");
		System.out.println(p1);
		Student s1 = new Student("김유빈",20,"컴퓨터과학");
		System.out.println(s1);
		
//	 오류 발생 시 .toString() 추가
		System.out.println(e1);
		System.out.println(p1);
		System.out.println(s1);

	}

	
	
}
