package javastudy.com.inheritance;

public class GoldCustomer extends Customer{
	//제품을 살 때 항상 10%할인
	//보너스 포인트는 2% 적립
	//담당 전문 상담원은 없음
	double saleRatio; // VIP고객 할인률
	
	public GoldCustomer() {
		initCustomer();
	}
	
	public GoldCustomer(String customerName, int customerID) {
		initCustomer();
		this.customerID = customerID;
		this.customerName = customerName;
	}
	
	private void initCustomer() {
		this.customerGrade = "Gold";
		this.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
