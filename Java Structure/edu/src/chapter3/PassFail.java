package chapter3;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
						
		while(true) {
		System.out.println("국어 점수를 입력하세요.");
		double kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		double eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		double math = sc.nextInt();
				
		if (kor > 100 || kor < 0 || eng > 100 || kor < 0 || math > 100 || math < 0) {
			System.out.println("유효한 성적을 입력해주세요.");
			break;
		}
		else if ((kor+eng+math)/3 < 70) {
			
			System.out.println("입력 : " + kor + "," + eng + "," + math);
			System.out.println("총계 : " + (kor + eng + math));
			System.out.println("평균 : " + ((kor + eng + math)/3));
			System.out.println("결과 : 과락");
			System.out.println("사유 : 평균점수 미달");
			break;
		}
			
		else if (kor < 60 || eng < 60 || math < 60) {
				
			System.out.println("입력 : " + kor + "," + eng + "," + math);
			System.out.println("총계 : " + (kor + eng + math));
			System.out.println("평균 : " + ((kor + eng + math)/3));
			System.out.println("결과 : 과락");
			System.out.println("사유 : 기준점수 미달");
			break;

		} 
		else {
			System.out.println("입력 : " + kor + "," + eng + "," + math);
			System.out.println("총계 : " + (kor + eng + math));
			System.out.println("평균 : " + ((kor + eng + math)/3));
			System.out.println("결과 : 통과");
			System.out.println("고생하셨습니다.");
			break;

		}
			
		}
			System.out.println("프로그램을 종료합니다.");
						
	}

}