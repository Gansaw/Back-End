package chapter6_기본자료구조;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
    public boolean equals(Object p) {
        Point pt = (Point) p;
        if (this.x == pt.x && this.y == pt.y)
            return true;
        else
            return false;
    }
}

class QuickSort {
	
    private List<Point> data; // stack 배열
    private int capacity; // stack 용량
    private int top; // stack 포인터

    // 생성자
	public QuickSort(int maxlen) {
		top = 0;
		capacity = maxlen;
		try {
			data = new ArrayList<>(capacity);
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
    // stack 예외 - empty(비어있음)
    public class EmptyStackException extends RuntimeException {
        public EmptyStackException() {
        }
    }

    // stack 예외 - overflow(가득참)
    public class OverflowStackException extends RuntimeException {
        public OverflowStackException() {
        }
    }
	
	public void push(Point p) {
		if (top < capacity) {
			top++;
			data.add(p);
		}
	}

	public Point pop() {
		if (top > 0) {
			top--;
			return data.remove(top);
		}
		return null;
	}

    // 가장 위의 데이터를 들여다봄
    public Point peek() throws EmptyStackException {
        if (top <= 0)
            throw new EmptyStackException();
        return data.get(top - 1);
    }

    // stack을 비움
    public void clear() {
        top = 0;
    }

    // stack에서 x를 찾아 index
    public int indexOf(Point p) {
        for (int i = top - 1; i >= 0; i--) {
            if (data.get(i).equals(p))
                // 검색 성공
                return i;
        }
        // 검색 실패
        return -1;
    }

    // stack 안의 모든 데이터를 바닥 -> 위 순서로 출력
    public void dump() {
        if (top <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for (int i = 0; i < top; i++) 
                System.out.println("(" + data.get(i).x + ", " + data.get(i).y + ")");            	
            System.out.println();
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return top;
    }

    // stack is empty?
    public boolean isEmpty() {
        return top <= 0;
    }

    public boolean isFull() {
        return top >= capacity;
    }
    
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	public static void quickSort(int[] a, int left, int right) {
		
		int count = 0;
	    int pl = left;
	    int pr = right;
	    int x = a[(pl + pr) / 2];

		QuickSort qs = new QuickSort(right - left + 1);
		Point p = new Point(left, right);
		qs.push(p);

		while (!qs.isEmpty() != true) {
			try{
				p = (Point) qs.pop();
				System.out.println("POP");
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			pl = p.x;
			pl = p.y;
			x = a[(left + right) / 2];
		}

		do {
			while (a[pl] < x) {
				pl++;
				count++;
			}
			while (a[pr] > x) {
				pr--;
				count++;
			}
			if (pl <= pr)
				swap(a, pl++, pr--);
			count++;
		} while (pl <= pr);

		if (left < pr)
			p = new Point(left, pr);
		qs.push(p);
		if (pl < right)
			p = new Point(pl, right);
		qs.push(p);
		
		System.out.println("비교 횟수 : " + count);

	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열을 나눕니다.");
		Random rand = new Random();

		System.out.println("버블 정렬(ver 1)");
		System.out.println("요솟수 : ");

		int nx = 100;
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			x[i] = rand.nextInt(100);
			System.out.println("x[" + i + "] = " + x[i]);
		}

		quickSort(x, 0, nx - 1);

		System.out.println("Asc Sort");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] = " + x[i]);
	}

}
