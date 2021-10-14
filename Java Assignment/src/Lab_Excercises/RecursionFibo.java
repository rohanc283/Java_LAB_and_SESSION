package Lab_Excercises;


public class RecursionFibo {

	long fibo(int n) {
		if (n <= 1)
			return 1;
		else
			return (fibo(n - 1) + fibo(n - 2));
	}

	public static void main(String[] args) {
		RecursionFibo f;
		long l;
		f = new RecursionFibo();
		l = f.fibo(5);
		System.out.println("5th Fibonacci number is : " + l);

	}

}

