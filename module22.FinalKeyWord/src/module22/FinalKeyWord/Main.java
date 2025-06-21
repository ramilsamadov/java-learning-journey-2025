package module22.FinalKeyWord;

public class Main {
	public static void main(String[] args) {
		User user = new User();
//		user.a = 10;  i can't change it because of final keyword
		System.out.println(user.a);
		user.userDatas("RamilSamadov", "1234");
	}
}
