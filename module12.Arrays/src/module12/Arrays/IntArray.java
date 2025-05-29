package module12.Arrays;

public class IntArray {
	public static void main(String[] args) {
		int[] arrInt = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int num : arrInt) {
			System.out.println(num);
		}

		System.out.println("************");
		int[] arr = new int[6];
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 14;
		arr[5] = 15;
		for (int num : arr) {
			System.out.println(num);
		}
	}
}
