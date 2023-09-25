/*<문제>
하지만 성우의 조 조장인 민건은 과제 내용을 듣자마자 집으로 도망쳐 버렸고, 성우는 민건이를 찾기 위해 떠난다. 성우는 1분에 1에서 5까지의 거리를 이동할 수 있다.
 성우가 있는 곳으로부터 민건이의 집까지 거리가 주어졌을 때, 최대한 빨리 찾을 경우, 정확히 몇 분만에 민건이를 찾을 수 있는지 출력하는 프로그램을 작성하시오.

	
<입력>
첫째 줄에 성우의 현재 위치와 민건이의 집까지의 거리 L(1 ≤ L ≤ 1,000,000)가 주어진다.

<출력>
성우가 최소 t분만에 민건이를 찾을 수 있을 때, t 이상의 가장 작은 정수를 출력한다.*/

package baekjoon;

import java.util.Scanner;

public class No_15727 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("거리를 입력하세요.");
			int L = sc.nextInt();

			int time = 5;
			if (L < 1 || L > 1000000) {
				System.out.println("유효한 거리를 입력하세요");
				continue;

			} else if (L % time == 0) {
				System.out.println("최단 시간 : " + (L / time));
			} else {
				System.out.println("최단 시간 : " + ((L / time) + 1));
			}

			break;

		}

	}

}
