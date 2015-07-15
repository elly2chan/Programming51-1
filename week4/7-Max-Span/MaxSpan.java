import java.util.Scanner;

public class MaxSpan {
    public static int maxSpan(int[] numbers) {
        int maxSpan = 0;
        int len = numbers.length - 1;
        for (int i = 0; i < len; i++) {
            int tempSpan = 0;
            for (int j = len; j > 0; j--) {
                if (numbers[i] == numbers[j]) {
                    tempSpan = j - i;
                    break;
                }
            }
            if (tempSpan == len) {
                return tempSpan + 1;
            }
            if (maxSpan < tempSpan) {
                maxSpan = tempSpan;
            }
        }
        return maxSpan + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(maxSpan(numbers));
        scanner.close();
    }
}
