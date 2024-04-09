
public class Book {

	String name;
	String isbn;
	int cost;
	
	public Book(String name, String isbn, int cost) {
		this.name = name;
		this.isbn = isbn;
		this.cost = cost;
	}

	public String toString() {
		return "Book [name=" + name + ", isbn=" + isbn + ", cost=" + cost + "]";
	}
	
	public boolean isCheaper(Book newBook)
	{
		//here b1 can be access using this
		//and b2 via newBook
		if(this.cost <= newBook.cost)
			return true;
		else
			return false;
	}
}
