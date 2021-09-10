package abstractFactory;

public class OrderFlatBread {

	public static void main(String[] args) {

		 int selectFactory = 4;
		    switch (selectFactory) {
		      case 1:
		        System.out.println("Your order is placed");
		         new Bakery(new GroupoBimboFactory());
		        break;
		      case 2:
		        System.out.println("Your order is placed");
		           new Bakery(new CampbellFactory());
		        break;
		      case 3:
		        System.out.println("Your order is placed");
		           new Bakery(new PrivateLabelFactory());
		        break;
		      case 4:
			        System.out.println("Your order from all factories is placed");
			        new Bakery(new GroupoBimboFactory());
			        new Bakery(new CampbellFactory());
			        new Bakery(new PrivateLabelFactory());
			        break;
		    }

	}

}
