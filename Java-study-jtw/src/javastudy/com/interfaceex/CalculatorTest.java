package javastudy.com.interfaceex;

public class CalculatorTest {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 0;
		
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.add(num1, num2));
		System.out.println(calculator.subtract(num1, num2));
		System.out.println(calculator.multiply(num1, num2));
		System.out.println(calculator.divide(num1, num2));
		calculator.showInfo();
		calculator.description();
		
		//	int[] arr = new int[]{1,2,3,4,5};
		//	int arr[] = new int[5];
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
	}

}
