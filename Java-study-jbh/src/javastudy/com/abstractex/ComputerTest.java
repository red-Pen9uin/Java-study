package javastudy.com.abstractex;

public class ComputerTest {
	public static void main(String[] args) {
//		Computer c1 = new Computer();
		Computer c2 = new DeskTop();
//		Computer c3 = new LapTop();
		Computer c4 = new MyMacBook();
		
		c2.turnOn();
		c2.typing();
		c2.display();
		c2.turnOff();
		
		c4.turnOn();
		c4.typing();
		c4.display();
		c4.turnOff();
	}
}
