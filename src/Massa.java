
/**
 * @author garro
 *
 */
public class Massa {
	private double kg;

    /**
     * @param kg
     */
    public Massa(double kg) {
	this.kg = kg;
    }

    /**
     * @param kg
     */
    public void setKg(double kg) {
	this.kg = kg;
    }

    /**
     * @return
     */
    public double getKg() {
	return this.kg;
    }

    /**
     * @param mg
     */
    public void setMGrams(double mg) {
	this.kg = mg / 1000000;
    }

    /**
     * @return
     */
    public double getMGrams() {
	return this.kg * 1000000;
    }

    /**
     * @param gm
     */
    public void setGrams(double gm) {
	this.kg = gm / 1000;
    }

    /**
     * @return
     */
    public double getGrams() {
	return this.kg * 0.001;
    }

    /**
     * @param ozRebudes
     */
    public void setPolzada(double ozRebudes) {
	this.kg = ozRebudes * 0.0283495;
    }

    /**
     * @return
     */
    public double getPolzada() {
	return this.kg * 35.274;
    }

    /**
     * @param lliuraRebuda
     */
    public void setLb(double lliuraRebuda) {
	this.kg = lliuraRebuda * 0.453592;
    }

    /**
     * @return
     */
    public double getLb() {
	return this.kg * 2.20462;
    }

    /**
     * @param tonaRebuda
     */
    public void setTona(double tonaRebuda) {
	this.kg = tonaRebuda * 0.001;
    }

    /**
     * @return
     */
    public double getTona() {
	return this.kg * 1000;
    }
}
