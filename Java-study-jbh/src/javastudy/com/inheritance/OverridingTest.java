package javastudy.com.inheritance;

public class OverridingTest {
	
	public static void main(String[] args) {
		Customer customerPark = new VIPCustomer("박혁거세", 11111);
		customerPark.bonusPoint = 10000;
		System.out.println(customerPark.showCustomerInfo());
		
		int itemPrice = 10000;
		
		System.out.println(customerPark.getCustomerName() + "님이 지불해야하는 금액은 "
				+ customerPark.calcPrice(itemPrice) + "원입니다.");
		
	}
}
