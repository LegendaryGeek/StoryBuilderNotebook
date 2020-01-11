package geek.story.elements.items;

import geek.story.elements.Item;
import geek.story.elements.Technology;
import geek.story.interfaces.ITechnology;

public class TechItem extends Item implements ITechnology {

	Technology tech;

	public TechItem() {
	}

	@Override
	public void setName(Technology tech, String name) {
		ITechnology.super.setName(tech, name);
		this.setName(name);
	}

	@Override
	public String getName(Technology tech) {
		return this.getName();
	}

	public Technology getTech() {
		return tech;
	}

	public void setTech(Technology tech) {
		this.tech = tech;
	}

}
