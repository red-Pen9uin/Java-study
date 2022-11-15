package javastudy.com.inheritance;

public class VIPCustomer2 {
	//	String phoneNumber; // 고객 전화번호
	int customerID; //고객 ID
	String customerName; // 고객 이름
	String customerGrade; // 고객 등급
	int bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립 비율
	
	//VIP 혜택 zone
	int agentID; // VIP 고객 담당 직원 id
	double saleRatio; // VIP고객 할인률
	
	public VIPCustomer2() {
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showCustomerInfo() {
		//		System.out.println(this.customerName + "님의 등급은 " + this.customerGrade + "이며, 현재 적립 포인트는 " + this.bonusPoint + "점 입니다.");
		return this.customerName + "님의 등급은 " + this.customerGrade + "이며, 현재 적립 포인트는 " + this.bonusPoint + "점 입니다.";
	}
}
