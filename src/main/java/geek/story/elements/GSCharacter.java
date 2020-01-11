package geek.story.elements;

import java.util.ArrayList;
import java.util.Map;

import geek.story.ElementBase;
import geek.story.annotations.BasicElement;

@BasicElement
public class GSCharacter extends ElementBase {

	String nickname;
	int age;
	String dateBorn;
	String strengths;
	String weaknesses;
	int healthPoints;
	int maxHealthPoints;
	int hungerPoints;
	int maxHungerPoints;
	String feelings;
	Map<GSCurrency, Float> currency;
	int mana;
	Map<String, Language> LanguagesSpoken;
	ArrayList<Group> groups = new ArrayList<>();
	ArrayList<Item> Inventory = new ArrayList<>();

	public GSCharacter() {
		getBook().getCharacters().add(this);
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateBorn() {
		return dateBorn;
	}

	public void setDateBorn(String dateBorn) {
		this.dateBorn = dateBorn;
	}

	public String getStrengths() {
		return strengths;
	}

	public void setStrengths(String strengths) {
		this.strengths = strengths;
	}

	public String getWeaknesses() {
		return weaknesses;
	}

	public void setWeaknesses(String weaknesses) {
		this.weaknesses = weaknesses;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public String getFeelings() {
		return feelings;
	}

	public void setFeelings(String feelings) {
		this.feelings = feelings;
	}

	public ArrayList<Item> getInventory() {
		return Inventory;
	}

	public void setInventory(ArrayList<Item> inventory) {
		Inventory = inventory;
	}

	public int getMaxHealthPoints() {
		return maxHealthPoints;
	}

	public void setMaxHealthPoints(int maxHealthPoints) {
		this.maxHealthPoints = maxHealthPoints;
	}

	public int getHungerPoints() {
		return hungerPoints;
	}

	public void setHungerPoints(int hungerPoints) {
		this.hungerPoints = hungerPoints;
	}

	public int getMaxHungerPoints() {
		return maxHungerPoints;
	}

	public void setMaxHungerPoints(int maxHungerPoints) {
		this.maxHungerPoints = maxHungerPoints;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public Map<String, Language> getLanguagesSpoken() {
		return LanguagesSpoken;
	}

	public void setLanguagesSpoken(Map<String, Language> languagesSpoken) {
		LanguagesSpoken = languagesSpoken;
	}

}
