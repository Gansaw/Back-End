package chapter5_기본자료구조;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueenEight {

	static class Point {
		int ix;
		int iy;

		public Point(int ix, int iy) {
			this.ix = ix;
			this.iy = iy;
		}

		@Override
		public boolean equals(Object p) {
			Point pt = (Point) p;
			return this.ix == pt.ix && this.iy == pt.iy;
		}
	}

	private List<Point> data; // stack 배열
	private int capacity; // stack 용량
	private int top; // stack 포인터

	// 생성자
	public QueenEight(int maxlen) {
		top = 0;
		capacity = maxlen;
		try {
			data = new ArrayList<>(capacity);
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	public void push(Point item) {
		if (top < capacity) {
			top++;
			data.add(item);
		}
	}

	public Point pop() {
		if (top > 0) {
			top--;
			return data.remove(top);
		}
		return null;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public static void SolveQueen(int[][] d, int x, int y) {
		int count = 0;
		int ix = x, iy = y;
		QueenEight st = new QueenEight(8);
		Point p = new Point(ix, iy);
		d[ix][iy] = 1;
		count++;
		st.push(p);

		while (count < 8) {
			ix++;
			int cy = 0;
			while (ix < d.length) {
				while (cy < d[0].length) {
					Point px = new Point(ix, cy);
					if (CheckMove(d, ix, cy)) {
						st.push(px);
						d[ix][cy] = 1;
						count++;
						break;
					}
					cy++;
				}
				if (cy != d[0].length) {
					break;
				} else {
					p = st.pop();
					count--;
					if (p == null)
						break;
					ix = p.ix;
					cy = p.iy + 1;
					d[ix][p.iy] = 0;
				}
			}
			if (p == null)
				break;
		}

	}

	public static boolean checkRow(int[][] d, int crow) {
		for (int col = 0; col < d[crow].length; col++) {
			if (d[crow][col] == 1)
				return false;
		}
		return true;
	}

	public static boolean checkCol(int[][] d, int ccol) {
		for (int row = 0; row < d.length; row++) {
			if (d[row][ccol] == 1)
				return false;
		}
		return true;
	}

	public static boolean checkDiagSW(int[][] d, int cx, int cy) {
		while (cx < d.length && cy >= 0) {
			if (d[cx][cy] == 1) {
				return false;
			}
			cx++;
			cy--;
		}
		return true;
	}

	public static boolean checkDiagNW(int[][] d, int cx, int cy) {
		while (cx >= 0 && cy >= 0) {
			if (d[cx][cy] == 1) {
				return false;
			}
			cx--;
			cy--;
		}
		return true;
	}

	public static boolean checkDiagSE(int[][] d, int cx, int cy) {
		while (cx < d.length && cy < d.length) {
			if (d[cx][cy] == 1) {
				return false;
			}
			cx++;
			cy++;
		}

		return true;
	}

	public static boolean checkDiagNE(int[][] d, int cx, int cy) {
		while (cx >= 0 && cy < d.length) {
			if (d[cx][cy] == 1) {
				return false;
			}
			cx--;
			cy++;
		}

		return true;
	}

	public static boolean CheckMove(int[][] d, int x, int y) {
		return checkRow(d, x) && checkCol(d, y) && checkDiagSW(d, x, y) && checkDiagSE(d, x, y) && checkDiagNW(d, x, y)
				&& checkDiagNE(d, x, y);
	}

	public static boolean NextMove(int[][] d, int row, int col) {
		int nextRow = row + 1;
		for (int nextCol = 0; nextCol < d.length; nextCol++) {
			if (CheckMove(d, nextRow, nextCol)) {
				d[nextRow][nextCol] = 1;
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[][] data = new int[8][8];

		Scanner sc = new Scanner(System.in);
		System.out.println("Queen Location (x, y)");

		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println("8 Queen Results");
		SolveQueen(data, x, y);

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}
}
