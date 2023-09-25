package innerClass;

// Node라는 클래스를 새로 만듦
class Node {
	String data;
	Node link;

	Node(String data) {
		this.data = data;
		link = null;
	}

	public String toString() {
		return "data = " + data;
	}

}

class LinkedList {
	Node head;

	// 새로운 노드 생성

	void show() {
		Node p = head;
		while (p != null) {
			System.out.println(p.toString());
			p = p.link;
		}
	}

	void add(String name) {
		Node temp = new Node(name);
		if (head == null) {
			head = temp;
		} else {
			temp.link = head;
			head = temp;
		}

	}

	public class ListClass {
		public static void main(String[] args) {
			LinkedList my = new LinkedList();
			my.add("Hong");
			my.add("Kim");
			my.add("Park");
			my.add("Choi");
			my.add("Lee");

			my.show();

		}

	}
}