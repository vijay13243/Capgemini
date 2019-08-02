package capgemini.collection;

public class Test_Boxuunbox {
	public static void main(String[] args) {
		int m = 10;
		Integer IntObj = new Integer(10);
		m = IntObj; // object type is assigned to primitive type
		IntObj = m; // primitive type is assigned to wrapper type

		// before JDK 1.5- explicit type conversion was needed

		// object type is converted and assigned to primitive type
		m = IntObj.intValue();

		// Primitive type is converted and assigned to Object type

		IntObj = Integer.valueOf(m);
		System.out.println(+IntObj);
		System.out.println(+m);
	}
}
