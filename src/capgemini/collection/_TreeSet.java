package capgemini.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class _TreeSet {
	public static void main(String[] args) {
		TreeSet<String> treeset= new TreeSet<String>();
		System.out.println("Size: " +treeset.size() +"\t"+treeset);
	
		treeset.add("A");
		treeset.add("A");	//no duplicates are allowed......
		treeset.add("C");	// insertion order is not maintained....
		treeset.add("B");	// sorts values on insertion.....
		System.out.println("Size: " +treeset.size() +"\t"+treeset);
		
		Iterator<String> iterator = treeset.iterator();
		System.out.println("Printing in ascending order");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Printing in descending order");
		Iterator<String> descendingiterator = treeset.descendingIterator();
		while (descendingiterator.hasNext()) {
			System.out.println(descendingiterator.next());
		}
		//enhanced for loop
				for(String s:treeset){
					System.out.println(s);
				}
		
	
	
	
	
	
	}

}
