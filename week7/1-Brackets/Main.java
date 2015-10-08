import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.next();
        System.out.println(Brackets.areCorrect(brackets));
    }
}
