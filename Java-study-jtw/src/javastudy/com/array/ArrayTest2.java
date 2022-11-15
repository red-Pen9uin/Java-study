package javastudy.com.array;

import java.util.Scanner;

public class ArrayTest2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("배열의 길이를 입력하세요: ");
		int arrSize = scanner.nextInt();
		
		int size = 0;
		
		int[] array = new int[arrSize];
		
		for(int i=0; i<6; i++) {
			System.out.print("i = " + i + ": ");
			array[i] = scanner.nextInt();
			size++;
		}
		
		System.out.print("array = ");
//		for(int i=0; i<array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
		for(int i=0; i<size; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
