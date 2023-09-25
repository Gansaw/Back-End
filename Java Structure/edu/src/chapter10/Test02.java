package chapter10;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("부산");
		list.add("제주");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("============");

		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("============");
		
		String [] sl = new String[10];
		sl[0] = "서울";
		sl[1] = "부산";
		sl[2] = "제주";
		for(String sx: sl) {
			System.out.println(" " + sx);
		}

		/* ArrayList의 경우 값이 추가되면 자동으로 공간에 할당하여 추가되지만
		 LinkedList는 값이 추가되면 기존의 위치에 있는 값을 수정한다 */

	}

}
