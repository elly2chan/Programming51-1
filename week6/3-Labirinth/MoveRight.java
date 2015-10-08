public class MoveRight extends Movement {
    public Pair<Integer> move(Pair<Integer> currentPosition) {
        return new Pair<>(currentPosition.getFirst(), currentPosition.getSecond()+1);
    }
}
