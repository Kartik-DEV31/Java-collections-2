import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;





public class collection3 {



	@SuppressWarnings("resource")
	public static void main(String []args) {

		HashMap<String,Float> dataMap = new HashMap<String,Float>();
	

		Scanner  num= new Scanner(System.in);
		Scanner  dataStr= new Scanner(System.in);

		System.out.print("Enter the entries  : ");
		int n = num.nextInt();
	
	String data=new String();
	
		
	 
	
		System.out.println("Enter the data (name#mark1#mark2#mark3): ");
		for(int i= 0;i<n;i++) {
			 data = dataStr.nextLine();
			 String[]dataarr = data.split("#");
			 float sum=Integer.parseInt(dataarr[1])+Integer.parseInt(dataarr[2])+Integer.parseInt(dataarr[3]);
			 dataMap.put(dataarr[0], sum);
			 
		}
		
		
		
		
	
	
String maxKey = null;
Float maxValue = 0F;

for(Map.Entry<String, Float> entry:dataMap.entrySet()) {
	if (entry.getValue()>maxValue)
	{
		
		maxValue = entry.getValue();
		maxKey = entry.getKey();
		
	}	
	
	
}

	
System.out.println("Name of highest scorrer is '"+maxKey+"' with the total score of '"+maxValue+"' ");	
	
	
		}

	

	

}