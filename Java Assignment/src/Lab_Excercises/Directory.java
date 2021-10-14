package Lab_Excercises;

import java.io.File;
import java.io.IOException;

public class Directory {
	 public static void main (String args[]) throws IOException
	 {
		 File f = new File ("C:\\Users\\Rohan");
		 if (f.mkdir())
		 System.out.println("created a directory");
		 else
		 System.out.println ("unable to create a directory");
		 } 
	 
}
