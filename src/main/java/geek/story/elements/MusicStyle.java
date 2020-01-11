package geek.story.elements;

import geek.story.ElementBase;

public class MusicStyle extends ElementBase {

	String genre;

	public MusicStyle() {
		getBook().getMusicStyles().add(this);
	}

	public String getStyleName() {
		return genre;
	}

	public void setStyleName(String styleName) {
		this.genre = styleName;
	}

}
