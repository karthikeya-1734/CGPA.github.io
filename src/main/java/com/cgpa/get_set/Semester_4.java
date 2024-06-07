package com.cgpa.get_set;

public class Semester_4 {
	private int cs3401,cs3451,cs3452,cs3461,cs3481,cs3491,cs3492,ge3451;
	private double result;
	private static Semester_4 s4;
	
	private Semester_4() {
		// TODO Auto-generated constructor stub
	}
	
	public static Semester_4 getInstance() {
		if(s4 == null) {
			s4 = new Semester_4();
		}
		return s4;
	}
	
	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public int getCs3401() {
		return cs3401;
	}

	public void setCs3401(int cs3401) {
		this.cs3401 = cs3401;
	}

	public int getCs3451() {
		return cs3451;
	}

	public void setCs3451(int cs3451) {
		this.cs3451 = cs3451;
	}

	public int getCs3452() {
		return cs3452;
	}

	public void setCs3452(int cs3452) {
		this.cs3452 = cs3452;
	}

	public int getCs3461() {
		return cs3461;
	}

	public void setCs3461(int cs3461) {
		this.cs3461 = cs3461;
	}

	public int getCs3481() {
		return cs3481;
	}

	public void setCs3481(int cs3481) {
		this.cs3481 = cs3481;
	}

	public int getCs3491() {
		return cs3491;
	}

	public void setCs3491(int cs3491) {
		this.cs3491 = cs3491;
	}

	public int getCs3492() {
		return cs3492;
	}

	public void setCs3492(int cs3492) {
		this.cs3492 = cs3492;
	}

	public int getGe3451() {
		return ge3451;
	}

	public void setGe3451(int ge3451) {
		this.ge3451 = ge3451;
	}



}
