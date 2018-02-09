package petshelter;

public class OrgDog extends Organic implements Walkable{
	
	private int poop;

	public OrgDog(String name, String description, int health, int hunger, int thirst, int boredom, int poop){
		this.name = name;
		this.description = description;
		this.health = health;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.poop = poop;
	}
	
	public int getPoop() {
		return poop;
	}

	public void walk() {
		poop -= 2;
	}

}
