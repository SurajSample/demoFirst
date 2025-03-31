package Mock;

public class task2 {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
//		int ar[]= {2,3,4,4,6,7};
//		
//		
//		for(int i=0;i<ar.length;i++)
//		{
//			for(int j=0;j<ar.length;j++)
//			{
//				if(ar[i]==ar[j])
//				{
//					int ar[]=ar[i];
//				}
//			}
//		}
		
		
		
		String str="suraj1234";
		int res=0;
		
		
		for(int i=0;i<str.length();i++)
		{
			char[] ch=str.toCharArray();
			if(Character.isDigit(i))
			{
				res=res+ch[i];
			}
		}
		System.out.println(res);

		
	}

}
