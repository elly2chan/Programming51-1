import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		char oper = scanner.next().charAt(0);
		int b = scanner.nextInt();

		System.out.println(a);
		System.out.println(oper);
		System.out.println(b);

		if (oper == '+') {
			System.out.println(a + b);

		} else if (oper == '-')

		{
			System.out.println(a - b);

		} else if (oper == '*')

		{
			System.out.println(a * b);

		} else if (oper == '^') {
			int c = a;
			for (int i = 1; i < b; i++) {
				c = c * a;
			}
			System.out.println(c);
		} else if (oper == '?') {
			int d = 1;
			for (int i = a; i > 0; i--) {
				d = d * a;
				a--;
			}

			int e = 1;
			for (int i = b; i > 0; i--) {
				e = e * b;
				b--;
			}
			System.out.println(d + e);
			}
		scanner.close();
			
			
	
		}
		
	}
