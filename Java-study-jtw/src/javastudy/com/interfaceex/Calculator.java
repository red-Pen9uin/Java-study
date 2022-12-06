package javastudy.com.interfaceex;

public class Calculator extends UnfinishedCalc{
	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1 / num2;
		else
			return Calc.ERROR;
	}
	
	@Override
	public void description() {
		System.out.println("정수 계산기를 구현했지롱.");
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
}
