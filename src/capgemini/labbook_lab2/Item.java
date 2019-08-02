package capgemini.labbook_lab2;

public abstract class Item {
	// fields
	private int identificationnumber;
	private String title;
	private int numberofcopies;

	// constructors
	public Item(int Identificationnumber, String Title, int Numberofcopies) {
		super();
		setIdentificationnumber(Identificationnumber);
		setTitle(Title);
		setNumberofcopies(Numberofcopies);

	}

	public int getIdentificationnumber() {
		return identificationnumber;
	}

	public void setIdentificationnumber(int identificationnumber) {
		this.identificationnumber = identificationnumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberofcopies() {
		return numberofcopies;
	}

	public void setNumberofcopies(int numberofcopies) {
		this.numberofcopies = numberofcopies;
	}

	public abstract void Print();

	public abstract void CheckIn();

	public abstract void CheckOut();

	public abstract void AddItem(int n);

	@Override
	public String toString() {
		return "Item [identificationnumber=" + identificationnumber + ", title=" + title + ", numberofcopies="
				+ numberofcopies + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (identificationnumber != other.identificationnumber)
			return false;
		if (numberofcopies != other.numberofcopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
}
