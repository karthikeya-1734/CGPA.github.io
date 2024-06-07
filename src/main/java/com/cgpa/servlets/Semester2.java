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
import com.cgpa.compute.Sem_2;
import com.cgpa.get_set.Semester_1;
import com.cgpa.get_set.Semester_2;

@WebServlet("/semester-2")
public class Semester2 extends HttpServlet{
	HashMap<String, Integer> mapping = new HashMap<String, Integer>();
	
	RequestDispatcher rd ;
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		rd =req.getRequestDispatcher("/JSP_Files/Semester-2.jsp");
		rd.forward(req, res);
			
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String be3251 = req.getParameter("be3251");
		String cs3251 = req.getParameter("cs3251");
		String cs3271 = req.getParameter("cs3271");
		String ge3251 = req.getParameter("ge3251");
		String ge3271 = req.getParameter("ge3271");
		String hs3251 = req.getParameter("hs3251");
		String ma3251 = req.getParameter("ma3251");
		String ph3256 = req.getParameter("ph3256");
		

		mapping.put("O",10 );mapping.put("A+",9 );mapping.put("A",8 );
		mapping.put("B+",7 );mapping.put("B",6 );mapping.put("C",5 );mapping.put("RE",0 );		
		
		Semester_2 s2 = Semester_2.getInstance();
		
		s2.setBe3251(mapping.get(be3251));
		s2.setCs3251(mapping.get(cs3251));
		s2.setCs3271(mapping.get(cs3271));
		s2.setGe3251(mapping.get(ge3251));
		s2.setGe3271(mapping.get(ge3271));
		s2.setHs3251(mapping.get(hs3251));
		s2.setMa3251(mapping.get(ma3251));
		s2.setPh3256(mapping.get(ph3256));
		
		Sem_2 sem2 = Sem_2.getInstance();
		sem2.compute(s2);
		
		req.setAttribute("result", String.format("%.3f", s2.getResult()));
		
		rd =req.getRequestDispatcher("/JSP_Files/Result.jsp");
		rd.forward(req, res);
	}
}
