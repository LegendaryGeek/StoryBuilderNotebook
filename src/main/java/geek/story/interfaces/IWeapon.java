package geek.story.interfaces;

import geek.story.elements.items.Weapon;

public interface IWeapon {

	default int getDamage(Weapon weapon) {
		return weapon.getDamage();
	}

	default int getDurability(Weapon weapon) {
		return weapon.getDurability();
	}

	default int getMaxDurability(Weapon weapon) {
		return weapon.getMaxDurability();
	}

	default boolean isRanged(Weapon weapon) {
		return weapon.isRanged();
	}

	default String getName(Weapon weapon) {
		return weapon.getName();
	}

	default String getWeaponClass(Weapon weapon) {
		return weapon.getWeaponClass();
	}

}
