
public class Circle {
	
	private int centerX; //private member cant access outside the class
	private int centerY;
	private int radius;
	
	Circle()
	{
		centerX = 0;
		centerY = 0;
		radius = 1;
	}
	
	Circle(int x , int y)
	{
		centerX = x;
		centerY = y;
		radius = 1;
	}
	
	Circle(int x , int y , int z)
	{
		centerX = x;
		centerY = y;
		radius = z;
	}
	

	public int getCenterX() 
	{
		return centerX;
	}

	public void setCenterX(int x) 
	{
		this.centerX = x;
	}

	

	public String toString() {
		String str = "CenterX : "+centerX+
				" , CenterY : "+centerY+
				" Radius: "+radius+
				". "+" Area :"+(float)(3.14* radius *radius);
		return str;
	}
	
}


/*
public class Circle {

int centerX;
int centerY;
int radius;

Circle()
{
	centerX = 0;
	centerY = 0;
	radius = 1;
}

Circle(int x , int y)
{
	centerX = x;
	centerY = y;
	radius = 1;
}

Circle(int x , int y , int z)
{
	centerX = x;
	centerY = y;
	radius = z;
}


public String toString() {
	String str = "CenterX : "+centerX+" , CenterY : "+centerY;
	return str;
}

}*/
