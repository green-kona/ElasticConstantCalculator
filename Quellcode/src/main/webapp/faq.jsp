<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="de">
<head>
    <meta charset="utf-8"/>
    <title>FAQ</title>
    <link rel="stylesheet" href="content/style.css">
</head>
<div id="header">
    <img src="content/htw_logo.png" align="left" alt="HTW-Logo">
    Projektstudium s78218
    <div id="groß">FAQ</div>
</div>
<nav id="navigation">
    <a class="auf" href="https://www.htw-dresden.de/fakultaet-geoinformation.html">HOME</a>
    <a class="auf" href="index.jsp">ANWENDUNG</a>
    <a class="auf" href="faq.jsp">FAQ</a>
    <a class="auf" href="kontakt.jsp">KONTAKT</a>
    <a class="auf"
       href="https://www.researchgate.net/publication/328557790_Determining_the_influence_of_pressure_and_temperature_on_the_elastic_constants_of_anisotropic_rock_samples_using_ultrasonic_wave_techniques">LITERATUR</a>
    <a class="auf" href="https://github.com/green-kona/ElasticConstantCalculator">REPOSITORIUM</a>
    <a class="auf" href="impressum.jsp">DISCLAIMER & IMPRESSUM</a>
</nav>

<body>

<p>
    <strong>Wozu dient das Programm?</strong>
    <br>
    Diese Seite ist Teil eines Projektstudiums an der HTW-Dresden und ist in dieser Form nur im Rahmen der Projektbewertung durch den Dozenten online.
    <br>
    Eine überarbeitete Seite wird online gestellt, sobald weitere Symetrien und der Multidatenupload implementiert sind. Behalten sie bei Interesse einfach das verlinkte GIT-Repositorium im Auge.
</p>


<p>
    <strong>Welche Funktionalität besitzt das Programm?</strong>
    <br>
    Dieses Programm kann zur Berechnung elastischer Konstanten und Anisotropieparametern genutzt werden. Weitere Informationen dazu erhalten Sie, wenn Sie sich das verlinkte Whitepaper anschauen.
</p>

<p>
    <strong>Welche Symmetrien werden gegenwärtig unterstützt?</strong>
    <br>
    Gegenwärtig wird nur die orthothropische (orthorhombische) Symmetrie unterstützt, die Unterstützung der isotropen und vertikal-transversal-isotropen (VTI) Symmetrie ist in Planung.
</p>

<p>
    <strong>Gibt es die Möglichkeit zum Multidatenupload?</strong>
    <br>
    Momentan besteht nur die Möglichkeit der Berechnung von Einzeldatensätzen über die graphische Benutzeroberfläche. Ein textdatenbasierter-Bulkuploader ist bereits in Arbeit.
</p>

<p>
    <strong>Hilfe, ich habe die Benachrichtigung erhalten, dass ich gültige Parameter eintragen soll?</strong>
    <br>
    Den Parametern dürfen nur gültige Werte übergeben werden. Eine Wellengeschwindigkeit oder Dichte von 0 ist daher leider nicht möglich.
</p>

<p>
    <strong>Hilfe, ich habe Konstanten oder Parameter mit dem Wert NAN erhalten</strong>
    <br>
    Diese Ausgabe weist darauf hin, dass die von Ihnen übergebenen Parameter nicht korrelieren und dadurch in nicht defininierte Ergebnismengen prdouzieren (d.h. ihre Werte sind falsch oder ungenau gemessen).

</p>

</body>
</html>
