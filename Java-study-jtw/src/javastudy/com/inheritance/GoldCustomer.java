package javastudy.com.inheritance;

public class GoldCustomer extends Customer{
	double saleRatio;
	
	public GoldCustomer(String customerName, int customerID) {
		super(customerName, customerID);
		this.customerGrade = "Gold";
		this.bonusRatio = 0.02; // 구매 금액의 1퍼센트를 적립
		this.saleRatio = 0.1;
		//		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
}
