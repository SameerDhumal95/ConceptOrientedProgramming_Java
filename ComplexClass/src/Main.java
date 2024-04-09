
public class Main {

	public static void main(String[] args) {
		
		Complex c1 = new Complex(10,20);
	    Complex c2 = new Complex(40,10);
	    
	    System.out.println(c1);
        System.out.println(c2);
		
        Complex sum = ComplexOpr.add(c1,c2);
        Complex diff = ComplexOpr.diff(c1,c2);
		
        System.out.println("Sum is : "+sum);
        System.out.println("Diff is : "+diff);

	}

}
