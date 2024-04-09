

public class Circle 
{
	int centerX;
	int centerY;
	int radius;

	Circle() //default constructor
	{
		centerX=0;
		centerY=0;
		radius= 1;
	}
	
	Circle(int x,int y ,int z)//parametersied constructor
	{
		centerX=y;  //2
		centerY=x;  //4
		radius =z;  //7
	}
	
	
	
	Circle(int x, int y) //parametersied constructor
	{
		centerX=x;
		centerY=y;
		radius= 1;
	}
	
	void display()
	{
		System.out.println("Center X and Y : ("+centerX+","+centerY+")"+" , Radius: "+radius);
	}
}

