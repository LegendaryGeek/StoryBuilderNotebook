package geek.story;

import java.util.HashMap;
import java.util.Map;

public class ElementBase implements IElementBase {

	String name;
	static Notebook book;
	private Map<String, String> customStats = new HashMap<>();
	private static Map<String, String> globalCustomStats = new HashMap<>();

	public ElementBase() {
		// Empty for json serialization
	}

	/**
	 * @return the name of this element
	 */
	public String getName() {
		return name.replace(" ", "_");
	}

	/**
	 * @param name: the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the Map of stats for this instance
	 */
	public Map<String, String> getCustomStatsMap() {
		return customStats;
	}

	/**
	 * @return the map of stats for all types
	 */
	public Map<String, String> getGlobalCustomStatsMap() {
		return globalCustomStats;
	}

	/**
	 * @return the Notebook
	 */
	public Notebook getBook() {
		return book;
	}

	/**
	 * @param bookIn the currently active notebook
	 */
	public void setBook(Notebook bookIn) {
		book = bookIn;
	}

	public ElementBase getBase() {
		return this;
	}

}
