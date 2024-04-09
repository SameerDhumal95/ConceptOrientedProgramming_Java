/*create class book(booking,BookName,author,price) 
 * create Constructor getter/setter make fields Private and
 *  create array of book and add contents in the book.
 *  find the book with Maximum price and display its corresponding author. 
 */

/*public class Book {

	private String booking;
	private String Bname;
	private String Bauthor;
    private int price;
    
    public Book(String booking, String Bname, String Bauthor, int price)
    {
    	this.booking = booking;
    	this.Bname = Bname;
    	this.Bauthor = Bauthor;
    	this.price = price;
    }

	public void setBooking(String booking) {
		this.booking = booking;
	}

	public String getBname() {
		return Bname;
	}

	public void setBname(String bname) {
		Bname = bname;
	}

	public String getBauthor() {
		return Bauthor;
	}

	public void setBauthor(String bauthor) {
		Bauthor = bauthor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void MaxPrice(Book arr[])
	{
		Book max = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(max.price < arr[i].price)//700 < 
			{
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
		
	}
	
	public String getBooking() {
		return booking;
	}

	public String toString() {
		
		String str = "Booking Status= " + booking + 
				", \nBook Name = " + Bname +
				", \nBook Author = " + Bauthor +
				", \nPrice = " + price ;
		
		return str;
				
	}
    
    
}

*/
//code after changes to boolean

public class Book {

	private static boolean booking;
	private String Bname;
	private String Bauthor;
    private int price;
    
    public Book(boolean booking, String Bname, String Bauthor, int price)
    {
    	this.booking = booking;
    	this.Bname = Bname;
    	this.Bauthor = Bauthor;
    	this.price = price;
    }

	public void setBooking(boolean booking) {
		this.booking = booking;
	}

	public String getBname() {
		return Bname;
	}

	public void setBname(String bname) {
		Bname = bname;
	}

	public String getBauthor() {
		return Bauthor;
	}

	public void setBauthor(String bauthor) {
		Bauthor = bauthor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void MaxPrice(Book arr[])
	{
		Book max = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(max.price < arr[i].price)//700 < 
			{
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
		
	}
	
	public static boolean Booking() {
		if(booking==true)
			System.out.println("This Book is Booked..");
		else
			System.out.println("This book is Not Booked");
		return booking;
	}

	public String toString() {
		
		String str = "Book Name = " + Bname +
				", \nBook Author = " + Bauthor +
				", \nPrice = " + price ;
		
		return str;
				
	}
    
    
	
	
}

