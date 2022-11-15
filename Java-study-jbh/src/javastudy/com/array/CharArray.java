package javastudy.com.array;

public class CharArray {
	
	public static void main(String[] args) {
//		int[] name = new int[size];
//		double[] var2 = new double[12];
		
		char[] alphabets = new char[26];
		// A부터 Z를 배열에 저장
		char ch = 'A';
//		char ch = 0x41;
//		char ch = 65;
		
		for(int i=0; i<alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		
		for(int i =0; i<alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
	}
	
}
