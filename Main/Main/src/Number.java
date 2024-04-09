
public class Number {
	int number=0;

	public Number()
	{
		this.number = 0;
	}

	public Number(int number)
	{ 
		this.number = number;
	}

	public int getNumber()
	{
		return number;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}

	
	public String toString()
	{
		return (""+number+"");
	}

	
	public boolean greaterThan(Number num1)
	{
		if(this.number > num1.number)
			return true;
		else
			return false;
	}
}
