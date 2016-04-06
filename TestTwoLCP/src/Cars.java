
public class Cars {
	
	public int tspeed = 0;
	public int numDoors = 0;
	public String model = "";

	public Cars faster(Cars car1, Cars car2) {
		if(car1.tspeed > car2.tspeed) {
			System.out.println(car1.model + " Is faster than " + car2.model);
		}
		else {
			System.out.println(car2.model + " Is faster than " + car1.model);
		}
	}
		
	public Cars whatType(Cars newCar) {
		if(newCar.numDoors >= 4) {
			System.out.println(newCar.model + " Is probably a Sedan.");
		}
		else {
			System.out.println(newCar.model + " Is probably a Coupe.");
		}
	}
	
	
	}
	
	
}
