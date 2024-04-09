
class Circle 
{
	
	int centerX;
	int centerY;
	int radius;
	
    Circle()
    {
    	centerX = 0;
    	centerY = 0;
    	radius = 1;
    }
    
    Circle(int x, int y, int z)
    {

    	centerX = x;
    	centerY = y;
    	radius = z;
    	
    }
    
    Circle(int x, int y)
    {
    	centerX = x;
    	centerY = y;
    	radius = 1;
    	     	
    }
    
    public String toString() 
    {
        String str = "Center X: "+centerX+", Center Y: "+centerY+", Radius : "+radius+
        		" Area : "+(float)(3.14 * radius * radius);
    	return str;
    }
}
