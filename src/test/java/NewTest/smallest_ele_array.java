package NewTest;

public class smallest_ele_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ar[]={20,4,59,70};

		int small=ar[0];

		for(int i=1;i<=ar.length-1;i++)
		{
			if(ar[i]<small)
			{
				small=ar[i];
			}
		}	
		System.out.println(small);

	}

}
