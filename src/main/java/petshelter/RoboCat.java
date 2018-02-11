package petshelter;

public class RoboCat extends Robotic {

	public RoboCat(String name, String description) {
		this(name, description, DEFAULT_HEALTH, 20);
	}

	public RoboCat(String name, String description, int health, int oils) {
		this.name = name;
		this.description = description;
		this.health = health;
		this.oils = oils;
	}
	@Override
	public String toString() {
		return ("Name: " + name + "\t|Health: "+ health +  "\t|Oils: " + oils);
	}
}
