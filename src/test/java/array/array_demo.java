package array;

public class array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array creation normal way
		int ar1[]= {1,2,3};
		
		//array creation using new keyword
		int ar2[]=new int[4];
		
		ar2[0]=20;
		ar2[1]=30;
		ar2[2]=40;
		ar2[3]=60;
		
		int sum=0;
		System.out.println("Array length:"+ar2.length);
		for(int i=0;i<=ar2.length-1;i++)
		{
			//sum=sum+ar2[i];
			System.out.println(ar2[i]);
			
			//System.out.println("Array Index at "+i+" "+ar2[i]);
		}
		
		System.out.println("Total addition is="+sum);
		
		//for each
//		for(int aa:ar2)
//		{
//			System.out.println(aa);
//		}
		
	}

}
