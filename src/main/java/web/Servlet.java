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
        String resFormula = request.getParameter("res");

        switch (opcion) {
            case "1":
               
                //ALAN
                out.print("<html>");
                out.print("<head>");
                out.print("<title>Formula general</title>");
                out.print("<script type='text/javascript' src='recursos/calculos.js'></script>");
                out.print("</head>");
                out.print("<body>");
                out.print("<h1>Dame los valores: </h1>");
                //action='/Manejo_Headers/ServletHeader' method='post' Va antes del onSubmit3
                //onsubmit='return calcularGeneral()'
                out.print("<form action='/Manejo_Headers/index.html' >");
                out.print("<table width='200' id='enfasis-columnas'><tr>");
                out.print("<td class='columna'>Valor A:</td><td><input type'text' name='val_1' id='val_1' onfocus='this.select()'></td><tr>");
                out.print("<td class='columna'>Valor B:</td><td><input type='text' name='val_2' id='val_2' onfocus='this.select()'></td></tr><tr>");
                out.print("<td class='columna'>Valor C:</td><td><input type='text' name='val_3' id='val_3' onfocus='this.select()'></td></tr><tr>");
                out.print("<tr style='text-align: center'>" + "<td>" + "<button class='default' onClick='calcularGeneral()'> Calcular </button>" + "</td>" + "</tr>");
                out.print("<tr style='text-align: center'><td class'columna' id='res1'>Resultado 1: </td></tr>");
                out.print("<tr style='text-align: center'><td class'columna' id='res2'>Resultado 2: </td></tr>");
                out.print("</table></form>");
                out.print("<br>");
                out.print("</body>");
                out.print("</html>");
                out.close();
                break;

            case "2":
                out.print("<html>");
                out.print("<head>");
                out.print("<title>Números primos</title>");
                out.print("<script type='text/javascript' src='recursos/calculos.js'></script>");
                out.print("</head>");
                out.print("<body>");
                out.print("<h1>Números primos: </h1>");
                out.print("<h4>Dame el número: </h4>");
                out.print("<form action='/Manejo_Headers/index.html'>");
                out.print("<table width='200' id='enfasis-columnas'><tr>");
                out.print("<td class='columna'>Número: </td><td><input type'text' name='val_1' value ='cantidadNum' id='cantidadNum' onfocus='this.select()'></td><tr>");
               // out.print("<td class='columna'>Resultado: </td><td><input type='text' name='txt_resultadoPRIM' onfocus='this.select()'></td><tr>");
                out.print("<tr style='text-align: center'><td><button type='submit' onClick='miPrimo()' value='Vamonos'>PICAME</button></td></tr>");

                out.print("</table></form>");

                out.print("</body>");
                out.print("</html>");
                out.close();
                break;

            case "3":
                out.print("<html>");
                out.print("<head>");
                out.print("<title>Triángulo</title>");
                out.print("<script type='text/javascript' src='recursos/calculos.js'></script>");
                out.print("</head>");
                out.print("<body>");
                out.print("<h1>Tipo de triángulo</h1>");
                out.print("<h4>Introduce los valores: </h4>");
                out.print("<form action='/Manejo_Headers/index.html'>");
                out.print("<table width='200' id='enfasis-columnas'><tr>");
                out.print("<td class='columna'>Lado A: </td><td><input type'text' name='val_1' id='val_1' onfocus='this.select()'></td><tr>");
                out.print("<td class='columna'>Lado B: </td><td><input type='text' name='val_2' id='val_2' onfocus='this.select()'></td></tr><tr>");
                out.print("<td class='columna'>Lado C:</td><td><input type='text' name='val_3' id='val_3' onfocus='this.select()'></td></tr><tr>");
                //out.print("<td class='columna'>Resultado: </td><td><input type='text' id='txt_resultado' onfocus='this.select()'/></td><tr>");
                out.print("<tr style='text-align: center'><td><button class='default' onClick='Triangulo()'> Verificar </button></td></tr>");

                out.print("</table></form>");

                out.print("</body>");
                out.print("</html>");
                out.close();

                break;
            default:
                out.print("<html>");
                out.print("<head>");
                out.print("<title>Formula general</title>");
                out.print("<script type='text/javascript' src='recursos/calculo.js'></script>");
                out.print("</head>");
                out.print("<body>");
                out.print("<h1>Formula general: </h1>");
                out.print("<h4>Introduce los valores: </h4>");
                out.print("<form action='/Manejo_Headers/ServletH' method='post' onsubmit='return validarForma(this)'>");
                out.print("<table width='200' id='enfasis-columnas'><tr><td class='columna'>Valor A: </td>");
                out.print("<td><input type'text' name='val_1' value = 'primer valor' onfocus='this.select()'></td><tr>");
                out.print("<td class='columna'>Valor B: </td><td><input type='text' name='val_2' onfocus='this.select()'></td></tr><tr>");
                out.print("<td class='columna'>Valor C:</td><td><input type='text' name='val_3' onfocus='this.select()'></td></tr><tr>");
                out.print("<td class='columna'>Resultado: </td><td><input type='text' name='txt_resultado' onfocus='this.select()'></td><tr>");
                out.print("<tr style='text-align: center'><td><input type='submit' value='Vamonos' class='default'></td></tr>");

                out.print("</table></form>");

                out.print("</body>");
                out.print("</html>");
                out.close();
                break;
        }

    }
}
