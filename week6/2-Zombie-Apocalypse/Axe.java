public class Axe implements Weapon {

	private int damage;
	private int durability;
	private int maxDurability;
	public String name = "Axe";
	
	public Axe () {
		damage = 10;
		durability = 40;
		maxDurability = 40;
	}

	@Override
	public int getDamage() {
		durability -= 1;
		if (durability < maxDurability / 2) {
			damage -= 1;
		}
		return damage;
	}

	public int getDurability() {
		return durability;
	}

	public String getType() {
		return "TO_SMASH";
	}

	public String getName() {
		return name;
	}

}
