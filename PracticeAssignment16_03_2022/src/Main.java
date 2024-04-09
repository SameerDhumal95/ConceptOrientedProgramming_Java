//

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
	int id;
	String name;
	float salary;
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Employee Id: ");
	id = sc.nextInt();
	System.out.println("Enter Employee Name: ");
	name = sc.next();
	System.out.println("Enter Employee Salary: ");
	salary = sc.nextFloat();
	
	Employee emp = new Employee(id,name,salary);  //objects which is from user input
	
	float s1 = emp.getSalary(); //input getting
	float s2 = emp.calculateSalary(s1);
	
	System.out.println("Employee details is:");
	System.out.println(emp);
	//System.out.println("After adding incentives salary is:");
	//System.out.println(s2);

	}

}
