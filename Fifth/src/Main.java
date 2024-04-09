import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
	  String name;
	  int age;
	  char gender;
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the Name:");
	  name = sc.next();
	  
	  System.out.println("Enter the age:");
	  age = sc.nextInt();
	  
	  System.out.println("Enter the gender:");
	  gender = sc.next().charAt(0);
	  
	  Student s1 = new Student(name,age,gender);
	  
	  System.out.println(s1);

	}

}
