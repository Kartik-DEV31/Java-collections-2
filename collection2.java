import java.util.*;


public class collection2{

	public static void main(String[] args) {
		Scanner num  = new Scanner(System.in);
		ArrayList<Integer> odds = new ArrayList<Integer>();
		
		
		System.out.print("Enter the number : - ");
		int n = num.nextInt();		
		
		
		for(int i=0;i<=n;i++) {
			
			if(i%2==0)
				continue;
			else 
				odds.add(i);
			
			
		}
		
		
		System.out.println("Odd numbers are :- "+odds);
		
		int sum =0;
		
		for (int i=0;i<odds.size();i++)
		{
			if (i==0) {
			
			
				sum = odds.get(i+1)+odds.get(i);
				
				
			 		
			}
			
			
			else if(i>0 &&i%2==0)
			{	if (i<odds.size()-1)
				sum = sum+odds.get(i+1);
				
			}
		 
			else if(i> 0 && i%2!=0)
				{
				if (i<odds.size()-1)
				sum = sum-odds.get(i+1);}
			
		
		}
		
		System.out.println("Answer : "+sum);
		
		

	}

}
