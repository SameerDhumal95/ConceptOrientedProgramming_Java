import java.util.Scanner;

public class Main
{
	public static void main(String [] str)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		Number n1 = new Number(number1);
		Number n2 = new Number(number2);
		
		
		Number n3 = MathOperation.addition(n1, n2);
		System.out.println("Addition of " + n1 + " and " + n2 + " is : " + n3);
		//10+20=30
		Number n4 = MathOperation.multiply(n3, n2);
		System.out.println("Multiplication of " + n3 + " and " + n2 + " is : " + n4);
		//30*20=600
		if(n4.greaterThan(n1))	//600>10
		{
			//System.out.println("num="+n4.getNumber());
		     n1.setNumber(n4.getNumber());			 
		}	//n1=600
		
		System.out.println("Finally n1=" + n1);
		
		Number n5 = MathOperation.subtraction(n1, n2);
		System.out.println("Subtraction of " + n1 + " and " + n2 + " is : " + n5);
		//600-20=580
		Number n6 = MathOperation.division(n4, n3);
		System.out.println("Division of " + n4 + " and " + n3 + " is : " + n6);
		//600/30=20
		System.out.println("Finally n1=" + n1);		
		sc.close();
	}	
}