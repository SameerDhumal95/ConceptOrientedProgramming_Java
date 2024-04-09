public class Main 
{
   public static void main(String []args)
   {
	   String n = args[0];
	   int a = Integer.parseInt(args[1]);
	   char g = args[2].charAt(0);
	   
	   Student s1  = new Student(n,a,g);
	   
	   System.out.println(s1);
   }
}