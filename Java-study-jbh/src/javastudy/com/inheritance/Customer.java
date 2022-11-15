package javastudy.com.inheritance;

public class Customer {
//	String phoneNumber; // 고객 전화번호
	protected int customerID; //고객 ID
	protected String customerName; // 고객 이름
	protected String customerGrade; // 고객 등급
	int bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립 비율
	
	public Customer() {
		initCustomer();
//		System.out.println("Customer() 생성자 호출");
	}
	
	public Customer(String customerName, int customerID) {
		this.customerName = customerName;
		this.customerID = customerID;
//		System.out.println("Customer(String customerName, int customerID) 생성자 호출");
		initCustomer();
	}
	
	private void initCustomer() {
		this.customerGrade = "Bronze";
		this.bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return this.customerName + "님의 등급은 " + this.customerGrade + "이며, 현재 적립 포인트는 " + this.bonusPoint + "점 입니다.";
	}
	
	public int getCustomerID() {
		
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		
		this.customerGrade = customerGrade;
	}
	

}
