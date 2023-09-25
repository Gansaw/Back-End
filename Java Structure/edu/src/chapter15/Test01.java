package chapter15;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Test01 {
	public static void main(String[] args) {
//		데이터 생성
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(50);
		myList.add(10);
		myList.add(80);
		
//		데이터 여과
		Stream<Integer> myStream = myList.stream();
		
		myStream.forEach((n) -> System.out.println(n + "점"));
		System.out.println();
		
		Optional<Integer> minVal = myList.stream().min(Integer::compare);
		System.out.println("최저 : " + minVal.get() + "점");
		
		Optional<Integer> totalScore = myList.stream().reduce((a,b) -> a+b);
		System.out.println("합계 : " + totalScore.get() + "점");
	}
}
