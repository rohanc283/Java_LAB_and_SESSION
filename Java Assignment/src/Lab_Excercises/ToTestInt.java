package Lab_Excercises;

interface TaskofInterface1 {
	public int square(int a);
}

// Implements 
class arithmetic implements TaskofInterface1 {

	public int square(int b) {
		System.out.println("Inside arithmetic class � implemented method square");
		System.out.println("Square of b " + "is " + b*b);
		return b;
	}

	void armeth() {

		System.out.println("Inside method of class Arithmetic");
	}
}

public class ToTestInt {

	public static void main(String[] args) {
		System.out.println("calling from ToTestInt class main method");
		arithmetic t = new arithmetic();
		System.out.println("==============================");
		System.out.println("created object of test interface � reference Arithmetic class ");
		System.out.println("Hence Arithmetic class method square called");
		System.out.println("This object cannot call armeth method of Arithmetic class");
		System.out.println("=================================");
		t.square(10);
		System.out.println("=================================");

	}

}
