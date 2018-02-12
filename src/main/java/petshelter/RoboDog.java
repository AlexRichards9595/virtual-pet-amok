package petshelter;

public class RoboDog extends Robotic implements Walkable {

	public RoboDog(String name, String description) {
		this(name, description, DEFAULT_HEALTH, 20);
	}

	public RoboDog(String name, String description, int health, int oils) {
		this.name = name;
		this.description = description;
		this.health = health;
		this.oils = oils;
	}

	@Override
	public void walk() {
		oils -= 1;

	}

	@Override
	public String toString() {
		return ("Name: " + name + "\t|Health: " + health + "\t|Oils: " + oils);
	}

}
