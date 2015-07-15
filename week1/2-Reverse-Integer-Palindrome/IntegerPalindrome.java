import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = n;
		int reverse = (n % 10);
		n = n / 10;
		while (n != 0) {
			reverse = reverse * 10 + (n % 10);
			n = n / 10;

		}

		int sum = a + reverse;

		int reverse_sum = (sum % 10);
		int sum1 = sum / 10;
		while (sum1 != 0) {
			reverse_sum = reverse_sum * 10 + (sum1 % 10);
			sum1 = sum1 / 10;
		}
		System.out.println(reverse);
		System.out.println(sum);

		if (sum == reverse_sum) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		scanner.close();
	}

}
