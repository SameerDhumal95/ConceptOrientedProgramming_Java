/*Q2.Create an array of students.
	1)Input size of array from user.
	2)Input student information from user (Name,Age,Gender)
	3)Find eldest & youngest student.
	4)Print all male and female students.
	5)Find average age of students ( Return the average in main class)
	6)Find average age of student male ( Return the average in main class)
	7)Count the male and female students ( Return the count in main class)
	1)Input size of array from user.
	2)Input student information from user (Name,Age,Gender)
	3)Find eldest & youngest student.
	4)Print all male and female students.
	5)Find average age of students ( Return the average in main class)
	6)Find average age of student male ( Return the average in main class)
	7)Count the male and female students ( Return the count in main class)
*/

import java.util.Scanner;

public class StudentArry 
{

	public static void main(String[] args) //main class
	{
	
		
		Scanner sc = new Scanner(System.in);
      
		System.out.println("Enter the No. of Students:");
		
		int num = sc.nextInt();
		
		Student []arr = new Student[num];  //reference
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("Enter the Name:");
			String name = sc.next();

			System.out.println("Enter the Age:");
			int age = sc.nextInt();

			System.out.println("Enter the Gender:");
			char gender = sc.next().toUpperCase().charAt(0);
			
			arr[i] = new Student(name,age,gender);
			 
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Male students are:\n");   //Male
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].getGender() == 'M')
				
			System.out.println(arr[i].name);
		}
        
		System.out.println("\n");
		
		System.out.println("Female students are:\n");  //Female
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].getGender()=='F')
				
			System.out.println(arr[i].name);
		}
		System.out.println("\n");
		
        System.out.println("Eldest Student is :\n");   //Eldest
		
        int max = arr[0].getAge();
        
		for(int i = 0; i < arr.length; i++)
		{
			if(max < arr[i].getAge())
			
			{
			max= arr[i].getAge();
			
			System.out.println(arr[i].name);
			}
				
		}
        
		System.out.println("Youngest students is:\n");  //Youngest
		
		int min = arr[0].getAge();
		
		for(int i = 0; i < arr.length; i++)
		{
			if(min > arr[i].getAge())
			{
			min= arr[i].getAge();
			System.out.println(arr[i].name);
			}		
			
		}

		float avg = average(arr); 
		
		System.out.println("Average of Students age is: "+avg);
	
	
		averagemale(arr);
	
		count_MF(arr);
		 
	}



	public static float average(Student []arr)   //average age
	{
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i].getAge();
			
		}
		float avg = (float)sum/(arr.length);
	    return avg;
	}
	

	public static void averagemale(Student []arr)  //avg male student
	{
		float sum = 0, count=0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].getGender() == 'M')
			{
			 count = count + 1;
				sum = sum + arr[i].getAge();
			 
			}
		}
		float a = (float)sum/count;
		
	    System.out.println("Average male Student is:"+a);
		
	
	}
	
	public static void count_MF(Student []arr)  //counting male students
	{
		int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].getGender() == 'M')  //
			{
				count = count + 1;
			}
			
		}
		
		System.out.println("Number of male student: "+count);
	}
}


