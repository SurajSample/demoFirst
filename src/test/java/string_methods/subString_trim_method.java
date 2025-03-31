package string_methods;

public class subString_trim_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//substring used to get chracter as per index
		String str="suraj Bodhale";
		String s1=str.substring(0, 3);
		System.out.println(s1);
		
		//trim method used to remove leading & trailing whitespaces
		String trim="   Suraj   bodhale    ";
		
		System.out.println(trim.trim());
		
		
	}

}
