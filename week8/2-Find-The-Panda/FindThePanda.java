import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class FindThePanda {
	public static class Pair {
		public int x;
		public int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public boolean equals(Pair p) {
			return x == p.x && y == p.y;
		}

		public String toString() {
			return "(" + x + ", " + y + ")";
		}
	}

	public char[][] maze;
	public int rows;
	public int columns;

	public FindThePanda(char[][] maze, int rows, int columns) {
		this.maze = maze;
		this.rows = rows;
		this.columns = columns;
	}

	public ArrayList<Integer> findMe(char[][] maze) {
		ArrayList<Integer> xy = new ArrayList<>();
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (maze[i][j] == 'U') {
					xy.add(i);
					xy.add(j);
				}
			}
		}
		return xy;
	}

	public static boolean solve(char[][] maze, int x, int y) {
		Stack<Pair> s = new Stack<>();
		Pair p = new Pair(x, y);
		s.push(p);
		while (!s.empty()) {
			p = s.pop();
			if (!(p.x >= maze.length || p.x < 0 || p.y >= maze[0].length
					|| p.y < 0 || maze[p.x][p.y] == '#'
					|| maze[p.x][p.y] == 'X')) {
			
			if (maze[p.x][p.y] == 'P')
				return true;
			
			maze[p.x][p.y] = 'X';
				s.push(new Pair(p.x, p.y+1));
				s.push(new Pair(p.x, p.y-1));
				s.push(new Pair(p.x+1, p.y));
				s.push(new Pair(p.x-1, p.y));
		}}
		return false;

	}

	public String toString(char[][] maze) {
		String result = "";
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				result += maze[i][j] + " ";

			}
			result += "\n";
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int columns = scanner.nextInt();
		String mazestr = "";
		for (int i = 0; i < rows; i++) {
			mazestr += scanner.next();
		}
		char[][] maze = new char[rows][columns];
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
				maze[j][i] = mazestr.charAt(i + j * columns);
			}
		}

		FindThePanda panda = new FindThePanda(maze, rows, columns);
		int x = panda.findMe(maze).get(0);
		int y = panda.findMe(maze).get(1);

		System.out.println(solve(maze, x, y));
	}

}
