package capgemini.thread;

public class TableThread {
	public static void main(String[] args) {
		System.out.println("TableThread-> Started.....");

		new Thread("table:1") {
			public void run() {
				System.out.println(getName());
				for (int num = 1; num <= 10; num++) {
					System.out.println(1 + "*" + num + " = " + num * 1);
				}
			}
		}.start();
		new Thread("table:2") {
			public void run() {
				System.out.println(getName());
				for (int num = 1; num <= 10; num++) {
					System.out.println(10 + "*" + num + " = " + num * 10);
				}
			}
		}.start();
		new Thread("table:3") {
			public void run() {
				System.out.println(getName());
				for (int num = 1; num <= 10; num++) {
					System.out.println(100 + "*" + num + " = " + num * 100);
				}
			}
		}.start();
	}

}
