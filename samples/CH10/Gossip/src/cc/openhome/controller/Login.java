package cc.openhome.controller;

import java.io.*;
import java.security.AccessControlException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cc.openhome.model.Account;
import cc.openhome.model.UserService;
import cc.openhome.model.UserService;

@WebServlet(
    urlPatterns={"/login.do"},
    initParams={
        @WebInitParam(name = "SUCCESS_VIEW", value = "message.do"),
        @WebInitParam(name = "ERROR_VIEW", value = "index.jsp")
    }
)
public class Login extends HttpServlet {
    private String SUCCESS_VIEW;
    private String ERROR_VIEW;
    
    @Override
    public void init() throws ServletException {
        SUCCESS_VIEW = getServletConfig().getInitParameter("SUCCESS_VIEW");
        ERROR_VIEW = getServletConfig().getInitParameter("ERROR_VIEW");
    }
    
	protected void doPost(HttpServletRequest request, 
	                      HttpServletResponse response) 
	                        throws ServletException, IOException {
	    String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    
	    String page = null;
	    Account account = new Account();
	    account.setName(username);
	    account.setPassword(password);
	    try {
	        request.login(username, password);
	        request.getSession().setAttribute("login", username);
	        page = SUCCESS_VIEW;
	    }
	    catch(ServletException ex) {
	        page = ERROR_VIEW;
	    }
	    request.getRequestDispatcher(page).forward(request, response);
	}
}