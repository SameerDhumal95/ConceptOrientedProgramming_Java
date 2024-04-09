
public class RecursionTable 
{

	public static void main(String[] args) 
	{
		int i = 1;
		fun(i);

	}
	
	private static void fun(int x)
	{
		if(x<10)
		{
			System.out.print("2 * "+x+" = "+ (2*x));
			System.out.println();
		    x=x+1;
		    fun(x);
		}
		
		
	}
	

}
