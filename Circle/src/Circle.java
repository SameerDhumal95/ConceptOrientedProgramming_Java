
public class Circle {
	
	Point p;  // Point is a user defined data type that not allocate memory
	int  radius;
	
	
	public Circle()  // Parameterless Constructor
	{
		p = new Point();  //default memory allocation for point only for this function
		radius=0;
	}
	
	public Circle(int ax, int ay)  // Parameterized Constructor
	{
		p = new Point(ax,ay); //memory allocation for point variables ax and ay only for this function
		radius=1;
	}
	
	
	Circle(int ax, int ay, int r)  // Parameterized Constructor
	{
		p  = new Point(ax,ay);
		radius=r;
	}
	
	
	public Point getP() //get values from user getter setter
	{
		return p;
	}

	public void setP(Point p) 
	{
		this.p = p;
	}

	public int getRadius() 
	{
		return radius;
	}

	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	
	public void changeCenter(int i,int j)
	{
		p.setX(i);
		p.setY(j);
	}

	public String toString() {
		String str = "Center " + p + " , Radius: "  + radius + "," +
					" Area = " + (float)( 3.1416 * radius * radius);
					
		return str;
	}

}

