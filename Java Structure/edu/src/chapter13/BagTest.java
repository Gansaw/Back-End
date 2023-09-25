package chapter13;

class Book extends Object {
	String name;
}

class Pencil {
	String name;
}

class Notebook {
	String name;
}

class Bag {
	Object thing;

	public Bag(Object thing) {
		this.thing = thing;
	}

	public Object getThing() {
		return thing;
	}

	public void setThing(Object thing) {
		this.thing = thing;
	}

}

public class BagTest {

	public static void main(String[] args) {

		Bag bag = new Bag(new Book());
		Bag bag2 = new Bag(new Pencil());
		Bag bag3 = new Bag(new Notebook());
		Book book = (Book) bag.getThing();

//		bag = bag2;   => 오류가 발생하지 않음(but 심각한 논리적 오류)



	}

}
