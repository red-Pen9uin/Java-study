package javastudy.com.inheritance;

public class VIPCustomer extends Customer{
	//VIP 혜택 zone
	private int agentID; // VIP 고객 담당 직원 id
	double saleRatio; // VIP고객 할인률
	
	public VIPCustomer() {
		super();
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public VIPCustomer(String customerName, int customerID) {
		super(customerName, customerID);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		System.out.println("VIPCustomer(String customerName, int customerID) 생성자 호출");
	}
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는 " + this.agentID + " 입니다.";
	}
	
}
