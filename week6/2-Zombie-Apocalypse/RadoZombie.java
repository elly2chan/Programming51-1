public class RadoZombie implements Zombie {

	private int health;
	private int currentHealth;

	public RadoZombie(int health) {
		this.health = health;
		currentHealth = health;

	}

	@Override
	public int getTotalHealth() {
		return health;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void hit(int damage) {
		if (currentHealth > 0) {
			currentHealth -= damage;
		}
	}
	
	public boolean isDead() {
		return getCurrentHealth() == 0;
	}

}
