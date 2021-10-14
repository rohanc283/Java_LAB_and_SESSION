package Lab_Excercises;

public class StaticExample {
	static int b = 5;
	static void show() {
		System.out.println("static show");
	}
	static{
		System.out.println("static block");
	}
	void display() {
		System.out.println("Not a static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample staticExample = new StaticExample();
		staticExample.show();
		System.out.print(staticExample.b);
		

	}

}
