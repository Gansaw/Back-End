/*<문제>
"한 변의 길이가 1인 정사각형을 아래 그림과 같이 겹치지 않게 빈틈없이 계속 붙여 나간다.
가장 아랫부분의 정사각형이 n개가 되었을 때, 실선으로 이루어진 도형의 둘레의 길이를 구하시오."

			
<입력>
첫 번째 줄에 가장 아랫부분의 정사각형 개수 n이 주어진다. (1 ≤ n ≤ 10^9)


<출력>
첫 번째 줄에 형석이가 말해야 하는 답을 출력한다.*/

package baekjoon;

import java.util.Scanner;

public class No_15894 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정사각형의 개수를 입력하세요.");
		int n = sc.nextInt();
		if(n<1 || n > Math.pow(10, 9)) {
			System.out.println("정확한 값을 입력해주세요.");
		} else
		System.out.println("둘레 : " + (n * 4));

	}
}
