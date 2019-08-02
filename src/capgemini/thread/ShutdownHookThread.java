package capgemini.thread;

public class ShutdownHookThread {
	public static void main(String[] args) throws Exception {
		Runtime runTime = Runtime.getRuntime();
		runTime.addShutdownHook(new Thread());
		System.out.println("Now main Sleeping.... press ctrl+c to exit");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {

		}

	}

}

class ShutdownHook extends Thread {
	public void run() {
		System.out.println("ShutdownHook TASK Completed......");
	}
}