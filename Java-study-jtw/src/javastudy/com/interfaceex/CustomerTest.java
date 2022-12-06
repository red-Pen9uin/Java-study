package javastudy.com.interfaceex;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = new Customer();
		buyer.buy();
		Buy.pay();
		buyer.order();
		
		Sell seller = new Customer();
		seller.sell();
		Sell.pay();
		seller.order();
		
//		if(seller instanceof Customer) {
//			Customer customer2 = (Customer)seller;
//			customer2.buy();
//			customer2.sell();
//		}
	}
}
