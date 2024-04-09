public class Main {

	public static void main(String[] args) 
	{
	      
        Circle c1 = new Circle(5,4,5);
        Circle c2 = new Circle(5,3);
        Circle c3 = new Circle();
        
      /*c1.centerY = 50;//when public data members in class that will accessible but private cannot*/
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
      /* if(c3.getCenter().getX() > c2.getX().//c3 object madhla center madhla X
               System.out.println("C3's X is bigger");
       else
    	       System.out.println("C2's X is bigger");  //accessing C3 center in that X element //getter setter is useful for printing 
       */
	}

}
