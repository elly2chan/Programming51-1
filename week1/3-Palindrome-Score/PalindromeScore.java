import java.util.Scanner;

public class PalindromeScore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(Pscore(n));

	}

	public static int Reversed(int n) {
		int m = n % 10;
		n = n / 10;

		while (n != 0) {
			m = m * 10 + n % 10;
			n = n / 10;
		}
		return m;
	}

	public static int Pscore(int n) {
		int score = 1;
		while (Reversed(n) != n) {
			n = n + (Reversed(n));
			score += 1;
		}

		return score;

	}

}
