
class Student 
{
  String name;
  int age;
  char gender;
  
 
  
  Student(String n, int a, char g) //parametersied
  {
	  name = n.toUpperCase();
	  age = a;
	  gender = g;
	  
  }
  
  void print()
  {
	  //Sameer,26,M
		  System.out.println(name+ " , " +age+" , "+gender);
  }
}
