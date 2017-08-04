package com.chaitu.practise;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class BankInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//step-1 get the data
		
	String bankName=request.getParameter("bankID");
	String accNum=request.getParameter("accID");
	String ssnNum=request.getParameter("ssnID");
	
		//step-2
		
	
		//step-3 respond back
	HttpSession ses=request.getSession();
	ses.setAttribute("bank_name", bankName);
	ses.setAttribute("acc_num", accNum);
	ses.setAttribute("ssn_num", ssnNum);
	response.sendRedirect("jsp/output.jsp");
	
	
		
	}

}
