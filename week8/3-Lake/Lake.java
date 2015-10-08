import java.util.Scanner;

public class Lake {
	public String lakeDescription;
	public int square;

	public Lake(String lakeDescription) {
		this.lakeDescription = lakeDescription;
		square = 1000;
	}

	public int getAmountOfWater() {
		int countD = 0;
		int countU = 0;
		int result = 0;

		for (int i = 0; i < lakeDescription.length(); i++) {
			switch (lakeDescription.charAt(i)) {
			case 'd':
				countU--;
				if (countU <= countD) {
					result += (square / 2) + countD * square;
					countD++;
				} else {
					result += 0;
					countD++;
				}
				break;
			case 'h':
				if (countU <= countD) {
					result += countD * square;
				} else {
					result += 0;
				}
				break;
			case 'u':
				countD--;
				countU++;
				if (countU <= countD) {
					result += (square / 2) + countD * square;
				} else {
					result += 0;
				}
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String lake = scanner.next();

		Lake myLake = new Lake(lake);
		System.out.println(myLake.getAmountOfWater());

	}

}
