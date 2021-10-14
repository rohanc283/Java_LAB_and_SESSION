package Session_Tasks;

import java.util.Scanner;

public class DescendingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

		int max = arr[0];
		int min = arr[0];
		int maxIndex = 0;
		int minIndex = 0;
		for(int i = 1; i < 5; i++) {
			if(arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
			if(arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		arr[minIndex] = max;
		arr[maxIndex] = min;
		System.out.println("\nModified array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
