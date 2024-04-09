package AbdulBari;

class Student{  
	int rollno1;  
	String name1;  
	float fee1;  
	Student(int rollno,String name,float fee){  
		rollno1=rollno;  
		name1=name;  
		fee1=fee;  
	}  
	void display(){System.out.println(rollno1+" "+name1+" "+fee1);}  
}  
class TestThis1{  
	public static void main(String args[]){  
		Student s1=new Student(111,"ankit",5000f);  
		Student s2=new Student(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
	}} 