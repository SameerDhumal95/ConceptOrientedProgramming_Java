
public class MathOperation {
	int num=0;
	public static Number addition(Number num1, Number num2)
	{
		return new Number(num1.number + num2.number);
	}
	
	public static Number multiply(Number num1, Number num2)
	{
		return new Number(num1.number * num2.number);
	}
	
	public boolean greaterThan(Number num1)
	{
		if(num > num1.number)
			return true;
		else
			return false;
	}
	
	public static Number subtraction(Number num1, Number num2)
	{
		return new Number(num1.number - num2.number);
	}
	
	public static Number division(Number num1, Number num2)
	{
		return new Number(num1.number / num2.number);
	}
}


