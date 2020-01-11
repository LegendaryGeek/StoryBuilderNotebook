package geek.story.elements;

import geek.story.ElementBase;
import geek.story.annotations.BasicElement;

@BasicElement
public class Religion extends ElementBase {

	String desc;
	int members;
	String alignment;

	public Religion() {
		getBook().getReligions().add(this);
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

}
