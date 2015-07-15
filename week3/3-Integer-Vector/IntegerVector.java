public class IntegerVector {
	
	public static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static int[] reverse(int[] a) {
		int b = a.length - 1;
		int i = 0;
		while (i < b) {
			int temp = a[i];
			a[i] = a[b];
			a[b] = temp;
			b--;
			i++;
		}
		return a;
	}

	public static String join(int[] a, String glue) {
		String result = "";
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				result += a[i];
			} else {
				result += a[i] + glue;
			}
		}
		return result;
	}

	public static int sum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static int[] range(int a, int b) {
		int[] c = new int[b - a];
		for (int i = 0; i < c.length; i++) {
			c[i] = a;
			a++;
		}
		return c;
	}

	public static int[] filterOdd(int[] a) {
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				counter++;
			}
		}
		int index = 0;
		int[] result = new int[counter];
		for (int j = 0; j < a.length; j++) {
			if (a[j] % 2 != 0) {
				result[index] = a[j];
				index++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, -50, 80, 70, 66, -365, 0 };

		System.out.println("Print the array to string:");
		System.out.println(Arr.toString(a));

		System.out.println("Sort the array a itself and print it sorted:");
		Arr.sort(a);
		System.out.println(Arr.toString(a));

		System.out.println("Print the reverse of the sorted array");
		Arr.reverse(a);
		System.out.println(Arr.toString(a));

		System.out.println(Arr.join(a, "->"));
		System.out.println(Arr.sum(a));

		int[] b = Arr.range(10, 20);
		System.out.println(Arr.join(b, ", "));

		int[] c = Arr.filterOdd(b);
		System.out.println(Arr.join(c, ", "));

	}

}
