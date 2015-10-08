import com.hackbulgaria.programming51.week7.DataStructure;

import java.util.Vector;

public class PriorityQueue implements DataStructure<Integer>{
    private Vector<Integer> data;

    public PriorityQueue(){
        this.data = new Vector<>();
    }

    public void push(Integer el) {
        data.add(el);
    }

    public Integer pop(){
        int size = data.size();
        int index = 0;
        for(int i = 0; i < size; i++){
           if(data.get(i) > data.get(index)){
               index = i;
           }
        }
        int temp = data.get(index);
        data.remove(data.get(index));
        return temp;
    };

    public Integer peek(){
        return 0;
    };

    public boolean isEmpty(){
        return data == null;
    };

}
