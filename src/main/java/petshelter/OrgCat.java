package petshelter;

public class OrgCat extends Organic {


	public OrgCat(String name, String description, int health, int hunger, int thirst, int boredom) {
		super (name, description, health);
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
	}

}
