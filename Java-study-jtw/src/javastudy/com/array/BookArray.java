package javastudy.com.array;

public class BookArray {
	
	public static void main(String[] args) {
//		int[] name = new int[size];
		Book[] library = new Book[5];
		
		for(int i=0; i< library.length; i++) {
			System.out.println(library[i]);
//			System.out.println(참조변수 이름);
		}
	}
}
