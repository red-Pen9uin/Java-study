package javastudy.com.array;

public class CharArray {
	
	public static void main(String[] args) {
		//char 배열 선언
		char[] alphabets = new char[26];
		char ch = 'A';
		//char ch = 0x41;
		
		for(int i=0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		
		for(int i=0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
		
		for(char c: alphabets) {
			System.out.println(c + ", " + (int)c);
		}
	}
}
