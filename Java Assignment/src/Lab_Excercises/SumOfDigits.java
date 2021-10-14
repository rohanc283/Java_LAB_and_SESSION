package Lab_Excercises;

import java.util.Iterator;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter minimum 4 digit number");
		
		int no = sc.nextInt();
		int sum = 0;
		int digit = 0;
		while (no>0) {
			digit = no%10;
			sum = sum+digit;
			no = no/10;
		}
		System.out.println(sum);
		

	}

}
