
public class Student {

	private String name;
	private int age;
	private int []marks;
	
	public Student(String name,int age)
	{
		this.name = name;
		this.age = age;
		this.marks = new int[5];
	}
		
	public void setMarks(int []marks) {
		this.marks = marks;
	}

	public String toString()
	{
		String str = "Name: "+this.name+", Age: "+ ///str + str concat
	                this.age+", Marks = ";
		
		for(int i = 0 ; i<marks.length; i++)
		{
		   str = str + this.marks[i]+" , ";		
		}
		return str;
	}
	
	public void printAvgMarks(int[] marks)
	{
		int sum = 0;
		for(int i=0 ;i<marks.length; i++)
		{
			sum = sum + marks[i];
			
		}
		System.out.println("Total Marks : "+sum);
		
		System.out.println("Average of marks: "+(float)sum/marks.length);
	}
	
	public void printLowestMarks(int []marks)
	{
		int lowest = marks[0];  //12
		for(int i = 1; i<marks.length; i++)//1//2//3//4
		{
		     if(lowest > marks[i])//12>11true //12>17false //12>21false //12>25false
			 lowest = marks[i]; //lowest = 11
		    
	    }
		System.out.println("lowest Marks: "+lowest);
    }
	
	public void printHighestMarks(int []marks)
	{
		int highest = marks[0];  //12
		for(int i = 1; i<marks.length; i++)//1//2//
		{
		     if(highest < marks[i])  //12<11false//12<17true //12<21true//12<25true
			 highest = marks[i];                 //17        //21       //25
		    
	    }
		System.out.println("Highest Marks: "+highest);
    }
}
