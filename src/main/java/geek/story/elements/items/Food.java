package geek.story.elements.items;

import geek.story.elements.Item;

public class Food extends Item {

	String hungerRestore;
	String healthRestore;

	private Food() {
		this.setType("Food");
	}

	public String getHungerRestore() {
		return hungerRestore;
	}

	public void setHungerRestore(String hungerRestore) {
		this.hungerRestore = hungerRestore;
	}

	public String getHealthRestore() {
		return healthRestore;
	}

	public void setHealthRestore(String healthRestore) {
		this.healthRestore = healthRestore;
	}

}
