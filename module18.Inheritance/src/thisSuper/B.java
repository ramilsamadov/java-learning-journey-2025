package thisSuper;

public class B extends C {
	public int variableB;
	public int variableB2;

	public B() {
		System.out.println("We are in B");
	}
	public B(int variableB) {
		this.variableB = variableB;
	}
	public B(int variableB,int variableB2) {
		this.variableB = variableB;
		this.variableB2 = variableB2;
	}

	public void bMethod() {
		System.out.println("We are in B_method");
		super.cMethod();
	}

	public int getVariableB() {
		return variableB;
	}

	public void setVariableB(int variableB) {
		this.variableB = variableB;
	}

	public int getVariableB2() {
		return variableB2;
	}

	public void setVariableB2(int variableB2) {
		this.variableB2 = variableB2;
	}
}
