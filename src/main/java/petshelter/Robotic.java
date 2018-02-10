package petshelter;

public abstract class Robotic extends VirtualPet {

	protected int oils;

	public int getOil() {
		return oils;
	}

	public void oilPet() {
		oils += 50;

	}

	public void tick() {
		oils -= 2;
	}

}
