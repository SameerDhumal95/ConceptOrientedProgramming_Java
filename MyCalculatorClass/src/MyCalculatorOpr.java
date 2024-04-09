
public class MyCalculatorOpr {

	public static MyCalculator addition(MyCalculator c1, MyCalculator c2)
	{
		MyCalculator m1 = new MyCalculator();
		
		m1.num1 = c1.num1 + c2.num1;
		m1.num2 = c1.num2 + c2.num2;
		return m1;
	}
	
	public static MyCalculator Substraction(MyCalculator c1, MyCalculator c2)
	{
		MyCalculator m1 = new MyCalculator();
		
		m1.num1 = c1.num1 - c2.num1;
		m1.num2 = c1.num2 - c2.num2;
		return m1;
	}
	
	public static MyCalculator Multiplication(MyCalculator c1, MyCalculator c2)
	{
		MyCalculator m1 = new MyCalculator();
		
		m1.num1 = c1.num1 * c2.num1;
		m1.num2 = c1.num2 * c2.num2;
		return m1;
	}
	
	public static MyCalculator Division(MyCalculator c1, MyCalculator c2)
	{
		MyCalculator m1 = new MyCalculator();
		
		m1.num1 = c1.num1 / c2.num1;
		m1.num2 = c1.num2 / c2.num2;
		return m1;
	}
}
