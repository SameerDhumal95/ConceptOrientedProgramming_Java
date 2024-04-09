package Student;

import java.util.Arrays;

public class Student {

		private String name;
		private int age;
		private int rollno;
		
		public Student(String name,int age,int rollno)
		{
			this.name = name;
			this.age = age;
			this.rollno = rollno;
		}

		public static void MaxAge(Student s[])
		{
			Student max=s[0];
			for(int i=0; i<s.length; i++)
			{
				if(max.age < s[i].age)
				{
					max=s[i];
				}
				
			}
			System.out.println("Older Student is :"+max);
		}
		
		public static void MinAge(Student s[])
		{
			Student min=s[0]; //min = sam  26  1
			for(int i=1; i<s.length; i++)
			{
				if(min.age > s[i].age)  //26>27false
				{
					min=s[i];
				}
				
			}
			System.out.println("Younger student is :"+min); 			
		
		}
		
		public static void AvgAge(Student s[])
		{
			int sum = 0;
			for(int i=0; i<s.length; i++)
			{
				sum = sum+s[i].age;
			}
			System.out.println("Avg age of all student is: "+
			                     (float)sum/s.length);
			
		}
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", rollno=" + rollno + "]";
		}
						
}
