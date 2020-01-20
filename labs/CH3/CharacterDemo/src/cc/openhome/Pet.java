package cc.openhome;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pet")
public class Pet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        /*
         * 完成範例1到3的內容
         * */
        out.println("<html>");
        out.println("<head>");
        out.println("<title>感謝填寫</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("聯絡人：<a href='mailto:"+
                /* 步驟4 */ + "'>" +
                /* 步驟4 */ + "</a>");
        out.println("<br>喜愛的寵物類型");
        out.println("<ul>");
        /* 步驟 5 */
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
