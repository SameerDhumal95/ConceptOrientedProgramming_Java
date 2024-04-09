//
//public class Main {
//
//	
//	public static void main(String[] args) {
//		
//		int A[]= {2,3,4,5,6};
//		update(A);
//		System.out.println(A[0]);
//	}
//	
//	static void update(int a[])
//	{
//		a[0]=24;
//	}
//}



public class Main {

	
	public static void main(String[] args) {
		
		int A[]= {2,3,4,5,6};
		update(A,2,52);
		for(int x: A)
			System.out.println(x);
	}
	
	static void update(int a[],int index,int value)
	{
		a[index]=value;
	}
}


