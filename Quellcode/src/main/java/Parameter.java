/**
 * Klasse zum Erstellen von Parameter-Objekten mit den Attributen für elastische Konstanten oder Anisotropieparameter.
 * Resultate werden durch ExpressionLanguage an das *.jsp Frontend weitergereicht.
 *
 * @author Jakob Mager.
 */
public class Parameter {

    double c11 = 0;
    double c22 = 0;
    double c33 = 0;
    double c44 = 0;
    double c55 = 0;
    double c66 = 0;
    double c12 = 0;
    double c13 = 0;
    double c23 = 0;
    double vp0 = 0;
    double vs0 = 0;
    double epsilon1 = 0;
    double epsilon2 = 0;
    double gamma1 = 0;
    double gamma2 = 0;
    double delta1 = 0;
    double delta2 = 0;
    double delta3 = 0;
    double checkParameter;

    /**
     * Methode zur Berechnung der Konstanten und Anisotropieparameter und des Prüfparameters.
     *
     * @param rho   Dichte
     * @param vpx   In x-schwingende Kompressionswelle
     * @param vpy   In y-schwingende Kompressionswelle
     * @param vpz   In z-schwingende Kompressionswelle
     * @param vszy  z-laufende, y-schwingende Transversalwelle
     * @param vsyz  y-laufende, z-schwingende Transversalwelle
     * @param vszx  z-laufende, x-schwingende Transversalwelle
     * @param vsxz  x-laufende, z-schwingende Transversalwelle
     * @param vsxy  x-laufende, y-schwingende Transversalwelle
     * @param vsyx  y-laufende, x-schwingende Transversalwelle
     * @param vp45x 45° zwischen x und z einfallende Kompressionswelle
     * @param vp45y 45° zwischen y und z einfallende Kompressionswelle
     * @param vp45z 45° zwischen x und y einfallende Kompressionswelle
     */
    public void setElastischeKonstanten(
            double rho,
            double vpx,
            double vpy,
            double vpz,
            double vszy,
            double vsyz,
            double vszx,
            double vsxz,
            double vsxy,
            double vsyx,
            double vp45x,
            double vp45y,
            double vp45z
    ) {
        this.c11 = rho * Math.pow(vpx, 2);
        this.c22 = rho * Math.pow(vpy, 2);
        this.c33 = rho * Math.pow(vpz, 2);
        this.c44 = (rho * Math.pow(vszy, 2) + rho * Math.pow(vsyz, 2)) / 2;
        this.c55 = (rho * Math.pow(vszx, 2) + rho * Math.pow(vsxz, 2)) / 2;
        this.c66 = (rho * Math.pow(vsxy, 2) + rho * Math.pow(vsyx, 2)) / 2;
        this.c12 = Math.sqrt(4 * Math.pow(vp45x, 4) * Math.pow(rho, 2) - 2 * Math.pow(vp45x, 2) * c11 * rho - 2 * Math.pow(vp45x, 2) * c22 * rho - 4 * Math.pow(vp45x, 2) * c66 * rho + c11 * c22 + c11 * c66 + c22 * c66 + Math.pow(c66, 2)) - c66;
        this.c13 = Math.sqrt(4 * Math.pow(vp45y, 4) * Math.pow(rho, 2) - 2 * Math.pow(vp45y, 2) * c11 * rho - 2 * Math.pow(vp45y, 2) * c33 * rho - 4 * Math.pow(vp45y, 2) * c55 * rho + c11 * c33 + c11 * c55 + c33 * c55 + Math.pow(c55, 2)) - c55;
        this.c23 = Math.sqrt(4 * Math.pow(vp45z, 4) * Math.pow(rho, 2) - 2 * Math.pow(vp45z, 2) * c22 * rho - 2 * Math.pow(vp45z, 2) * c44 * rho - 4 * Math.pow(vp45z, 2) * c44 * rho + c22 * c33 + c22 * c44 + c33 * c44 + Math.pow(c44, 2)) - c44;
        this.vp0 = Math.sqrt((c33 / rho));
        this.vs0 = Math.sqrt((c55 / rho));
        this.epsilon1 = (c22 - c33) / (2 * c33);
        this.epsilon2 = (c11 - c33) / (2 * c33);
        this.gamma1 = (c66 - c55) / (2 * c55);
        this.gamma2 = (c66 - c44) / (2 * c44);
        this.delta1 = (Math.pow((c23 + c44), 2) - Math.pow((c33 + c44), 2)) / (2 * c33) * (c33 - c44);
        this.delta2 = (Math.pow((c13 + c55), 2) - Math.pow((c33 + c55), 2)) / (2 * c33) * (c33 - c55);
        this.delta3 = (Math.pow((c12 + c66), 2) - Math.pow((c11 + c66), 2)) / (2 * c11) * (c11 - c66);
        this.checkParameter = rho * vpx * vpy * vpz * vszy * vsyz * vszx * vsxz * vsxy * vsyx * vp45x * vp45y * vp45z;
    }

    /**
     * @return Gibt elastische Konstante zurück.
     */
    public double getC11() {
        return c11;
    }

    /**
     * @return Gibt elastische Konstante zurück.
     */
    public double getC22() {
        return c22;
    }

    /**
     * @return Gibt elastische Konstante zurück.
     */
    public double getC33() {
        return c33;
    }

    /**
     * @return Gibt elastische Konstante zurück.
     */
    public double getC44() {
        return c44;
    }

    /**
     * @return Gibt elastische Konstante zurück.
     */
    public double getC55() {
        return c55;
    }

    /**
     * @return Gibt elastische Konstante zurück.
     */
    public double getC66() {
        return c66;
    }

    /**
     * @return Gibt elastische Konstante zurück.
     */
    public double getC12() {
        return c12;
    }

    /**
     * @return Gibt elastische Konstante zurück.
     */
    public double getC13() {
        return c13;
    }

    /**
     * @return Gibt elastische Konstante zurück.
     */
    public double getC23() {
        return c23;
    }

    /**
     * @return Gibt Standard-Anisotropieparameter der Kompressionswelle zurück.
     */
    public double getVp0() {
        return vp0;
    }

    /**
     * @return Gibt Standard-Anisotropieparameter der Transversalwelle zurück.
     */
    public double getVs0() {
        return vs0;
    }

    /**
     * @return Gibt Thomsen-Anisotropieparameter zurück.
     */
    public double getEpsilon1() {
        return epsilon1;
    }

    /**
     * @return Gibt Thomsen-Anisotropieparameter zurück.
     */
    public double getEpsilon2() {
        return epsilon2;
    }

    /**
     * @return Gibt Thomsen-Anisotropieparameter zurück.
     */
    public double getGamma1() {
        return gamma1;
    }

    /**
     * @return Gibt Thomsen-Anisotropieparameter zurück.
     */
    public double getGamma2() {
        return gamma2;
    }

    /**
     * @return Gibt Tsvankin-Anisotropieparameter zurück.
     */
    public double getDelta1() {
        return delta1;
    }

    /**
     * @return Gibt Tsvankin-Anisotropieparameter zurück.
     */
    public double getDelta2() {
        return delta2;
    }

    /**
     * @return Gibt Tsvankin-Anisotropieparameter zurück.
     */
    public double getDelta3() {
        return delta3;
    }

    /**
     * @return Prüfparameter für das Frontend, welcher bei Fehleingaben oder Manipulationen des Number Eingabefelds eine Warnung im Frontend ausgibt.
     */
    public double getCheckParameter() {
        return checkParameter;
    }
}

