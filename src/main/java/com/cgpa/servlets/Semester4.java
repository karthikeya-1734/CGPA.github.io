package com.cgpa.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cgpa.compute.Sem_4;
import com.cgpa.get_set.Semester_4;

@WebServlet("/semester-4")
public class Semester4 extends HttpServlet{
	HashMap<String, Integer> mapping = new HashMap<String, Integer>();
	
	RequestDispatcher rd ;
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		rd =req.getRequestDispatcher("/JSP_Files/Semester-4.jsp");
		rd.forward(req, res);
			
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String cs3401 = req.getParameter("cs3401");
		String cs3451 = req.getParameter("cs3451");
		String cs3452 = req.getParameter("cs3452");
		String cs3461 = req.getParameter("cs3461");
		String cs3481 = req.getParameter("cs3481");
		String cs3491 = req.getParameter("cs3491");
		String cs3492 = req.getParameter("cs3492");
		String ge3451 = req.getParameter("ge3451");
		

		mapping.put("O",10 );mapping.put("A+",9 );mapping.put("A",8 );
		mapping.put("B+",7 );mapping.put("B",6 );mapping.put("C",5 );mapping.put("RE",0 );		
		
		Semester_4 s4 = Semester_4.getInstance();
		
		s4.setCs3401(mapping.get(cs3401));
		s4.setCs3451(mapping.get(cs3451));
		s4.setCs3452(mapping.get(cs3452));
		s4.setCs3461(mapping.get(cs3461));
		s4.setCs3481(mapping.get(cs3481));
		s4.setCs3491(mapping.get(cs3491));
		s4.setCs3492(mapping.get(cs3492));
		s4.setGe3451(mapping.get(ge3451));
		
		Sem_4 sem4 = Sem_4.getInstance();
		sem4.compute(s4);
		
		req.setAttribute("result", String.format("%.3f", s4.getResult()));
		
		rd =req.getRequestDispatcher("/JSP_Files/Result.jsp");
		rd.forward(req, res);
	}
}
