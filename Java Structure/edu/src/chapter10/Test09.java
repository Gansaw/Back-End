package chapter10;

import java.util.Map;
import java.util.TreeMap;

public class Test09 {
	
	public static void main(String[] args) {
		
		TreeMap<String,String> users = new TreeMap<String,String>();
		
		users.put("20080319","김푸름");
		users.put("20070620","김하늘");
		users.put("20050817","오정임");
		
		System.out.println(users.toString());
		
		Map.Entry<String, String> entry = null;
		
		entry = users.firstEntry();
		System.out.println(entry);

		
	}

}
