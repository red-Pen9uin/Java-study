package javastudy.com.inheritance;

public class CustomerTest3 {
	public static void main(String[] args) {
		Customer customerKim = new Customer("김유신", 10010);
		customerKim.bonusPoint = 1000;
		Customer customerLee = new VIPCustomer("이순신", 10101);
		customerLee.bonusPoint = 10000;
		Customer customerPark = new GoldCustomer("박혁거세", 10111);
		customerPark.bonusPoint = 1000;

		System.out.println(customerKim.showCustomerInfo());
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerPark.showCustomerInfo());
		
		System.out.println("======할인률과 보너스 포인트 계산======");
		
		int price = 10000;
		int kimPrice = customerKim.calcPrice(price);
		int leePrice = customerLee.calcPrice(price);
		int parkPrice = customerPark.calcPrice(price);
		
		System.out.println(customerKim.getCustomerName() + " 님이 "
				+ kimPrice + "원 지불하셨습니다.");
		System.out.println(customerKim.showCustomerInfo());
		System.out.println(customerLee.getCustomerName() + " 님이 "
				+ leePrice + "원 지불하셨습니다.");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerPark.getCustomerName() + " 님이 "
				+ parkPrice + "원 지불하셨습니다.");
		System.out.println(customerPark.showCustomerInfo());
	}
}
