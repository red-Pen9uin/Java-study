package javastudy.com.bookshelf;

import java.util.ArrayList;

public class BookShelf extends Shelf implements Queue{
//	protected ArrayList <String> shelf;
	
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}
	
	@Override
	public String deQueue() {
		return shelf.remove(0);
	}
	
	@Override
	public int getSize() {
		return getCount();
	}
	
}
