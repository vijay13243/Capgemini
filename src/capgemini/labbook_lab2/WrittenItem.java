package capgemini.labbook_lab2;

public abstract class WrittenItem extends Item {
	// fields
	private String Authorname;

	public WrittenItem(int identificationnumber, String title, int numberofcopies, String authorname) {
		super(identificationnumber, title, numberofcopies);
		this.Authorname = authorname;
	}

	public String getAuthorname() {
		return Authorname;
	}

	public void setAuthorname(String authorname) {
		this.Authorname = authorname;
	}

	public abstract void Print();

	public abstract void CheckIn();

	public abstract void CheckOut();

	public abstract void AddItem(int n);

	@Override
	public String toString() {
		return "WrittenItem [Authorname=" + Authorname + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WrittenItem other = (WrittenItem) obj;
		if (Authorname == null) {
			if (other.Authorname != null)
				return false;
		} else if (!Authorname.equals(other.Authorname))
			return false;
		return true;
	}

}
