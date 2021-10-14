package Lab_Excercises;

public class CommandLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		String name = args[2];
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		System.out.println(name);
	}

}
