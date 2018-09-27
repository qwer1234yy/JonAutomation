package fitnesse;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
 int a=10, b=2;
 Calculator c= new Calculator();
 
 public void addTest() {
	 c.setA(a);
	 c.setB(b);
	 System.out.println(c.add());
 }
}
