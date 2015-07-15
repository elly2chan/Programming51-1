import java.util.Scanner;
import java.util.Vector;

public class MissingStudents {
    public static Vector<Vector<String>> missingStudents(Vector<String> students, Vector<Vector<String>> presence) {
        Vector<Vector<String>> result = new Vector<>();
        for (Vector<String> vector : presence) {
            Vector<String> missingStudents = new Vector<>();
            for (String student : students) {
                if (!vector.contains(student)) {
                    missingStudents.add(student);
                }
            }
            result.add(sort(missingStudents));
        }
        return result;
    }

    private static Vector<String> sort(Vector<String> missingStudents) {
        String temp = "";
        for (int i = 0; i < missingStudents.size(); i++) {
            for (int j = i + 1; j < missingStudents.size(); j++) {
                if (missingStudents.get(i).compareTo(missingStudents.get(j)) > 0) {
                    temp = missingStudents.get(i);
                    missingStudents.set(i, missingStudents.get(j));
                    missingStudents.set(j, temp);
                }
            }
        }
        return missingStudents;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> students = new Vector<>();
        Vector<Vector<String>> presence = new Vector<>();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentsCount; i++) {
            String student = scanner.nextLine();
            students.add(student);
        }
        int days = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < days; i++) {
            int studentsForThatDay = Integer.parseInt(scanner.nextLine());
            Vector<String> presenceForDay = new Vector<>();
            for (int j = 0; j < studentsForThatDay; j++) {
                presenceForDay.add(scanner.nextLine());
            }
            presence.add(presenceForDay);
        }
        Vector<Vector<String>> missing = missingStudents(students, presence);
        System.out.println(missing);
        scanner.close();
    }
}
