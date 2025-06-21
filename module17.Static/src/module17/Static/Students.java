package module17.Static;

public class Students {
	private int id;
	private String name;
	private String surname;
	public static int number;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		Students.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	public static void printNumber() {
		System.out.println("Phone number +48"+number);
	}
	public void studentsInfo() {
		System.out.println("Id: "+id);
		System.out.println("Surname: "+surname);
		System.out.println("Name: "+name);
		printNumber();
	}
}
