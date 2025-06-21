package module22.FinalKeyWord;

public class BaseClass {
	private long id;
	
	public final void test() {
		System.out.println("Test");
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
