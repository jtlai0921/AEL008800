package cc.openhome;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class EscapeFilter implements Filter {
    public void init(FilterConfig fConfig) throws ServletException {}
    
	public void doFilter(ServletRequest request, 
	                     ServletResponse response, 
	                     FilterChain chain) 
	                          throws IOException, ServletException {
	    /* 實作步驟1、2 */
	}

	
    public void destroy() {}
}
