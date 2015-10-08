import java.util.Scanner;
import java.util.Stack;

public class FunctionCalls {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int x = scanner.nextInt();

        System.out.println(evaluate(input, x));
    }

    public static int evaluate(String formula, int x) {
        Stack<String> funcs = new Stack<>();
        int result = 0;
        for (int i = 0; i < formula.length(); i++){
            if(formula.charAt(i) == 'f'){
                funcs.push("f" + formula.charAt(i + 1));
            }
        }
        while(!(funcs.size() == 0)){
            result = findFuncResult(funcs.peek(), x);
            funcs.pop();
            x = result;
        }

        return result;
    }

    private static int findFuncResult(String f, int x){
        int primeFunc1 = 2 * x;
        int primeFunc2 = x + 1;
        int funcResult;

        switch(f){
            case "f1": funcResult = primeFunc1 + primeFunc2;
                break;
            case "f2": funcResult = primeFunc1;
                break;
            case "f3": funcResult = primeFunc2;
                break;
            case "f4": funcResult = 2 * (primeFunc1 + primeFunc2);
                break;
            default: funcResult = 0;
                break;
        }
        return funcResult;
    }

}
