public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(toBinary(10));
		System.out.println(toNumber("1011"));
		System.out.println(countBits(18));
		System.out.println(isPowerOfTwo("10100"));
		System.out.println(isPowerOfTwo("1000"));
	}

	public static String toBinary(int n) {
		String result = "";
		while (n != 0) {
			if (n % 2 == 0) {
				result = result + 1;
			}
			if (n % 2 != 0) {
				result = result + 0;
			}
			n = n / 2;
		}
		return result;
	}

	public static int toNumber(String binary) {
		int result = 0;
		int n = binary.length();
		int i = 0;
		while (i < binary.length()) {
			if (binary.charAt(i) == '1') {
				result += Math.pow(2, n);
			}
			i++;
			n--;
		}
		return result / 2;
	}

	public static int countBits(int n) {
		String binaryN = (toBinary(n));
		char[] numbers = binaryN.toCharArray();
		int count = 0;
		for (int i = 0; i < numbers.length;) {
			if (numbers[i] == '1') {
				count = numbers.length - i;
				break;
			}
		}
		return count;
	}
	public static boolean isPowerOfTwo(String binary){
		char [] numbers = binary.toCharArray();
		int count = 0;
		for (int i=0; i< numbers.length; i++){
			if (numbers[i] == '1'){
				count++;
			}}
		return count == 1;
		
		
	}
}
