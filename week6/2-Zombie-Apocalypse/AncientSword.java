public class AncientSword implements Weapon {

	private int damage;
	private int durability;
	private int maxDurability;
	public String name = "AncientSword";
	
	public AncientSword() {
		damage = 50;
		durability = 10;
		maxDurability = 10;
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
