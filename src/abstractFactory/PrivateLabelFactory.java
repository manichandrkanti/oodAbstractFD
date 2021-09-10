package abstractFactory;

public class PrivateLabelFactory implements FlatBreadFactory {

	 @Override
	 public Bread bakeNew() {
	  return new Label();
	 }

}
