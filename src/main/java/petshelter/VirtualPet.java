package petshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPet {

	protected String name;
	protected String description;
	protected int health=20;
	
	

	public VirtualPet(String name, String description, int health) {
		this.name = name;
		this.description = description;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHealth() {
		return health;
	}

	

}
