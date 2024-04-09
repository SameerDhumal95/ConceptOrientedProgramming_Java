/* Q2.Create a class Employee(empid,empname,basicSalary)
Write constructor,toString(),getter and setter method.
and also add calculateSalary() which calculate salary with incentive
where in incentive is 1000rs for all employees.
public class Employee */

class Employee
{
	private String empname;
	private String empid;
	private int basicSalary;
	
	public Employee(String empname, String id, int salary)
	{
		this.empname = empname;
		this.empid = id;
		this.basicSalary = salary;
	}
	
	public String getEmpid()
	{
		return empid;
	}
	
	public void setEmpid(String id)
	{
		empid = id;
	}

	public String getEmpname() 
	{
		return empname;
	}

	public void setEmpname(String name) 
	{
		empname = name;
	}

	public int getBasicSalary()
	{
		return basicSalary;
	}

	public void setBasicSalary(int salary) 
	{
		basicSalary = salary;
	}
	
	private int calculateSalary()
	{
		return (this.basicSalary + 1000);
	}
	
	public int getFinalSalary()
		{
			int sal = calculateSalary();
			return sal;
		}
	
	
	public String toString()
	{
		String str = "Employee Name : "+ empname +
					 "\nEmployee Id : "+ empid +
					 "\nBasic Salary : " + basicSalary + "\n";
		return str;
	}
	
	
}


/*class Employee
{
	private String empid;
	private String empname;
	private int basicSalary;
	private int incentive;
	
//creating constructor with parameters
	
	public Employee(String empname, String id, int salary)
	{
		this.empname = empname;
		this.empid = id;
		this.basicSalary = salary;
		this.incentive = 1000;
	}
	
	public void setIncentive(int i)
	{
		incentive = i;
	}
//creating constructor without parameters

	public String getEmpid()
	{
		return empid;
	}
	
//writing getter and setter functions

	public void setEmpid(String id)
	{
		empid = id;
	}

	public String getEmpname() 
	{
		return empname;
	}

	public void setEmpname(String name) 
	{
		empname = name;
	}

	public int getBasicSalary()
	{
		return basicSalary;
	}

	public void setBasicSalary(int salary) 
	{
		basicSalary = salary;
	}
	
//function for calculating salary with incentives
	private int calculateSalary()
	{
		return (this.basicSalary + incentive);
	}
	
//toString method for concatinating and returning string
	
	public String toString()
	{
		String str = "Employee Name : "+ empname +
					 "\nEmployee Id : "+ empid +
					 "\nBasic Salary : " + basicSalary + "\n\n";
		return str;
	}
	
	public int getFinalSalary()
	{
		int sal = calculateSalary();
		return sal;
	}

}*/
