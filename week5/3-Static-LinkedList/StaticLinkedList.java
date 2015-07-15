import java.util.Vector;

public class StaticLinkedList {
	public static LinkedList<Integer> reverse(LinkedList<Integer> l) {
		LinkedList<Integer> result = new LinkedList<Integer>();
		for (int i = l.size(); i > 0; i--) {
			result.add(l.get(i));
		}
		return result;
	}

	public static LinkedList<Integer> sort(LinkedList<Integer> l) {
		Vector<Integer> v = new Vector<>();
		for (int i = 0; i < l.size(); i++) {
			v.add(l.get(i));
		}
		int minIndex;
		int temp;
		for (int i = 0; i < v.size() - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < v.size(); j++) {
				if (v.get(j) < v.get(minIndex)) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				temp = v.get(i);
				v.set(i, v.get(minIndex));
				v.set(minIndex, temp);
			}
		}
		return new LinkedList<Integer>(v);
	}

	public static LinkedList<Integer> merge(LinkedList<Integer> a, LinkedList<Integer> b) {
		for (int i = 0; i < b.size(); i++) {
			a.add(b.get(i));
		}
		return a;
	}
}
