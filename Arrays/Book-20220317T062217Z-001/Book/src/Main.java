
public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("MyBook", "kjsdgfwe78r46jb", 60);
		Book b2 = new Book("MyBook2", "ksjdhfskjfh", 510);
		
		System.out.println(b1);
		System.out.println(b2);	
		
		if(b1.isCheaper(b2))
		{
			System.out.println("b1 is Cheaper than b2");
		}
	}
}
