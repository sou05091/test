package chapter13;

import java.awt.print.Book;

class Bag<T, N> {
	private T thing;
	private N name;

	public Bag(T thing, N name) {
		this.thing = thing;
		this.name = name;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	public N getName() {
		return name;
	}

	public void setName(N thing) {
		this.name = name;
	}

}

	void showType() {
		System.out.println(thing.getClass().getName());
		System.out.println(name.getClass().getName());
	}

	class Book {
		public String toString() {
			return "책";
		}
	}

	class PencilCase {
	}

	class NoteBook {
	}

public class BagTest03 {
public static void main(String[] args) {
//	Bag<Book, String> bag = new Bag<Book, String>(new Book(), "과학");
//	bag.showType();
//	
//	Book book = bag.getThing();
//	String name = bag.getName();
//	
//	System.out.println(book);
//	System.out.println(name);
	}
}
