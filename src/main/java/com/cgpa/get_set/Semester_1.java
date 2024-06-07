package com.cgpa.get_set;

public class Semester_1 {
	
	private static Semester_1 s1;
	
	private Semester_1() {
		// TODO Auto-generated constructor stub
	}
	
	public static Semester_1 getInstance() {
		if(s1 == null) {
			s1 = new Semester_1();
		}
		return s1;
	}
	
	private int bs3171,cy3151,ge3151,ge3171,hs3151,ma3151,ph3151;
	
	private double result;
	
	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public int getBs3171() {
		return bs3171;
	}

	public void setBs3171(int bs3171) {
		this.bs3171 = bs3171;
	}

	public int getCy3151() {
		return cy3151;
	}

	public void setCy3151(int cy3151) {
		this.cy3151 = cy3151;
	}

	public int getGe3151() {
		return ge3151;
	}

	public void setGe3151(int ge3151) {
		this.ge3151 = ge3151;
	}

	public int getGe3171() {
		return ge3171;
	}

	public void setGe3171(int ge3171) {
		this.ge3171 = ge3171;
	}

	public int getHs3151() {
		return hs3151;
	}

	public void setHs3151(int hs3151) {
		this.hs3151 = hs3151;
	}

	public int getMa3151() {
		return ma3151;
	}

	public void setMa3151(int ma3151) {
		this.ma3151 = ma3151;
	}

	public int getPh3151() {
		return ph3151;
	}

	public void setPh3151(int ph3151) {
		this.ph3151 = ph3151;
	}
}
