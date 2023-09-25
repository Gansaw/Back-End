package chapter6_기본자료구조;

import java.util.Random;
import java.util.Scanner;

public class Sorting {
	static int count = 0;

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void quickSort(int[] a, int left, int right) {
	    int pl = left;
	    int pr = right;
	    int x = a[(pl + pr) / 2];

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
	        quickSort(a, left, pr);
	    if (pl < right)
	        quickSort(a, pl, right);
	    
	    System.out.println("비교 횟수 : " + count);
	}

	static void shellSort(int[] a, int n) {
		for (int h = n / 2; h > 0; h = h / 2) {
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j = j - h)
					a[j + h] = a[j];
				a[j + h] = tmp;
			}
		}

	}

	static void insertionSort(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--) {
				a[j] = a[j - 1];
				count++;
			}

			a[j] = tmp;
		}
		System.out.println("비교 횟수 : " + count);
	}

	static void selectionSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				count++;
				if (a[j] < a[min])
					min = j;
				swap(a, i, min);
			}
		}
		System.out.println("비교 횟수 : " + count);
	}

	static void bubbleSort(int[] a, int n) {
		int k = 0;
		while (k < n - 1) {
			int last = n - 1;
			for (int j = n - 1; j > k; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}

			}

			k = last;
		}
	}

//		for (int i = 0; i < n; i++) {
//			int exchange = 0;
//			for (int j = n - 1; j > i; j--) {
//				count++;
//				if (a[j - 1] > a[j]) {
//					swap(a, j - 1, j);
//					exchange++;
//				}
//			}
//			if(exchange == 0) break;			
//		}
//		System.out.println("비교 횟수 : " + count);
//	}

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

//		bubbleSort(x, nx);
//		selectionSort(x, nx);
//		insertionSort(x, nx);
//		shellSort(x, nx);
		quickSort(x, 0, nx - 1);

		System.out.println("Asc Sort");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] = " + x[i]);
	}

}
