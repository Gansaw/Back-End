package innerClass;


public class MyLinkedList_outer {

	class Student {
		int sid;
		String sname;

		Student(int sid, String sname){
			this.sid = sid;
			this.sname = sname;
		}
		
		public String toString(){
			return "sid = " + sid + " , sname = " + sname;
		}
		
		void show() {
//			System.out.println("sid = " + sid + " , sname = " + sname);
			System.out.println(this.toString());
		}
	}

	public static void main(String[] args) {
		int[] data = new int[10];
		Student[] sdata = new Student[10];
		data[0] = 10;
		MyLinkedList_outer my = new MyLinkedList_outer();
		sdata[0] = my.new Student(2023, "Choi");
		sdata[1] = my.new Student(2022, "Park");
		sdata[2] = my.new Student(2021, "Kim");
		sdata[3] = my.new Student(2020, "Lee");
		sdata[4] = my.new Student(2019, "Hong");
		
		for(int i = 0; i < 5; i++) {
			sdata[i].show();
		}
		
	}
}
