package Lab_Excercises;
import java.util.*;
import java.util.Scanner;

public class Two_Strings_Are_Equal_or_Not{
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String s1 = sc.nextLine();
		System.out.println("Enter Second String");
		String s2 = sc.nextLine();
		
		if (s1.trim().equals(s2.trim())) {
			System.out.println("Both String are equal");
		} else {
			System.out.println("Both String are not equal");
		}
		
		System.out.println(s1+" "+s2);
	}

}
