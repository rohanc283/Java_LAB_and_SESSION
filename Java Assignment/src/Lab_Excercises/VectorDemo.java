package Lab_Excercises;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		String s = "Delhi";
		String ss = "Chennai";
		Vector v = new Vector();
		v.addElement(s);
		v.addElement(ss);
		System.out.println("Size is " + v.size());
		System.out.println(v);

	}

}
