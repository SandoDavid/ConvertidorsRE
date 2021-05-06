
/**
 * @author garro
 *
 */
public class Longitud {
	private double metre;

    /**
     * @param metre
     */
    public Longitud(double metre) {
	this.metre = metre;
    }

    /**
     * @param metre
     */
    public void setM(double metre) {
	this.metre = metre;
    }

    /**
     * @return
     */
    public double getM() {
	return this.metre;
    }

    /**
     * @param km
     */
    public void setKm(double km) {
	this.metre = km * 1000;
    }

    /**
     * @return
     */
    public double getKm() {
	return this.metre / 1000;
    }

    /**
     * @param cm
     */
    public void setMM(double cm) {
	this.metre = cm / 1000;
    }

    /**
     * @return
     */
    public double getMM() {
	return this.metre * 1000;
    }

    /**
     * @param polzadesRebudes
     */
    public void setPolzada(double polzadesRebudes) {
	this.metre = polzadesRebudes * 0.0254;
    }

    /**
     * @return
     */
    public double getPolzada() {
	return this.metre * 39.3701;
    }

    /**
     * @param peuRebut
     */
    public void setPeu(double peuRebut) {
	this.metre = peuRebut * 0.3048;
    }

    /**
     * @return
     */
    public double getPeu() {
	return this.metre * 3.28084;
    }

    /**
     * @param iardaRebuda
     */
    public void setIarda(double iardaRebuda) {
	this.metre = iardaRebuda * 0.9144;
    }

    /**
     * @return
     */
    public double getIarda() {
	return this.metre * 1.09361;
    }

    /**
     * @param millaRebuda
     */
    public void setMilla(double millaRebuda) {
	this.metre = millaRebuda * 0.000621371;
    }

    /**
     * @return
     */
    public double getMilla() {
	return this.metre * 1609.34;
    }

    /**
     * @param lleguaRebuda
     */
    public void setLlegua(double lleguaRebuda) {
	this.metre = lleguaRebuda * 0.000207124;
    }

    /**
     * @return
     */
    public double getLlegua() {
	return this.metre * 4828.03;
    }
}
