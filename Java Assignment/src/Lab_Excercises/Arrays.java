package Lab_Excercises;
import java.util.*;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("lenth of an array=======");
		System.out.println(arr.length);
		System.out.println("One Dimensional Array=======");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nTwo Dimensional Array=======");
		
		int[][] arr2 = {{10,20},{30,40,50}};
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
		}
		System.out.println("\nThree Dimensional Array=======");
		int[][][] arr3 = {{{10,20},{30,40,50}},{{60,70},{80,90,100}}};
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				for (int k = 0; k < arr3[i][j].length; k++) {
					System.out.print(arr3[i][j][k]+" ");
				}
			}
		}
		System.out.println("\nFour Dimensional Array=======");
		int[][][][] arr4 = {{{{10,20},{30,40,50},{60,70,80},{90,100}}}};
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				for (int k = 0; k < arr4[i][j].length; k++) {
					for (int l = 0; l < arr4[i][j][k].length; l++) {
						System.out.print(arr4[i][j][k][l]+" ");
					}
				}
			}
		}
	}

}
