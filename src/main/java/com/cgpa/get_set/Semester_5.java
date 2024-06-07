package com.cgpa.get_set;

public class Semester_5 {
	private int ;
	private double result;
	private static Semester_5 s5;
	
	private Semester_5() {
		// TODO Auto-generated constructor stub
	}
	
	public static Semester_5 getInstance() {
		if(s5 == null) {
			s5 = new Semester_5();
		}
		return s5;
	}
	
	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
}
