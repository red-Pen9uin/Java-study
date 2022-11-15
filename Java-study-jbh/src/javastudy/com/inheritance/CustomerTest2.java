package javastudy.com.inheritance;

public class CustomerTest2 {
	public static void main(String[] args) {
		Customer customerKim = new Customer("김유신", 10010);
		customerKim.bonusPoint = 1000;
		System.out.println(customerKim.showCustomerInfo());
		
		VIPCustomer customerLee = new VIPCustomer("이순신", 10101);
		customerLee.bonusPoint = 10000;
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerPark = new VIPCustomer("박혁거세", 11111);
		customerPark.bonusPoint = 10000;
		System.out.println(customerPark.showCustomerInfo());
		
//		VIPCustomer customerHong = new Customer("홍길동", 10011);
//		customerPark.bonusPoint = 10000;
//		System.out.println(customerPark.showVIPInfo());
		
		int itemPrice = 10000;
		
		System.out.println(customerKim.getCustomerName() + "님이 지불해야하는 금액은 " + customerKim.calcPrice(itemPrice) + "원입니다.");
		System.out.println(customerLee.getCustomerName() + "님이 지불해야하는 금액은 " + customerLee.calcPrice(itemPrice) + "원입니다.");
		
		System.out.println(customerPark.calcPrice((itemPrice)));
//		System.out.println(customerLee.getCustomerName() + "님이 지불해야하는 금액은 " + customerLee.calcPrice(itemPrice) + "원입니다.");
	}
}
