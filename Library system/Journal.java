package act2;

public class Journal extends AbstractItem {
	private int issueNumber;
	private int publiccationDate;

	public Journal(int id, String title, String author, int issueNumber, int publicationDate) {

		super(id, title, author, ItemType.JOURNAL);
		this.issueNumber = issueNumber;
		this.publiccationDate = publicationDate;
	}

}
