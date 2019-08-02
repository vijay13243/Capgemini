package capgemini.labbook_lab2;

public class Book extends WrittenItem  {

	public Book(int Identificationnumber, String Title, int Numberofcopies, String Authorname) {
		super(Identificationnumber, Title, Numberofcopies,Authorname);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Print(){
		System.out.println("Author Name: " +this.getAuthorname());
		System.out.println("Identification number" +this.getIdentificationnumber());
		System.out.println("Title: " +this.getTitle());
		System.out.println("Number of Copies: " +this.getNumberofcopies());
		}
	@Override
	public void CheckIn(){
		System.out.println("You Checked In");
	}
	@Override
	public void CheckOut(){
		System.out.println("You Checked Out");
	}
	@Override
	public void AddItem(int n){
		System.out.println("You added a New Item" +n);
	}
	

}
