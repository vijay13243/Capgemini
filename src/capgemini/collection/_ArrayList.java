package capgemini.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class _ArrayList {
	public static void main(String[] args) {
		// ArrayList<String> list = new ArrayList<String>();
		// LinkedList<String> list = new LinkedList<String>();
		Vector<String> list = new Vector<String>();
		System.out.println("Size: " + list.size() + "\t" + list);
		list.add("Sun");
		list.add("Mon");
		list.add("Wed");
		System.out.println("Size: " + list.size() + "\t" + list);
		// added based on index
		list.add(2, "tue");
		System.out.println("Size: " + list.size() + "\t" + list);
		list.add("Thur");
		list.add("Free");
		list.add("Sat");
		list.add("Soon");

		System.out.println("Size: " + list.size() + "\t" + list);
		// searched a string
		if (list.contains("Free"))
			// list.set(5, "Fri");
			list.set(list.indexOf("Free"), "Fri");

		if (list.contains("Soon"))
			list.remove("Soon");
		System.out.println("Size: " + list.size() + "\t" + list);
		// enhanced for loop....................
		for (String s : list) {
			System.out.println(s);
		}
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Printing in descending order");
		ListIterator<String> listiterator = list.listIterator();
		while (listiterator.hasNext())
			listiterator.next();

		while (listiterator.hasPrevious())
			System.out.println(listiterator.previous());
	}

}
