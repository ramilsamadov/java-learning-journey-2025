package calculation;

public class Square extends Calc {
	
	private int height;
	private int width;

	public Square() {
		
	}
	public Square(int height,int width,String name) {
		this.height = height;
		this.width = width;
		super.name = name;
	}
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void areaCalculation() {
		System.out.println(super.name + " area is " + getHeight()*getWidth());
		
	}

}
