package capgemini.interfaces;

class CalculatorImpl implements Calculator, AdvCalculator {
	// The type CalculatorImpl must implement the inherited abstract method
	@Override
	public int add(int no1, int no2) {
		return no1 + no2;
	}

	@Override
	public int sub(int no1, int no2) {
		return no1 - no2;
	}

	@Override
	public int mul(int no1, int no2) {
		return no1 * no2;
	}

	@Override
	public int div(int no1, int no2) {
		return no1 / no2;
	}
}

public class Calculator_Test {
	public static void main(String[] args) {
		Calculator calc;
		AdvCalculator advcalc; 
		
		// cannot instantiate the type Calculator
		// calc=new Calculator();
		CalculatorImpl calculatorImpl = new CalculatorImpl();
		System.out.println("Add:" + calculatorImpl.add(10, 20));
		System.out.println("Sub:" + calculatorImpl.sub(10, 20));
		System.out.println("Mul:" + calculatorImpl.mul(10, 20));
		System.out.println("Div:" + calculatorImpl.div(20, 10));
		
		//ref pointer......
		//calc=calculatorImpl;
		calc = new CalculatorImpl();
		System.out.println("Add: " +calc.add(10, 20));
		System.out.println("Sub: " +calc.sub(10, 20));
		
		//advcalc = calculatorImpl;
		advcalc = new CalculatorImpl();
		System.out.println("Mul: " +advcalc.mul(10, 20));
		System.out.println("Div: " +advcalc.div(20, 10));

	}

}
