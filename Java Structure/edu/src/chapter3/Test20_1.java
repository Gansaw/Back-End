package chapter3;

import java.util.Scanner;

public class Test20_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	while(true) {	
		System.out.println("성적을 입력하세요:");
		
		int score = sc.nextInt();
		char grade;
		
		if(score < 0 || score > 100) {
			break;
		}
		
		else if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';			
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("당신의 성적은 " + grade + "입니다"); 
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
}
