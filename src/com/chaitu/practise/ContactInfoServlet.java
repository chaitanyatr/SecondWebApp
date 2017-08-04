package com.chaitu.practise;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ContactInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//step-1 get the data
		String address=request.getParameter("AddrID");
		String city=request.getParameter("CityID");
		String state=request.getParameter("StateID");
		String country=request.getParameter("CountryID");
		String phone=request.getParameter("PhoneID");
		
		//step-2
		
		//step-3 respond back
		HttpSession ses=request.getSession();
		ses.setAttribute("addr", address);
		ses.setAttribute("cty", city);
		ses.setAttribute("stat", state);
		ses.setAttribute("ctry", country);
		ses.setAttribute("phn", phone);
		response.sendRedirect("html/bankinfo.html");
		
	}

}
