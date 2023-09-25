package chapter13;

/*class Bag<T> {
	T thing;

	public Bag(T thing) {
		this.thing = thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}
	
	class Book{};
	class Pencil{};
	class Notebook{};

}
*/
public class Test01{
	
	public static void main(String[] args) {
		
		Bag<Book> b = new Bag<>(new Book());
		Bag<Pencil> p = new Bag<>(new Pencil());
		Bag<Notebook> n = new Bag<>(new Notebook());
		
//		b=p;     => 오류 발생 (매우 당연하고 정상적인 것)
		
	}
	
}