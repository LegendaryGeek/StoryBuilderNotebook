package geek.story.file;

public class Temperture {

	public Temperture() {
		// TODO Auto-generated constructor stub
	}

	// Temperature
	double CelsiusToFahrenheit(double celsius) {
		return (celsius * 1.8000) + 32.00;
	}

	double CelsiusToKelvin(double celsius) {
		return celsius + 273.15;
	}

	double FahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) / 1.8000;
	}

	double FahrenheitToKelvin(double fahrenheit) {
		return CelsiusToFahrenheit(FahrenheitToCelsius(fahrenheit));
	}

	double KelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
	}

	double KelvinToFahrenheit(double kelvin) {
		return CelsiusToFahrenheit(KelvinToCelsius(kelvin));
	}

	double FahrenheitToReaumer(double fahrenheit) {
		return CelsiusToReaumer(FahrenheitToCelsius(fahrenheit));
	}

	double CelsiusToReaumer(double celsius) {
		return celsius / 0.80;
	}

	double KelvinToReaumer(double kelvin) {
		return CelsiusToReaumer(KelvinToCelsius(kelvin));
	}

	double ReaumerToKelvin(double reaumer) {
		return ReaumerToCelsius(CelsiusToKelvin(reaumer));
	}

	double ReaumerToCelsius(double reaumer) {
		return reaumer * 0.80;
	}

	double ReaumerToFahrenheit(double reaumer) {
		return CelsiusToFahrenheit(ReaumerToCelsius(reaumer));
	}

	double RankineToCelsius(double rankine) {
		return FahrenheitToCelsius(RankineToFahrenheit(rankine));
	}

	double RankineToFahrenheit(double rankine) {
		return rankine - 459.67;
	}

	double RankineToKelvin(double rankine) {
		return CelsiusToKelvin(RankineToCelsius(rankine));
	}

	double RankineToReaumer(double rankine) {
		return FahrenheitToReaumer(RankineToFahrenheit(rankine));
	}

	double CelsiusToRankine(double celsius) {
		return FahrenheitToRankine(CelsiusToFahrenheit(celsius));
	}

	double FahrenheitToRankine(double fahrenheit) {
		return fahrenheit + 459.67;
	}

	double KelvinToRankine(double kelvin) {
		return CelsiusToRankine(KelvinToCelsius(kelvin));
	}

	double ReaumerToRankine(double reaumer) {
		return FahrenheitToRankine(ReaumerToFahrenheit(reaumer));
	}

	// Pressure
	double hPaToPascals(double hPa) {
		return hPa * 100;
	}

	double hPaToBar(double hPa) {
		return PascalsToBar(hPaToPascals(hPa));
	}

	double BarTohPa(double bar) {
		return PascalsTohPa(BarToPascals(bar));
	}

	double BarToPascals(double bar) {
		return bar * 100000;
	}

	double PascalsToBar(double pascals) {
		return pascals / 100000;
	}

	double PascalsTohPa(double pascals) {
		return pascals / 100;
	}

	double BarTomBar(double bar) {
		return bar * 1000;
	}

	double mBarToBar(double mBar) {
		return mBar / 1000;
	}

	double hPaTomBar(double hPa) {
		return hPa;
	}

	double mBarTomhPa(double mBar) {
		return mBar;
	}

	double PascalsTomBar(double Pascals) {
		return PascalsTohPa(Pascals);
	}

	double mBarToPascals(double mBar) {
		return hPaToPascals(mBar);
	}

	// Pound force per square inch (Psi)
	// Atmospheres (atm)
	// mBar
	// inch Hg

}
