package chapter3_review;

import java.util.Scanner;

public class Test20_review {

	public static void main(String[] args) {
		/* Scanner 작성 방법
		 	Scanner 구문 Scanner sc = new Scanner(System.in);
 		 	이후에 ctrl + shift + O !!
		 */

		Scanner sc = new Scanner(System.in);
		/*Scanner에 기입하게 하는 방법 : int인 경우 sc.nextInt() 
		char인 경우 char c = scanner.next().charAt(0);*/
		
//		while(true) 작성을 통해 무한 loop 가능 
		
		while (true) {
			System.out.println("성적을 입력하시오");
			
			int score = sc.nextInt();
			char grade;
			
//		break를 통해 loop를 끊어준다!	
			if(score < 0 || score > 100) {
				break;
			}
//			if else 구문 if(){ elseif(){ else{
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


