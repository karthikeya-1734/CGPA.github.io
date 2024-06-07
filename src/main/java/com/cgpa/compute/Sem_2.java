package com.cgpa.compute;
import com.cgpa.get_set.Semester_2;

public class Sem_2 {
	
	private static Sem_2 sem2;
	private double result;
	
	private Sem_2() {
		// TODO Auto-generated constructor stub
	}
	
	public static Sem_2 getInstance() {
		if(sem2 == null) {
			sem2 = new Sem_2();
		}
		return sem2;
	}

	private double be3251,cs3251,cs3271,ge3251,ge3271,hs3251,ma3251,ph3256;
	
	public void compute(Semester_2 s2) {
		
		be3251 = 3*s2.getBe3251();
		cs3251 = 3*s2.getCs3251();
		cs3271 = 2*s2.getCs3271();
		ge3251 = 4*s2.getGe3251();
		ge3271 = 2*s2.getGe3271();
		hs3251 = 2*s2.getHs3251();
		ma3251 = 4*s2.getMa3251();
		ph3256 = 3*s2.getPh3256();
		
		
        result = (double)(be3251+cs3251+cs3271+ge3251+ge3271+hs3251+ma3251+ph3256)/23;
        
        s2.setResult(result);
		
	}
	
	
}
