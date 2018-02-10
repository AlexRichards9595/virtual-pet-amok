package petshelter;

public class OrgDog extends Organic implements Walkable {
	
	public OrgDog(String name, String description) {
		this(name, description, 20, 20, 20,20,20);
	}

	public OrgDog(String name, String description, int health, int hunger, int thirst, int boredom, int waste) {
		this.name = name;
		this.description = description;
		this.health = health;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.waste = waste;
	}

	public void walk() {
		waste -= 2;
	}

}
