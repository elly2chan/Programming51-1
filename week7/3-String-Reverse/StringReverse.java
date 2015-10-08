import java.util.Scanner;

public class StringUtils {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String aString = scanner.next();
        System.out.println(reverseStringWithStack(aString));
    }

    public static String reverseStringWithStack(String s) {
        Stack<Character> data = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            data.push(s.charAt(i));
        }
        s = "";
        while (!data.empty()){
            s += data.peek();
            data.pop();
        }
        return s;
    }
}
