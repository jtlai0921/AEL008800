package cc.openhome;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 步驟1 */
public class Avatar extends HttpServlet {
    private String AVATAR_DIR;

    @Override
    public void init() throws ServletException {
        /* 步驟2 */
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>頭像顯示</title>");
        out.println("</head>");
        out.println("<body>");
        for (String avatar : getServletContext()
                                .getResourcePaths(AVATAR_DIR)) {
            avatar = avatar.replaceFirst("/", "");
            out.println("<img src='" + avatar + "'>");
        }
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
