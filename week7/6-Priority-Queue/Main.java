public class Main {

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.push(60);
        queue.push(75);
        queue.push(85);
        queue.push(50);
        queue.push(56);

        System.out.println(queue.pop()); // 85
        System.out.println(queue.pop()); // 75
        System.out.println(queue.pop()); // 60
    }
}
