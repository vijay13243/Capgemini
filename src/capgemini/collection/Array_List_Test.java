package capgemini.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Test {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String str = "hi";
		list.add("Vijay");
		list.add(str);
		list.add(str + str);

		// using Iterator................
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj);
		}

		System.out.println(list.size());
		System.out.println(list.contains(42));
		System.out.println(list.contains("hihi"));
		list.remove("hi");
		System.out.println(list.size());
	}
}
