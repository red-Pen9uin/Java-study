package javastudy.com.array;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList <Book>();
		
		library.add(new Book("그리스 로마 신화", "asdf"));
		library.add(new Book("그리스 로마 신화", "asdf"));
		library.add(new Book("그리스 로마 신화", "asdf"));
		library.add(new Book("그리스 로마 신화", "asdf"));
		library.add(new Book("그리스 로마 신화", "asdf"));
		
		for(int i=0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		for(Book book: library) {
			book.showBookInfo();
		}
	}
	
	
}
