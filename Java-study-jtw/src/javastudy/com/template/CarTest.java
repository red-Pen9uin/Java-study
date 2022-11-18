package javastudy.com.template;

public class CarTest {
	
	public static void main(String[] args) {
		System.out.println("=============AI CAR===========");
		Car myCar = new AICar();
		myCar.run();
		System.out.println("===========MANUAL CAR=========");
		Car yourCar = new ManualCar();
		yourCar.run();
	}
}
