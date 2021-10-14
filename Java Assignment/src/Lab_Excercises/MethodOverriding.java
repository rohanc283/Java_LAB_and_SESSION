package Lab_Excercises;

public class MethodOverriding {
	
	public static void main(String[]args) {
		B2 b = new B2();
		b.show();
	}

}

class A2{
	void show() {
		System.out.println("class A");
	}
}
class B2 extends A{
	void show() {
		System.out.println("class B");
	}
	
}


