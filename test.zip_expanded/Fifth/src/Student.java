
public class Student 
{
	String name;
	int age;
	char gender;
	
    Student(String x,int y,char z)
    {
	   name = x;
	   age = y;
	   gender = z;
    }
    
    public String toString() 
    {
    	String str = name+" , "+age+" , "+gender;
    	return str;
    }
}
