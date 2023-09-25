package com.ruby.java.ch06;

//코딩 방법1 (비추천)
public class Student4 {
	private int sid;
	private String name;
	private String dept;
//	default 생성자
	public Student4() {}
//	int, String 등 변수를 지정해줘야 한다
	public Student4(int sid,String name,String dept) {
// java에서 사용, 코딩 x 영역 안에 있는 객체를 가리킴 (= receiver object)
		this.sid = sid; this.name = name; this.dept = dept;
	}
	public static void main(String[] args) {
		System.out.println("6장 시작");
		int n = 10;
//		변수 s는 Student4 Class를 참조하고 있음
		Student4 s = null;
//		new : 객체를 생성한다는 keyword
		s = new Student4(201512019,"최호진","컴퓨터");
		System.out.println(s.sid);
		s.sid = 99;
		System.out.println(s.sid);
		System.out.println("student 객체 = " + s);
	}
}
