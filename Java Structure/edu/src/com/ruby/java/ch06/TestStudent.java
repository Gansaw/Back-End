package com.ruby.java.ch06;

class Student1{
	static int countStudents;
	int sid;
	String sname;
	String city;
	
	public Student1() {
		this(0);
	}

	public Student1(int sid) {
		this(sid,null,null);
	}
	
	public Student1(int sid, String sname) {
		this(sid, sname, null);
	}
	public Student1(int sid, String sname, String city) {
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		countStudents++;
	}

	public String toString() {
		return sid + ":" + sname + ":" + city;
	}
	
	void showStudent() {
		this.toString();
		System.out.print("학번 : ");
		System.out.println(sid);
		System.out.print("이름 : ");
		System.out.println(sname);
		System.out.print("거주지 : ");
		System.out.println(city);
		
		
	}
	static void showNumberObjects() {
		System.out.println("학생 수 : " + countStudents);
	}
}

public class TestStudent {
	public static void main(String[] args) {
		Student.countStudents = 0;
		int[] a = new int[5];
		Student1 arry[] = new Student1[5];
		Student1.showNumberObjects();
		arry[0] = new Student1();
		arry[1] = new Student1(202301);
		arry[2] = new Student1(202302, "Hong");
		arry[3] = new Student1(202303, "Lee","Busan");
		arry[4] = new Student1(202303, "Na","jeju");
		Student1.showNumberObjects();
		for(int i=0; i<5; i++) {
			arry[i].showStudent();
		}
			
	}

}
