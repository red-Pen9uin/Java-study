package javastudy.com.abstractex;

public abstract class Computer {
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	public abstract void typing();
	public abstract void display();
}
