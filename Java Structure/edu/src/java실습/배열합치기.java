package java실습;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열합치기 {

	static void merge(int[] A, int[] B) {
		int[] C = new int[A.length + B.length];
		for (int i = 0; i < A.length; i++) {
			C[i * 2] = A[i];
			if (i < B.length) {
				C[(i * 2) + 1] = B[i];
			}
		}
		System.out.println(Arrays.toString(C));
	}

	static void randData(int[] arr) {

		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
	}

	static void showData(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("배열 길이를 입력하세요.");
		int N = sc.nextInt();
		if (N < 1)
			System.out.println("적절하지 않은 길이입니다.");

		int[] A = new int[N];
		int[] B = new int[N + 1];

		randData(A);
		System.out.println("A 랜덤변수");
		showData(A);

		randData(B);
		System.out.println("\nB 랜덤변수");
		showData(B);

		System.out.println("\nC (merge 결과)");
		merge(A, B);

	}

}
