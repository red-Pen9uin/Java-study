package javastudy.com.inheritance;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		initCustomer();
	}
	
	public Customer(String customerName, int customerID) {
		this.customerName = customerName;
		this.customerID = customerID;
		initCustomer();
	}
	
	private void initCustomer() {
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01; // 구매 금액의 1퍼센트를 적립
//		System.out.println("Customer() 생성자 호출");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return this.customerName + "님의 등급은 " + this.customerGrade + "이며, 보너스 포인트는 "
				+ this.bonusPoint + "점 입니다.";
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
