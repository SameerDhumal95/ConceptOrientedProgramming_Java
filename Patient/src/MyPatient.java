
public class MyPatient {

	private String pname;
	private String paddress;
	private MyDate dob;
	private String Mhistory;
	
	MyPatient(String pname,String paddress, MyDate dob,String Mhistory)
	{
		this.pname=pname;
		this.paddress=paddress;
		this.dob=dob;
		this.Mhistory=Mhistory;
	}

	public String toString() {
		return "MyPatient [ pname= " + pname + ", paddress= " + 
	    paddress + ", dob = " + dob + ", Mhistory = " + Mhistory + "]";
	}
	
	
}
