
/*public class Main {

	public static void main(String arg[])
	{
	
	Book arr[] = new Book[5];
	arr[0] = new Book("Not Booked","Bhagvatgita","ramanand sagar",600);
	arr[1] = new Book("Booked" ,"Ramayan","R.S.Gupta",700);
	arr[2] = new Book("Booked" ,"Krishnlila","r.k.patil",800);
	arr[3] = new Book("Not Booked" ,"Vishupuran","s.k.pawar",900);
	arr[4] = new Book("Booked" ,"Gyaneshwari","g.k.shinde",1000);
	
	System.out.println("Costy Book is:");
	Book.MaxPrice(arr);
	

	}

}*/

public class Main {

	public static void main(String arg[])
	{
	
	Book arr[] = new Book[5];
	
	arr[0] = new Book(true,"Bhagvatgita","ramanand sagar",600);
	arr[1] = new Book(false ,"Ramayan","R.S.Gupta",700);
	arr[2] = new Book(false ,"Krishnlila","r.k.patil",800);
	arr[3] = new Book(true ,"Vishupuran","s.k.pawar",900);
	arr[4] = new Book(true ,"Gyaneshwari","g.k.shinde",1000);
	
	System.out.println("Costy Book is:");
	Book.MaxPrice(arr);
	Book.Booking();
	

	}

}
