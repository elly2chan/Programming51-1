import java.util.Stack;

public class PositivesAndNegatives {
    private int[] data;

    public PositivesAndNegatives(int[] data){
        this.data = data;
    }

    public Stack<Integer> reorder() {
        Stack<Integer> result = new Stack<>();
        order();
        for(int num:data){
            if(num >= 0){
                result.push(num);
            }
        }
        for(int i = data.length - 1; i >= 0; i--){
            if(data[i] < 0 ){
                result.push(data[i]);
            }
        }
        return result;
    }

    private void order(){
        int index;
        for (int i = 0; i < data.length; i++){
            index = i;
            for (int n = i; n < data.length; n++){
                if(data[n] < data[index]){
                    index = n;
                }
            }
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
    }
}
