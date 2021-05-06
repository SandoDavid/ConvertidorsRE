
/**
 * @author garro
 *
 */
public class Temps {
	private double segons;

    /**
     * @param segons
     */
    public Temps(double segons) {
	this.segons = segons;
    }

    /**
     * @param segons
     */
    public void setSegons(double segons) {
	this.segons = segons;
    }

    /**
     * @return
     */
    public double getSegons() {
	return this.segons;
    }

    /**
     * @param minuts
     */
    public void setMinuts(double minuts) {
	this.segons = segons / 60;
    }

    /**
     * @return
     */
    public double getMinuts() {
	return this.segons * 60;
    }

    /**
     * @param hores
     */
    public void setHores(double hores) {
	this.segons = segons / 3600;
    }

    /**
     * @return
     */
    public double getHores() {
	return this.segons * 3600;
    }

    /**
     * @param ms
     */
    public void setMS(double ms) {
	this.segons = segons / 1000;
    }

    /**
     * @return
     */
    public double getMS() {
	return this.segons * 1000;
    }

    /**
     * @param hores
     * @param minuts
     * @param segons
     * @param ms
     */
    public void setHMSM(double hores, double minuts, double segons, double ms) {
	this.segons = hores * 3600 + minuts * 60 + segons + ms / 1000;
    }
}
