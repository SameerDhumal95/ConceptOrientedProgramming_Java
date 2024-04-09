
public class Rectangle 
{

	private int width;
	private int length;
	private int area;
	
	Rectangle()
	{
		width = 0;
		length = 0;
		area = 0;
	}
	
	Rectangle(int width, int length)
	{
		this.width = width;
		this.length = length;
		/*this.area = width * length;*/
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		length = length;
	}

	/*public int Area(int a,int b) 
	{
		return (a * b);
		
	}*/
	
	public String toString() 
	{
		return "Rectangle [width=" + width + ", Length=" + length + ", area=" + (width * length)+ "]";
	}
	
	
	
}
