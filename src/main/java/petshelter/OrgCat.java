package petshelter;

public class OrgCat extends Organic {
	

	public OrgCat(String name, String description) {
		this(name, description, DEFAULT_HEALTH, 20, 20, 20, 0);
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

	public void tick() {

		health = DEFAULT_HEALTH;
		hunger += 2;
		thirst += 1;
		boredom += 2;
		waste += 2;
		if (hunger > 100) {
			health -= hunger - 100;
		}
		if (thirst > 100) {
			health -= thirst - 100;
		}
		if (boredom > 100) {
			health -= boredom - 100;
		}
	}

	public void removeWaste() {
		waste = 0;
	}
	@Override
	public String toString() {
		return ("Name: " + name + "\t|Health: "+ health + "\t|Hunger: " + hunger + "\t|Thirst: " + thirst + "\t|Boredome: " + boredom + "\t|Waste: " + waste);
	}

}
