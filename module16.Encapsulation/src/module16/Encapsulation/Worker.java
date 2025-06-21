package module16.Encapsulation;

public class Worker {
	private long id;
	private String name;
	private String surname;
	private int salary;

	public Worker(long id, String name, String surname, int salary) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}
	public Worker() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if(salary>1000 && salary < 5000) {
			this.salary = salary;

		}
	}
}
