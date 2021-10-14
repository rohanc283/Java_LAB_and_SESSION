package Lab_Excercises;

public class MultipleInheritance {

	public static void main(String[] args) {
		Tyre tyre = new Tyre();
		System.out.println(tyre.isMovable());
		System.out.println(tyre.isRollable());		
		tyre.move();

	}

}

interface Moveable{
	int AVERAGE_SPEED = 50; 
	void move(); 
	boolean isMovable();
}

interface Rollable { 
	boolean isRollable();
}

class Tyre implements Moveable, Rollable{

	@Override
	public boolean isRollable() {		
		return true;
	}

	@Override
	public void move() {
		System.out.println("Avg Speed: "+AVERAGE_SPEED);
	}

	@Override
	public boolean isMovable() {
		return true;
	}
	
}
