package chapter10;

import java.util.HashMap;
import java.util.Iterator;

public class Test06 {
	
	public static void main(String[] args) {
		
		String word[] = {"BEE","HV","ALL","WO"};
		String meaning[] = {"꿀벌","천국","모든","호기심"};
		
		HashMap<String,String> dic = new HashMap<String,String>();
		
		for(int i = 0; i < word.length;i++) {
			dic.put(word[i], meaning[i]);
		}
		System.out.println(dic.toString());
		System.out.println(dic.size()/4);
		System.out.println(dic.keySet());
		System.out.println(dic.values());
		
		Iterator<String>keys = dic.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(dic.get(key));
		}
			
		
	}

}
