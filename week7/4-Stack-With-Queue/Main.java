public class Main {
    public static void main(String[] args){
        Stack2<Integer> data = new Stack2<>();

        for(int i = 0; i < 10; i++){
            data.push(i);
        }
        data.pop();
        System.out.println(data);
    }
}
