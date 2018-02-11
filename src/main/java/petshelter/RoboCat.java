package petshelter;

public class RoboCat extends Robotic {

	public RoboCat(String name, String description) {
		this(name, description, 20, 20);
	}

	public RoboCat(String name, String description, int health, int oils) {
		this.name = name;
		this.description = description;
		this.health = health;
		this.oils = oils;
	}
}
