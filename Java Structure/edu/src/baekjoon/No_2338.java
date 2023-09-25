/*<문제>
두 수 A.B를 입력받아 A+B, A-B, AxB를 구하는 프로그램을 작성하시오

	
<입력>
첫째 줄에 A가, 둘째 줄에 B가 주어진다. 각각의 수는 10진수로 1,000자리를 넘지 않으며 양수와 음수가 모두 주어질 수 있다.


<출력>
첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 AxB를 출력한다. 각각을 출력할 때, 답이 0인 경우를 제외하고는 0으로 시작하게 해서는 안 된다(1을 01로 출력하면 안 된다는 의미).*/

package baekjoon;

import java.util.Scanner;

public class No_2338 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("A : ");
			int A = sc.nextInt();
			System.out.println("B : ");
			int B = sc.nextInt();

			if(A>Math.pow(10, 1000)||B>Math.pow(10, 1000)) {
				System.out.println("첫자리 수부터는 입력하실 수 없습니다.");
				break;
			}
		
			System.out.println("A+B = " + (A+B));
			System.out.println("A-B = " + (A-B));
			System.out.println("AxB = " + (A*B));
			break;

		}
	}

}
