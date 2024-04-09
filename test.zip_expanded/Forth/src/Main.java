import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
	  String name = "";
	  int age = 0;
	  char gender = 'M';
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the name :");
	  name = sc.next();
	  
	  System.out.println("Enter the age :");
	  age = sc.nextInt();
	  
	  System.out.println("Enter the gender :");
      gender = sc.next().charAt(0);
	  
	  Student s1 = new Student(name,age,gender);
	  
	  s1.print();
	 

	}

}
