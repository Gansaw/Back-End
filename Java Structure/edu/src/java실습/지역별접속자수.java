package java실습;


public class 지역별접속자수 {
	
	static void showData(String[] items){
		for(int i = 0; i < items.length; i++) {
			System.out.println(items[i] + "");
		}
	}
	
	public static void main(String[] args) {
		String[] data = {new String ("서울 : 559명"),("부산 : 551명"), ("인천 : 46명"),
										("대전 : 43명"),("대구 : 27명")};

		
		showData(data);
		
	}

}
