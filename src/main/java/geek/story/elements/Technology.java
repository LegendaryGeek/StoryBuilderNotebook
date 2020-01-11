package geek.story.elements;

import geek.story.ElementBase;
import geek.story.annotations.BasicElement;

@BasicElement
public class Technology extends ElementBase {

	String powerSystem;
	int powerUnits;
	int maxPower;

	public Technology() {
		getBook().getTech().add(this);
	}

	public String getPowerSystem() {
		return powerSystem;
	}

	public void setPowerSystem(String powerSystem) {
		this.powerSystem = powerSystem;
	}

	public int getPowerUnits() {
		return powerUnits;
	}

	public void setPowerUnits(int powerUnits) {
		this.powerUnits = powerUnits;
	}

	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

}
