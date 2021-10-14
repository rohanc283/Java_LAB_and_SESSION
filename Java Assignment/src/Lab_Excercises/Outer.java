package Lab_Excercises;

public class Outer {
	
	void display() {
		System.out.println("Outer");
	}
	
	class Inner{
		void display() {
			System.out.println("Inner");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		outer.display();
		inner.display();

	}

}
