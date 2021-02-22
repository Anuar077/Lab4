package Session;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class FirstServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response){
        try{

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String n=request.getParameter("userName");
            out.print("Welcome "+n);

            Cookie ck=new Cookie("uname",n);//creating cookie object
            response.addCookie(ck);//adding cookie in the response

            //creating submit button
            out.print("<form action='servlet2'>");
            out.print("<button type=\"submit\" formaction=\"http://localhost:8080/Lab4_war_exploded/index.html\" color=\"white\">Main</button>");
            out.print("</form>");

            out.close();

        }catch(Exception e){System.out.println(e);}
    }
}