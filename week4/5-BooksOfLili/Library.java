import java.util.Scanner;
import java.util.Vector;

public class LilisLibrary {
    public static Vector<Pair<String, Integer>> orderBooks(Vector<String> books) {
        Vector<Pair<String, Integer>> orderedBooks = new Vector<Pair<String, Integer>>();
        int num = 1;
        String bookName = "";

        sort(books);
        for(int i = 0; i < books.size(); i++){
            if( ( (i +1) < books.size() ) && books.get(i).trim().equalsIgnoreCase(books.get(i + 1)) ){
                num++;
            }
            else{
                bookName = books.get(i);
                orderedBooks.add(new Pair(bookName, num));
                num = 1;
            }
        }
        return orderedBooks;
    }

    private static void sort(Vector<String> books){
        String temp = "";
        for(int i = 0; i < books.size() - 1; i++){
            for(int n = i + 1; n < books.size(); n++){
                if( books.get(i).compareToIgnoreCase(books.get(n)) > 0 ){
                    //ascending
                    temp = books.get(i);               // and just changing the places
                    books.set(i, books.get(n));
                    books.set(n, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vector<String> books = new Vector<String>();
        int booksCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < booksCount; i++) {
            books.add(scanner.nextLine());
        }

        Vector<Pair<String, Integer>> result = orderBooks(books);

        for(Pair<String, Integer> titleCount: result) {
            System.out.println(titleCount.first + " : " + titleCount.second);
        }
    }
}
