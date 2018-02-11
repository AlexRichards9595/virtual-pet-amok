package petshelter;

public abstract class VirtualPet {

	protected static final int DEFAULT_HEALTH = 100;
	protected String name;
	protected String description;
	protected int health = DEFAULT_HEALTH;

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
