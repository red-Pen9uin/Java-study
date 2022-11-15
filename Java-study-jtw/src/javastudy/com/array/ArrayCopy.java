package javastudy.com.array;

public class ArrayCopy {
	
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {0,0,0,0,0};
		
//		for(int i=0; i<array2.length; i++) {
//			array2[i] = array1[i];
//		}
		System.arraycopy(array1, 0, array2, 2, 3);
		
		for(int i=0; i< array1.length; i++) {
			System.out.print(array1[i] + ", ");
		}
		System.out.println();
		for(int i=0; i< array1.length; i++) {
			System.out.print(array2[i] + ", ");
		}
	}
}
