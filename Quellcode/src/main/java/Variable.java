/**
 * Klasse zum erstellen von Variablen-Objekten mit den Attributen Geschwindigkeit oder Dichte.
 * Eingabeparameter werden durch einen Regex-String validiert und ansonsten nicht übergeben.
 * In diesem Fall wird Geschwindigkeit auf 0 gesetzt, was im Frontend eine Warnung auslöst.
 * Resultate werden zur Berechnung von Parametern genutzt.
 *
 * @author Jakob Mager.
 */
public class Variable {

    private double rho = 0;
    private double geschwindigkeit = 0;
    private String regex = "^[0-9]+.?[0-9]*$";

    /**
     * @return Gibt die gespeicherte Geschwindigkeit einer elastischen Welle als double aus.
     */
    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    /**
     * @param geschwindigkeit Aus dem Eingangsformular als String übergebene Geschwindigkeit, welche gegen Regex-String validiert wird.
     */
    public void setGeschwindigkeit(String geschwindigkeit) {
        if (geschwindigkeit.matches(regex)) {
            try {
                this.geschwindigkeit = Double.parseDouble(geschwindigkeit);
            } catch (NumberFormatException e) {
                System.out.println("Eine oder mehrere Eingaben sind keine Zahl");
            }
        } else {
            this.geschwindigkeit = 0;
        }
    }

    /**
     * @return Gibt die gespeichterte Dichte (rho) als double aus.
     */
    public double getRho() {
        return rho;
    }

    /**
     * @param rho Aus dem Eingangsformular als String übergebene Dichte, welche gegen Regex-String validiert wird.
     */
    public void setRho(String rho) {
        if (rho.matches(regex)) {
            try {
                this.rho = Double.parseDouble(rho);
            } catch (NumberFormatException e) {
                System.out.println("Eine oder mehrere Eingaben sind keine Zahl");
            }
        } else {
            this.rho = 0;
        }
    }


}