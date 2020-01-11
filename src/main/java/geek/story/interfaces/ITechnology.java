package geek.story.interfaces;

import geek.story.elements.Technology;

public interface ITechnology {

	default String getName(Technology tech) {
		return tech.getName();
	}

	default String getPowerSystem(Technology tech) {
		return tech.getPowerSystem();
	}

	default int getPowerUnits(Technology tech) {
		return tech.getPowerUnits();
	}

	default int getMaxPower(Technology tech) {
		return tech.getMaxPower();
	}

	default void setName(Technology tech, String name) {
		tech.setName(name);
	}

	default void setPowerSystem(Technology tech, String powerSystem) {
		tech.setPowerSystem(powerSystem);
	}

	default void setPowerUnits(Technology tech, int powerUnits) {
		tech.setPowerUnits(powerUnits);
	}

	default void setMaxPower(Technology tech, int maxPower) {
		tech.setMaxPower(maxPower);
	}

	default boolean isPowerOverloaded(Technology tech) {
		return tech.getPowerUnits() > tech.getMaxPower();
	}

}
