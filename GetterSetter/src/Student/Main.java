package Student;

public class Main {

	public static void main(String []args)
	{
		Student S = new Student();
		Student S1 = new Student("Sameer",89,'M');
		
		/*Use of setter/getter*/
		 
		S.print();
		S1.print();
		S1.setName("Ajit");
		//S1.getName();
		S1.print();
		S.setName(S1.getName());
		S.print();
		S1.setName("Raju");
		S1.print();
		S.setName(S1.getName());
		
		
	}
}
