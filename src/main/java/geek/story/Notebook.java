package geek.story;

import java.util.ArrayList;

import geek.story.elements.GSCharacter;
import geek.story.elements.GSCurrency;
import geek.story.elements.Item;
import geek.story.elements.Language;
import geek.story.elements.MagiTech;
import geek.story.elements.Magic;
import geek.story.elements.MusicStyle;
import geek.story.elements.Religion;
import geek.story.elements.Technology;
import geek.story.elements.World;

public class Notebook {

	String name;
	String desc;
	String path;
	private ArrayList<GSCharacter> characters = new ArrayList<>();
	private ArrayList<GSCurrency> currencies = new ArrayList<>();
	private ArrayList<Item> items = new ArrayList<>();
	private ArrayList<Language> languages = new ArrayList<>();
	private ArrayList<Magic> magic = new ArrayList<>();
	private ArrayList<MagiTech> magitech = new ArrayList<>();
	private ArrayList<MusicStyle> musicStyles = new ArrayList<>();
	private ArrayList<Religion> religions = new ArrayList<>();
	private ArrayList<Technology> tech = new ArrayList<>();
	private ArrayList<World> worlds = new ArrayList<>();

	public Notebook() {
		StoryBuilderNotebook.books.add(this);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the characters
	 */
	public ArrayList<GSCharacter> getCharacters() {
		return characters;
	}

	/**
	 * @param characters the characters to set
	 */
	public void setCharacters(ArrayList<GSCharacter> characters) {
		this.characters = characters;
	}

	/**
	 * @return the currencies
	 */
	public ArrayList<GSCurrency> getCurrencies() {
		return currencies;
	}

	/**
	 * @param currencies the currencies to set
	 */
	public void setCurrencies(ArrayList<GSCurrency> currencies) {
		this.currencies = currencies;
	}

	/**
	 * @return the items
	 */
	public ArrayList<Item> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	/**
	 * @return the languages
	 */
	public ArrayList<Language> getLanguages() {
		return languages;
	}

	/**
	 * @param languages the languages to set
	 */
	public void setLanguages(ArrayList<Language> languages) {
		this.languages = languages;
	}

	/**
	 * @return the magic
	 */
	public ArrayList<Magic> getMagic() {
		return magic;
	}

	/**
	 * @param magic the magic to set
	 */
	public void setMagic(ArrayList<Magic> magic) {
		this.magic = magic;
	}

	/**
	 * @return the magitech
	 */
	public ArrayList<MagiTech> getMagitech() {
		return magitech;
	}

	/**
	 * @param magitech the magitech to set
	 */
	public void setMagitech(ArrayList<MagiTech> magitech) {
		this.magitech = magitech;
	}

	/**
	 * @return the musicStyles
	 */
	public ArrayList<MusicStyle> getMusicStyles() {
		return musicStyles;
	}

	/**
	 * @param musicStyles the musicStyles to set
	 */
	public void setMusicStyles(ArrayList<MusicStyle> musicStyles) {
		this.musicStyles = musicStyles;
	}

	/**
	 * @return the religions
	 */
	public ArrayList<Religion> getReligions() {
		return religions;
	}

	/**
	 * @param religions the religions to set
	 */
	public void setReligions(ArrayList<Religion> religions) {
		this.religions = religions;
	}

	/**
	 * @return the tech
	 */
	public ArrayList<Technology> getTech() {
		return tech;
	}

	/**
	 * @param tech the tech to set
	 */
	public void setTech(ArrayList<Technology> tech) {
		this.tech = tech;
	}

	/**
	 * @return the worlds
	 */
	public ArrayList<World> getWorlds() {
		return worlds;
	}

	/**
	 * @param worlds the worlds to set
	 */
	public void setWorlds(ArrayList<World> worlds) {
		this.worlds = worlds;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

}
