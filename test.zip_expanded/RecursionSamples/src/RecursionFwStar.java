//Q2.
public class RecursionFwStar 
{
   public static void main(String args[])
   {
	   int i = 1;
	   fun(i);
	   
   }
   private static void fun(int x)
   {
	   if(x<6)
	   {
		   for(int i=1; i<=x; i++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
		   x=x+1;
		   fun(x);
	   }
   }
}
