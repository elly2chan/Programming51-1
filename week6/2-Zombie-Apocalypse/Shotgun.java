public class Shotgun implements Weapon {

	private int damage;
	private int durability;
	public String name = "Shotgun";
	
	public Shotgun() {
		damage = 25;
		durability = 10;
	}

	@Override
	public int getDamage() {
		durability -= 1;
		if (durability == 0) {
			damage -= 1;
		}
		return damage;
	}

	public int getDurability() {
		return durability;
	}

	public String getType() {
		return "TO_SHOOT";
	}

	public String getName() {
		return name;
	}

}
