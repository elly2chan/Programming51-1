public class Fraction {
	
	double numerator;
	double denominator;
	
	public double getReal() {
		return numerator / denominator;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fraction a = new Fraction();
		
		a.numerator = 4;
		a.denominator = 12;
		
		System.out.println(a.getReal());

	}

}
