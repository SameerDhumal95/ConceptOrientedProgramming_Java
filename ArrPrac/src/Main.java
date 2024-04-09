import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		System.out.print("Enter the size of array:");
		Scanner sc = new Scanner(System.in);
		
		int size=sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements in arry:");
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt(); 		
		}
			
		print(arr);

		System.out.println("Sum of elements are: "+ sumOfnumbers(arr));
		
		sumOfevenumbers(arr);
		
		System.out.println("Sumof odd numbers: "+ sumOfoddNumbers(arr));
		
		System.out.println("Avg of elements are : "+ (float)sumOfnumbers(arr)/size);
		
		
	}
	
	public static void print(int []arr)
	{
	    System.out.println("Your elements are");
	
	    for(int i = 0; i < arr.length; i++)
	    {
		    System.out.print(arr[i]+", ");
	    }
	    System.out.println();
	}
	
	public static int sumOfnumbers(int []arr)
	{
		int sum = 0;
		for(int i = 0; i<arr.length;i++)
		{
			sum = sum+arr[i];
		}
		
		return sum;
	}
	
	public static void sumOfevenumbers(int []arr)
	{
		int sum = 0;
		
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i] % 2 == 0)
				
			sum = sum+arr[i];
		}
		System.out.println("Sum of even numbers are: "+sum);
		
		System.out.println();
		
	}
	
	public static int sumOfoddNumbers(int []arr)
	{
		int sum = 0;
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i] % 2 != 0)
			sum = sum+arr[i];
		}
		
		return sum;
	}
	
}
