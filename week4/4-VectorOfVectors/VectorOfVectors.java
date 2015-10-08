import java.util.Scanner;
public class VectorOfVectors {

    public static Vector<Integer> sortAndUnique(Vector<Vector<Integer>> v) {
        Vector<Integer> uniqueData = new Vector<Integer>();

        for(int i = 0; i < v.getSize(); i++){
            for(int n = 0; n < v.getElement(i).getSize(); n++){
                if(unique(v.getElement(i).getElement(n), uniqueData)){
                    uniqueData.add( v.getElement(i).getElement(n) );
                }
            }
        }
        return sort(uniqueData);
    }

    private static boolean unique(Integer unique, Vector<Integer> uniqueData){
        for(int i = 0; i < uniqueData.getSize(); i++){
            if(unique == uniqueData.getElement(i)){
                return false;
            }
        }
        return true;
    }

    private static Vector<Integer> sort(Vector<Integer> uniqueData){
        int index = 0;
        for(int i = 0; i < uniqueData.getSize(); i++){
            for (int n = i; n < uniqueData.getSize(); n++){
                if(uniqueData.getElement(n) < uniqueData.getElement(index)){
                    index = n;
                }
            }
            uniqueData.switchPlaces(i, index);
        }
        return uniqueData;
    }

    public static void main(String[] args) {

        Vector<Vector<Integer>> vi = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Vector<Integer> v = new Vector<Integer>();
            int num = scanner.nextInt();
            for (int k = 0; k < num; k++) {
                v.add(scanner.nextInt());
            }
            vi.add(v);
        }
        System.out.println(sortAndUnique(vi));
    }
}
