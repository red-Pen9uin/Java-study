package javastudy.com.inheritance;

public class CustomerTest2 {
	public static void main(String[] args) {
		Customer customerLee = new Customer("이순신", 10010);
		customerLee.bonusPoint = 1000;
		
		int itemPrice = 10000;
		int leePrice = customerLee.calcPrice(itemPrice);
		
		System.out.println(customerLee.getCustomerName()
				+ "님이 결제하실 금액은 " + leePrice + "원입니다.");
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerKim = new VIPCustomer("김유신", 10101);
		customerKim.bonusPoint = 1000;
		
		int kimPrice = customerKim.calcPrice(itemPrice);
		
		System.out.println(customerKim.getCustomerName()
				+ "님이 결제하실 금액은 " + kimPrice + "원입니다.");
		System.out.println(customerKim.showCustomerInfo());
		
		Customer customerHong = new GoldCustomer("홍길동", 11111);
		customerHong.bonusPoint = 1000;
		
		int hongPrice = customerHong.calcPrice(itemPrice);
		
		System.out.println(customerHong.getCustomerName()
				+ "님이 결제하실 금액은 " + hongPrice + "원입니다.");
		System.out.println(customerHong.showCustomerInfo());
		
	}
}
