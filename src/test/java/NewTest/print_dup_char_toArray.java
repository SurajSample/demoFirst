package NewTest;

public class print_dup_char_toArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str="surajaa";
//		
//		System.out.println(str.length());
//		
//		for(int i=0;i<str.length();i++)
//		{
//			int count=1;
//			boolean alreadyCounted = false;
//			
//			for(int k=0;k<i;k++)
//			{
//				if(str.charAt(i)==str.charAt(k))
//				{
//					alreadyCounted = true;
//					count++;
//				}
//			}
//			if (alreadyCounted) 
//			{
//                continue; // Skip already counted characters
//            }
//			
//			for(int j=i+1;j<str.length();j++)
//			{
//				if(str.charAt(i)==str.charAt(j))
//				{
//					count++;
//				}
//			}
//			if(count>1)
//			{
//				System.out.println("Character "+str.charAt(i)+" "+count+" times");
//			}
//		}
//		
//		
//		
		String str="suraj jammu";//
		
		char ch[]=str.toCharArray();
		System.out.println(ch.length);
		
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]==' ')
			continue;
		
		//System.out.println(ch);
		
			int count=1;
			
			for(int j=i+1;j<=ch.length-1;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					//ch[j]=' ';
				}
			}
			if(count>1)
			{
				System.out.println(ch[i]+"="+count+" times");
			}
		}

	}

}
