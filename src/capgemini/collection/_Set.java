package capgemini.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class _Set {
	public static void main(String[] args) {
		//HashSet<String> hashset=new HashSet<String>();
		LinkedHashSet<String> hashset=new LinkedHashSet<String>();
		System.out.println("Size: " +hashset.size() +"\t"+hashset);
		hashset.add("jan");
		hashset.add("jan");	//no duplicates are allowed......
		hashset.add(null);
		hashset.add(null);	// only one null is allowed....
		hashset.add("feb");
		hashset.add("Mar");	// insertion order is not maintained....
		hashset.add("Apr");
		hashset.remove("Mar");
		System.out.println("Size: " +hashset.size() +"\t"+hashset);
		Iterator<String> iterator = hashset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//enhanced for loop
		for(String s:hashset){
			System.out.println(s);
		}
		
	}

}
