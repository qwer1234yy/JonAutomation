package fitnesse;

public class Calculator {
     public int a,b;
     
     public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int add() {
    	 return a+b;
     }
     public int minus() {
    	 return a-b;
     }
     public int multible() {
    	 return a*b;
     }
     public int divide() {
    	 return a/b;
     }
     public int divideByTest() {
    	 return a/b;
     }
}
