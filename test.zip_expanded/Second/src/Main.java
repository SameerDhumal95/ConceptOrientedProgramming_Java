import java.util.Scanner;

public class Main
{
	
   public static void main(String []args)
   {
	   int x,y,r;
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter the Circle coordinate");
	   System.out.print("X :");
	   x = sc.nextInt();
	   System.out.print("Y :");
	   y = sc.nextInt();
	   System.out.print("Radius :");
	   r = sc.nextInt();
	 
	   
	   
	   Circle c1 = new Circle(x,y,r);
	   c1.display();
	   Circle c2 = new Circle(x,y);
	   c2.display();
	   Circle c3 = new Circle();
	   c3.display();
   }

}


/*public class Main
{

public static void main(String []args)
{
	   Circle c1 = new Circle(2,5);
	   Circle c2 = new Circle(3,2,6);
	   Circle c3 = new Circle();
	   
	   c1.display();
	   c2.display();
	   c3.display();
}

}*/
