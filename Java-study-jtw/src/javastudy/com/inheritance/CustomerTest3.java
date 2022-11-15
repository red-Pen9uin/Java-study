package javastudy.com.inheritance;

import java.util.ArrayList;

public class CustomerTest3 {
	public static void main(String[] args) {
		//ArrayList 생성
		ArrayList <Customer> customerList = new ArrayList <Customer>();
		
		Customer customerHong = new GoldCustomer("홍길동", 11111);
		Customer customerKim = new VIPCustomer("김유신", 10101);
		Customer customerLee = new Customer("이순신", 10010);
		Customer customerYoul = new GoldCustomer("이율곡", 10040);
		Customer customerShin = new VIPCustomer("신사임당", 10050);
		
		customerList.add(customerHong);
		customerList.add(customerKim);
		customerList.add(customerLee);
		customerList.add(customerYoul);
		customerList.add(customerShin);
		
		System.out.println("===== 고객정보 출력 ====");
		for(Customer customer: customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== 할인률과 보너스 포인트 계산 =====");
		int itemPrice = 10000;
		for(Customer customer: customerList) {
			int cost = customer.calcPrice(itemPrice);
			System.out.println(customer.getCustomerName() + "님이 "
			+ cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님이"
			+ "현재 보유하신 포인트는 " + customer.bonusPoint + "원입니다.");
		}
	}
}
