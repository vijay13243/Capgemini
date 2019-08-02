package capgemini.lang;

import capgemini.javabeans.Employee;

//public class My_System extends System{
public class My_System {
	public static void main(String[] args) {
		long startMemory = Runtime.getRuntime().freeMemory();
		long startTimeMillis = System.currentTimeMillis();
		System.out.println("Start Memory: " + startMemory);
		System.out.println("Start Time: " + startTimeMillis);
		// consuming memory.....
		for (int index = 0; index < 10000; index++) {
			new Employee();
		}
		System.out.println("Last employee Id:" + Employee.SEQUENCE);
		System.out.println("Total employee count:" + Employee.COUNT); // 3
		long endTImeMillis = System.currentTimeMillis();
		long endMemory = Runtime.getRuntime().freeMemory();
		System.out.println("END MEMORY " + endTImeMillis);
		System.out.println("END TIME: " + endMemory);

	}
}
