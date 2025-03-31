package array;

public class array_refrenceType {

	
	array_refrenceType m1()
	{
		System.out.println("M1");
		return null;
	}
	public static void main(String[] args) 
	{
		Integer ar1[]= {10,20,30};
		
		Integer ar2[]= new Integer[3];
		ar2[0]=10;
		ar2[1]=20;
		
		int ele1=ar1[0];
		System.out.println(ele1);
			
	}
}
