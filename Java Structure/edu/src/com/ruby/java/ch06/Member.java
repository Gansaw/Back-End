package com.ruby.java.ch06;



public class Member {
	private String name;
	private int age;
	
	public Member() {
//		this.name = "guest";
//		this.age = 0;
		this("guest");
	}
	public Member(String name) {
//		this.name = name;
//		this.age = 0;
		this(name,0);
		this.age = 0;
	}
	public Member(String name, int age) {
		this.name = name;
		this.age = age;		
	}

	public String toString() {
		return name + ":" + age;
	}
	
//	public void show() {
//		 this("guest"); - 사용불가
//	}
	
	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member("Amy");
		Member m3 = new Member("Amy",23);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		
	}
	
}