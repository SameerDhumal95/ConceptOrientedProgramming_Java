import java.util.Scanner;

public class CafeMenu {

	public static void main(String []args)
	{
		
		int num,total=0;
		int result = 0;
		Scanner sc =new Scanner(System.in);
		do {
			System.out.println("!!!What do you want???");
			System.out.println("1. Cold drink");
			System.out.println("2. Hot drink");
			System.out.println("3. Snack");
			System.out.println("4. Ice cream");
			System.out.println("5. Exit");
			System.out.println("Enter the menu no.:");
			num = sc.nextInt();
			  switch(num)
			  {
			  case 1:
				System.out.println("Which type of cold drinks do you want:");
				result = ColdDrink();
				break;
			  case 2:
				System.out.println("Which type of Hot drinks do you want:");
				result = HotDrink();
				break;
			  case 3:
				System.out.println("Which type of Ice Cream do you want:");
				result = IceCream();
				break;
			  case 4:
				System.out.println("Which type of Snack do you want:");
				result = Snack();
				break;
			  default:
				if(num==5)
				System.out.println("Bye Bye Visit again!!!");
				else
				System.out.println("You Entered Invalied choice..Try again");
						
				break;	
			  
				
			  }
			
		   }while(num!=0);	
		   
		     int cld = ColdDrink();
		     int hdk = HotDrink();
		     int Ice = IceCream();
		     int Snk = Snack();
		     
		   total = cld+hdk+Ice+Snk;
		   
		   System.out.println("Total is : "+ total);
		     
	}
	
	     static int ColdDrink() //Colddrinks
	     {
	    	    Scanner sc = new Scanner(System.in);
	    	    System.out.println("1. Mirinda     - rs.22/-\n" + 
	    	    		           "2. Coke        - rs.25/-\n" + 
	    	    		           "3. Pepsi       - rs.20/-\n" + 
	    	    		           "4. Cold coffee - rs.50/-\n" + 
	    	    		           "5. Exit");
	    	    
	    	    int c = sc.nextInt();
	    	    
	    	    int Mirinda=0,Coke=0,Pepsi=0,ColdC=0;
	    	    
	    	    do{
	    	  
	    		   switch(c) 
	    		   {
	    		   case 1:
	    		   
	    	           Mirinda = 22;
	    	           System.out.println("Your bill is:"+Mirinda);
	    	           
	    	           break;
	    	           
	    	           
	    		   case 2:
		    		   
		    	       Coke = 25;

	    	           System.out.println("Your bill is:"+Coke);
		    	       break;
		    	       
	    		   case 3:
		    		   
		    	       Pepsi = 20;

	    	           System.out.println("Your bill is:"+Pepsi);
		    	       break;
		    	       
	    		   case 4:
		    		   
		    	       ColdC = 50;

	    	           System.out.println("Your bill is:"+ColdC);
		    	       break;
		    	       
	    		   case 5:
		    		   
	    			   System.out.println("Return to main menu");
	    	           break;
	    		    }
	    		   }while(c!=0);
	    		   
	    		   int cd = (Mirinda+Coke+Pepsi+ColdC);
	    		   return cd;
	     }
	    	    
	     static int HotDrink()  //Hotdrinks
	   	 {
	    	    Scanner sc = new Scanner(System.in);    
	   	        System.out.println("1. Tea    -       15/-\n" + 
	   	    	    		       "2. Coffee -       30/-\n" + 
	   	    	    		       "3. Hot choclate - 45/-\n" + 
	   	    	    		       "4. Born Vita-     50/-\n" + 
	   	    	    		       "5. Exit");
	   	    	    
	   	    	 int c = sc.nextInt();
	   	    	 int Tea=0,Coffee=0,Hot=0,BornVita=0; 
	   	    	 do{
	   	    	  
	   	    		switch(c) 
	   	    		{
	   	  	   case 1:
	    		   
    	           Tea = 22;
    	           
    	           break;
    	           
    	           
    		   case 2:
	    		   
	    	       Coffee = 25;
	    	       
	    	       break;
	    	       
    		   case 3:
	    		   
	    	       Hot = 20;
	    	       
	    	       break;
	    	       
    		   case 4:
	    		   
	    	       BornVita = 50;
	    	       
	    	       break;
	    	       
    		   case 5:
	    		   
    			   System.out.println("Return to main menu");
    	           break;
    		    }
    		   }while(c!=0);
    		   
    		   int hd = (Tea+Coffee+Hot+BornVita);
    		   return hd;
     }
	   	    	 
	   	 static int IceCream()  //IceCream
	     {
	   		    Scanner sc = new Scanner(System.in);    	    
	   		   	System.out.println("1. Butter scotch   -  35/-\n" + 
	   		   			           "2. Black current   -  37/-\n" + 
	   		   			           "3. Mango           -  25/-\n" + 
	   		   			           "4. Vanilla         -  20/-\n" + 
	   		   			           "5. Dry friut       -  50/-\n" + 
	   		   			           "6. Exit");
	   		   	    	    
	   		   	 int c = sc.nextInt();
	   		   	 int bs=0,bc=0,m=0,v=0,d=0;   	 
	   		   	 do{
	   		   	    	  
	   		   	  
		   	       switch(c) 
		   	    		{
		   	  	   case 1:
		    		   
	    	           bs = 35;
	    	           
	    	           break;
	    	           
	    	           
	    		   case 2:
		    		   
		    	       bc = 37;
		    	       
		    	       break;
		    	       
	    		   case 3:
		    		   
		    	       m = 25;
		    	       
		    	       break;
		    	       
	    		   case 4:
		    		   
		    	       v = 20;
		    	       
		    	       break;
		    	       
	    		   case 5:
		    		   
	    			   d = 50;
	    			   break;
	    		   
	    		   default :	    
	    			   {
	    				   System.out.println("Return to main menu");
	    			   
	    	               break;
	    	           }
	    		    }
		   	       
	    		   }while(c!=0);
	    		   
	    		   int hd = (bs+bc+m+v+d);
	    		   
	    		   return hd;
	     }
	   	 
	      static int Snack()  //Snack
	 	  {
	    	    Scanner sc = new Scanner(System.in);   	    	    
	 	   		System.out.println("1. Vada paav       - 25/-\n" + 
	 	   				           "2. Dabeli          - 20/-\n" + 
	 	   				           "3. Samosa          - 18/-\n" + 
	 	   				           "4. Idli            - 12/-\n" + 
	 	   				           "5. Kachori         - 22/-\n" + 
	 	   				           "6. Exit");
	 	   		   	    	    
	 	   		  int c = sc.nextInt();
	 	   		  int vp=0,bc=0,v=0,m=0,d=0; 	    	 
	 	   		  do{
	 	   	    	  
		   		   	  
			   	       switch(c) 
			   	    		{
			   	  	   case 1:
			    		   
		    	           vp = 35;
		    	           
		    	           break;
		    	           
		    	           
		    		   case 2:
			    		   
			    	       bc = 37;
			    	       
			    	       break;
			    	       
		    		   case 3:
			    		   
			    	       m = 25;
			    	       
			    	       break;
			    	       
		    		   case 4:
			    		   
			    	       v = 20;
			    	       
			    	       break;
			    	       
		    		   case 5:
			    		   
		    			   d = 50;
		    			   break;
		    		   
		    		   default :	    
		    			   {
		    				   System.out.println("Return to main menu");
		    			   
		    	               break;
		    	           }
		    		    }
			   	       
		    		   }while(c!=0);
		    		   
		    		   int hd = (vp+bc+m+v+d);
		    		   
		    		   return hd;
		     }		   	 
}


