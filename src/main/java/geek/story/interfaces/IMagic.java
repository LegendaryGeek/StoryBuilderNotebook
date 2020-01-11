package geek.story.interfaces;

import geek.story.elements.Magic;

public interface IMagic {

	default String getName(Magic magic) {
		return magic.getName();
	}

	default String getSchool(Magic magic) {
		return magic.getSchool();
	}

	default boolean hasSpells(Magic magic) {
		return magic.hasSpells();
	}

	default int getMana(Magic magic) {
		return magic.getMana();
	}

	default int getMaxMana(Magic magic) {
		return magic.getMaxMana();
	}

	default boolean isManaOverloaded(Magic magic) {
		return magic.getMana() > magic.getMaxMana();
	}

}
