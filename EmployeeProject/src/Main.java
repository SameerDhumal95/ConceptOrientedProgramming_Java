/*import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("ABC", "1", 3500);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the incentive:");
		int i = sc.nextInt();
		e1.setIncentive(i);
		
		int sal = e1.getFinalSalary();
		System.out.println(sal);
	}
}
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		int n = sc.nextInt();
		
		Employee []arr = new Employee[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter the name:");
			String empname = sc.next();
		

			System.out.println("Enter the employeeID:");
			String empid = sc.next();
		

			System.out.println("Enter the basic salry:");
			int basicsalary = sc.nextInt();
			System.out.println("\n");
		
			arr[i] = new Employee(empname, empid, basicsalary);
		}
		
		for (int i = 0; i < arr.length ; i++)
		{
			System.out.println(arr[i] + "Final Salary with incentives: " + arr[i].getFinalSalary()+"\n\n");
		}
		
		
	}
}