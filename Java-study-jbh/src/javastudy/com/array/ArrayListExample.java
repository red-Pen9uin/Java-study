package javastudy.com.array;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		
		ArrayList <Book> library = new ArrayList <Book>();
		
//		library[0] = new Book("제인 에어", "asdf");
//		library[1] = new Book("그리스 로마 신화", "asdf");
//		library[2] = new Book("노인과 바다", "헤밍웨이");
//		library[3] = new Book("부활 (상)", "asdf");
//		library[4] = new Book("부활 (하)", "asdf");
		
		library.add(new Book("제인 에어", "asdf"));
		library.add(new Book("그리스 로마 신화", "asdf"));
		library.add(new Book("노인과 바다", "헤밍웨이"));
		library.add(new Book("부활 (상)", "asdf"));
		library.add(new Book("부활 (하)", "asdf"));
		
//		for(int i=0; i< library.length; i++) {
//			library[i].showBookInfo();
//		}
		
		for(int i=0; i< library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
//			library.get(i).showBookInfo();
		}
		System.out.println("========향상된 for문======");
		for(Book book: library) {
			book.showBookInfo();
		}
	}
}
