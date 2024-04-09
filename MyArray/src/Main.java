import java.util.Scanner;


public class Main {

	public static void main(String[] args)
	{
		
		int []arr = new int[5];  //we create an array for 5 numbers from user
		
		Scanner sc = new Scanner(System.in);  
		
		System.out.println("Enter 5 numbers:"); 
		
		for(int i=0; i<arr.length ; i++)  //repeations for 5 time
		{
			arr[i] = sc.nextInt();
		}
		
		print_histogram(arr);//call function
		
	    print_max(arr);      	
	}
	
	public static void print_histogram(int [] arr)  // repeation for histogram function
	{
		
		for (int i = 0; i < arr.length; i++) 
		{
			histogram(arr[i]); //
		}
		
	}
	
	
	
	public static void histogram(int x)   
	{
		System.out.print(x + " : ");
		
		for (int i = 0; i < x; i++) 
		{
			System.out.print("$");
		}
		System.out.println(); //new line new element
	}
	
    public static void print_max(int a)
    {
    	for (int i=0; i < arr.length ;i++)
    	{
    		for(int i =0 ; i > arr[a+1]; a++)
    		{
    		 	
    			a = arr[i]	
    		}	
    		
    		System.out.println("Greatest element in array is:"+ a);
    	}
    		
    }
    
}

