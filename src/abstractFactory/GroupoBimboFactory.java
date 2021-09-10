package abstractFactory;

public class GroupoBimboFactory implements FlatBreadFactory {
	@Override
	 public Bread bakeNew() {
	  return new Bimbo();
	 }
}
