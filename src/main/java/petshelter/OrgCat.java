package petshelter;

public class OrgCat extends Organic {
	
	public OrgCat(String name, String description) {
		this(name, description, 20, 20, 20,20,20);
	}

	public OrgCat(String name, String description, int health, int hunger, int thirst, int boredom, int waste) {
		this.name = name;
		this.description = description;
		this.health = health;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.waste = waste;
	}

}
