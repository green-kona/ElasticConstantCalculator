import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jakob Mager.
 * @version 1.0.
 * Wellengeschwindigkeiten und Dichte werden aus dem POST-request in Variablen-Objekte hinterlegt.
 * Parameter-Objekt wird initialisert und anschließend mit Konstanten und Anisotropieparametern attributiert.
 * Request für Parameter-Objekt wird Bezeichner als Attribut mitgegeben, erlaubt Zugriff vom Frontend durch ExpressionLanguage.
 * Objekt, dass das Servlet zur Verfügung stellt wird in lokale Variable geschrieben.
 * Antwort und Antwortobjekt wird weitergeleitet.
 */
public class Elcon extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* Wellengeschwindigkeiten und Dichte werden aus dem POST-request in Variablen-Objekte hinterlegt. */

        Variable vrho = new Variable();
        vrho.setRho(req.getParameter("rho"));
        Variable vpx = new Variable();
        vpx.setGeschwindigkeit(req.getParameter("vpx"));
        Variable vpy = new Variable();
        vpy.setGeschwindigkeit(req.getParameter("vpy"));
        Variable vpz = new Variable();
        vpz.setGeschwindigkeit(req.getParameter("vpz"));
        Variable vsxy = new Variable();
        vsxy.setGeschwindigkeit(req.getParameter("vsxy"));
        Variable vsyx = new Variable();
        vsyx.setGeschwindigkeit(req.getParameter("vsyx"));
        Variable vszy = new Variable();
        vszy.setGeschwindigkeit(req.getParameter("vszy"));
        Variable vsyz = new Variable();
        vsyz.setGeschwindigkeit(req.getParameter("vsyz"));
        Variable vsxz = new Variable();
        vsxz.setGeschwindigkeit(req.getParameter("vsxz"));
        Variable vszx = new Variable();
        vszx.setGeschwindigkeit(req.getParameter("vszx"));
        Variable vp45x = new Variable();
        vp45x.setGeschwindigkeit(req.getParameter("vp45x"));
        Variable vp45y = new Variable();
        vp45y.setGeschwindigkeit(req.getParameter("vp45y"));
        Variable vp45z = new Variable();
        vp45z.setGeschwindigkeit(req.getParameter("vp45z"));

        /* Parameter-Objekt wird initialisert und anschließend mit Konstanten und Anisotropieparametern attributiert */
        Parameter orthothrop = new Parameter();
        orthothrop.setElastischeKonstanten(
                vrho.getRho(),
                vpx.getGeschwindigkeit(),
                vpy.getGeschwindigkeit(),
                vpz.getGeschwindigkeit(),
                vszy.getGeschwindigkeit(),
                vsyz.getGeschwindigkeit(),
                vszx.getGeschwindigkeit(),
                vsxz.getGeschwindigkeit(),
                vsxy.getGeschwindigkeit(),
                vsxy.getGeschwindigkeit(),
                vp45x.getGeschwindigkeit(),
                vp45y.getGeschwindigkeit(),
                vp45z.getGeschwindigkeit());

        /* Debug: gezielten Ausgabe von Objekten */
        // ServletOutputStream out = resp.getOutputStream();
        // out.println(vp45x.getGeschwindigkeit());


        /* Request für Parameter-Objekt wird "c11" als Attribut mitgegeben,
         erlaubt Zugriff vom Frontend durch ExpressionLanguage*/

        req.setAttribute("c11", orthothrop.getC11());
        req.setAttribute("c22", orthothrop.getC22());
        req.setAttribute("c33", orthothrop.getC33());
        req.setAttribute("c44", orthothrop.getC44());
        req.setAttribute("c55", orthothrop.getC55());
        req.setAttribute("c66", orthothrop.getC66());
        req.setAttribute("c12", orthothrop.getC12());
        req.setAttribute("c13", orthothrop.getC13());
        req.setAttribute("c23", orthothrop.getC23());
        req.setAttribute("vp0", orthothrop.getVp0());
        req.setAttribute("vs0", orthothrop.getVs0());
        req.setAttribute("epsilon1", orthothrop.getEpsilon1());
        req.setAttribute("epsilon2", orthothrop.getEpsilon2());
        req.setAttribute("gamma1", orthothrop.getGamma1());
        req.setAttribute("gamma2", orthothrop.getGamma2());
        req.setAttribute("delta1", orthothrop.getDelta1());
        req.setAttribute("delta2", orthothrop.getDelta2());
        req.setAttribute("delta3", orthothrop.getDelta3());
        req.setAttribute("checkParameter", orthothrop.getCheckParameter());

        // Objekt, dass das Servlet zur Verfügung stellt wird in lokale Variable geschrieben
        RequestDispatcher dispatcher = req.getRequestDispatcher("/antwort.jsp");
        // leitet Antwort und Antwortobjekt weiter
        dispatcher.forward(req, resp);
    }
}

