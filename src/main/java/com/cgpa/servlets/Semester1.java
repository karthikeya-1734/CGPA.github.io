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

import com.cgpa.compute.Sem_1;
import com.cgpa.get_set.Semester_1;

@WebServlet("/semester-1")
public class Semester1 extends HttpServlet{
	HashMap<String, Integer> mapping = new HashMap<String, Integer>();
	
	RequestDispatcher rd ;
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		rd =req.getRequestDispatcher("/JSP_Files/Semester-1.jsp");
		rd.forward(req, res);
			
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String bs3171 = req.getParameter("bs3171");
		String cy3151 = req.getParameter("cy3151");
		String ge3151 = req.getParameter("ge3151");
		String ge3171 = req.getParameter("ge3171");
		String hs3151 = req.getParameter("hs3151");
		String ma3151 = req.getParameter("ma3151");
		String ph3151 = req.getParameter("ph3151");
		

		mapping.put("O",10 );mapping.put("A+",9 );mapping.put("A",8 );
		mapping.put("B+",7 );mapping.put("B",6 );mapping.put("C",5 );mapping.put("RE",0 );		
		
		Semester_1 s1 = Semester_1.getInstance();
		
		s1.setBs3171(mapping.get(bs3171));
		s1.setCy3151(mapping.get(cy3151));
		s1.setGe3151(mapping.get(ge3151));
		s1.setGe3171(mapping.get(ge3171));
		s1.setHs3151(mapping.get(hs3151));
		s1.setMa3151(mapping.get(ma3151));
		s1.setPh3151(mapping.get(ph3151));
		
		Sem_1 sem1 = Sem_1.getInstance();
		sem1.compute(s1);
		
		req.setAttribute("result", String.format("%.3f", s1.getResult()));
		
		rd =req.getRequestDispatcher("/JSP_Files/Result.jsp");
		
		rd.forward(req, res);
	}
}
