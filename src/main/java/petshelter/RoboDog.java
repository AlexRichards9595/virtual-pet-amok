package petshelter;

public class RoboDog extends Robotic implements Walkable {
	
	public RoboDog(String name, String description) {
		this(name, description, 20, 20);
	}

	public RoboDog(String name, String description, int health, int oils) {
		this.name = name;
		this.description = description;
		this.health = health;
		this.oils = oils;
	}

	@Override
	public void walk() {
		health +=3;
		oils -=1;
		
	}

}
