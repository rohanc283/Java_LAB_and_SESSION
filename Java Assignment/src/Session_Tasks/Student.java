package Session_Tasks;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StudentDetails obj[] = new StudentDetails[5];
		
		System.out.println("enter student detail");
	
		StudentDetails obj1 = new StudentDetails(01, "arif", "JAVA", 90);
		StudentDetails obj2 = new StudentDetails(03, "pintu", "ANDROID", 40);
		StudentDetails obj3 = new StudentDetails(05, "pankaj", "BCA", 30);
		StudentDetails obj4 = new StudentDetails(07, "messi", "PYTHON", 70);
		StudentDetails obj5 = new StudentDetails(02, "ronaldo", "BCA", 80);  
		
		
		
		
		StudentDetails[] stud = {obj1,obj2, obj3, obj4, obj5};
		
		for(int i = 0 ; i < stud.length ; i++) {
			
			if(stud[i].marks < 50 && stud[i].course == "BCA") {
				
				stud[i].show();
				
			}
		}
		

	}

}


class StudentDetails{
	
	int stid;
	String name;
	String course;
	int marks;
	
		public StudentDetails(int stid, String name, String course, int marks) {
	
		this.stid = stid;
		this.name = name;
		this.course = course;
		this.marks = marks;
		
		
		
	} 

	public void show() {
		System.out.println("Student id : " +stid);
		System.out.println("Student name : " +name);
		System.out.println("Student course : " +course);
		System.out.println("Student mark : " +marks);
		
	}
	
}