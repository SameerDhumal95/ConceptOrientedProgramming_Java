
public class ComplexOpr {
	
	public static Complex add(Complex C1, Complex C2)
	
	{
		Complex sum = new Complex();
		
		sum.real = C1.real + C2.real;
		sum.imag = C1.imag + C2.imag;
		
		return sum;         
		
	}
	
    public static Complex diff(Complex C1, Complex C2)
	
	{
		Complex diff = new Complex();
		
		diff.real = C1.real - C2.real;
		diff.imag = C1.imag - C2.imag;
		
		return diff;         
		
	}

}
