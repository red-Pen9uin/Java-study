package javastudy.com.bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		// 1. BookShelf 생성
		Queue bookshelf = new BookShelf();
		
		// 2. BookShelf에 3권의 책을 넣는다
		bookshelf.enQueue("이방인");
		bookshelf.enQueue("맥베스");
		bookshelf.enQueue("뻐꾸기 둥지 위로 날아가는 새");
		
		// 3. BookShelf에 몇 권의 책이 있는지 확인
		bookshelf.getSize();
		
		// 4. BookShelf에서 책을 순서대로 한권씩 꺼낸다
		System.out.println(bookshelf.deQueue());
		System.out.println(bookshelf.deQueue());
		System.out.println(bookshelf.deQueue());
	}
}
