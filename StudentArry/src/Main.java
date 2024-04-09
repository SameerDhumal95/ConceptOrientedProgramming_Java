
public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("Sameer",25); 
		
		int []arr = new int[5];//or hardcore values new marks int[5] {12,11,17,21,25}
		
		arr[0] = 12;

		arr[1] = 11;

		arr[2] = 17;

		arr[3] = 21;

		arr[4] = 25;
            
		s1.setMarks(arr);
		
		System.out.println(s1);
		
		s1.printAvgMarks(arr);
		s1.printLowestMarks(arr);
		s1.printHighestMarks(arr);
	}
	
	

}
