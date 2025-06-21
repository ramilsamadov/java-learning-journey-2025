package example;

public class Truck extends Cars {
	private double punishmentAmount;
	public double getPunishmentAmount() {
		return punishmentAmount;
	}
	public void setPunishmentAmount(double punishmentAmount) {
		this.punishmentAmount = punishmentAmount;
	}
	public Truck() {
		 
	}
	public Truck(int id, String carBrand, String color, double price, int wheels,double punishmentAmount) {
		setId(id);
		setCarBrand(carBrand);
		setColor(color);
		setPrice(price);
		setWheels(wheels);
		setPunishmentAmount(punishmentAmount);
	}
	@Override
	public void punishments(double amount) {
		super.punishments(amount);
		System.out.println(getCarBrand()+" brand punishment is "+getPunishmentAmount());
		

	}
	@Override
	public void carDetails() {
		super.carDetails();
		System.out.println("ID:        "+getId());
		System.out.println("Car Brand: "+getCarBrand());
		System.out.println("Color:     "+getColor());
		System.out.println("Price:     "+getPrice());
		System.out.println("Wheels:    "+getWheels());


	}
}
