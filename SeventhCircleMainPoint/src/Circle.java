//circle class responsibility
class Circle 
{
	
	 Point center;//user made class Point bahar se
	 int radius;
	
    Circle()
    {
    	center = new Point(0,0);  //call to Point default class  
    	radius = 1;
    }
    
    Circle(int x, int y, int z)  
    {

    	center = new Point(x,y);   //parameterised Point class
    	radius = z;
    	
    }
    
    Circle(int x, int y)
    {
    	center = new Point(x,y);
    	radius = 1;
    	     	
    }
    
    public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String toString() 
    {
        String str = "Center : "+center+", Radius : "+radius+
        		" Area : "+(float)(3.14 * radius * radius);
    	return str;
    }
    
}


