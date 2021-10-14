package Lab_Excercises;

public class MatAdd {
	public static void main(String a1[]) {
		int I, j, k;
		int a[][] = { { 4, 7, 9, 8, 3 }, { 2, 4, 7, 8, 1 }, { 1, 1, 8, 1, 2 }, { 0, 0, 1, 0, 4 } };
		int b[][] = { { 1, 2, 8, 4, 3 }, { 4, 1, 8, 3, 1 }, { 2, 1, 0, 0, 5 }, { 1, 2, 1, 1, 7 } };
		int c[][];
		c = new int[4][5];
		for (I = 0; I < 4; I++)
			for (j = 0; j < 5; j++)
				c[I][j] = a[I][j] + b[I][j];
		for (I = 0; I < 4; I++) {
			System.out.println("\n");
			for (j = 0; j < 5; j++)
				System.out.print(c[I][j]);
		}
	}
}