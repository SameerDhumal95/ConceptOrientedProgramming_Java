
public class Main {

	public static void main(String[] args) 
	{
		Book b1 = new Book("Ramayan", "BK47", 400);
		Book b2 = new Book("Krishna", "KS25", 510);
		
		System.out.println(b1);
		System.out.println(b2);	
		
		if(b1.isCheaper(b2))
		{
			System.out.println("b1 is Cheaper than b2");
		}
	}
}
