//Q1. 1, 2, 3, 4, 5, 4, 3, 2, 1
public class RecurrsionNum 
{

	public static void main(String[] args) 
	{
		
		int i=1;
		fun(i);  
	}

	private static void fun(int x) {
		
		System.out.print(x + " , ");  
		
		if(x<5)
		{
			int y = x; 
			x = x+1;  
			fun(x);  
			System.out.print(y + " , ");
		}
		
				
	}

}