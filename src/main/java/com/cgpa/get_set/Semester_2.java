package com.cgpa.get_set;

public class Semester_2 {
	private int be3251,cs3251,cs3271,ge3251,ge3271,hs3251,ma3251,ph3256;
	private double result;
	private static Semester_2 s2;
	
	private Semester_2() {
		// TODO Auto-generated constructor stub
	}
	
	public static Semester_2 getInstance() {
		if(s2 == null) {
			s2 = new Semester_2();
		}
		return s2;
	}
	
	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public int getBe3251() {
		return be3251;
	}

	public void setBe3251(int be3251) {
		this.be3251 = be3251;
	}

	public int getCs3251() {
		return cs3251;
	}

	public void setCs3251(int cs3251) {
		this.cs3251 = cs3251;
	}

	public int getCs3271() {
		return cs3271;
	}

	public void setCs3271(int cs3271) {
		this.cs3271 = cs3271;
	}

	public int getGe3251() {
		return ge3251;
	}

	public void setGe3251(int ge3251) {
		this.ge3251 = ge3251;
	}

	public int getGe3271() {
		return ge3271;
	}

	public void setGe3271(int ge3271) {
		this.ge3271 = ge3271;
	}

	public int getHs3251() {
		return hs3251;
	}

	public void setHs3251(int hs3251) {
		this.hs3251 = hs3251;
	}

	public int getMa3251() {
		return ma3251;
	}

	public void setMa3251(int ma3251) {
		this.ma3251 = ma3251;
	}

	public int getPh3256() {
		return ph3256;
	}

	public void setPh3256(int ph3256) {
		this.ph3256 = ph3256;
	}

}
