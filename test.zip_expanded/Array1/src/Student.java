
public class Student // Student class entities
{ 
	
	private String name;
	private int age;
	private char gender;
	
	Student(String n, int a, char g) 
	{
		name = n;
		age = a;
		gender = g;
	}

	public String getName() 
	{
		return name;   
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public char getGender() 
	{
		return gender;
	}

	public void setGender(char gender) 
	{
		this.gender = gender;
	}

	public String toString()   //printing all elements in one 
	{
		String str = name + "," + age + "," + gender;
		return str;
	}
}
