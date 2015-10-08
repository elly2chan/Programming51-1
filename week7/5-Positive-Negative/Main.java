import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        PositivesAndNegatives data = new PositivesAndNegatives(arr);
        Stack<Integer> result = data.reorder();

        while(!result.isEmpty()) {
            System.out.println(result.pop());
        }
    }
}
