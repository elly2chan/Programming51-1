import java.util.Scanner;

public class Fight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int broinazombita = scanner.nextInt();
		int kruvnazombita = scanner.nextInt();
		String orujie = scanner.next();

		Weapon[] weapons = { new Axe(), new AncientSword(), new Shotgun(),
				new Revolver() };
		Weapon weapon = null;

		for (Weapon w : weapons) {
			if (w.getName().equals(orujie)) {
				weapon = w;
			}
		}

		int counter = 0;
		for (int i = 0; i < broinazombita; i++) {
			Zombie zombie = new KamenPeshoZombie(kruvnazombita);
			while (!zombie.isDead()) {
				zombie.hit(weapon.getDamage());
				counter++;
			}
		}

		System.out.println(counter);
		scanner.close();

	}

}
