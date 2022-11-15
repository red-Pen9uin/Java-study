package javastudy.com.array;

public class BookArray2 {
	public static void main(String[] args) {
		//		int[] name = new int[size];
		//		double[] var2 = new double[12];
		//		char[] alphabets = new char[26];
		
		Book[] library = new Book[5];
		
		library[0] = new Book("제인 에어", "asdf");
		library[1] = new Book("그리스 로마 신화", "asdf");
		library[2] = new Book("노인과 바다", "헤밍웨이");
		library[3] = new Book("부활 (상)", "asdf");
		library[4] = new Book("부활 (하)", "asdf");
		
		for(int i=0; i< library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i =0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
	}
}
