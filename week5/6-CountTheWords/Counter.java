import java.util.Scanner;

public class WordCounter {
    private char [][] matrix;
    private String word;

    public WordCounter(char[][] matrix, String word){
        this.matrix = matrix;
        this.word = word;
    }

    public int findTheWord(){
        int wordCounter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == word.charAt(0)){
                    wordCounter += ifWordExists(i, j);
                }
            }
        }
        return ( palindrom(word)? wordCounter/2: wordCounter );
    }

    private int ifWordExists(int row, int col){
        int wordCounter = 0;
        wordCounter += checkHorizontally(row, col);
        wordCounter += checkVertically(row, col);
        wordCounter += checkDiagonally(row, col);
        return wordCounter;
    }

    private int checkHorizontally(int row, int col){
        int wordCounter = 0;
        boolean match = true;
        int counter = 0;
        // -->
        if(word.length() <= matrix[row].length - col){
            for(int i = col; i < col + word.length() ; i++){
                if(matrix[row][i] != word.charAt(counter)){
                    match = false;
                    break;
                }
                counter++;
            }
            wordCounter += (match)? 1: 0;
        }
        // <--
        match = true;
        if(word.length() <= col + 1){
            counter = 0;
            for(int i = col; i > col - word.length(); i--){
                if(matrix[row][i] != word.charAt(counter)){
                    match = false;
                    break;
                }
                counter++;
            }
            wordCounter += (match)? 1: 0;
        }
        return wordCounter;
    }

    private int checkVertically(int row, int col){
        int wordCounter = 0;
        boolean match = true;
        int counter = 0;
        // down
        if(word.length() <= matrix.length - row){
            for(int i = row; i < row + word.length(); i++){

                if(matrix[i][col] != word.charAt(counter)){
                    match = false;
                    break;
                }
                counter++;
            }
            wordCounter += (match)? 1: 0;
        }
        // up
        match = true;
        if(word.length() <= row + 1){
            counter = 0;
            for(int i = row; i > row - word.length(); i--){
                if(matrix[i][col] != word.charAt(counter)) {
                    match = false;
                    break;
                }
                counter++;
            }
            wordCounter += (match)? 1: 0;
        }
        return wordCounter;
    }

    private int checkDiagonally(int row, int col){
        int wordCounter = 0;
        int counter = 0;
        boolean match = true;
        int i = row;
        int j = col;
        // down
        if(word.length() <= matrix.length - row ){
            // <--
            if(word.length() <= col + 1){
                while (i < row + word.length() && j > col - word.length()){
                    if(matrix[i][j] != word.charAt(counter)){
                        match = false;
                        break;
                    }
                    i++; j--; counter++;
                }
                wordCounter += (match)? 1: 0;
            }
            // -->
            counter = 0;
            match = true;
            i = row;
            j = col;
            if(word.length() <= matrix[row].length - col){
                while (i < row + word.length() && j < col + word.length()){
                    if(matrix[i][j] != word.charAt(counter)){
                        match = false;
                        break;
                    }
                    i++; j++; counter++;
                }
                wordCounter += (match)? 1: 0;
            }
        }
        // up
        counter = 0;
        match = true;
        i = row;
        j = col;
        if(word.length() <= row + 1 ){
            // <--
            if(word.length() <= col + 1){
                while (i > row - word.length() && j > col - word.length()){
                    if(matrix[i][j] != word.charAt(counter)){
                        match = false;
                        break;
                    }
                    i--; j--; counter++;
                }
                wordCounter += (match)? 1: 0;
            }
            // -->
            counter = 0;
            match = true;
            i = row;
            j = col;
            if(word.length() <= matrix[row].length - col){
                while (i > row - word.length() && j < col + word.length()){
                    if(matrix[i][j] != word.charAt(counter)){
                        match = false;
                        break;
                    }
                    i--; j++; counter++;
                }
                wordCounter += (match)? 1: 0;
            }
        }
        return wordCounter;
    }

    private boolean palindrom(String word){
       for(int i = word.length()-1; i >= 0; i--){
           if(word.charAt(i) != word.charAt(word.length()-1 - i)){
               return false;
           }
       }
       return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searched = scanner.next();
        char [][] map;
        int n,m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        map = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = scanner.next().charAt(0);
            }
        }
        WordCounter counter = new WordCounter(map, searched);
        // Print result here
        System.out.println(counter.findTheWord());
    }
}
