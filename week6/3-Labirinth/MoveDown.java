public class MoveDown extends Movement {
    public Pair<Integer> move(Pair<Integer> currentPosition) {
        return new Pair<>(currentPosition.getFirst() + 1, currentPosition.getSecond());
    }
}
