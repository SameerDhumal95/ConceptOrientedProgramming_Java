
public class MyPen {

	private String penColour;
	private String brand;
	private String penType;
	
	public MyPen()
	{
		this.penColour = "Blue";
		this.brand = "Raynold";
		this.penType = "BallPen";
		
	}
	
	public MyPen(String penColour,String brand,String penType)
	{
		this.penColour = penColour;
		this.brand = brand;
		this.penType = penType;
		
	}
	
	public MyPen(String brand,String penType)
	{
		this.penColour = "Blue";
		this.brand = brand;
		this.penType = penType;
		
	}

	
	public String getPenColour() {
		return penColour;
	}

	public void setPenColour(String penColour) {
		this.penColour = penColour;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPenType() {
		return penType;
	}

	public void setPenType(String penType) {
		this.penType = penType;
	}

	public String toString()
	{
		String str = "Pen Colour: "+penColour+" , Brand: "+brand+
				     " , Pen Type: "+penType;
		return str;
	}
	
}
