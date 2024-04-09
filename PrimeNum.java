import java.util.Scanner;
class PrimeNum
{  
    public static void main(String []args)
     {
       Scanner sc = new Scanner(System.in);       
       int m = 0,flag=0;
       System.out.println("Enter the Number:");
       int n = sc.nextInt();
       m = n/2;
       for(int i=2;i<=m;i++)
        {
           if(n%i==0)
           {
             System.out.println("Not Prime");
             flag=1;
             break;
           }
        }
        if(flag==0)
        {
          System.out.println("Prime");
        }
      }
}

       
       