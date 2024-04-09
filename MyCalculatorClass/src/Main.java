
public class Main {

	public static void main(String []arg)
	{
	    MyCalculator c1 = new MyCalculator();
	    
	    MyCalculator c2 = new MyCalculator(10,20);
	    
	    MyCalculator c3 = MyCalculatorOpr.addition(c1, c2);
	    
	    MyCalculator c4 = MyCalculatorOpr.Substraction(c1, c2);
	    MyCalculator c5 = MyCalculatorOpr.Multiplication(c1, c2);
	    MyCalculator c6 = MyCalculatorOpr.Division(c1, c2);
	    
	    System.out.println(c1);

	    System.out.println(c2);

	    System.out.println(c3);

	    System.out.println(c4);

	    System.out.println(c5);

	    System.out.println(c6);
	    
	}
}
