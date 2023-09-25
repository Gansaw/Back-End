/*<문제>
그림과 같이 오른손을 바닥에 놓고 엄지 1 검지 2 중지 3 약지 4 새끼 5 약지
6 중지 7 검지 8 엄지 9 검지 10의 규칙으로 계속 세어나갈 때 입력한 값(n)에 해당하는 손가락은?

			
<입력>
첫 번째 줄에 자연수 n (1 ≤ n ≤ 109)이 주어진다.


<출력>
첫 번째 줄에 19번 문제 세 번째 줄에 등장하는 수 '1000'을 자연수 n으로 바꾸었을 때 그에 해당하는 답의 번호를 출력한다.
즉, 1 이상 5 이하의 자연수 중 하나를 출력해야 한다.*/

package baekjoon;

import java.util.Scanner;

public class No_17362 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호를 입력해주세요.");
		

		int n = sc.nextInt();
		int k = 8;
		
		if (n<1||n>1000) {
				System.out.println("입력할 수 없는 숫자입니다.");				
			} else if (n % k == 1) {
			System.out.println("정답 : 1번 (엄지)");
		} else if (n % k == 2 || n % k == 0) {
			System.out.println("정답 : 2번 (검지)");
		} else if (n % k == 3 || n % k == 7) {
			System.out.println("정답 : 3번 (중지)");
		} else if (n % k == 4 || n % k == 6) {
			System.out.println("정답 : 4번 (약지)");
		} else if (n % k == 5) {
			System.out.println("정답 : 5번 (새끼)");
		}

	}

}
