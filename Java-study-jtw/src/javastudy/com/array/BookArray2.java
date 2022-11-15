package javastudy.com.array;

public class BookArray2 {
	public static void main(String[] args) {
		//		int[] name = new int[size]
		Book[] library = new Book[5];
		
		library[0] = new Book("그리스 로마 신화", "asdf");
		library[1] = new Book("오만과 편견", "제인 어스틴");
		library[2] = new Book("작은아씨들", "asdf");
		library[3] = new Book("부활(상)", "asdf");
		library[4] = new Book("부활(하)","asdf");
		
		for(int i=0; i< library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i=0; i< library.length; i++) {
			System.out.println(library[i]);
			//			System.out.println(참조변수 이름);
		}
	}
}
