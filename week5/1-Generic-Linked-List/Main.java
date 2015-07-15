public class Main {

    public static void main(String[] args){
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 10; i < 20; i++) {
            l.add(i);
        }
        l.insert(2, 5);
        l.remove(1);
        System.out.println(l);
    }
}
