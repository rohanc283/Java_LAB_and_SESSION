package Lab_Excercises;

public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 B b = new B();
		 b.show();
		 b.show2();

	}

}

class A{
	void show() {
		System.out.println("class A");
	}
}
class B extends A{
	void show2() {
		System.out.println("class B");
	}
	
}