//responsibility point class ki x axis and y axis
public class Point 
{
   int x;
   int y;
   
   public Point()
   {
	   x = 0;
	   y = 0;
   }
   public Point(int ax, int ay)
   {
	   x = ax;
	   y = ay;
   }
   
   public String toString()
   {
	   String str = "("+x+ " , "+y+")";
	   return str;
   }
   
}