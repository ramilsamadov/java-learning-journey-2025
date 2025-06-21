package calculation;

public class Triangle extends Calc {
	
	private int height;
	private int width;
	
	public Triangle() {
		
	}
	public Triangle(int height,int width) {
		this.height = height;
		this.width = width;
		name = "Triangle";
	}
	

	@Override
	public void areaCalculation() {
		System.out.println(name +" area is "+ (getWidth()*getHeight())/2);
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

}
