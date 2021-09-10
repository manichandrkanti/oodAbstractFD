package abstractFactory;

public class Bakery {
	public Bakery(FlatBreadFactory bikeFactory) {

		  Bread bike = bikeFactory.bakeNew();
		  bike.heat();  

		 }
}
