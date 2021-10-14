package Lab_Excercises;


public class RecursionArray {

	int fact (int n) 
	 { 
	 if (n <= 1) {
		return 1; 
	 }
	 else {
	    return (n * fact(n-1));
	 }
	 }

	public static void main(String[] args) {
		int fa, fb, fc;
		int a = 4, b = 5, c = 6;
		RecursionArray f = new RecursionArray();
		fa = f.fact(a);
		fb = f.fact(b);
		fc = f.fact(c);
		System.out.println("Factorial of " + a + "is " + fa);
		System.out.println("Factorial of " + b + " is " + fb);
		System.out.println("Factorial of " + c + "is " + fc);

	}

}
