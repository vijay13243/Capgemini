package capgemini.labbook_lab2;

public class Cd extends MediaItem {

	private String artist;
	private String genre;
	public Cd(int Identificationnumber, String Title, int Numberofcopies, int runtime, String artist, String genre) {
		super(Identificationnumber, Title, Numberofcopies, runtime);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void Print(){
		System.out.println("Artist: " +this.getArtist());
		System.out.println("Genre :" +this.getGenre());
		System.out.println("Identification number" +this.getIdentificationnumber());
		System.out.println("Title: " +this.getTitle());
		System.out.println("Number of Copies: " +this.getNumberofcopies());
		System.out.println("runtime: " +this.getRuntime());
		}
	@Override
	public String toString() {
		return "Cd [artist=" + artist + ", genre=" + genre + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cd other = (Cd) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		return true;
	}
	@Override
	public void CheckIn() {
		System.out.println("You Checked In");
		
	}
	@Override
	public void CheckOut() {
		System.out.println("You Checked Out");
		
	}
	/*@Override
	public void AddItem(int n) {
		System.out.println("You added a New Item");
		
	}*/
	@Override
	public void AddItem(int n) {
		// TODO Auto-generated method stub
		System.out.println("You added a New Item");
		
	}
	
}
