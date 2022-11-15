package javastudy.com.inheritance;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer customerKim = new Customer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10010);
		customerKim.bonusPoint = 1000;
		System.out.println(customerKim.showCustomerInfo());
		
		VIPCustomer customerLee = new VIPCustomer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10101);
		customerLee.bonusPoint = 10000;
		System.out.println(customerLee.showCustomerInfo());
	}
}
