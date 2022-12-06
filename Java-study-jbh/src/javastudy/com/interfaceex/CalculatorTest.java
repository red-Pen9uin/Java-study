package javastudy.com.interfaceex;

public class CalculatorTest {
	
	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 3;
		
		Calc calc = new CompleteCalc();
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.subtract(num1, num2));
		System.out.println(calc.multiply(num1, num2));
		System.out.println(calc.divide(num1, num2));
		if(calc instanceof CompleteCalc) {
			CompleteCalc c = (CompleteCalc)calc;
			c.showInfo();
		}
		calc.description();
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
/*			calc.showInfo();*/
	}
}
