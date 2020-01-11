package geek.story.elements;

import geek.story.ElementBase;
import geek.story.annotations.BasicElement;

@BasicElement
public class MagiTech extends ElementBase {

	String powerSystem;
	String mana;
	int manaAmount;
	int maxMana;
	int powerAmount;
	int maxPower;

	public MagiTech() {
		getBook().getMagitech().add(this);
	}

}
