package capgemini.thread;

public class ThreeThread {
	public static void main(String[] args) {
		new TablePrint(1).start();
		new TablePrint(10).start();
		new TablePrint(100).start();
	/*	TablePrint t1=new TablePrint(1);
		TablePrint t2=new TablePrint(10);
		TablePrint t3=new TablePrint(100);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
		}


class TablePrint extends Thread {
	int startTable;

	public TablePrint(int startTable) {
		this.startTable = startTable;
	}

	@Override
	public void run() {
		for (int num = 1; num <= 10; num++) {
			System.out.println(startTable + "*" + num + " = " + num * startTable);

		}
	}
}
