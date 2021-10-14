package Lab_Excercises;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		
		System.out.println("Switch Statement =======");
		
		switch (i) {
		case 10:
			System.out.println(i);
			break;
		case 5:
			System.out.println(i);
			break;

		default:
			break;
		}
		
		System.out.println("If Statement =======");
			
		if (i>5) {
			System.out.println(i);
		}
		
		System.out.println("For loop =======");
		for (int j = 0; j < i; j++) {
			System.out.print(j+ " ");
		}
		System.out.println();
		System.out.println("While Statement =======");
		while (i>0) {
			System.out.print(i+ " ");
			i--;
		}
		System.out.println();	
		
	}

}
