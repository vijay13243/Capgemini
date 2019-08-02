package capgemini.labbook_lab2;

public abstract class MediaItem extends Item {
	private int runtime;

	public MediaItem(int Identificationnumber, String Title, int Numberofcopies, int runtime) {
		super(Identificationnumber, Title, Numberofcopies);

		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + "]";
	}

	public abstract void Print();

	public abstract void CheckIn();

	public abstract void CheckOut();

	public abstract void AddItem(int n);

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MediaItem other = (MediaItem) obj;
		if (runtime != other.runtime)
			return false;
		return true;
	}

}
