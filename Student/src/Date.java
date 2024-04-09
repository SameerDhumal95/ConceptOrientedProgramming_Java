/*
public class Date {

	String dob ;
	
	Date()
	{
		this.dob = "dd/mm/yyyy";
	}
	
	Date(String dob)
	{
		this.dob = dob;
	}
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String toString()
	{
		String str = dob;
		return str;
	}
}
*/

public class Date {

	int dd;
	int mm;
	int yy;
	
	Date()
	{
		this.dd = 00;
		this.mm = 00;
		this.yy = 00;
		
	}
	
	Date(int dd, int mm, int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
		
	public String toString()
	{
		String str = dd+ "/"+mm+"/"+yy;
		return str;
	}
}

