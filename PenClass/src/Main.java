import java.util.Scanner;

/*Q1.Create a class MyPen which has 
attributes(pencolour,brand,pentype(Example->ballPen,inkPen,gellPen),price)\
1.Write parameter less and parameterized constructor
2.getter and setter methods and toString() method.
       Write another class called TestMain which has main() method which will create 
3 objects of MyPen class.and which will update the pentype from ballpen to gellpen.
(hint:call setter method to update the type of pen).Display all the objects.
*/
public class Main {

	public static void main(String[] args) {
		
       MyPen p1 = new MyPen();
		
       MyPen p2 = new MyPen("Black","Montex","Gellpen");
       
       MyPen p3 = new MyPen("Cello","BallPen");
       
       System.out.println(p1);

       System.out.println(p2);

       System.out.println(p3);
       
       /******Okay*******/
       
       System.out.println("*************************************************");
       
       System.out.println("***Choice your pen***");
       
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Pen Color: ");
       
       String Colour = sc.next();
       
       System.out.print("Brand : ");
       
       String Brand = sc.next();
       
       System.out.print("Type : ");
       
       String Type = sc.next();
       
       p1.setPenColour(Colour);
       
       System.out.println(p1.getPenColour());
       
       p1.setBrand(Brand);
       
       p1.setPenType(Type);  
       
       System.out.println(p1);

       
	}

}
