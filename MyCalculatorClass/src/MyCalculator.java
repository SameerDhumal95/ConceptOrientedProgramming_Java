
public class MyCalculator {

	int num1;

	int num2;
	
	MyCalculator()
	{
		this.num1= 40;

		this.num2= 30;
	
	}
	
	MyCalculator(int num1,int num2)
	{
		this.num1= num1;

		this.num2= num2;
	}

	public String toString() {
		return "MyCalculator [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	
	
}
