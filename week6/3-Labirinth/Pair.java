public class Pair<T> {
    private T x;
    private T y;

    public Pair(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getFirst() {
        return x;
    }

    public T getSecond() {
        return y;
    }

}
