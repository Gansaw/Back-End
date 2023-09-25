package chapter4_기본자료구조;

import java.util.ArrayList;
import java.util.List;

public class ObjectQueue {

	class Integer {
		int x;

		public Integer(int x) {
			this.x = x;

		}

		public boolean equals(Object q) {
			Integer qe = (Integer) q;
			if (this.x == qe.x)
				return true;
			else
				return false;
		}
	}

	private List<Integer> que;
	private int capacity;
	private int front;
	private int rear;
	private int num;

	public ObjectQueue(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = new ArrayList<Integer>(capacity);
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	public class EmptyObjectQueueException extends RuntimeException {
		public EmptyObjectQueueException() {
		}
	}

	public class OverflowObjectQueueException extends RuntimeException {
		public OverflowObjectQueueException() {
		}
	}

	public int enque(int x) throws OverflowObjectQueueException {
		if (num >= capacity)
			throw new OverflowObjectQueueException();
		que.add(rear++, new Integer(x));
		num++;
		if (rear == capacity)
			rear = 0;

		return num;
		
	}

	public Integer deque() throws EmptyObjectQueueException {
		if (num <= 0)
			throw new EmptyObjectQueueException();
		Integer i = que.remove(front++);
		num--;
		if (front == capacity)
			front = 0;
		return i;
	}

	public Integer peek() throws EmptyObjectQueueException {
		if (num <= 0)
			throw new EmptyObjectQueueException();
		return que.get(front);
	}

	public void clear() {
		num = front = rear = 0;
	}

	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % capacity;
			if (que.get(idx).x == x)
				return idx;
		}
		return -1;
	}

	public int getCapacity() {
		return capacity;
	}

	public int size() {
		return num;
	}

	public boolean isEmpty() {
		return num <= 0;
	}

	public boolean isFull() {
		return num >= capacity;
	}

	public void dump() {
		if (num <= 0)
			System.out.println("Queue is Empty");
		else {
			for (int i = 0; i < num; i++) {
				int idx = (i + front) % capacity;
				System.out.print("(" + que.get(idx).x + ") ");
			}
			System.out.println();
		}
	}
}
