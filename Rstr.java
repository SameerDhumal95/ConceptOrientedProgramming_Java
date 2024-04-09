import java.util.Scanner;

class Rstr{
public static void main(String []args)
{
   Scanner sc = new Scanner(System.in);
   String name = sc.nextLine();
   char ch;
   String rstr ="";
   
   for(int i=0;i<name.length();i++)
   {
     ch = name.charAt(i);
     rstr = ch + rstr;
   } 
   System.out.println(rstr);
}
}