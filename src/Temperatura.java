
/**
 * @author garro
 *
 */
public class Temperatura {
	private double kelvin;

    /**
     * @param kelvin
     */
    public Temperatura(double kelvin) {
	this.kelvin = kelvin;
    }

    /**
     * @param kelvin
     */
    public void setKelvin(double kelvin) {
	this.kelvin = kelvin;
    }

    /**
     * @return
     */
    public double getKelvin() {
	return this.kelvin;
    }

    /**
     * @param celsius
     */
    public void setCelsius(double celsius) {
	this.kelvin = kelvin - 273.15;
    }

    /**
     * @return
     */
    public double getCelsius() {
	return this.kelvin + 273.15;
    }

    /**
     * @param fahrenheit
     */
    public void setFahrenheit(double fahrenheit) {
	this.kelvin = 9 * (kelvin - 273.15) / 5 + 32;
    }

    /**
     * @return
     */
    public double getFahrenheit() {
	return (9 / (kelvin + 273.15) * 5 - 32);
    }
}
