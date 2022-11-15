package javastudy.com.array;

public class BookArray {
	
	public static void main(String[] args) {
//		int[] name = new int[size];
//		double[] var2 = new double[12];
//		char[] alphabets = new char[26];
		
		Book[] library = new Book[5];
		
		for(int i =0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
	}
}
