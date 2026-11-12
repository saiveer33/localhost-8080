HTML
<html>
<body>
<h2>Student Details</h2>

<form action="display" method="post">
    Name: <input type="text" name="name"><br><br>
    Age: <input type="text" name="age"><br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>

Displayservlet
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayServlet extends HttpServlet
{
    public void doPost(HttpServletRequest req,
                       HttpServletResponse res)
                       throws IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");
        String age = req.getParameter("age");

        out.println("<h2>Student Details</h2>");
        out.println("Name: " + name + "<br>");
        out.println("Age: " + age);
    }
}
2)






2)
XML
<web-app>

    <context-param>
        <param-name>college</param-name>
        <param-value>ABC College</param-value>
    </context-param>

    <servlet>
        <servlet-name>MyServlet</servlet-name>
        <servlet-class>MyServlet</servlet-class>

        <init-param>
            <param-name>username</param-name>
            <param-value>Student</param-value>
        </init-param>
    </servlet>

    <servlet-mapping>
        <servlet-name>MyServlet</servlet-name>
        <url-pattern>/test</url-pattern>
    </servlet-mapping>

</web-app>

Java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req,
                      HttpServletResponse res)
                      throws IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        ServletConfig config = getServletConfig();

        String user = config.getInitParameter("username");

        ServletContext context = getServletContext();

        String college = context.getInitParameter("college");

        out.println("<h2>Initialization Parameters</h2>");
        out.println("ServletConfig: " + user + "<br>");
        out.println("ServletContext: " + college);
    }
}
