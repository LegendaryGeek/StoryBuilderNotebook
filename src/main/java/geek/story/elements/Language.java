package geek.story.elements;

import java.io.File;

import geek.story.ElementBase;

public class Language extends ElementBase {

	File dictionary;

	public Language() {
		getBook().getLanguages().add(this);
	}

}
