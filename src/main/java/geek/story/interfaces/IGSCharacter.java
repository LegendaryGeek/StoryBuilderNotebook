package geek.story.interfaces;

import geek.story.elements.GSCharacter;
import geek.story.elements.Language;

public interface IGSCharacter {

	public default String getName(GSCharacter chara) {
		return chara.getName();
	}

	public default Language getLanguage(GSCharacter chara, String lang) {
		return chara.getLanguagesSpoken().get(lang);
	}

}
