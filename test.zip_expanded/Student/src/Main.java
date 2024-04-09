import java.util.Scanner;

public class Main {
	
	public static void main(String []args)
	{
	  String name = "";
	  int rollno = 0; 
	  int d,m,y;
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Name:");
	  name = sc.next();
	  
	  System.out.println("Enter the rollno.:");
	  rollno = sc.nextInt();
	  
	  System.out.println("Enter the dob:");
	  d = sc.nextInt();
	  m = sc.nextInt();
	  y = sc.nextInt();
	  
	 
      Student s1 = new Student(name, rollno, d,m,y);
	  System.out.println(s1);  // s1.print() aas function call karnyaaivji aapan toString function lihila
	
	  sc.close();
	}
}

/*
import java.util.Scanner;

public class Main {
	
	public static void main(String []args)
	{
	  String name = "";
	  int age = 0; 
	  char gender = '';
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Name:");
	  name = sc.next();
	  
	  System.out.println("Enter the age:");
	  age = sc.nextInt();
	  
	  System.out.println("Enter the dob:");
	  gender = sc.next.charAt(0);
	  
	  
      Student s1 = new Student(name, age, gender);
	  System.out.println(s1);  // s1.print() aas function call karnyaaivji aapan toString function lihila
	
	}
}*/
