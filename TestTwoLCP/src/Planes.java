
public class Planes {
	
	public int tspeed = 0;
	public int numEnginees = 0;
	public String model = "";
	public static  int size = 10;
	public  static int[] age = new int[size];
	
	public int position = 0; 
	
	public Planes(int newTspeed, int newNumEnginees, int newYr){
		tspeed = newTspeed;
		numEnginees = newNumEnginees; 
		age[position] = newYr; 
		position = position++; 
	}
	public Planes faster(Planes plane1, Planes plane2) {
		if(plane1.tspeed > plane2.tspeed) {
			System.out.println(plane1.model + " Is faster than " + plane2.model);
		}
		else {
			System.out.println(plane2.model + " Is faster than " + plane1.model);
		}
		return plane2;
	}
		
	public String whatType(Planes newPlane) {
		if(newPlane.numEnginees >= 4) {
			System.out.println(newPlane.model + " Is probably a Jet.");
		}
		else {
			System.out.println(newPlane.model + " Is probably a recPlane.");
			return "planes"; 
		}
		return model;
	}
	
	
}
	
	

