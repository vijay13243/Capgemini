package capgemini.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JUnit_4_JAVA_Runner {
	public static void main(String[] args) {
		System.out.println("Running JUnit Test cases using Junit Core....");
		Result result = JUnitCore.runClasses(CalculatorAddSubTest.class, CalculatorMulDivTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Test Successful?:" + result.wasSuccessful());
	}
}
