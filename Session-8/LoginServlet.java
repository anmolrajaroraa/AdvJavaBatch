package com.advjava.users;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.advjava.dao.UsersDAO;




/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/login")
@WebServlet(description = "A login servlet", urlPatterns = {"/login"}, initParams = {@WebInitParam(name = "defaultUser", value = "John")})
public class LoginServlet extends HttpServlet {
	PrintWriter out;
	int count ;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userid = request.getParameter("userid");   //usrid=bob
		String pwd = request.getParameter("pwd");
		Enumeration<String> e = request.getParameterNames();  //getting multiple parameters from request
		while(e.hasMoreElements()) {
			String param = e.nextElement();
			out.println("Parameter name is " + param);
			out.println("Value is " + request.getParameter(param));
		}
		
		
		
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(userid!=null) {
			if(session.getAttribute("saveduserid") == null || 
					!          ((String)session.getAttribute("saveduserid"))    //saveduserid=jim  !=  ==
										.equals(userid)) {
				count = 0;
				session.setAttribute("tracker", ++count);
			}
			else {
				count = (int) session.getAttribute("tracker");
				session.setAttribute("tracker", ++count);
			}
			session.setAttribute("saveduserid", userid);
			context.setAttribute("saveduserid", userid);
			
			out.println("You have come here "  + (int)session.getAttribute("tracker") + " times");

		}
		out = response.getWriter(); //allowing access to the network stream
		out.println("Hello user "+userid +pwd);
		out.println("<br> Userid in session is " + (String)session.getAttribute("saveduserid"));
		out.println("<br> Userid in context is "+ (String)context.getAttribute("saveduserid"));
		out.println("Default user name is " + this.getServletConfig().getInitParameter("defaultUser"));
		out.close();
				
		UsersDAO obj = new UsersDAO();
		boolean result = obj.authenticate(userid, pwd);
		if(result) {
			response.sendRedirect("success.jsp");
		}
		else {
			response.sendRedirect("index.html");
		}
	}

}
