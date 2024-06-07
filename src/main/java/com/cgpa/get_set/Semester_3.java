package com.cgpa.get_set;

public class Semester_3 {
	private int cs3301,cs3311,cs3351,cs3352,cs3361,cs3381,cs3391,ge3361,ma3354;
	private double result;
	private static Semester_3 s3;
	
	private Semester_3() {
		// TODO Auto-generated constructor stub
	}
	
	public static Semester_3 getInstance() {
		if(s3 == null) {
			s3 = new Semester_3();
		}
		return s3;
	}
	
	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public int getCs3301() {
		return cs3301;
	}

	public void setCs3301(int cs3301) {
		this.cs3301 = cs3301;
	}

	public int getCs3311() {
		return cs3311;
	}

	public void setCs3311(int cs3311) {
		this.cs3311 = cs3311;
	}

	public int getCs3351() {
		return cs3351;
	}

	public void setCs3351(int cs3351) {
		this.cs3351 = cs3351;
	}

	public int getCs3352() {
		return cs3352;
	}

	public void setCs3352(int cs3352) {
		this.cs3352 = cs3352;
	}

	public int getCs3361() {
		return cs3361;
	}

	public void setCs3361(int cs3361) {
		this.cs3361 = cs3361;
	}

	public int getCs3381() {
		return cs3381;
	}

	public void setCs3381(int cs3381) {
		this.cs3381 = cs3381;
	}

	public int getCs3391() {
		return cs3391;
	}

	public void setCs3391(int cs3391) {
		this.cs3391 = cs3391;
	}

	public int getGe3361() {
		return ge3361;
	}

	public void setGe3361(int ge3361) {
		this.ge3361 = ge3361;
	}

	public int getMa3354() {
		return ma3354;
	}

	public void setMa3354(int ma3354) {
		this.ma3354 = ma3354;
	}

}
