/*import java.util.Scanner;

public class Main {
	
	
	public static void main(String [] args)  //this will be in Main
	{
		int p1, p2; 
		int radius = 0;
		
		Scanner sc = new Scanner(System.in);  // sc can be replaced with any name
		
		System.out.println("Enter X Co-ordinate:");
		p1 = sc.nextInt(); 
		
		System.out.println("Enter Y Co-ordinate");
		p2 = sc.nextInt();
		
		System.out.println("Enter Radius of Circle:");
		radius = sc.nextInt();
		
		
		Circle c1 = new Circle(p1, p2, radius);
		
		System.out.println(c1);
	}
	
}*/

public class Main {
	
	
	public static void main(String [] args)  //this will be in Main
	{
		
		Circle c1 = new Circle(1,1);

		Circle c2 = new Circle(5,5,5);

		Circle c3 = new Circle();
		
		c3.changeCenter(7,5);

		if(c3.getP().getX() > c2.getP().getX())
	        System.out.println("C3's X is bigger");
		else
			System.out.println("C2's X is bigger");
			
	
	}
	
}