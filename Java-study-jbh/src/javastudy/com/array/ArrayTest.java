package javastudy.com.array;

import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] num1 = new int[10];
//		int num1[] = new int[10];
		
		int[] num2 = new int[] {101, 102, 103};
//		int[] num2 = {101, 102, 103};
		
		int[] num3 = new int[3];
//		num3[0] = 0;
//		num3[1] = 1;
//		num3[2] = 2;
		
		for(int i=0; i<3; i++) {
			num3[i] = i;
		}
		
		System.out.print("배열의 길이를 입력하세요: ");
		int arrSize = scanner.nextInt();
		
		int[] array1 = new int[arrSize];
		
//		array1[0] = scanner.nextInt();
//		array1[1] = scanner.nextInt();
//		array1[2] = scanner.nextInt();
//		array1[3] = scanner.nextInt();
//		array1[4] = scanner.nextInt();
		
		System.out.print("입력할 갯수를 입력하세요: ");
		int inputSize = scanner.nextInt();
		int size = 0;
		
		for(int a=0; a<inputSize; a++) {
			System.out.print("a = " + a + ": ");
			array1[a] = scanner.nextInt();
			size++;
		}
		
//		for(int i=0; i<arrSize; i++) {
//			System.out.print(array1[i] + " ");
//		}
		
		for(int i=0; i<array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<inputSize; i++) {
			System.out.print(array1[i] + " ");
		}
	}
	
}
