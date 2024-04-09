

/*Q2.Create a class Employee(empid,empname,basicSalary)
Write constructor,toString(),getter and setter method.
and also add calculateSalary() which calculate salary with incentive
if basicSalary is greater than 5000 the incentaive is 1000rs.
otherwise incentaive is 500rs 
*/

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
	
	public int calculateSalary()
	{
		return (this.basicSalary + 500);
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
                       
