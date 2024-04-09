import java.util.Scanner;

public class Histogram 

{
   public static void main(String []args)
   {
	   Scanner sc = new Scanner(System.in);
	   
	   int []arr = new int [5];
	   
	   System.out.println("Enter the five numbers:");
	   
	   for (int i = 0; i < arr.length ; i++)
	   {
		   arr[i]= sc.nextInt();
	   }
	   
	   print_histogram(arr);
	   
	}
   
    public static void print_histogram(int [] arr)
    {
    	for(int i = 0 ; i < arr.length ; i++)
    	{
    		 histogram(arr[i]);
    	}
    }
    
    public static void histogram(int x)
    {
    	System.out.print(x+" : ");
    	
    	for(int i =0; i < x; i++) //jitna number utna *
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
}
