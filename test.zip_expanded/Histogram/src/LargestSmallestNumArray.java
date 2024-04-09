/* Q1.Print histogram by using integer array.
	1)Array length taken from user.
	2)Find largest and smallest value in array.*/

import java.util.Scanner;

public class LargestSmallestNumArray {

	
	    public static void main(String []args)
	
	    {
	    
	    Scanner s = new Scanner(System.in);
	    
	    System.out.print("Enter the number of elements in the array:");
	    
	    int n = s.nextInt();
	    
	    int a[] = new int[n];
	    
        System.out.println("Enter the elements of array:");
	    
	    for(int i = 0; i < n; i++)
	    {
	    
	    	a[i] = s.nextInt();  //numbers entered by user 
	    }
	    
	    
	    largest(a);  
	    
	    smallest(a);
	    
	    }
	    
	    public static void largest(int []a)
	    {
	   
	    int l = a[0];  //
	    
	    for(int i = 0; i < a.length; i++)
        {
	      if(l < a[i])
	      {
	        l = a[i];
	      }
	    }
	    
	    System.out.println("Largest no. in the array is:" + l);
	  }
	
	  public static void smallest(int []b)
	
	  {
	    
	    int s = b[0];
	    
	    for(int i = 0; i < b.length; i++)
      {
	      if(s > b[i])
	      {
	        s = b[i];
	      }
	    }
	    
	    System.out.println("Smallest no. in the array is:" + s);
	  }

}

