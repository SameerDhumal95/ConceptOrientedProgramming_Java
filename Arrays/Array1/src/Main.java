import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter number of students:"); 
		
		int student_size = sc.nextInt();
		int count = 0, count1 = 0;
		
		Student arr[] = new Student[student_size];  

		for (int i = 0; i < arr.length; i++) 
		{
			
			System.out.println("Enter student name:");  
			String n = sc.next();
			
			System.out.println("Enter student age:");  
			int a = sc.nextInt();
			
			System.out.println("Enter student gender:");  
			char g = sc.next().charAt(0);  
			
			arr[i] = new Student(n, a, g);  
		}
	
		System.out.println("Male Students are:");
		for (int i = 0; i < arr.length; i++)  
		{
			if((arr[i].getGender() == 'm' )||(arr[i].getGender() == 'M' )) 
				{
				System.out.println(arr[i].getName());
			    count = count + 1;
				}
		}

        System.out.println("No. of male students are: "+ count);
		
		
        System.out.println("Female Students are:");
		for (int i = 0; i < arr.length; i++)  
		{
			if((arr[i].getGender() == 'f' )||(arr[i].getGender() == 'F' )) 
				{System.out.println(arr[i].getName());
			count1 = count1 + 1;}
		}
		System.out.println("No. of male students are: "+ count1);
 }
}
