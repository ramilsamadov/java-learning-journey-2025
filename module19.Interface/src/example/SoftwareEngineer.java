package example;

public class SoftwareEngineer extends BaseEngineer implements IEngineer {

	
	public SoftwareEngineer() {
		
	}
	


	public SoftwareEngineer(String name, String surname, int experience, int salary, String[] progLanguages) {
		setName(name);
		setSurname(surname);
		setExperience(experience);
		setSalary(salary);
		setProgLanguages(progLanguages);
	}

	@Override
	public void printData() {
		 System.out.println("Name:       "+getName());
		 System.out.println("Surname:    "+getSurname());
		 System.out.println("Salary:     "+getSalary());
		 System.out.println("Experience: "+getExperience());
		 System.out.println("Course check:"+getDegreeCheck());
		 System.out.println("Programming Languages: ");
		 for(String lang : getProgLanguages()) {
			System.out.println(" - "+lang); 
		 }
		 
	}

	@Override
	public void courseDone(boolean value) {
		if(value) {
			setDegreeCheck("Course complete");
		}
		else {
			setDegreeCheck("Course nor complete");
		}
	}


	

	

}
