public class AutoShop {
	
	static Auto[] collection = new Auto[5];
	static Auto audi;
	
	public void addCar(Auto newAuto, int index) {
		collection[index] = newAuto;
			}
	
	public String toString() {
		return collection.toString();
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto bmw = new Auto();
		bmw.maxSpeed = 200;
		bmw.brand = "BMW";
		bmw.name = "Баварец";
		bmw.price = 20000;

		
		AutoShop as = new AutoShop();
		as.addCar(bmw, 1);
		as.addCar(audi, 2);
		
		System.out.println(collection);

	}

}
