package javastudy.com.cooperation;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
		this.money = 0;
		this.passengerCount = 0;
	}
	
	public void take(int money) {
		this.money = money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스" + this.lineNumber + "번의 승객은" + this.passengerCount + "명이고, 수입은" + this.money + "원 입니다.");
	}
}
