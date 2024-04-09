import java.util.Scanner;

public class Cafe 
{
static int qty = 0;
static int bill = 0;

	public static void main(String[] args)
	{
		int choice,result=0;
		
		Scanner sc=new Scanner(System.in);
				
		do 
		{
			 System.out.println("***Welcome to Cafe***\n");
			 
			 System.out.println("1.Cold Drink.");
			 
			 System.out.println("2.Hot Drink.");
			 
			 System.out.println("3.Snacks.");
			 
			 System.out.println("4.Ice Cream:");
			 
			 System.out.println("5.Exit");
			 
			 System.out.println("PLEASE PLACE YOUR ORDER:\n");
			  
			 choice= sc.nextInt();                             //Displaying ***okay***
			 
			 switch(choice)
			  {
			   case 1:
				   
			       result= ColdDrink();	
			       
			       System.out.println("Bill :" +result);
			       
			       break;
			       
			   case 2:
				   
				   result = HotDrink();
				  
				   System.out.println("Bill:" + result);
				   
				   break;
				   
			   case 3:
				   
				   result = Snacks();
				   
				   System.out.println("Bill:" + result);
				   
				   break;
				   
			   case 4:   
				   
				   result = IceCreams();
				   
				   System.out.println("Bill:" + result);
				   
				   break;
				   
			   case 5:
				   
				   break;
			   }
		
	     }while(choice!=5);
	   
	   System.out.println("Your total bill is: " + result);
	}	  
		
public  static int ColdDrink()
	   {   
		 
           int ch;	
           Scanner sc=new Scanner(System.in);
		   do
		   {
			   System.out.println("1.Mirinda:    22/-");
			   
			   System.out.println("2.Pepsi:      25/-");
			   
			   System.out.println("3.ColdCoffee: 50/-");
			   
			   System.out.println("4.Coke:       25/-");
			   
			   System.out.println("5.Exit");
			   
			   System.out.println("Select colddrink type:");
			   
			   ch=sc.nextInt();   //displaying ***Okay***
			   
			    switch(ch)
			    {
			      case 1:
			    	  
			    	System.out.println(  "Mirinda 22Rs.");
			    	
			    	System.out.println("Enter the qty:");
			    	
			    	qty= sc.nextInt();
			    	
			    	bill = bill + (qty * 22);
			    	
			    	break;
			    	
			      case 2:
			   
			    	  System.out.println("Pepsi   20Rs");
				      
			    	  System.out.println("Enter qty:");
				      
			    	  qty= sc.nextInt();
				      
			    	  bill=bill+(qty*20);
				      
			    	  break;
				    
			      case 3:
			    	  
			    	  System.out.println("Cold Coffee   50Rs");
				      
			    	  System.out.println("Enter qty:");
				      
			    	  qty= sc.nextInt();
				      
			    	  bill=bill+(qty*50);
				      
			    	  break;
				      
			      case 4:
			    	  
			    	  System.out.println("Coke.  25Rs  ");
				      
			    	  System.out.println("Enter qty:");
				      
			    	  qty= sc.nextInt();
				      
			    	  bill=bill+(qty*25);
				      
			    	  break;
			     
			      case 5:
			    	  System.out.println("Exit");
			    	  
			    	  break;
				 }   
		   
		      }while(ch!=5);
		   
		System.out.println("\n\n---------------------------------------------\n"  +bill);
     
		return bill ;
     }	
	 

	 public static int HotDrink()
	 {       
		    int ch;
		    
		    Scanner sc=new Scanner(System.in);
		    
		    do{
		    	
		    	System.out.println("1.Tea    15Rs");
		    
		    	System.out.println("2.coffee 20Rs ");
		    	
		    	System.out.println("3.HotChocolate 45Rs ");
		    	
		    	System.out.println("4.BournVita    30Rs ");
		    	
		    	System.out.println("5.Exit. ");
		    	
		    	System.out.println("Select hot drink type:");
		    	
		    	ch=sc.nextInt(); 
		    	
		    	switch(ch)
		    	{
        		    	case 1:
        		
        		    		System.out.println("Tea.");
        		    		
        		    		System.out.println("Enter Qty:");
        		    		
        		    		ch=sc.nextInt();
        		    		
        		    		bill=bill+(qty*15);
        		    		
        		    		break;
        		    	
        		    	case 2:
        		    		
        		    		System.out.println("Coffee");
        		    		
        		    		System.out.println("Enter Qty:");
        		    		
        		    		ch=sc.nextInt();
        		    		
        		    		bill=bill+(qty*20);
        		    		
        		    		break;
        		    	
        		    	case 3:
        		    		
        		    		System.out.println("Hot chocalate.");
        		    		
        		    		System.out.println("Enter Qty:");
        		    		
        		    		ch=sc.nextInt();
        		    		
        		    		bill=bill+(qty*45);
        		    	    
        		    		break;
        		    	
        		    	case 4:
        		    		
        		    		System.out.println("BournVita");
        		    		
        		    		System.out.println("Enter Qty:");
        		    		
        		    		ch=sc.nextInt();
        		    		
        		    		bill=bill+(qty*30);
        		    		
        		    		break;
        		    		
        		    	case 5:
        		    		 
        		    		System.out.println("Exit");
        		    		
        		    		break;
        		    	
        		    		
		    	 }
		    	
		      }while(ch!=5);
		  
		    return bill;
	 }
	  
	 public static int Snacks()
	 {       
		    int ch;
		    Scanner sc=new Scanner(System.in);
		    do{
		    	
		    	System.out.println("1.VadaPaav    20Rs");
		    	
		    	System.out.println("2.Dabeli      10Rs ");
		    	
		    	System.out.println("3.Samosa      18Rs ");
		    	
		    	System.out.println("4.Idli        12Rs ");
		    	
		    	System.out.println("5.Kachori     22Rs ");
		    	
		    	System.out.println("6.EXit      ");
		    	
		    	System.out.println("Select snack type:");
		    	
		    	ch=sc.nextInt(); 
		    	
		    	switch(ch)
		    	{
        		    	case 1:
        		
        		    		System.out.println("Vada Paav");
        		    		
        		    		System.out.println("Enter Qty:");
        		    		
        		    		ch=sc.nextInt();
        		    		
        		    		bill=bill+(qty*20);
        		    		
        		    		break;
        		    	
        		    	case 2:
        		    		
        		    		System.out.println("Dabeli");
        		    		
        		    		System.out.println("Enter Qty:");
        		    		
        		    		ch=sc.nextInt();
        		    		
        		    		bill=bill+(qty*10);
        		    		
        		    		break;
        		    	
        		    	case 3:
        		    		
        		    		System.out.println("Samosa");
        		    		
        		    		System.out.println("Enter Qty:");
        		    		
        		    		ch=sc.nextInt();
        		    		
        		    		bill=bill+(qty*18);
        		    		
        		    		break;
        		    	
        		    		
        		    	case 4:
        		    		
        		    		System.out.println("Idli");
        		    		
        		    		System.out.println("Enter Qty:");
        		    		
        		    		ch=sc.nextInt();
        		    		
        		    		bill=bill+(qty*12);
        		    		
        		    		break;
        		    		
        		    	case 5:	
        		    		
        		    		System.out.println("Kachori");
        		    		
        		    		System.out.println("Enter Qty:");
        		    		
        		    		ch=sc.nextInt();
        		    		
        		    		bill=bill+(qty*22);
        		    		
        		    		break;	
        		    	
        		    		
        		    	case 6:
        		    		 
        		    		System.out.println("Exit");
        		    		 
        		    		break;
        		    	
        		      }
		    	
		      }while(ch!=6);
		  
		    return bill;
	 
      }
	 public static int IceCreams()
	 {       
		    int ch;
		    Scanner sc=new Scanner(System.in);
		    do{
		    	
		    	System.out.println("1.ButterScotch    35Rs");
		    	
		    	System.out.println("2.Black Current   37Rs ");
		    	
		    	System.out.println("3.Mango           25Rs ");
		    	
		    	System.out.println("4.Vanilla         20Rs ");
		    	
		    	System.out.println("5.Dry Fruit       50Rs ");
		    	
		    	System.out.println("6.EXit      ");
		    	
		    	System.out.println("Select icecream flavour:");
		    	
		    	ch=sc.nextInt(); 
		    	
		    	switch(ch)
		    	{
        		    	case 1:
        		    		
        		    		System.out.println("Butterscotch");
        		
        		    		System.out.println("Enter Qty:");
        		    		
        		    		ch=sc.nextInt();
        		    		
        		    		bill=bill+(qty * 35);
        		    		
        		    		break;
        		    	
        		    	case 2:
        		    		
        		    		System.out.println("Black Current");
        		    		
        		    		System.out.println("Enter Qty:");
        		    		
        		    		ch=sc.nextInt();
        		    		
        		    		bill = bill+(qty * 37);
        		    		
        		    		break;
        		    	
        		    	case 3:
        		    		
        		    		System.out.println("Mango");
        		    		
        		    		System.out.println("Enter Qty:");
        		    		
        		    		ch=sc.nextInt();
        		    		
        		    		bill = bill+(qty * 25);
        		    		
        		    		break;
        		    	
        		    	case 4:
        		    		
        		    		System.out.println("Vanilla");
        		    		
        		    		System.out.println("Enter Qty:");
        		    		
        		    		ch=sc.nextInt();
        		    		
        		    		bill = bill + ( qty * 20);
        		    		
        		    		break;
        		    		
        		    	case 5:	
        		    		
        		    		System.out.println("Dry Fruit");
        		    		
        		    		System.out.println("Enter Qty:");
        		    		
        		    		ch=sc.nextInt();
        		    		
        		    		bill = bill + (qty * 50);
        		    		
        		    		break;	
        		    	
        		    	case 6:
        		    		 
        		    		System.out.println("Exit");
        		    		 
        		    		break;
        		    	
        		      }
		    	
		      }while(ch!=6);
		  
		    return bill;
	 
      }
} 