public class Brackets {
    public static boolean areCorrect(String brackets) {
        Stack<Character> data = new Stack<>();
        for(int i = 0; i < brackets.length(); i++){
            char letter = brackets.charAt(i);
            if(letter == '{' || letter == '[' || letter == '('){
                data.push(brackets.charAt(i));
            } else {
                char temp;
                switch (letter){
                    case '}': temp = '{';
                        break;
                    case ']': temp = '[';
                        break;
                    case ')': temp = '(';
                        break;
                    default: temp = '_';
                }
                if(temp != data.peek()){
                    return false;
                }
                data.pop();
            }
        }
        return true;
    }
}
