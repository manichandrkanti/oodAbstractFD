package abstractFactory;

public class CampbellFactory implements FlatBreadFactory {

	 @Override
	 public Bread bakeNew() {
	  return new Campbell();
	 }

}
