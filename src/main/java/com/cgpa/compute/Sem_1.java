package com.cgpa.compute;
import com.cgpa.get_set.Semester_1;

public class Sem_1 {
	
	private static Sem_1 sem1;
	private double result;
	
	private Sem_1() {
		// TODO Auto-generated constructor stub
	}
	
	public static Sem_1 getInstance() {
		if(sem1 == null) {
			sem1 = new Sem_1();
		}
		return sem1;
	}

	private double bs3171,cy3151,ge3151,ge3171,hs3151,ma3151,ph3151;
	
	public void compute(Semester_1 s1) {
		
		bs3171 = 2*s1.getBs3171();
		cy3151 = 3*s1.getCy3151();
		ge3151 = 3*s1.getGe3151();
		ge3171 = 2*s1.getGe3171();
		hs3151 = 3*s1.getHs3151();
		ma3151 = 4*s1.getMa3151();
		ph3151 = 3*s1.getPh3151();
		
        result = (double)(bs3171+cy3151+ge3151+ge3171+hs3151+ma3151+ph3151)/20;
        
        s1.setResult(result);
		
	}
	
	
}
