/*import java.util.Scanner;  //user defines circle cordinates

public class Main {

	public static void main(String[] args) 
	{
		int x,y,r;
	  	Scanner sc = new Scanner(System.in);
	  	System.out.print("Enter the X Coordinate : ");
        x = sc.nextInt();
	  	System.out.print("Enter the Y Coordinate : ");
	  	y = sc.nextInt();
	  	System.out.print("Enter the radius : ");
        r = sc.nextInt();
        
        Circle c1 = new Circle(x,y,r);
        
        System.out.println(c1);
	}

}*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
	      
        Circle c1 = new Circle(5,4,5);
        Circle c2 = new Circle(5,3);
        Circle c3 = new Circle();
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
	}

}

