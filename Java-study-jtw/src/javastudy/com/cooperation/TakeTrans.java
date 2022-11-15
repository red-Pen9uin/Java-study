package javastudy.com.cooperation;

public class TakeTrans {
	
	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Subway subwayKTX = new Subway("KTX");
		
		studentJames.takeBus(bus100);
		studentTomas.takeSubway(subwayKTX);
		
		studentJames.showInfo();
		studentTomas.showInfo();
		
		bus100.showInfo();
		subwayKTX.showInfo();
	}
}
