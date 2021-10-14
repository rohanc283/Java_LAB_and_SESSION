package Lab_Excercises;

public class Operators {
	int a = 5;
	int b = 7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operators o = new Operators();
		System.out.println("Increment/Decrement Operators==============");
		System.out.println(++o.a);
		System.out.println(o.a++);	
		System.out.println(--o.b);
		System.out.println(o.b--);
		
		System.out.println("Bitwise Operators==============");
		
        System.out.println("a&b = " + (o.a & o.b));
        System.out.println("a|b = " + (o.a | o.b));
        System.out.println("a^b = " + (o.a ^ o.b));
        System.out.println("~a = " + ~o.a);
//        o.a &= o.b;
//        System.out.println("a= " +o.a);
        
        System.out.println("Airthematic Operators==============");
        System.out.println(o.a+o.b);
        System.out.println(o.a-o.b); 
        System.out.println(o.a*o.b);
        System.out.println(o.a/o.b);
        System.out.println(o.a%o.b);
        
        System.out.println("Relational Operators==============");
        System.out.println(o.a==o.b);
        System.out.println(o.a>o.b); 
        System.out.println(o.a<o.b);
        System.out.println(o.a>=o.b);
        System.out.println(o.a<=o.b);
        
        System.out.println("Conditional Operators==============");
        System.out.println(o.a>o.b && o.a>o.b||o.a<o.b);  
        System.out.println((o.a<o.b || o.a>o.b) && o.a<o.b);  
	}

}
