
public class Main {

	public static void main(String[] args) 
	{
	//System.out.println("Total no. of arguments: " + args.length);

	/*for(int i = 0; i<args.length; i++)
	{
		System.out.println(args[i]);
	}*/
	/*int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	int sum = 0;
	System.out.println(num1 + num2);
	System.out.println("Total no. of arguments: " + args.length);
	*/
	int sum = 0;	
	for(int i =0; i <args.length; i++)
	{
		sum = sum + Integer.parseInt(args[i]);
	}
	System.out.println(sum);
	}

}
