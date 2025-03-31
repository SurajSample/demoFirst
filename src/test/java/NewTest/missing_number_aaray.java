package NewTest;

import java.util.Arrays;

public class missing_number_aaray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int ar[]= {1,2,3,5,7};
		
		int ar[]= {1,2,4,5,7};
		int n=ar.length+2;
		System.out.println("Total n="+n);//5
		
		int min=Arrays.stream(ar).min().getAsInt();
		int max=Arrays.stream(ar).max().getAsInt();
		System.out.println("Min="+min+" AND Max="+max);
		
		
		for(int i=min;i<=max;i++)
		{
			 if (!contains(ar, i)) 
			 {
	                System.out.print(i + " ");
	         }
		}
	}

	private static boolean contains(int[] ar, int i) 
	{
		for(int j:ar)
		{
			if(j==i)
			{
				return true;
			}
		}
		return false;
	}

}
