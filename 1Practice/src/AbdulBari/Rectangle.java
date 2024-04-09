package AbdulBari;

class Rectangle1
{
	//double length,breadth;
	
	private double length,breadth;  //DATA HIDING
	
	public double area()
	{
		return length * breadth;
	}
	
	public double perimeter()
	{
		return 2 * (length + breadth);
	}
	
	public void setLength(double l)
	{
		length = l;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public void setBreadth(double b)
	{
		breadth = b;
	}
	
	public double getBreadth()
	{
		return breadth;
	}
			
}

public class Rectangle {

	public static void main(String[] args) {
		
		Rectangle1 R1 = new Rectangle1();
		
//		R1.length=25.5;    //if data members are private(Data hidden) then we cannot change
//		R1.breadth=10;
		
		R1.setLength(25);	
		R1.setBreadth(2);
		
		System.out.println("Area : "+R1.area());

		System.out.println("Perimeter : "+R1.perimeter());
	}
	
}
