public class KamenPeshoZombie implements Zombie {
	
	private int health;
	private int currentHealth;
	
	public KamenPeshoZombie (int health) {
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
		currentHealth-=damage;
	}
	
	public boolean isDead() {
		return getCurrentHealth() <=0;
	}

}
