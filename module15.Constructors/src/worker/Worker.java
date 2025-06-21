package worker;

public class Worker {
	public int no;
	public String name;
	public String surname;
	public int experience;
	public int salary;
	
    public Worker(int no, String name, String surname, int experience, int salary) {
        this.no = no;
        this.name = name;
        this.surname = surname;
        this.experience = experience;
        this.salary = salary;
    }
	public Worker() {
		System.out.println("**********Worker Details**********");
		System.out.println("No: " + no);
		System.out.println("Name: " + name);
		System.out.println("Surname: " + surname);
		System.out.println("Experience: " + experience);
		System.out.println("Salary: " + salary);
	}
	public void showDetails() {
		System.out.println("**********Worker Details**********");
		System.out.println("No: " + no);
		System.out.println("Name: " + name);
		System.out.println("Surname: " + surname);
		System.out.println("Experience: " + experience);
		System.out.println("Salary: " + salary);
	}

	public void empoleeDetails() {
		this.no = no;
		this.name = name;
		this.surname = surname;
		this.experience = experience;
		this.salary = salary;
	}

	public void increase(int inc_amount) {
		System.out.println("Your salary " + inc_amount + "zl increased");
		System.out.println("Yiur current salary is " + (salary + inc_amount));
	}

	public void format(String opsystem, String byWho) {
		System.out.println(byWho + " is formating your computer's OS "+opsystem);
	}
}
