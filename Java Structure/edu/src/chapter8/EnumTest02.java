package chapter8;

enum Stat{
	READY, SEND, COMPLETE, CLOSE
}

public class EnumTest02 {
	public static void main(String[] args) {
		Stat work = Stat.COMPLETE;
		System.out.println(work.name());
		System.out.println(work.ordinal());
		
		int n = 2;

		switch (n) {
		case 1:
			work = Stat.READY;
			break;
		case 2:
			work = Stat.SEND;
			break;
		case 3:
			work = Stat.COMPLETE;
			break;
		case 4:
			work = Stat.CLOSE;
			break;

		}

		System.out.println("현재 작업 상태 : " + work);

//		work.toString();
//		String name = "hello";
//		String sname = "good";
//		if(name>sname) { } (x)
//		if(name.compareTo(sname)>0) { }

	}
}
