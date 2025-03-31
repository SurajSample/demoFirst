package NewTest;

public class addition_numbers_string 
{
		
	public static void main(String[] args) 
	{
		String str="suraj1234";
		
		int res=0;
		
		for(char ch:str.toCharArray()) 
		{
			if(Character.isDigit(ch))
			{
				res=res+Character.getNumericValue(ch);
			}
		}
		System.out.println(res);
		
		
	}
}
