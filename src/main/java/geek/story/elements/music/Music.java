package geek.story.elements.music;

import geek.story.elements.MusicStyle;
import geek.story.interfaces.IMusic;

public class Music extends MusicStyle implements IMusic {

	String title;
	String artist;
	String album;
	String publisher;
	String copyrightHolder;
	String dateRecorded;
	int trackNumber;
	String language;
	String comments;

	public Music() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCopyrightHolder() {
		return copyrightHolder;
	}

	public void setCopyrightHolder(String copyrightHolder) {
		this.copyrightHolder = copyrightHolder;
	}

	public String getDateRecorded() {
		return dateRecorded;
	}

	public void setDateRecorded(String dateRecorded) {
		this.dateRecorded = dateRecorded;
	}

	public int getTrackNumber() {
		return trackNumber;
	}

	public void setTrackNumber(int trackNumber) {
		this.trackNumber = trackNumber;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
