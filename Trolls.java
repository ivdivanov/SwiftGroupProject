package project;

public class Trolls {
	private String name;
	private int power;
	private int health;
	
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
	
	public Trolls(String name, int power, int health) {
		super();
		this.name = name;
		this.power = power;
		this.health = health;
	}
	
	public int takeDamage(int damage) {
		return this.health -= damage;
	}
	public int hit(Heroes hero) {
		return hero.takeDamage(this.power);
	}
}
