package capgemini.labbook_lab2;

public class JournalPaper extends WrittenItem {
	// fields
	private int publishedyear;

	public JournalPaper(int Identificationnumber, String Title, int Numberofcopies, String authorname,
			int publishedyear) {
		super(Identificationnumber, Title, Numberofcopies, authorname);
		this.publishedyear = publishedyear;
	}

	public int getPublishedyear() {
		return publishedyear;
	}

	public void setPublishedyear(int publishedyear) {
		this.publishedyear = publishedyear;
	}

	@Override
	public void Print() {
		System.out.println("Author Name: " + this.getAuthorname());
		System.out.println("Identification number" + this.getIdentificationnumber());
		System.out.println("Title: " + this.getTitle());
		System.out.println("Number of Copies: " + this.getNumberofcopies());
		System.out.println("published year: " + this.getPublishedyear());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		JournalPaper other = (JournalPaper) obj;
		if (publishedyear != other.publishedyear)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "JournalPaper [publishedyear=" + publishedyear + "]";
	}

	@Override
	public void CheckIn() {
		System.out.println("You Checked In");
	}

	@Override
	public void CheckOut() {
		System.out.println("You Checked Out");
	}

	@Override
	public void AddItem(int n) {
		System.out.println("You added a New Item");
	}

}
