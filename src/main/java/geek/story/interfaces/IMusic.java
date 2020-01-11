package geek.story.interfaces;

import geek.story.elements.music.Music;

public interface IMusic {

	default String getCurrentSong(Music music) {
		return music.getTitle() + " - " + music.getStyleName();
	}

}
