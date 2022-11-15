package javastudy.com.array;

public class ObjectCopy3 {
	public static void main(String[] args) {
		Book[] library1 = new Book[5];
		
		library1[0] = new Book("그리스 로마 신화", "asdf");
		library1[1] = new Book("오만과 편견", "제인 어스틴");
		library1[2] = new Book("작은아씨들", "asdf");
		library1[3] = new Book("부활(상)", "asdf");
		library1[4] = new Book("부활(하)","asdf");
		
		Book[] library2 = new Book[5];
		
		library2[0] = new Book();
		library2[1] = new Book();
		library2[2] = new Book();
		library2[3] = new Book();
		library2[4] = new Book();
		
		for(int i=0; i < library1.length; i++) {
//			String bname = library1[i].getBookName();
//			library2[i].setBookName(bname);
			
			library2[i].setBookName(library1[i].getBookName());
			library2[i].setAuthor(library1[i].getAuthor());
		}
		
		library1[3].setBookName("스페이스 오디세이");
		library1[3].setAuthor("아서 클라크");
		
		System.out.println("========library1========");
		for(int i=0; i < library2.length; i++) {
			library1[i].showBookInfo();
		}
		System.out.println("========library2========");
//		for(int i=0; i < library2.length; i++) {
//			library2[i].showBookInfo();
//		}

		for(Book book: library2) {
			book.showBookInfo();
		}
	}
}
