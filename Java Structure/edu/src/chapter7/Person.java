package chapter7;

public class Person {
		private String name;
		private int age;
		
		public Person(){
			System.out.println("Person 생성자가 호출되었습니다.");
		}
		
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
			
		}
		
		// source -> set getter and setter

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		// source -> generate toString()
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		/*
		 * public static void main(String[] args) { Person p = new Person();
		 * p.setName("최호진"); p.setAge(28);
		 * 
		 * System.out.println(p); }
		 */



}
