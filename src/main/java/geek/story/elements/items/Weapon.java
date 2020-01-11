package geek.story.elements.items;

import geek.story.elements.Item;

public class Weapon extends Item {

	int damage;
	int durability;
	int maxDurability;
	boolean isRanged;
	String weaponClass;

	public Weapon() {
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	public int getMaxDurability() {
		return maxDurability;
	}

	public void setMaxDurability(int maxDurability) {
		this.maxDurability = maxDurability;
	}

	public boolean isRanged() {
		return isRanged;
	}

	public void setRanged(boolean isRanged) {
		this.isRanged = isRanged;
	}

	public String getWeaponClass() {
		return weaponClass;
	}

	public void setWeaponClass(String weaponClass) {
		this.weaponClass = weaponClass;
	}

}
