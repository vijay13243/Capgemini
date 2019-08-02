package capgemini.thread;

public class CommunicationInterThread {
	public static void main(String[] args) {
		System.out.println("CommunicationInterThread-> started");
		Account account = new Account();
		new Thread() {
			public void run() {
				account.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				account.deposit(10000);
			}
		}.start();
		System.out.println("CommunicationInterThread-> ended");
	}
}

class Account {
	int accbal = 10000;

	synchronized void withdraw(int amount){
		System.out.println("Going to withdraw");
		if(amount>accbal){
			try{
				wait();
			}
			catch(InterruptedException e){
			e.printStackTrace();	
			}
		}
		this.accbal-=amount;
		System.out.println("withdraw completed");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit");
		this.accbal += amount;
		System.out.println("deposit completed");
		notify();
	}
}
