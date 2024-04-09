package Student;

import java.util.Scanner;

public class Main {

	public static void main(String []args)
	{
		System.out.print("Enter the Number of students:");
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		Student s[] = new Student[size];

		System.out.println("Enter the ("+size+") students data");
		String name;
		int age,rollno;
		for(int i=0 ;i<s.length;i++)
		{
			System.out.print("Name: ");
		    name = sc.next();           
			System.out.print("age: ");
			age = sc.nextInt();
			System.out.print("rollno: ");
			rollno = sc.nextInt();
			s[i] = new Student(name,age,rollno);
		}
		System.out.println("*****************************");
		
		for(int i=0; i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		int c=0;
		do{
		System.out.println("*****************************");
		System.out.println("Enter your choice:"
					+ "1.Older Student"
					+ "2.Younger Student"
					+ "3.Average Student Age"
					+ "4.Exit");
		  
		c = sc.nextInt();	  
		switch(c)
		{
			case 1:
				Student.MaxAge(s);
				break;
			case 2:
				Student.MinAge(s);
				break;
			case 3:
				Student.AvgAge(s);
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Enter the correct choice...");
		}
		  }while(c!=4);
			
	}
}
