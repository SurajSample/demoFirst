package Mock;

public class missing_number_array {

	public void missingNumber(int ar[])
	{
		int n=ar.length+1;
		System.out.println("Total n value="+n);//5
		int sum=0;
		
		for(int i=0;i<n-1;i++)
		{
			sum=sum+ar[i];//11
			
		}
		System.out.println("Total sum="+sum);//11
		
		//11-7
		
		int expected=(n*(n+1)/2);//15
		System.out.println("Total expected="+expected);
		int res=expected-sum;//
		System.out.println(res);
		
		
	}
	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,5};
		missing_number_array obj =new missing_number_array();
		obj.missingNumber(ar);
	}
}
