import java.util.Scanner;
import java.util.Vector;

public class Anagrams {
	public static boolean areAnagrams(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		Vector<Character> wordA = new Vector<>();
		Vector<Character> wordB = new Vector<>();
		for (int i = 0; i < a.length(); i++) {
			wordA.add(a.charAt(i));
			wordB.add(b.charAt(i));
		}
		return wordA.containsAll(wordB);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		if (areAnagrams(a, b)) {
			System.out.println("ANAGRAMS");
		} else {
			System.out.println("NOT ANAGRAMS");
		}
		scanner.close();
	}
}
