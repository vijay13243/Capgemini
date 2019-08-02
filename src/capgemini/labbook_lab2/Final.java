package capgemini.labbook_lab2;

public class Final {
	public static void main(String args[]) {
		Book b = new Book(100, "VIJAY", 20, "Sriram");
		Video v = new Video(100, "VIJAY", 20, 60, "Sriram", "action", 1998);
		Cd c = new Cd(100, "VIJAY", 20, 60, "Sriram", "action");
		JournalPaper j = new JournalPaper(100, "VIJAY", 20, "Sriram", 1997);
		System.out.println("PRINTING BOOK DATA");
		b.Print();
		b.AddItem(10);
		b.CheckIn();
		b.CheckOut();
		System.out.println();
		System.out.println("PRINTING VIDEO DATA");
		v.Print();
		v.CheckIn();
		v.CheckOut();
		v.AddItem(20);
		System.out.println();
		System.out.println("PRINTING JOURNAL DATA");
		j.Print();
		j.AddItem(50);
		j.CheckIn();
		j.CheckOut();
		j.AddItem(100);
		System.out.println();
		System.out.println("PRINTING CD DATA");
		c.AddItem(100);
		c.CheckIn();
		c.CheckOut();
		c.Print();
 
	}

}
