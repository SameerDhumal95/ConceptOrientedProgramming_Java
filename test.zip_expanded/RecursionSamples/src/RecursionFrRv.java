/*
    *
    **
    ***
    **
    *
 */
public class RecursionFrRv {

	public static void main(String[] args) 
	{
		int i = 0;
		fun(i);
	}

	private static void fun(int x) 
	  {
		
			if(x<5)
			{
				for(int i=0; i<x; i++)
				{
					System.out.print("*");
				}
				System.out.println();
				x = x+1;
				fun(x);
				
				for(int i=0; i<x; i++)
				{
					System.out.print("*");
				}
				System.out.println();
				
			}
	  
	  }
}
