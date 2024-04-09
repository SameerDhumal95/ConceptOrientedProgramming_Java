	
public class Histogram_Vowels {
	
	private String input;   ///sameer
	
	public String getInput() {	
		return input;
	}

	public void setInput(String input) {	
		this.input = input;
	}
	
	public void printHistogram(String input) 
	{
        int count=0; char x='a';
        for (int i=0; i<input.length(); i++) //sameer
		{
			if(input.charAt(i)=='A' || input.charAt(i)=='a')  //1. a
            	count++; //1. 1
        }
		histogram(x,count);
		
		count=0; x ='e';
        for (int i=0; i<input.length(); i++)  //3. e //4. e
		{
			if(input.charAt(i)=='E' || input.charAt(i)=='e')  
            	count++;  //3. 1//4. 2
        }
		histogram(x,count);  //4. 2
		
		count=0; x='i';
        for (int i=0; i<input.length(); i++) 
		{
			if(input.charAt(i)=='I' || input.charAt(i)=='i')
            	count++;
        }
		histogram(x,count);
		
		count=0; x='o';
        for (int i=0; i<input.length(); i++) 
		{
			if(input.charAt(i)=='O' || input.charAt(i)=='o')
            	count++;
        }
		histogram(x,count);
		
		count=0; x='u';
        for (int i=0; i<input.length(); i++) 
		{
			if(input.charAt(i)=='U' || input.charAt(i)=='u')
            	count++;
        }
		histogram(x,count);
	}
	
	public static void histogram(char x,int count)  //(a,1) / (e,2)
	{
		System.out.print("\n"+ x + "(" + count + ") : ");
		
		for (int i=0; i<count; i++) 
		{
			System.out.print("*");
		}
		System.out.println("\n");
	}

	public String toString() 
	{
		return "Histogram_Vowels [input =" + input + "]";
	}
}
