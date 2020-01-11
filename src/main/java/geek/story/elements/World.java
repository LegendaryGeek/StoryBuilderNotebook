package geek.story.elements;

import geek.story.ElementBase;
import geek.story.annotations.BasicElement;

@BasicElement
public class World extends ElementBase {

	public World() {
		getBook().getWorlds().add(this);
	}

}
