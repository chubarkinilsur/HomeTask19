package stc21; /**
 * @autor Ilsur Chubarkin
 * EJB Servelet
 */

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * Выполнено согласно заданию
 */
@WebServlet(urlPatterns = "/files")
public class EjbServelet extends HttpServlet {
    @EJB()
    Recursion recursion;

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String baseDir = System.getProperty("user.dir");
        File file = new File(baseDir);
        request.setAttribute("files", recursion.showFiles(file));
        request.getRequestDispatcher("/files.jsp").include(request, response);
    }
}
