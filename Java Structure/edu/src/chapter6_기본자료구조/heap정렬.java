package chapter6_기본자료구조;

import java.util.Scanner;

interface MaxHeap {
	void Insert(int x);

	int DeleteMax();
}

class Heap implements MaxHeap {
	private int[] heap;
	private int n; // current size of MaxHeap
	private int MaxSize; // Maximum allowable size of MaxHeap

	final int heapSize = 10;

	public Heap(int sz) {
		heap = new int[sz + 1];
		MaxSize = 0;
	}

	public void display() {
		for (int i = 1; i <= MaxSize; i++)
			System.out.println("x[" + i + "] = " + heap[i]);
	}

	public int getMaxSize() {
		return MaxSize;
	}

	@Override
	public void Insert(int x) {
		if (MaxSize == heap.length - 1) {
			HeapFull();
			return;
		}
		int i = ++MaxSize;

		while (i > 1 && x > heap[i / 2]) {
			heap[i] = heap[i / 2];
			i = i / 2;
		}
		heap[i] = x;
	}

	@Override
	public int DeleteMax() {
		if (MaxSize == 0) {
			HeapEmpty();
		}
		
		int i = 1;
		int j;
		int k = heap[1];
		int l = heap[MaxSize--];

		while (2 * i <= MaxSize) {
			j = 2 * i;

			if (j < MaxSize && heap[j] < heap[j + 1])
				j++;

			if (l >= heap[j])
				break;

			heap[i] = heap[j];
			i = j;
		}

		heap[i] = l;
		return k;
	}

	private void HeapEmpty() {
		System.out.println("Heap Empty");
	}

	private void HeapFull() {
		System.out.println("Heap Full");
	}
}

public class heap정렬 {

	public static void main(String[] args) {
		int select = 0;
		Scanner sc = new Scanner(System.in);
		Heap heap = new Heap(100);
		final int count = 100;
		int[] x = new int[count];
		int[] sorted = new int[count];

		do {
			System.out.println("Heap Sort. Select: 1 insert, 2 display, 3 sort, 4 exit => ");
			select = sc.nextInt();
			switch (select) {
			case 1:
				for (int i = 0; i < count; i++) {
					x[i] = (int) (Math.random() * 130);
					heap.Insert(x[i]);
					System.out.println("Insert Complete");
				}
				break;
			case 2:
				heap.display();
				break;
			case 3:
				for (int i = 0; i < count; i++) {
					sorted[i] = heap.DeleteMax();
				}
				System.out.println("Sorted array:");
				for (int num : sorted)
					System.out.print(" " + num);
				System.out.println();
				break;
			case 4:
				return;
			}
		} while (select < 5);
	}
}