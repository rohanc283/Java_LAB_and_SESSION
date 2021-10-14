package Lab_Excercises;

public class QuadraticExpressionRoots {
	double a, b, c;

	QuadraticExpressionRoots(double a, double b, double c) {
		a = a;
		b = b;
		c = c;
	}

	void root() {
		double r1, r2, d, rp, ri;
		d = a * a - 4 * a * c;
		if (d < 0) {
			rp = -b / (2.0 * a);
			ri = Math.sqrt(Math.abs(d)) / (2.0 * a);
			System.out.println("The roots are complex conjugates");
			System.out.println("Roots1 = " + rp + "i" + ri);
			System.out.println("Roots2 = " + rp + "i" + ri);
		}
		if (d == 0) {
			r1 = -b / (2.0 * a);
			System.out.println("The roots are real and equal");
			System.out.println("Root = " + r1);
		}
		if (d > 0) {
			r1 = (-b + Math.sqrt(d)) / (2.0 * a);
			r2 = (-b - Math.sqrt(d)) / (2.0 * a);
			System.out.println("Root1 = " + r1 + "\n Root2 = " + r2);
		}
	}

	public static void main(String a[]) {
		QuadraticExpressionRoots q1, q2, q3;
		q1 = new QuadraticExpressionRoots(1.0, -5.0, 6.0);
		q2 = new QuadraticExpressionRoots(4.0, -20.0, 25.0);
		q3 = new QuadraticExpressionRoots(2.0, 1.0, 2.0);
		q1.root();
		q2.root();
		q3.root();
	}
}