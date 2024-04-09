import java.util.Scanner;

public class VerticalHistogram {
	
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int i;
			int [] num = new int [5];
			for(i=0 ; i <5 ; i++)
			{ 
				System.out.println("Enter number : " +i );
				num[i]=sc.nextInt();
			}
			int max=num[0];
			int p=0,m=0;
			for(i=0 ; i<5 ; i++)
			{
				if(max<num[i])
				{
					max=num[i];
					p=i;
				}
			}
			
			int j;
			m=max;
			max=max+1;
			for(j=1 ; j <=m ; j++)
			{
				System.out.println();
				max--;
				for(i=0 ; i < 5 ; i++)
				{
					if(num[i]>=max)
					{
						System.out.print("*  ");
					}
					else
					{
						System.out.print("   ");
					}
				}
			}
			System.out.println();
			System.out.println("--------------");
			for(i=0 ; i <5 ; i++)
			{ 
				System.out.print( num[i]+"  " );
			}
		}
		
}



