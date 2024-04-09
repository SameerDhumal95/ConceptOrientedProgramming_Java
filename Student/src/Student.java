/*class Student 
{

	String name;
	int age;
	char gender;
	
	
	
	Student(String n, int a,char g) 
	{
	    name = n.toUpperCase();
	    age = a;
	    gender = g;
	}
    
	public String toString()
	{
	  String str = name + "," + age + "," + gender;
	  return str;
	}
}*/


class Student 
{

	String name;
	int rollno;
	Date dob;
	
	
	
	Student(String n, int a, int d, int m, int y) 
	{
	    name = n.toUpperCase();
	    rollno = a;
	    dob = new Date(d,m,y);
	}
    
	public String toString()
	{
	  String str = name + "," + rollno + "," + dob;
	  return str;
	}
}
