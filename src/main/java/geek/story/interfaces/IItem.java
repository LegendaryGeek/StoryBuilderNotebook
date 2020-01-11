package geek.story.interfaces;

import geek.story.ElementBase;
import geek.story.elements.Item;

public interface IItem {

	default Item getAsItem(ElementBase base) {
		return (Item) base;
	}

}
