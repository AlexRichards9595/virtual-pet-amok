package petshelter;

public class Organic extends VirtualPet {
	
	public Organic(String name, String description, int health) {
		super(name, description, health);
	}

	protected int hunger =20;
	protected int thirst=20;
	protected int boredom=20;

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

}
