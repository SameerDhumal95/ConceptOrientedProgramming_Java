import java.util.Scanner;

public class RecursionSeries {

	public static void main(String[] args) 
	{
		int i = 0;
		fun(i);

	}
	/*
	private static void fun(int x)
	{
	    if(x<10)
	    {
	        int y = x;  //1 //3 //
	        y++;        // 2 //4 //
	        x = x+y;    // 1+2=3//3+4=7//
	        fun(x); 
	        System.out.println(x); 
	    }
	    //System.out.println(x); 
          
	}

}*/
  
	private static void fun(int x)
	{
	    if(x<10)
	    {
	        int y = x;  //1 //3
	        x = y++; // 1+2=3
	        fun(x); 
	    }
	    System.out.println(x); 
          
	}
}