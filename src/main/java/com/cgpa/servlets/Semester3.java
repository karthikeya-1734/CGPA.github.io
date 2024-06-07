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

import com.cgpa.compute.Sem_3;
import com.cgpa.get_set.Semester_3;

@WebServlet("/semester-3")
public class Semester3 extends HttpServlet{
	HashMap<String, Integer> mapping = new HashMap<String, Integer>();
	
	RequestDispatcher rd ;
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		rd =req.getRequestDispatcher("/JSP_Files/Semester-3.jsp");
		rd.forward(req, res);
			
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String cs3301 = req.getParameter("cs3301");
		String cs3311 = req.getParameter("cs3311");
		String cs3351 = req.getParameter("cs3351");
		String cs3352 = req.getParameter("cs3352");
		String cs3361 = req.getParameter("cs3361");
		String cs3381 = req.getParameter("cs3381");
		String cs3391 = req.getParameter("cs3391");
		String ge3361 = req.getParameter("ge3361");
		String ma3354 = req.getParameter("ma3354");


		mapping.put("O",10 );mapping.put("A+",9 );mapping.put("A",8 );
		mapping.put("B+",7 );mapping.put("B",6 );mapping.put("C",5 );mapping.put("RE",0 );		
		
		Semester_3 s3 = Semester_3.getInstance();
		
		s3.setCs3301(mapping.get(cs3301));
		s3.setCs3311(mapping.get(cs3311));
		s3.setCs3351(mapping.get(cs3351));
		s3.setCs3352(mapping.get(cs3352));
		s3.setCs3361(mapping.get(cs3361));
		s3.setCs3381(mapping.get(cs3381));
		s3.setCs3391(mapping.get(cs3391));
		s3.setGe3361(mapping.get(ge3361));
		s3.setMa3354(mapping.get(ma3354));
		
		Sem_3 sem3 = Sem_3.getInstance();
		sem3.compute(s3);
		
		req.setAttribute("result", String.format("%.3f", s3.getResult()));
		rd =req.getRequestDispatcher("/JSP_Files/Result.jsp");
		rd.forward(req, res);
	}
}
