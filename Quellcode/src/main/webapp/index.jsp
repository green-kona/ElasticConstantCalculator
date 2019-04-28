<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="de">
<head>
    <meta charset="utf-8"/>
    <title>Projektstudium</title>
    <link rel="stylesheet" href="content/style.css">
</head>
<div id="header">
    <img src="content/htw_logo.png" align="left" alt="HTW-Logo">
    Projektstudium s78218
    <div id="groß">Anwendung zu Berechnung elastischer Konstanten anisotroper Medien</div>
</div>
<nav id="navigation">
    <a class="auf" href="https://www.htw-dresden.de/fakultaet-geoinformation.html">HOME</a>
    <a class="auf" href="index.jsp">ANWENDUNG</a>
    <a class="auf" href="faq.jsp">FAQ</a>
    <a class="auf" href="kontakt.jsp">KONTAKT</a>
    <a class="auf"
       href="https://www.researchgate.net/publication/328557790_Determining_the_influence_of_pressure_and_temperature_on_the_elastic_constants_of_anisotropic_rock_samples_using_ultrasonic_wave_techniques">WHITEPAPER</a>
    <a class="auf" href="https://github.com/green-kona/ElasticConstantCalculator">REPOSITORIUM</a>
    <a class="auf" href="impressum.jsp">DISCLAIMER & IMPRESSUM</a>
</nav>

<body>
<br>
<h2>
    Bitte geben sie die Parameter zur Berechnung orthothroper Medien ein
</h2>
<table border="0">
    <TR>
        <td id="ContainerLinks">
            <form action="ausgabe" method="POST" id="floatLinks">
                <table border="0" cellpadding="8">
                    <TR>
                        <td>&rho; [kg/&#13221;]</td>
                        <td><input type="number" name="rho" required="required" step="any" min=0></td>
                        <td>VP(X) [m/s]</td>
                        <td><input type="number" name="vpx" required="required" step="any" min=0></td>
                    </TR>
                    <TR>
                        <td>VP(Y) [m/s]</td>
                        <td><input type="number" name="vpy" required="required" step="any" min=0></td>
                        <td>VP(Z) [m/s]</td>
                        <td><input type="number" name="vpz" required="required" step="any" min=0></td>
                    </TR>
                    <TR>
                        <td>VS(XY) [m/s]</td>
                        <td><input type="number" name="vsxy" required="required" step="any" min=0></td>
                        <td>VS(YX) [m/s]</td>
                        <td><input type="number" name="vsyx" required="required" step="any" min=0></td>
                    </TR>
                    <TR>
                        <td>VS(ZY) [m/s]</td>
                        <td><input type="number" name="vszy" required="required" step="any" min=0></td>
                        <td>VS(YZ) [m/s]</td>
                        <td><input type="number" name="vsyz" required="required" step="any" min=0></td>
                    </TR>
                    <TR>
                        <td>VS(XZ) [m/s]</td>
                        <td><input type="number" name="vsxz" required="required" step="any" min=0></td>
                        <td>VS(ZX) [m/s]</td>
                        <td><input type="number" name="vszx" required="required" step="any" min=0></td>
                    </TR>
                    <TR>
                        <td>VP45(XZ)[m/s]</td>
                        <td><input type="number" name="vp45x" required="required" step="any" min=0></td>
                        <td>VP45(YZ)[m/s]</td>
                        <td><input type="number" name="vp45y" required="required" step="any" min=0></td>
                    </TR>
                    <TR>
                        <td>VP45(XY) [m/s]</td>
                        <td><input type="number" name="vp45z" required="required" step="any" min=0></td>
                        <br><br>
                        <td colspan="2" align="right"><input type="submit" value="Parameter berechnen"
                                                             id="submitButton">
                        </td>
                    </TR>
                    <TR>
                        <td><br></td>
                    </TR>
                    <TR>
                        <td><br></td>
                    </TR>
                </table>
            </form>
        </td>
        <td id="ContainerRechts">
            <figure id="Abbildung">
                <img id="Bild" src="content/Geschwindigkeiten.JPG" alt=" Abbildung seismischer Geschwindigkeiten">
                <figcaption id="Quelle">Quelle: Yin, Hezhu: Acoustic Velocity and Attenuation of Rocks: Isotrophy,
                    Intrinsic
                    Anisotropy, and Stress-induced Anisotrophy. Stanford, Stanford University, Dissertation, 1992
                </figcaption>
            </figure>
        </td>
    </TR>
</table>
</body>
</html>
