package com.ruby.java.ch06;

public class Student {
	static int countStudents;
	int sid;
	String sname;
	String city;

	public Student() {
		this(0);	
	}

	public Student(int sid) {
		this(sid,null,null);
	}
	
	public Student(int sid, String sname) {
		this(sid, sname, null);
	}
	public Student(int sid, String sname, String city) {
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
		
	public static void main(String[] args) {
		Student.countStudents = 0;
		int[]a = new int[5];
		Student arry[] = new Student[5];
		Student.showNumberObjects();
		arry[0] = new Student();
		arry[1] = new Student(202301);
		arry[2] = new Student(202302, "Hong");
		arry[3] = new Student(202303, "Lee","Busan");
		arry[4] = new Student(202303, "Na","jeju");
		Student.showNumberObjects();
		for(int i=0; i<5; i++) {
			arry[i].showStudent();
		}		
		
	}

}
