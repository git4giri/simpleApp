package com.ibm.test;

import java.io.IOException;
import java.io.PrintWriter;
//test comment
import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet implements Servlet{
	private static final long serialVersionUID = -3537062746450602871L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp){
		doPost(req, resp);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp){
		PrintWriter out = null;
		try {
			out = resp.getWriter();
			out.write("<h1>Hi There !...</h1>");
			if(req.getParameter("param") != null)
				out.write("<h1>You typed: "+req.getParameter("param")+"</h1>");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			out.close();
		}
	}
	
}
