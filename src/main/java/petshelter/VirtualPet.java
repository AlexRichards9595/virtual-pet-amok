package petshelter;

public class VirtualPet {

	private String name;
	private int hunger;
	private int thirst;
	private int boredom;
	private String description;

	public VirtualPet(String name, String description) {
		this(name, description, 20, 20, 20);
	}

	public VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
		this.name = name;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	public String getDescription() {
		return description;
	}

	public void tick() {
		hunger += 2;
		thirst += 2;
		boredom += 5;

	}

	public void feed() {
		hunger -= 5;
	}

	public void water() {
		thirst -= 5;
	}

	public void play() {
		boredom -= 10;
	}

	@Override
	public String toString() {
		return (name + "\t\t|" + hunger + "\t|" + thirst + "\t|" + boredom);
	}

}
