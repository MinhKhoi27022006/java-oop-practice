package act2;

public abstract class AbstractItem implements Item {
	private int id;
	private String title;
	private String author;
	private ItemType type;

	public AbstractItem(int id, String title, String author, ItemType type) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;

	}

	public String getAuthor() {
		return author;
	}

	public ItemType getType() {
		return type;
	}

	@Override
	public String toString() {
		return id + "-" + title + "-" + author + "-" + type;
	}

}
