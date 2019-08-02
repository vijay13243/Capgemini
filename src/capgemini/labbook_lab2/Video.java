package capgemini.labbook_lab2;

import java.util.Date;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private int year;

	public Video(int Identificationnumber, String Title, int Numberofcopies, int runtime, String director, String genre,
			int year) {
		super(Identificationnumber, Title, Numberofcopies, runtime);
		this.director = director;
		this.genre = genre;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", year=" + year + "]";
	}

	public void Print() {
		System.out.println("Director: " + this.getDirector());
		System.out.println("Genre :" + this.getGenre());
		System.out.println("Year : " + this.getYear());
		System.out.println("Identification number" + this.getIdentificationnumber());
		System.out.println("Title: " + this.getTitle());
		System.out.println("Number of Copies: " + this.getNumberofcopies());
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public void CheckIn() {
		System.out.println("You Checked In" + new Date());
	}

	@Override
	public void CheckOut() {
		System.out.println("You Checked Out");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Video other = (Video) obj;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public void AddItem(int n) {
		// TODO Auto-generated method stub
		System.out.println("ADDED:" + n);

	}

}
