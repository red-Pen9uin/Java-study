package javastudy.com.array;

public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] library1 = new Book[5];
		
		library1[0] = new Book("제인 에어", "asdf");
		library1[1] = new Book("그리스 로마 신화", "asdf");
		library1[2] = new Book("노인과 바다", "헤밍웨이");
		library1[3] = new Book("부활 (상)", "asdf");
		library1[4] = new Book("부활 (하)", "asdf");
		
		Book[] library2 = new Book[5];
		
		System.arraycopy(library1, 0, library2, 0, 5);
		
		library1[3].setBookName("셜록 홈즈");
		library1[3].setAuther("아서 코난 도일");
		
		System.out.println("========library1=======");
		for(int i=0; i< library1.length; i++) {
			library1[i].showBookInfo();
		}
		System.out.println("========library2=======");
		for(int i=0; i< library2.length; i++) {
			library2[i].showBookInfo();
		}
	}
}
