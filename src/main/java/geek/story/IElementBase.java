package geek.story;

/**
 * @author LegendaryGeek
 *
 */
public interface IElementBase {

	/**
	 * @param element: the element to set the name of
	 * @param name:    the name to set the element to
	 * @return the element
	 */
	default ElementBase setName(ElementBase element, String name) {
		element.setName(name);
		return element;
	}

	/**
	 * @param element: the element to add a stat for
	 * @param key:     the unique key for this stat
	 * @param value:   the value for this stat
	 * @return the element
	 */
	default ElementBase addStat(ElementBase element, String key, String value) {
		element.getCustomStatsMap().put(key, value);
		return element;
	}

	/**
	 * @param element: the element that has the stat
	 * @param key:     the key to get the stat from
	 * @return the element
	 */
	default String getStatFromKey(ElementBase element, String key) {
		return element.getCustomStatsMap().get(key);
	}

	/**
	 * @param element: the element to add a global stat for
	 * @param key:     the unique key for this global stat
	 * @param value:   the value for this stat
	 * @return the element
	 */
	default ElementBase addGlobalStat(ElementBase element, String key, String value) {
		element.getGlobalCustomStatsMap().put(key, value);
		return element;
	}

	/**
	 * @param element: the element that has the stat
	 * @param key:     the key to get the stat from
	 * @return the element
	 */
	default String getGlobalStatFromKey(ElementBase element, String key) {
		return element.getGlobalCustomStatsMap().get(key);
	}

}
