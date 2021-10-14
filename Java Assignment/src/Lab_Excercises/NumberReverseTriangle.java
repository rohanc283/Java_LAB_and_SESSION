package Lab_Excercises;

public class NumberReverseTriangle {

	public static void main(String arg[]) {
		String k = "";

		int n = 5; /* if necessary change the value of n* */
		for (int i = 5; i >= 0; i--) {
			k = i + " " + k;
			System.out.print(k + "\n");
		}
	}
}
