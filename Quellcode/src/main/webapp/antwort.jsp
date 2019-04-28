<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="de">
<head>
    <meta charset="utf-8"/>
    <title>Datenausgabe</title>
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

<!-- Skript überprüft, ob im bisherigen Verlauf versucht wurde, das Nummernfeld der Eingabe zu umgehen oder ungültige Werte (0) übergeben wurden -->
<script>
    function test(x) {
        if (x == 0) {
            alert("Bitte geben sie gültige Werte ein!");
            window.history.back();
        }
    }
    test(${checkParameter});
</script>

<h2>
    Ergebnisse der elastischen Konstanten und Anisotropieparameter für orthothropische Medien
</h2>

<table id="ergebnistabelle" border="0" align="center" width="80%" cellpadding="8">
    <th>
        <tr>
            <td id="out1" colspan="6">Elastische Konstanten</td>
        </tr>
    </th>
    <tr>
        <td id="out2">C11</td>
        <td id="out2">C22</td>
        <td id="out2">C33</td>
        <td id="out2">C44</td>
        <td id="out2">C55</td>
        <td id="out2">C66</td>
    </tr>
    <tr>
        <td id="out3">${c11}</td>
        <td id="out3">${c22}</td>
        <td id="out3">${c33}</td>
        <td id="out3">${c44}</td>
        <td id="out3">${c55}</td>
        <td id="out3">${c66}</td>
    </tr>
    <tr>
        <td id="out2" colspan="2">C12</td>
        <td id="out2" colspan="2">C13</td>
        <td id="out2" colspan="2">C23</td>
    </tr>
    <tr>
        <td id="out3" colspan="2">${c12}</td>
        <td id="out3" colspan="2">${c13}</td>
        <td id="out3" colspan="2">${c23}</td>
    </tr>
    <th>
        <tr>
            <td id="out1" colspan="6">Thomsen-Anisotropieparameter</td>
        </tr>
    </th>
    <tr>
        <td id="out2" colspan="3">VP0</td>
        <td id="out2" colspan="3">VS0</td>
    </tr>
    <tr>
        <td id="out3" colspan="3">${vp0}</td>
        <td id="out3" colspan="3">${vs0}</td>
    </tr>
    <tr>
        <td id="out2" colspan="3">&epsi;-1</td>
        <td id="out2" colspan="3">&epsi;-2</td>
    </tr>
    <tr>
        <td id="out3" colspan="3">${epsilon1}</td>
        <td id="out3" colspan="3">${epsilon2}</td>
    </tr>
    <tr>
        <td id="out2" colspan="3">&gamma;-1</td>
        <td id="out2" colspan="3">&delta;-2</td>
    </tr>
    <tr>
        <td id="out3" colspan="3">${gamma1}</td>
        <td id="out3" colspan="3">${gamma2}</td>
    </tr>
    <th>
        <tr>
            <td id="out1" colspan="6">Tsvankin-Anisotropieparameter</td>
        </tr>
    </th>
    <tr>
        <td id="out2" colspan="2">&delta;-1</td>
        <td id="out2" colspan="2">&delta;-2</td>
        <td id="out2" colspan="2">&delta;-3</td>
    </tr>
    <tr>
        <td id="out3" colspan="2">${delta1}</td>
        <td id="out3" colspan="2">${delta2}</td>
        <td id="out3" colspan="2">${delta3}</td>
    </tr>
</table>

</body>
</html>