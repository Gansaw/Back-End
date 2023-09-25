package chapter4;

public class multiple {

	public static void  main(String[] args) {
				
		int[][] arrA = {
				{5, 7, 10, 3},
				{6, 4, 7, 5},
				{1, 4, 5, 2}
		};
		int[][] arrB = {
				{3, 5, 4},
				{1, 7, 9},
				{11, 13, 4},
				{1, 9, 7}
		};
		System.out.println(arrA);
		
		int[][] AB = new int[3][3];
//i,j,k 조건 다시 확인하기		
		for(int i = 0; i < arrA.length; i++) {
			for(int j = 0; j < arrB[0].length; j++) {
				AB[i][j] = 0;
				for(int k = 0; k < arrA[0].length; k++) {
					AB[i][j] += (arrA[i][k] * arrB[k][j]);
					
				}
				
			}
						
		}

		System.out.print(AB[0][0]);
		System.out.print('\t');
		System.out.print(AB[0][1]);
		System.out.print('\t');
		System.out.println(AB[0][2]);
		System.out.print('\n');
		System.out.print(AB[1][0]);
		System.out.print('\t');
		System.out.print(AB[1][1]);
		System.out.print('\t');
		System.out.println(AB[1][2]);
		System.out.print('\n');
		System.out.print(AB[2][0]);
		System.out.print('\t');
		System.out.print(AB[2][1]);
		System.out.print('\t');
		System.out.print(AB[2][2]);
		
	}

}
