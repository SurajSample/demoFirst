package array;

public class duplicate_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="suraj mosus";
		
		char ch[]=str.toCharArray();
		System.out.println(ch.length);
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				continue;
			}
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=' ';
				}
			}
			if(count>1)
			{
				System.out.println(ch[i]+" at "+count+" times");
			}
			
		}
		

	}

}
