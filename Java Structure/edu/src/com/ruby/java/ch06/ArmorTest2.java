package com.ruby.java.ch06;

public class ArmorTest2 {
	public static void main(String[] args) {
		Armor suit = new Armor();
		System.out.println(suit.getName());

//		suit = null;
		
//		NULL값인데 setName 및 setHeight를 지정하고 있기 때문에 에러가 발생
		suit.setName("mark6");
		suit.setHeight(180);
		System.out.println(suit.getName() + " : " + suit.getHeight());
	}
}