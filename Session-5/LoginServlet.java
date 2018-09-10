package com.advjava.users;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(userid!=null) {
			session.setAttribute("saveduserid", userid);
			context.setAttribute("saveduserid", userid);
		}
		PrintWriter out = response.getWriter(); //allowing access to the network stream
		out.println("Hello user "+userid +pwd);
		out.println("<br> Userid in session is " + (String)session.getAttribute("saveduserid"));
		out.println("<br> Userid in context is "+ (String)context.getAttribute("saveduserid"));
		out.close();
	}

}
