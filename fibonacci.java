import java.util.scanner;

class Fibonacci
{
   public static void main(String []args)   
   { 
     Scanner sc = new Scanner(System.in);
     int n1 = 0, n2 = 1, n3 = 0 ;
     int count = sc.nextInt();

     for(int i = 1 ; i<=count; i++)
     { 
       System.out.print(n1+" ,");
       n3 = n1 + n2;
       n1 = n2;
       n2 = n3;
     }
   }
}