package capgemini.collection;

import java.util.HashMap;
import java.util.Iterator;

public class _Hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap= new HashMap<Integer,String>();
		System.out.println("Size: " +hashmap.size() +"\t"+hashmap);
		hashmap.put(null, null);
		hashmap.put(null, null);	// allows only one null value...
		hashmap.put(0, null);		//allows many null values.....
		hashmap.put(1, "Mon");		//duplicate keys are not allowed....
		hashmap.put(1, "Jan");
		hashmap.put(2, "Feb");
		hashmap.put(3, "Mar");
		System.out.println("Size: " +hashmap.size() +"\t"+hashmap);
		
		//hash map.iterator(); do not get iterator directly.....
		Iterator<Integer>itrkeys=hashmap.keySet().iterator();
		System.out.println("Printing keys");
		while(itrkeys.hasNext()){
			System.out.println(itrkeys.next());
		}
		Iterator<String>itrvalues=hashmap.values().iterator();
		System.out.println("Printing Values");
		while(itrvalues.hasNext()){
			System.out.println(itrvalues.next());
		}
		System.out.println("Printing Key:values");
		Iterator<Integer>itrkeys2=hashmap.keySet().iterator();
		System.out.println("Printing keys");
		while(itrkeys2.hasNext()){
			Integer key=itrkeys2.next();
			System.out.println(key +" : " +hashmap.get(key));
		}
		
	}
}
