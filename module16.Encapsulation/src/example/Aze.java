package example;

import java.util.Random;

public class Aze {
	private Long id;
	private String birthPlace;
	private String aze;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getAze() {
		return aze;
	}
	
	boolean check = true;
	public void setAze(String aze) {
		if(aze.length() == 11) {
			for(int i = 0; i<aze.length();i++) {
				char character = aze.charAt(i);
				if(Character.isDigit(character)) {
					check = true;
				}
				else {
					check = false;
					break;
				}
			}
			if(check) {
				Random random = new Random();
				int serianum = random.nextInt(100);
				printResult("Seria number : "+serianum);
			}
			else {
				printResult("Type the all characters with numbers ");
			}
		}else {
			printResult("Aze must be 11 character ");
		}
		this.aze = aze;
	}
	public void printResult(String result) {
		System.out.println(result);
	}

	public static void main(String[] args) {

	}
}
