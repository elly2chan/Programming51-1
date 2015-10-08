public class Labirinth {
    private char[][] labirinth;
    private Pair<Integer> currentPos;
    private Boolean success;

    public Labirinth(char[][] labirinth){
        this.labirinth = labirinth;
        this.success = false;
        this.currentPos = firstPos();
    }

    public String toString(){
        String str = "";
        for(int i = 0; i < labirinth.length; i++){
            for (int n = 0; n < labirinth[i].length; n++ ){
                str += labirinth[i][n] + " ";
            }
            str += "\n";
        }
        return str;
    }
    public void print(){
        System.out.println(toString());
    }

    public boolean movePerson(Movement move){
       Pair<Integer> tempMove = move.move(currentPos);
        if(labirinth[tempMove.getFirst()][tempMove.getSecond()] != '#'){
            if(labirinth[tempMove.getFirst()][tempMove.getSecond()] == '!'){
                success = true;
            }
            labirinth[tempMove.getFirst()][tempMove.getSecond()] = labirinth[currentPos.getFirst()][currentPos.getSecond()];
            labirinth[currentPos.getFirst()][currentPos.getSecond()] = '.';
            currentPos = tempMove;
            return true;
        }
        return false;
    }

    public Boolean getSuccess(){
        return success;
    }

    private Pair<Integer> firstPos(){
        for(int i = 0; i < labirinth.length; i++){
            for (int n = 0; n < labirinth[i].length; n++ ){
                if(labirinth[i][n] == 'X'){
                    return new Pair<>(i, n);
                }
            }
        }
        return new Pair<>(1, 1); // If we don't find a start position, create one
    }
}
