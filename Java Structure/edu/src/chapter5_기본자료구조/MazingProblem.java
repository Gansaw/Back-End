package chapter5_기본자료구조;

import java.util.ArrayList;
import java.util.List;

enum Directions {
	N, NE, E, SE, S, SW, W, NW
}

class Items {
	int x;
	int y;
	int dir;

	public Items(int x, int y, int dir) {
		this.x = x;
		this.y = y;
		this.dir = dir;
	}
}

class Offsets {
	int a;
	int b;

	public Offsets(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class StackList {
	private List<Items> data;
	private int capacity;
	private int top;

	public StackList(int maxlen) {
		top = 0;
		capacity = maxlen;
		data = new ArrayList<>(capacity);
	}

	public class EmptyStackException extends RuntimeException {
		public EmptyStackException() {
		}
	}

	public class OverflowStackException extends RuntimeException {
		public OverflowStackException() {
		}
	}

	public void push(Items item) throws OverflowStackException {
		if (top >= capacity)
			throw new OverflowStackException();
		data.add(item);
		top++;
	}

	public Items pop() throws EmptyStackException {
		if (top <= 0)
			throw new EmptyStackException();
		top--;
		return data.remove(top);
	}

	public boolean isEmpty() {
		return top <= 0;
	}
}

public class MazingProblem {
	static Offsets[] moves = new Offsets[8];

	public static void path(int[][] maze, int[][] mark, int ix, int iy) {
		mark[1][1] = 1;
		StackList st = new StackList(50);
		Items temp = new Items(0, 0, 2);
		temp.x = 1;
		temp.y = 1;
		temp.dir = 2;
		mark[temp.x][temp.y] = 2;
		st.push(temp);

		while (!st.isEmpty()) {
			Items tmp = st.pop();
			int i = tmp.x;
			int j = tmp.y;
			int d = tmp.dir;
			mark[i][j] = 1;
			while (d < 8) {
				int g = i + moves[d].a;
				int h = j + moves[d].b;

				if ((g == ix) && (h == iy)) {
					System.out.println("path to exit");
					return;
				}
				if ((g >= 0 && g < mark.length) && (h >= 0 && h < mark[0].length) && (maze[g][h] == 0)
						&& (mark[g][h] == 0)) {

					mark[g][h] = mark[i][j] + 1;

					Items item = new Items(i, j, d);
					st.push(item);
					i = g;
					j = h;
					d = 0;
				} else {
					d++;
				}
			}
		}
		System.out.println("no path in maze");
	}

	public static void main(String[] args) {
		int[][] maze = { { 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 }, { 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
				{ 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 }, { 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 }, { 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 },
				{ 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 } };
		int[][] mark = new int[maze.length][maze[0].length];

		for (int ia = 0; ia < 8; ia++) {
			moves[ia] = new Offsets(0, 0);
		}
		moves[0].a = -1;
		moves[0].b = 0;
		moves[1].a = -1;
		moves[1].b = 1;
		moves[2].a = 0;
		moves[2].b = 1;
		moves[3].a = 1;
		moves[3].b = 1;
		moves[4].a = 1;
		moves[4].b = 0;
		moves[5].a = 1;
		moves[5].b = -1;
		moves[6].a = 0;
		moves[6].b = -1;
		moves[7].a = -1;
		moves[7].b = -1;

		System.out.println("maze[12,15]:");
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}

		path(maze, mark, 12, 15);
		System.out.println();

		System.out.println("mark:");
		for (int i = 0; i < mark.length; i++) {
			for (int j = 0; j < mark[0].length; j++) {
				System.out.print(mark[i][j] + " ");
			}
			System.out.println();
		}
	}
}
