package Lab_Excercises;
import java.util.Iterator;
import java.util.Scanner;

public class PrimeNumberChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		
		int no = sc.nextInt();
		int temp = 0;
		for (int i = 0; i <= no; i++) {
			for (int j = 2; j < i-1; j++) {
				if (i%2==0) {
					temp = temp+1;
				}
				
			}
			if (temp == 0) {
				System.out.println(i+" is a prime number");
			}
			else {
				temp = 0;
			}
		}
		
	
	}

}
