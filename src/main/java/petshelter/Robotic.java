package petshelter;

public abstract class Robotic extends VirtualPet {

	protected int oils = 20;

	public int getOil() {
		return oils;
	}

	public void oilPet() {
		oils += 50;

	}

	public void tick() {
		oils -= 2;
		if (oils < 10) {
			health -= 10;
		}
	}

}
