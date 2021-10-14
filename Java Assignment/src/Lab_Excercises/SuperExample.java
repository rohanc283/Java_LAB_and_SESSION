package Lab_Excercises;
class SuperExample2{
	int x=20;
	SuperExample2(){
		System.out.println("Heloo parent");
		
	}
}

class child extends SuperExample2{
	int x=10;
	public child() {
		super();
		System.out.println("Hello child");
		System.out.println(super.x);
		System.out.println(x);
	}
}

public class SuperExample {

	public static void main(String[] args) {
		SuperExample2 a=new SuperExample2();
		child b=new child();

	}

}


