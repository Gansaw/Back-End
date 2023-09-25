package com.ruby.java.ch06;

//	코딩 방법2 (추천)

//Count 파일이름 x main이 있는 곳에 파일이름이 같음
//private, public 없으면 default값
class Count {

	static int totalCount;
	 int num;
//	다음과 같은 방식으로 사용할 수 있게 한다
	public void setNum(int n) {
		num = n;
	}

//	public : class 밖에서도 사용할 수 있게 함
	public int getNum() {
		return num;
	}
}

public class CountTest {
	public void show() {
		System.out.println("Hello!");
	}
	// static으로 되어있는 경우 data 영역에 저장
	public static void main(String[] args) {
		CountTest cx = new CountTest();
		cx.show();
		int num = 0;
	// data 영역에 totalCount = 10으로 저장
		Count.totalCount = 10;
		// Count.num = 20;
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
	// data에 저장되어 있던 10을 20으로 변경
		Count.totalCount = 20;
		c1.num++;
		c1.setNum(num);
		Count.totalCount++;
		c2.setNum(num);
		Count.totalCount++;
		c3.setNum(num);
		Count.totalCount++;

//		System.out.println(Count.totalCount + " : " + c1.num);
		System.out.println(Count.totalCount + " : " + c1.getNum());
		System.out.println(Count.totalCount + " : " + c2.getNum());
		System.out.println(Count.totalCount + " : " + c3.getNum());
	}
}