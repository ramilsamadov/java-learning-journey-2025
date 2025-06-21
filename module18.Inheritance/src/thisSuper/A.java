package thisSuper;

public class A extends B {
	public int variableA;
	public int variableA2;
	public A() {
		System.out.println("We are in A");
	}
	public A(int variableA,int variableA2) {
		super(variableA,variableA2);
//		this.variableA = variableA;
//		this.variableB = variableA2;
	}
	public void aMethod() {
		System.out.println("We are in A_Method");
		super.bMethod(); 
		//super() must be on top place and it works in constructor
	}
}
