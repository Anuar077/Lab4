package HiddenFromField;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SecondServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //Getting the value from the hidden field
        String n=request.getParameter("uname");
        out.print("Hello "+n);
        out.print("<button type=\"submit\" formaction=\"http://localhost:8080/Lab4_war_exploded/index.html\" color=\"white\">Main</button>");
        out.close();
    }catch(Exception e){System.out.println(e);}
}
}