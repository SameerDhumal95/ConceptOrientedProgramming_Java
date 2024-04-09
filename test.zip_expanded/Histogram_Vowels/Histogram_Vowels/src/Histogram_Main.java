/*Q3. Program to print histogram of vowels from user input string .
	Separate the vowels & count that vowels and print its histogram.
*/


import java.util.Scanner;				
public class Histogram_Main {

	public static void main(String[] args) 		 
	{
		int num = 0;
	    do
		{
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String: \n");
		
		String i = sc.nextLine();  //string taken from user				
		 
		Histogram_Vowels h1 = new Histogram_Vowels(); // object made  
		
		h1.setInput(i);	//sameer
		
		System.out.println(h1);		
		
		h1.printHistogram(i);
		
		}while(num == 0);
		
	}
}
