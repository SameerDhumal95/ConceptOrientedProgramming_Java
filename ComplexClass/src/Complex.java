public class Complex {
	
	int real;
	int imag;
	
	public Complex() 
	{
		real=10;
		imag=5;
	}
	
	public Complex(int real, int imag)
	{
		this.real=real;
		this.imag=imag;
	}
	
	public int getReal()
	{
		return this.real;
	}
	
	public void setReal(int real)
	{
		this.real=real;
	}
	
	public int getImag()
	{
		return this.imag;
	}
	
	public void setImag(int imag)
	{
		this.imag=imag;
	}

	public String toString()
	{
		String str="real = " +this.real+ " , imag = " +this.imag ;
		
		return str;
	}
}
