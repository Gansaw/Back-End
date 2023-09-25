package java실습;

import java.util.Random;

public class 배열정렬 {

	static void showData(int[] arr) {
		for(int i=0; i< arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void randData(int[] arr) {
		Random rand = new Random();
		for(int i = 1; i < arr.length; i++) {
		arr[i] = rand.nextInt(46);
		}
	}
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void reverseData(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j< arr.length; j++) {
				if(arr[i]>arr[j]) {
					swap(arr,i,j);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] data = new int[7];
		
		
		randData(data);
		System.out.println("랜덤 변수 : ");
		showData(data);
		
		reverseData(data);
		System.out.println("\n역정렬 : ");
		showData(data);
		
		
		
		
	}
	
}
