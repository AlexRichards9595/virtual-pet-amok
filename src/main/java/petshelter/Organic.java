package petshelter;

public abstract class Organic extends VirtualPet {

	protected static final int DEFAULT_WASTE = 20;
	protected static final int DEFAULT_BOREDOM = 20;
	protected static final int DEFAULT_THIRST = 20;
	protected static final int DEFAULT_HUNGER = 20;
	protected int hunger = DEFAULT_HUNGER;
	protected int thirst = DEFAULT_THIRST;
	protected int boredom = DEFAULT_BOREDOM;
	protected int waste = DEFAULT_WASTE;

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	public void feed() {
		hunger = 0;

	}

	public void water() {
		thirst = 0;
	}

	public void play() {
		boredom = 0;
	}

	public int getWaste() {
		return waste;
	}

}
