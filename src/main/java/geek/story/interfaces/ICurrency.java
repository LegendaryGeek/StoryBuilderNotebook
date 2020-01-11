package geek.story.interfaces;

import geek.story.elements.GSCurrency;

public interface ICurrency {

	public default String getName(GSCurrency curr) {
		return curr.getName();
	}

	public default float getAmount(GSCurrency curr) {

		return 0;
	}

}
