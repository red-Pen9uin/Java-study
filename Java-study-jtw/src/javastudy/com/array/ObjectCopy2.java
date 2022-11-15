package javastudy.com.array;

public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] library1 = new Book[5];
		
		library1[0] = new Book("그리스 로마 신화", "asdf");
		library1[1] = new Book("오만과 편견", "제인 어스틴");
		library1[2] = new Book("작은아씨들", "asdf");
		library1[3] = new Book("부활(상)", "asdf");
		library1[4] = new Book("부활(하)","asdf");
		
		Book[] library2 = new Book[5];
		
		//		System.arraycopy(array1, 0, array2, 2, 3);
		System.arraycopy(library1, 0, library2, 0, 5);
		
		library1[3].setBookName("스페이스 오디세이");
		library1[3].setAuthor("아서 클라크");
		
		System.out.println("========library1========");
		for(int i=0; i < library2.length; i++) {
			library1[i].showBookInfo();
		}
		System.out.println("========library2========");
		for(int i=0; i < library2.length; i++) {
			library2[i].showBookInfo();
		}
	}
}
