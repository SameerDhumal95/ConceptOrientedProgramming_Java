import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int length,width;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rectangle the width:");
        width = sc.nextInt();
        System.out.println("Enter Rectangle the length:");
        length = sc.nextInt();
        
        Rectangle R = new Rectangle(width,length);
        
        int wd = R.getWidth();
        int ld = R.getLength();
        //int area = R.Area(wd, ld);
        
        System.out.println(R);
	}

}
