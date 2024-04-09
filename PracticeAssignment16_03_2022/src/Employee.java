
public class Employee
{
	
  /*int empid;
  String name;
  float salary;
  */
  private int empid;
  private String name;
  private float salary;
  
  
  Employee(int x, String y, float z)//we have not create default constructure because no need
  {
	  empid = x;
	  name = y;
	  salary = z;
  }
  
  void setSalary(float a) //
  {
	  salary = a;
  }
  
  float getSalary()
  {
	  return salary;
  }
  
  float calculateSalary(float a)
  {
	  salary = a+1000;
	  return salary;
  }
  
  public String toString()
  {
	  String str = "Employee Id : "+empid+ "\tEmployee Name : "+name+"\tEmployee Salary : "
			  +salary;
	  return str;
  }
  
  
}
