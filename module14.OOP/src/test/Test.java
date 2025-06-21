package test;

import com.ramilsamadov.Students;

public class Test {

	public static void main(String[] args) {
		Students students = new Students();
		students.id = 1;
		students.name = "Ramil";
		students.surname = "Samadov";
		System.out.println("Student datas ");
		System.out.println("Student's id: "+students.id);
		System.out.println("Student's name: "+students.name);
		System.out.println("Student's surname: "+students.surname);

		

	}

}
