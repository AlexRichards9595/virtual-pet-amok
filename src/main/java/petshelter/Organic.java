package petshelter;

public abstract class  Organic extends VirtualPet {


	protected int hunger = 20;
	protected int thirst = 20;
	protected int boredom = 20;

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
