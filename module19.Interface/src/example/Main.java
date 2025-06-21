package example;

public class Main {
	public static void main(String[] args) {
		//String name, String surname, int experience, int salary, String[] progLanguages
		SoftwareEngineer se = new SoftwareEngineer("Ramil","Samadov",3,6000,new String[] {"Java","Python","React","PHP"});
		SoftwareDeveloper sd = new SoftwareDeveloper("Famil","Samadov",1,5000,new String[] {"PHP","JS"});
		
		//for checking the bad scenaio remove the comment section
//		PrintSoftwareDeveloper(sd);
//		System.out.println("---------------------");
//		PrintSoftwareEngineer(se);
		PrintEngineers(se);
		System.out.println("---------------------");
		PrintEngineers(sd);
	} 
	
	
	//bad scenario
//	public static void PrintSoftwareEngineer(SoftwareEngineer se) {
//		se.courseDone(true);
//		se.printData();
//	}
//	public static void PrintSoftwareDeveloper(SoftwareDeveloper sd) {
//		sd.courseDone(true);
//		sd.printData();
//	}
	public static void PrintEngineers(IEngineer engineer) {
		engineer.courseDone(true);
		engineer.printData();
	}
}
