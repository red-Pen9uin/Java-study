package javastudy.com.inheritance;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(String customerName, int customerID) {
		super(customerName, customerID);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05; // 구매 금액의 1퍼센트를 적립
		this.saleRatio = 0.1;
//		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
//	public String showCustomerInfo() {
//		return this.customerName + "님의 등급은 " + this.customerGrade
//	        	+ "이며, 보너스 포인트는 " + this.bonusPoint + "점 입니다.";
//	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 직원 ID는 " + this.agentID + "입니다.";
	}
	
}
