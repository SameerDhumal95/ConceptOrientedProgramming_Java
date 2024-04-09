abstract class Bike
{
   abstract void run();   
}

class Honda extends Bike
{
    public void run()
    {
      System.out.println("Hello Abstraction");
     }
}


public class Main
{
  public static void main(String []args)
   {
     Honda H = new Honda();
     H.run();
   }
}