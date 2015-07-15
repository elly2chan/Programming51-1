import java.util.Scanner;

public class StringNormalizer {
	public static String normalize(String str) {
		String string = "";
		String[] word = str.trim().toLowerCase().split("\\s+");
		for (int i = 0; i < word.length; i++) {
			char a = word[i].charAt(0);
			string += Character.toUpperCase(a) + word[i].substring(1) + " ";
		}
		return string.trim();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println(normalize(s));
		scanner.close();
	}
}
