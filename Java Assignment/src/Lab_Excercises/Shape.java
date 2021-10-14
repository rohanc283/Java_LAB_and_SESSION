package Lab_Excercises;

abstract class Shape {
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

class Circle extends Shape {
	void draw() {
		System.out.println("Circle is drawn");
	}

	void erase() {
		System.out.println("Circle is erased");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Triangle is drawn");
	}

	void erase() {
		System.out.println("Triangle is erased");
	}
}

class square {
	void draw() {
		System.out.println("Square is drawn");
	}

	void erase() {
		System.out.println("square is erased");
	}
}