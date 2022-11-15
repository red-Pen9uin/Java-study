package javastudy.com.array;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = 10;
//		int[] num1 = new int[10];
//		int[] num1 = new int[] {101, 102, 103};
		int[] num1 = {101, 102, 103};
		
		int num2[] = new int[3];
//		num2[0] = 0;
//		num2[1] = 1;
//		num2[2] = 2;
		
		for(int i=0; i<3; i++) {
			num2[i] = i;
		}
		
		int[] stdID;
//		stdID = new int[3];
		stdID = new int[] {1, 2, 3};
		
		// 5개짜리 배열을 만들어서 1에서 5까지
		int[] array1 = new int[5];
		
		for(int i=0; i<5; i++) {
			array1[i] = i+1;
		}
		
		int arrSize = scanner.nextInt();
		
		int[] array2 = new int[arrSize];
		
		for(int i=0; i<array2.length; i++) {
			array2[i] = i+1;
		}
		
		
	
	
	}
}
