import java.util.Scanner;
import java.util.Vector;

public class BirthdayRanges {
    public static class IntPair {
        public int start;
        public int end;
    }

    public static Vector<Integer> birthdaysCount(Vector<Integer> birthdays, Vector<IntPair> ranges) {
        Vector<Integer> birthdaysCount = new Vector<Integer>();
        int counter = 0;

        for (int i = 0; i < ranges.size(); i++){
            for (int n = 0; n < birthdays.size(); n++){
                if(birthdays.get(n) >= ranges.get(i).start && birthdays.get(n) <= ranges.get(i).end ){
                    counter++;
                }
            }
            birthdaysCount.add(counter);
            counter = 0;
        }

        return birthdaysCount;
    }

    public static void main(String[] args) {
        Vector<Integer> birthdays = new Vector<Integer>();
        Vector<IntPair> ranges = new Vector<IntPair>();

        Scanner scanner = new Scanner(System.in);

        int bdaysCount = scanner.nextInt();
        int rangesCount = scanner.nextInt();

        for (int i = 0; i < bdaysCount; i++) {
            birthdays.add(scanner.nextInt());
        }

        for (int i = 0; i < rangesCount; i++) {
            IntPair pair = new IntPair();

            pair.start = scanner.nextInt();
            pair.end = scanner.nextInt();

            ranges.add(pair);
        }

        Vector<Integer> result = birthdaysCount(birthdays, ranges);

        for (int count : result) {
            System.out.println(count);
            scanner.close();
        }

    }
}
