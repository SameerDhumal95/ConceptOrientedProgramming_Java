import java.util.Scanner;

public class Main {
	
	public static void main(String []args)
	{
		//System.out.println("Enter the no. of employees:");
		//Scanner s = new Scanner(System.in);
		
		Employee e1 = new Employee("Sameer","ID45",20000);
		
		Employee e2 = new Employee("Pritam","ID44",6000);
		
		System.out.println(e1);

		System.out.println(e2);
		
		if(e1.getBasicSalary() <= 5000)
		{
			System.out.println("Employee "+e1.getEmpname()+
					" salary is: "+e1.calculateSalary());
		} 
		else
		{
			System.out.println("Employee "+e1.getEmpname()+
					" salary is: "+(e1.getBasicSalary()+1000));
		}	
		
	}

}
