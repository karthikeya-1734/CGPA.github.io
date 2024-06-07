package com.cgpa.compute;
import com.cgpa.get_set.Semester_4;

public class Sem_4 {
	
	private static Sem_4 sem4;
	private double result;
	
	private Sem_4() {
		// TODO Auto-generated constructor stub
	}
	
	public static Sem_4 getInstance() {
		if(sem4 == null) {
			sem4 = new Sem_4();
		}
		return sem4;
	}

	private double cs3401,cs3451,cs3452,cs3461,cs3481,cs3491,cs3492,ge3451;
	
	public void compute(Semester_4 s4) {
		
		cs3401 = 4*s4.getCs3401();
		cs3451 = 3*s4.getCs3451();
		cs3452 = 3*s4.getCs3452();
		cs3461 = (1.5)*s4.getCs3461();
		cs3481 = (1.5)*s4.getCs3481();
		cs3491 = 4*s4.getCs3491();
		cs3492 = 3*s4.getCs3492();
		ge3451 = 2*s4.getGe3451();
				
        result = (double)(cs3401+cs3451+cs3452+cs3461+cs3481+cs3491+cs3492+ge3451)/22;
        
        s4.setResult(result);
		
	}
	
	
}
