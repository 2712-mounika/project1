package com.watsapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.watsapp.entity.WatsappEmployee;
import com.watsapp.service.WatsappService;
import com.watsapp.service.WatsappServiceInterface;

/**
 * Servlet implementation class GlobalServlet
 */
public class GlobalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		String s=request.getParameter("ac");
		if(s.equals("register"))
		{
			String name=request.getParameter("name");
			String password=request.getParameter("pass");
		    WatsappEmployee we=new WatsappEmployee();
		    we.setName(name);
		    we.setPass(password);
		    WatsappServiceInterface ws=WatsappService.CreateServiceObject();
		    int i=ws.createProfile(we);
		    if(i>0)
			{
				out.println("profile created");
			}
			else
			{
				out.println("could not create profile");
			}
		}
	}

}

			


