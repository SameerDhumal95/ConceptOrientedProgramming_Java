class Student 
{
  String name;
  int age;
  char gender;
  
 
  
  public Student(String n, int a, char g)  //parametersied
  {
	  name = n.toUpperCase();
	  age = a;
	  gender = g;
	  
  }


  public String toString() 
  {
	return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
  }
  
}
