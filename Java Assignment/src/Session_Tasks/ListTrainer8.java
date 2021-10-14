package Session_Tasks;

import java.util.ArrayList;

import java.util.Iterator;





public class ListTrainer8 {
	public static void main(String[] args) {
		
		ArrayList<CampusTrainer> trainer=new ArrayList<CampusTrainer>();
		trainer.add(new CampusTrainer(101,"abitha","java",22000));
		trainer.add(new CampusTrainer(102,"mayank","java",10000));
		trainer.add(new CampusTrainer(103,"samadhan","php",24000));
		trainer.add(new CampusTrainer(104,"vinay","java",23000));
		trainer.add(new CampusTrainer(103,"rohit","java",21000));
		
		Iterator<CampusTrainer> itr=trainer.iterator();
		while(itr.hasNext()) {
			CampusTrainer tr=itr.next();
			System.out.println(tr);
		}
		
		System.out.println("================");
		
		ArrayList<CampusTrainer> newtrainer=new ArrayList<CampusTrainer>();
		for(CampusTrainer tr:trainer) {
			if(tr.salary > 20000) {
				if(tr.course == "java") {
					newtrainer.add(tr);
					System.out.println(tr);
				}
				
			
			}
		
		}
		
		trainer.clear();
		System.out.println("=============");
		
		Iterator<CampusTrainer> itr1=trainer.iterator();
		while(itr1.hasNext()) {
			CampusTrainer tr1=itr.next();
			System.out.println(tr1);
		}
		
	

	}

}

class CampusTrainer{
	int trid;
	String name;
	String course;
	int salary;
	public CampusTrainer(int trid, String name, String course, int salary) {
		super();
		this.trid = trid;
		this.name = name;
		this.course = course;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "trid:  "+trid+"   Name:  "+name+"  course:  "+course+"  Salary:  "+salary;
	}

}