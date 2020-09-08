import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HelloServlet extends HttpServlet {
    private String servletName;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletName = config.getInitParameter("servletName");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        Date today = new java.util.Date();

        out.println("<html> <body>"

                + "<h1 align=center>Hello Servlet3!</h1><br> Today is:" + today

                + "</body> </html>");
    }
}
