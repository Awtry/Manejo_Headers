package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/ServletH")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String metodoHTTP = request.getMethod();
        String opcion = request.getParameter("opcion");

        switch (opcion) {
            case "1":
                out.print("<html>");
                out.print("<head>");
                out.print("<title>Formula general</title>");
                out.print("<script type='text/javascript' src='recursos/calculo.js'></script>");
                out.print("</head>");
                out.print("<body>");
                out.print("<h1>Dame los valores: </h1>");
                out.print("<form action='/Manejo_Headers/ServletHeader' method='post' onsubmit='return validarForma(this)'>");
                out.print("<table width='200' id='enfasis-columnas'><tr><td class='columna'>Valor A: </td>");
                out.print("<td><input type'text' name='val_1' value = 'primer valor' onfocus='this.select()'></td><tr>");
                out.print("<td class='columna'>Valor B: </td><td><input type='text' name='val_2' onfocus='this.select()'></td></tr><tr>");
                out.print("<td class='columna'>Valor C:</td><td><input type='text' name='val_3' onfocus='this.select()'></td></tr><tr>");
                out.print("<br>");

                out.print("</body>");
                out.print("</html>");
                out.close();
                break;

            case "2":
                out.print("<html>");
                out.print("<head>");
                out.print("<title>Headers HTTP</title>");
                out.print("</head>");
                out.print("<body>");
                out.print("<h1>Headers HTTP my darling</h1>");
                out.print("<b>Método http: </b>" + metodoHTTP);
                out.print("<br>");
                String uri = request.getRequestURI();
                out.print("<b>Uri solicitada: </b>" + uri);

                //Headers disponibles
                out.print("<br>");
                Enumeration cabeceros = request.getHeaderNames();
                while (cabeceros.hasMoreElements()) {
                    String nombreCabecero = (String) cabeceros.nextElement();
                    out.print("<b>" + nombreCabecero + "</b>");
                    out.print(request.getHeader(nombreCabecero));
                    out.print("<br>");
                    out.print("<br>");
                }

                out.print("</body>");
                out.print("</html>");
                out.close();
                break;

            case "3":
                out.print("<html>");
                out.print("<head>");
                out.print("<title>Headers HTTP</title>");
                out.print("</head>");
                out.print("<body>");
                out.print("<h1>Headers HTTP my darling</h1>");
                out.print("<b>Método http: </b>" + metodoHTTP);
                out.print("<br>");
                //String uri = request.getRequestURI();
                //out.print("<b>Uri solicitada: </b>" + uri);

                //Headers disponibles
                out.print("<br>");
                // Enumeration cabeceros = request.getHeaderNames();
                /*  while (cabeceros.hasMoreElements()) {
                    String nombreCabecero = (String) cabeceros.nextElement();
                    out.print("<b>" + nombreCabecero + "</b>");
                    out.print(request.getHeader(nombreCabecero));
                    out.print("<br>");
                    out.print("<br>");
                }
                 */
                out.print("</body>");
                out.print("</html>");
                out.close();

                break;
            default:
                out.print("<html>");
                out.print("<head>");
                out.print("<title>Headers HTTP</title>");
                out.print("</head>");
                out.print("<body>");
                out.print("<h1>BATEADO</h1>");
                out.print("<h1>Headers HTTP my darling</h1>");
                out.print("<b>Método http: </b>" + metodoHTTP);
                out.print("<br>");
              
                out.print("</body>");
                out.print("</html>");
                out.close();
                break;
        }

    }
}
