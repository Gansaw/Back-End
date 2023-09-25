package chapter8;

enum Mandarin {
	금귤(600), 한라봉(500), 레드향(300), 천혜향(400), 황금향(800);

	private int price;

	Mandarin(int p) {
		price = p;
	}

	public int getPrice() {
		return price;
	}

}

public class EnumTest03 {
	public static void main(String[] args) {

		Mandarin o1 = Mandarin.금귤;
		System.out.println(o1.hashCode());
		System.out.println(o1.toString());
		
		Mandarin ma = Mandarin.한라봉;
		if (ma == Mandarin.한라봉) {
			System.out.println("ma는 한라봉입니다.");
		}

		System.out.println(ma + " 가격 : " + ma.getPrice());

		Mandarin list[] = Mandarin.values();
		System.out.println("== 귤의 종류 ==");
		for (Mandarin m : list)
			System.out.println(m + " : " + m.getPrice());

	}

}
