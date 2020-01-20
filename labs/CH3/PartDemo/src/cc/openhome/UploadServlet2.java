package cc.openhome;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

//完成標號1內容
@WebServlet("/upload2.do")
public class UploadServlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
     // 完成標號2內容
        Part part = req.getPart("photo");
        String filename = getFilename(part);
     // 完成標號3內容
    }

    private String getFilename(Part part) {
        String header = part.getHeader("Content-Disposition");
        String filename = header.substring(header.indexOf("filename=\"") + 10,
                header.lastIndexOf("\""));
        return filename;
    }
}
