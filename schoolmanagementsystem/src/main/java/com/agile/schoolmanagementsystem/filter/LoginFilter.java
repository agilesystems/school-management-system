package com.agile.schoolmanagementsystem.filter;

import java.io.IOException;

import javax.jms.Session;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter(urlPatterns = { "/home","/index","/view" }, servletNames = { "Login" })
public class LoginFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public LoginFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {

		
		HttpServletRequest request = (HttpServletRequest) req;
		
		String path = request.getRequestURI();
		HttpSession session = request.getSession();	
		System.out.println(path+"session is :"+(session==null)) ;
		if (path.startsWith(pathToBeIgnored)) {
		    chain.doFilter(req, res); // Just continue chain.
		} else {
		    

		if (session.getAttribute("user") == null /*&& !request.getRequestURI().endsWith("/login")*/) {
			request.getRequestDispatcher("/login").forward(req, res);
		} else {
			chain.doFilter(req, res);
		}
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	private String pathToBeIgnored;
	public void init(FilterConfig fConfig) throws ServletException {
		pathToBeIgnored = fConfig.getInitParameter("pathToBeIgnored");
	}
	
	
  

}
