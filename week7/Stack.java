import java.util.LinkedList;

public class Stack <E> implements DataStructure<E> {
    private LinkedList<E> data;

    public Stack(){
        this.data = new LinkedList<>();
    }

    public void push(E element){
        data.addFirst(element);
    }

    public E pop(){
        return data.removeFirst();
    }

    public int size(){
        return data.size();
    }

    public E peek(){
        return data.getFirst();
    }

    public boolean isEmpty() {
        return data.size() == 0;
    }

    public String toString(){
        return data.toString();
    }

    public boolean empty() {
        return data.size() == 0;
    }
}
