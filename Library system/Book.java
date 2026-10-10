package act2;

public class Book extends AbstractItem {
	private int pages;
	private String publisher;
	private int year;

	public Book(int id, String title, String author, int pages, String publisher, int year) {

		super(id, title, author, ItemType.BOOK);
		this.pages = pages;
		this.publisher = publisher;
		this.year = year;

	}
}
