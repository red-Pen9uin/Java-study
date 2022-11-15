package javastudy.com.array;

public class CharArray2 {
	public static void main(String[] args) {
		//char 배열 선언
		char[][] alphabets = new char[2][26];
		char ch1 = 'a';
		char ch2 = 'A';
		//char ch = 0x41;
		
//		System.out.println(alphabets.length);
//		System.out.println(alphabets[0].length);
//		System.out.println(alphabets[1].length);
		
		for(int i=0; i < alphabets[0].length; i++, ch1++) {
			alphabets[0][i] = ch1;
		}
		
		for(int i=0; i < alphabets[1].length; i++, ch2++) {
			alphabets[1][i] = ch2;
		}
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<26; j++) {
				System.out.println(alphabets[i][j] + ", " + (int)alphabets[i][j]);
			}
		}
		
//		for(int i=0; i < alphabets.length; i++) {
//			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
//		}

//		for(char c: alphabets) {
//			System.out.println(c + ", " + (int)c);
//		}
	}
}
