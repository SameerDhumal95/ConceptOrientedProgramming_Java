class Student 
{

	String name;
	int age;
	char gender;
	
	
	
	Student(String n, int a,char g) //constructor
	{
	    name = n.toUpperCase();
	    age = a;
	    gender = g;
	}
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String toString()
	{
	  String str = name + "," + age + "," + gender+"\n";
	  return str;
	}
}
