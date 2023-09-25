package chapter10;

import java.util.ArrayList;
import java.util.Arrays;

class Employee {

	String name;
	int age;
	int height;
	int weight;
	char blood_type;
	String email;

	public Employee(String name, int age, int height, int weight, char blood_type, String email) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.blood_type = blood_type;
		this.email = email;

	}

	public String toString() {
		return name + " , " + age + " , " + height + " , " + weight + " , " + blood_type + " , " + email;
	}

}

class Student{
	int sid; String name;
	
}

public class Test01 {

	public static void main(String[] args) {
//		ArrayList<Student> list2 = new ArrayList<>();
//		Student s1 = new Student(10, "hong");
//		list2.add(s1);
		

		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("부산");
		list.add("창원");
		list.add("서울");
		list.add("울산");
		list.add("밀양");

//		for (int i = 0; i<list.size();i++) {
//			System.out.println(list.get(i));

//		0번째 인천 추가
		list.add(0, "인천");
//		1번째 제거
		list.remove(1);
		System.out.println("/n ----인천 추가----");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
			System.out.println(list.toString());
			Object obj[] = list.toArray();
			System.out.println("8 : " + Arrays.toString(obj));
//		}
		
		

//		Object arr[] = new Object[10];
//		ArrayList list1 = new ArrayList();
//		String s = "java";
//		Integer i = 123;
//		arr[0] = s;
//		arr[1] = i;
//		list1.add(s);
//		list1.add(i);
//		((String)list1.get(0)).length();
		
		

		
//	}

//	int[] a = new int[10];
//	Employee [] eset = new Employee[10];
//	eset[0]=new Employee("hong",11,130,50,'A',"bhhong@go.kr");eset[1]=new Employee("choi",13,150,80,'B',"choi@naver.com");eset[2]=new Employee("park",15,110,70,'O',"parksh@gmail.kr");eset[3]=new Employee("kim",20,170,30,'A',"kimbob@daum.net");eset[4]=eset[3];eset[3]=eset[2];eset[2]=new Employee("lee",17,130,40,'B',"lee@gmail.kr");
//
	
/*		배열 전부 돌리는 함수식
		for(Employee e:eset) {
			System.out.println(e.toString());*/
//
//	for(int i = 0;i<5;i++)
//	{
//		System.out.println(eset[i].toString());
//	}

}

}
