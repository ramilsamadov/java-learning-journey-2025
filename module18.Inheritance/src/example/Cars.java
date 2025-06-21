package example;

public class Cars {
	private int id;
	private String carBrand;
	private String color;
	private double price;
	private int wheels;

	public Cars() {

	}

	public Cars(int id, String carBrand, String color, double price, int wheels) {
		super();
		this.id = id;
		this.carBrand = carBrand;
		this.color = color;
		this.price = price;
		this.wheels = wheels;
	}

	public void carDetails() {
		System.out.println("Car details!!!");
		System.out.println("---------------------");
	}

	public void punishments(double amount) {
		System.out.println("Trafic punishment ");
		System.out.println("---------------------");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

}
