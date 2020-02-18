import java.util.*;





public class collection1 {



	public static void main(String []args) {

		ArrayList<Integer> array1 = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();

		Scanner num = new Scanner(System.in);

		System.out.print("Enter the entries for array1 : ");
		int n = num.nextInt();
	
	
		
		System.out.println("Enter the data for array1 : ");
		for(int i= 0;i<n;i++) {
			int temp = num.nextInt();
			array1.add(temp);
			
			
		}
		
		System.out.print("Enter the entries for array2 : ");
		int n1 = num.nextInt();
		
		System.out.println("Enter the data for array2 : ");
		for(int i= 0;i<n1;i++) {
			int temp = num.nextInt();
			array2.add(temp);
		
		}

		array1.retainAll(array2);
		
System.out.println("Resultant array : "+array1);
		int sum = 0;
		
for(int i =0;i<array1.size();i++) {
	
	sum = sum+array1.get(i);
	
}

		System.out.print("Sum of Elements : "+sum);
		
		
	}

	

	

}