package geek.story.elements;

import java.util.HashMap;
import java.util.Map;

import geek.story.ElementBase;
import geek.story.annotations.BasicElement;
import geek.story.interfaces.IItem;

@BasicElement
public class Item extends ElementBase implements IItem {

	String type;
	boolean canBeEquipped;
	static Map<String, String> globalCustomItemStats = new HashMap<>();

	public Item() {
		getBook().getItems().add(this);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public ElementBase addGlobalStat(ElementBase element, String key, String value) {
		globalCustomItemStats.put(key, value);
		return element;
	}

	@Override
	public Map<String, String> getCustomStatsMap() {
		return globalCustomItemStats;
	}

	@Override
	public String getGlobalStatFromKey(ElementBase element, String key) {
		return globalCustomItemStats.get(key);
	}

	public boolean isCanBeEquipped() {
		return canBeEquipped;
	}

	public void setCanBeEquipped(boolean canBeEquipped) {
		this.canBeEquipped = canBeEquipped;
	}

	public static Map<String, String> getGlobalCustomItemStats() {
		return globalCustomItemStats;
	}

	public static void setGlobalCustomItemStats(Map<String, String> globalCustomItemStats) {
		Item.globalCustomItemStats = globalCustomItemStats;
	}

}
