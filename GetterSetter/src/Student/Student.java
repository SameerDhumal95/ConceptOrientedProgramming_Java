package Student;

public class Student {
	
	private String name; //global variables
	int rollNo;  //global variables
	char gender; //global variables
	
	public Student()
	{
		this.name = "";
		this.rollNo = 0;
		this.gender = 'M';
		
	}
	
	public Student(String name, int rollNo, char gender)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.gender = gender;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print()
	{
		System.out.println("Name: "+name+" , RollNo. "+
	                        rollNo+", Gender: "+gender);
		
	}

}