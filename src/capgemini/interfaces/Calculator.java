package capgemini.interfaces;

interface Calculator {
	// by default methods are public and abstract
	int add(int no1, int no2); // no body

	public abstract int sub(int no1, int no2);
	default void defInJdk8(){
		System.out.println("I am feature in JDK 8 called default methods......");
	}
}

interface AdvCalculator {
	int mul(int no1, int no2);

	int div(int no1, int no2);
}
// interfaces are implemented via class

