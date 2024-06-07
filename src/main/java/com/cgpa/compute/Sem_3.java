package com.cgpa.compute;
import com.cgpa.get_set.Semester_3;

public class Sem_3 {
	
	private static Sem_3 sem3;
	private double result;
	
	private Sem_3() {
		// TODO Auto-generated constructor stub
	}
	
	public static Sem_3 getInstance() {
		if(sem3 == null) {
			sem3 = new Sem_3();
		}
		return sem3;
	}

	private double cs3301,cs3311,cs3351,cs3352,cs3361,cs3381,cs3391,ge3361,ma3354;
	
	public void compute(Semester_3 s3) {
		
		cs3301 = 3*s3.getCs3301();
		cs3311 = (1.5)*s3.getCs3311();
		cs3351 = 4*s3.getCs3351();
		cs3352 = 3*s3.getCs3352();
		cs3361 = 2*s3.getCs3361();
		cs3381 = (1.5)*s3.getCs3381();
		cs3391 = 3*s3.getCs3391();
		ge3361 = 1*s3.getGe3361();
		ma3354 = 4*s3.getMa3354();
				
        result = (double)(cs3301+cs3311+cs3351+cs3352+cs3361+cs3381+cs3391+ge3361+ma3354)/23;
        
        s3.setResult(result);
		
	}
	
	
}
