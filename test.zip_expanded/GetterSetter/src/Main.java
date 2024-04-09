
public class Main {
	public static void main(String []args)
	{
		Circle c1 = new Circle(5,4,3);
		
		c1.setCenterX(50);    //this field is not visible because of private in Circle to access this use getter/setter 
	
	    System.out.println(c1);
	}

}



/*
public class Main {
public static void main(String []args)
{
	Circle c1 = new Circle(5,4,3);  //
	
	c1.centerX = 50;    //public object
	
    System.out.println(c1);
}

}
*/