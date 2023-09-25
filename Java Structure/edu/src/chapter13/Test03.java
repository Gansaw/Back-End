package chapter13;

class Solid {
}

class Liquid {
}

class Book extends Solid {
}

class Pencil extends Solid {
}

class Notebook extends Solid {
}

class Water extends Liquid {
}

class Coffee extends Liquid {
}

class Bag<T extends Solid> {
	T thing;
	String owner;

	public Bag(T thing) {
		this.thing = thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}
	String getOwner() {
		return owner;
	}
	boolean isSameOwner(Bag<?> obj) {
		if(this.owner.equals(obj.getOwner()))
			return true;
		return false;
	}
}

public class Test03 {

	public static void main(String[] args) {
		Bag<Book> bag = new Bag<>(new Book());
		Bag<Pencil> bag2 = new Bag<>(new Pencil());
//		bag = bag2;
		bag.isSameOwner(bag2);
//		Bag<Water> water = new Bag<>(new Water());
	}

}
