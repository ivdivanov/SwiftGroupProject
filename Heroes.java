package project;

public class Heroes {
	private String name;
	private int power;
	private int health;

	public Heroes(String name, int power, int health) {
		super();
		this.name = name;
		this.power = power;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	public int takeDamage(int damage) {
		return this.health -= damage;
	}
	public int hit(Trolls troll) {
		return troll.takeDamage(this.power);
	}
}
