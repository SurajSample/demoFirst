package string_methods;

public class string_split_limit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str="suraj@mohan@Bodhale";
		String str="abc:123";
		//String words[]=str.split("@", 3);
		String words[]=str.split(":",2);
		for(String word:words)
		{
			System.out.println(word);
		}
		

	}

}
