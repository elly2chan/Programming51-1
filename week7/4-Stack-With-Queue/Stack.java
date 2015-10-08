import java.util.LinkedList;
import java.util.Queue;

public class Stack<T> {
    private Queue<T> firstQueue = new LinkedList<T>();

    public T pop() {
        return firstQueue.poll();
    }

    public T peek() {
        return firstQueue.peek();
    }

    public boolean isEmpty() {
        return firstQueue.size() == 0;
    }

    public void push(T data) {
        Queue<T> temp = new LinkedList<>();
        temp.add(data);
        while (!isEmpty()){
            temp.add(firstQueue.poll());
        }
        firstQueue = temp;
    }

    public String toString(){
        return firstQueue.toString();
    }
}
