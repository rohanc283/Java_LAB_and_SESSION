package Lab_Excercises;

abstract class Abstract {

	// TODO Auto-generated method stub
	abstract void draw();

	abstract void erase();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		square s = new square();
		Triangle t = new Triangle();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();

	}

}
