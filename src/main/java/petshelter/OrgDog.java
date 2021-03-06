package petshelter;

public class OrgDog extends Organic implements Walkable {

	int cageWaste;

	public OrgDog(String name, String description) {
		this(name, description, DEFAULT_HEALTH, DEFAULT_HUNGER, DEFAULT_THIRST, DEFAULT_BOREDOM, DEFAULT_WASTE, 0);
	}

	public OrgDog(String name, String description, int health, int hunger, int thirst, int boredom, int waste,
			int cageWaste) {
		this.name = name;
		this.description = description;
		this.health = health;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.waste = waste;
		this.cageWaste = cageWaste;
	}

	public void walk() {
		waste -= 10;
		boredom -= 10;
	}

	public int getCageWaste() {
		return 0;
	}

	public void cleanCage() {
		cageWaste = 0;
		waste = 0;
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
		if (waste > 30) {
			cageWaste += 10;
		}
		if (cageWaste > 20) {
			health -= cageWaste;
		}
	}

	@Override
	public String toString() {
		return ("Name: " + name + "\t|Health: " + health + "\t|Hunger: " + hunger + "\t|Thirst: " + thirst
				+ "\t|Boredom: " + boredom + "\t|Waste: " + waste + "\t|Cage waste: " + cageWaste);
	}

}
