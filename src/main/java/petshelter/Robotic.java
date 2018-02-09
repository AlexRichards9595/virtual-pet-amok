package petshelter;

public class Robotic extends VirtualPet {
	
	public Robotic(String name, String description, int health, int oils) {
		super(name, description, health);
	}

	private int oils;

	public void Organic(String name, String description, int health) {
		this.name= name;
		this.description = description;
		this.health = health;
		this.oils = oils;
	}

}
