package array;

import java.util.HashSet;

public class duplicate_string_from_array {

	public static void main(String[] args) {
		String ar[]= {"pune","pune","delhi","mumbai"};
		System.out.println(ar.length);
		//1st approch using hashset
		HashSet<String> hash=new HashSet<String>();
		
		for(String city:ar)
		{
			if(!hash.add(city))
			{
				System.out.println(city);
			}
		}
		
		//2nd approch using loops
		
//		for(int i=0;i<ar.length;i++)
//		{
//			for(int j=i+1;j<ar.length;j++)
//			{
//				if(ar[i]==ar[j])
//				{
//					System.out.println(ar[i]);
//				}
//			}
//		}
//		

	}

}
