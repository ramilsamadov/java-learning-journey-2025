package test;

import com.ramilsamadov.Students;

public class Test {
	public static void main(String[] args) {
		Students students = new Students(1, "Ramil", "Samadov");

//		students.id = 1;
//		students.name = "Ramil";
//		students.surname = "Samadov";

		System.out.println("ID : " + students.id + "\nName : " + students.name + "\nSurname : " + students.surname);
	}
}
