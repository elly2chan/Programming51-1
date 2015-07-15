public class Auto {
	
	Person owner;
	int maxSpeed;
	String brand;
	String name;
	int price;

	public String toString() {
		return brand + " " + name + ", Max Speed: " + maxSpeed + ", Price: " + price + ", Owner: " + owner;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person elena = new Person();
		elena.firstName = "Elena";
		elena.lastName = "Konstantinova";
		elena.age = 19;
		
		Person katia = new Person();
		katia.firstName = "Katia";
		katia.lastName = "Stamatova";
		katia.age = 15;
		
		
		Auto bmw = new Auto();
		bmw.owner = elena;
		bmw.maxSpeed = 200;
		bmw.brand = "BMW";
		bmw.name = "Баварец";
		bmw.price = 20000;
		
		Auto audi = new Auto();
		audi.owner = katia;
		audi.maxSpeed = 300;
		audi.brand = "Audi";
		audi.name = "Стрела";
		audi.price = 25000;
		
		System.out.println(audi);
	}

}
