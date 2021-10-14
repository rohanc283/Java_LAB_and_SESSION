package Session_Tasks;

import java.util.Scanner;

class Pattern1{
	
	void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row");
		int row = sc.nextInt();
		int i , j;
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=row-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=1; j<=i; j++ )   
		{   
		//prints star      
		System.out.print(j+" "); 
		    
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
	}
	public static void main(String[] a) {
		Pattern1 obj = new Pattern1();
		obj.display();
	}
	
}
