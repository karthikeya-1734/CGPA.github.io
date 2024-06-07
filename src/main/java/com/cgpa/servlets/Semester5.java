package com.cgpa.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/semester-5")
public class Semester5 extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter pw = res.getWriter();
		pw.write("Semester5");
	}
}
