import java.util.Scanner;


public class Main {

	public static void main(String[] args)
	{
		
		int []arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers:");
		
		for(int i=0; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		print_histogram(arr);			
		
	}
	
	public static void print_histogram(int [] arr)
	{
		
		for (int i = 0; i < arr.length; i++) 
		{
			histogram(arr[i]);
		}
		
	}
	
	
	
	public static void histogram(int x)
	{
		System.out.print(x + " : ");
		
		for (int i = 0; i < x; i++) 
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	
}
