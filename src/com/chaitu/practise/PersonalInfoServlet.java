package com.chaitu.practise;
//servlet
import java.io.IOException;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PersonalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//step-2 
		String firstName=request.getParameter("firstname");
		String middleName=request.getParameter("middlename");
		String lastName=request.getParameter("lastname");
		
		
		
		//step-3 respond back
		HttpSession ses=request.getSession();
		ses.setAttribute("first_name", firstName);
		ses.setAttribute("middle_name", middleName);
		ses.setAttribute("last_name", lastName);
		
		response.sendRedirect("html/contactinfo.html");
		
		
		
	}

}
