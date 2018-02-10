package petshelter;



public abstract class VirtualPet {

	protected String name;
	protected String description;
	protected int health = 20;


	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHealth() {
		return health;
	}

}
