package geek.story.elements;

import geek.story.ElementBase;
import geek.story.annotations.BasicElement;

@BasicElement
public class Magic extends ElementBase {

	String school;
	boolean hasSpells;
	int mana;
	int maxMana;

	public Magic() {
		getBook().getMagic().add(this);
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public boolean hasSpells() {
		return hasSpells;
	}

	public void setHasSpells(boolean hasSpells) {
		this.hasSpells = hasSpells;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getMaxMana() {
		return maxMana;
	}

	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
	}

}
