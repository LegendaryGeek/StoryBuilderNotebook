package geek.story.elements;

import geek.story.ElementBase;
import geek.story.annotations.BasicElement;

@BasicElement
public class GSCurrency extends ElementBase {

	String symbol;
	int fractionDigits;
	float dollarEquals;
	float centEquals;

	public GSCurrency() {
		getBook().getCurrencies().add(this);
	}

	public float getDollarEquals() {
		return dollarEquals;
	}

	public void setDollarEquals(float dollarEquals) {
		this.dollarEquals = dollarEquals;
	}

	public float getCentEquals() {
		return centEquals;
	}

	public void setCentEquals(float centEquals) {
		this.centEquals = centEquals;
	}

}
